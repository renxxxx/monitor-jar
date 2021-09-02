package renx.monitor;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class JavaxMail {

	public JavaxMail(String host, Integer port, String protocol, String smtpAuth, String user, String pwd,
			String sender) {
		super();
		this.host = host;
		this.port = port;
		this.protocol = protocol;
		this.smtpAuth = smtpAuth;
		this.user = user;
		this.pwd = pwd;
		this.sender = sender;
	}

	private String host;
	private Integer port;
	private String protocol;
	private String smtpAuth;
	private String user;
	private String pwd;
	private String sender;

	public Message send(String receiver, String subject, String content) throws Exception {
		Properties prop = new Properties();
		prop.setProperty("mail.host", host);
		prop.setProperty("mail.transport.protocol", protocol);
		prop.setProperty("mail.smtp.auth", smtpAuth);
		prop.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		Session session = Session.getInstance(prop);
		session.setDebug(false);
		Transport ts = session.getTransport();
		if (port == null)
			ts.connect(host, user, pwd);
		else
			ts.connect(host, port, user, pwd);
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
