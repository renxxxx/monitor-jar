package app;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class JMail {

	public String host;
	public String user;
	public String pwd;
	public String sender;

	public Message send(String receiver, String subject, String content) throws Exception {
		Properties prop = new Properties();
		prop.setProperty("mail.transport.protocol", "smtp");
		prop.setProperty("mail.smtp.host", "smtp.qq.com");
		prop.setProperty("mail.smtp.auth", "true");
		prop.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		prop.setProperty("mail.smtp.socketFactory.port", "465");
		prop.setProperty("mail.smtp.port", "465");
		Session session = Session.getInstance(prop);
		session.setDebug(false);

		Transport ts = session.getTransport();
		ts.connect(host, 465, user, pwd);

		MimeMessage message = new MimeMessage(session);
		message.setFrom(new InternetAddress(sender));
		message.setRecipient(Message.RecipientType.TO, new InternetAddress(receiver));
		message.setSubject(subject);
		message.setContent(content, "text/html;charset=UTF-8");
		ts.sendMessage(message, message.getAllRecipients());
		ts.close();
		return message;
	}

}
