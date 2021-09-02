package renx.monitor;

import java.io.File;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class Monitor {
	public static Logger logger = Logger.getLogger(Monitor.class);
	public static String version = "210902";
	public static JMail j = null;

	static String email = "413038044@qq.com";
	static String pwd = "euhiglgjaxribjch";
	static OkHttpClient okHttpClient = new OkHttpClient();

	public static void main(String[] args) throws Exception {
		logger.info("enter");
		j = new JMail();
		j.host = "smtp.qq.com";
		j.user = "413038044@qq.com";
		j.pwd = "euhiglgjaxribjch";
		j.sender = "413038044@qq.com";

		String path = new File("").getAbsolutePath();

		FileAppender appender = (FileAppender) org.apache.log4j.Logger.getRootLogger().getAppender("rlfile");
		logger.info(System.getProperties());

		while (true) {
			renx_urban_web();
			za_home();
			za_home_server();
			za_ycc_server();
			za_ylt_server();
			za_ypt_server();
			Thread.sleep(10000);
		}
	}

	public static void za_ycc_server() {
		String url = null;
		Request request = null;
		Response response = null;
		ResponseBody responseBody = null;
		try {
			url = "https://yichacha.njshangka.com/test";
			logger.debug(url);
			request = new Request.Builder().url(url).build();
			response = okHttpClient.newCall(request).execute();
			logger.debug("response code : " + response.code());
			if (response.code() != 200) {
				throw new RuntimeException("response code : " + response.code());
			}
			responseBody = response.body();
			String responseBody_string = responseBody.string();
			logger.debug(responseBody_string);
			if (responseBody_string != null && !responseBody_string.isEmpty()) {
				JSONObject responseBody_string_JSON = JSON.parseObject(responseBody_string);
				Integer code = responseBody_string_JSON.getInteger("code");
				if (code == null || code != 0) {
					throw new RuntimeException(responseBody_string);
				}
			}
		} catch (Exception e) {
			try {
				j.send(email, "fail on " + url, e.getMessage());
			} catch (Exception e1) {
				logger.info(ExceptionUtils.getStackTrace(e1));
			}
		} finally {
			if (responseBody != null)
				responseBody.close();
			if (response != null)
				response.close();
		}

	}

	public static void renx_urban_web() {
		String url = null;
		Request request = null;
		Response response = null;
		ResponseBody responseBody = null;
		try {
			url = "https://renx.cc/urban/index.html";
			logger.debug(url);
			request = new Request.Builder().url(url).build();
			response = okHttpClient.newCall(request).execute();
			logger.debug("response code : " + response.code());
			if (response.code() != 200) {
				throw new RuntimeException("response code : " + response.code());
			}
		} catch (Exception e) {
			try {
				j.send(email, "fail on " + url, e.getMessage());
			} catch (Exception e1) {
				logger.info(ExceptionUtils.getStackTrace(e1));
			}
		} finally {
			if (responseBody != null)
				responseBody.close();
			if (response != null)
				response.close();
		}
	}

	public static void za_ypt_server() {
		String url = null;
		Request request = null;
		Response response = null;
		ResponseBody responseBody = null;
		try {
			url = "https://njshangka.com/ypt/test";
			logger.debug(url);
			request = new Request.Builder().url(url).build();
			response = okHttpClient.newCall(request).execute();
			logger.debug("response code : " + response.code());
			if (response.code() != 200) {
				throw new RuntimeException("response code : " + response.code());
			}
			responseBody = response.body();
			String responseBody_string = responseBody.string();
			logger.debug(responseBody_string);
			if (responseBody_string != null && !responseBody_string.isEmpty()) {
				JSONObject responseBody_string_JSON = JSON.parseObject(responseBody_string);
				Integer code = responseBody_string_JSON.getInteger("code");
				if (code == null || code != 0) {
					throw new RuntimeException(responseBody_string);
				}
			}
		} catch (Exception e) {
			try {
				j.send(email, "fail on " + url, e.getMessage());
			} catch (Exception e1) {
				logger.info(ExceptionUtils.getStackTrace(e1));
			}
		} finally {
			if (responseBody != null)
				responseBody.close();
			if (response != null)
				response.close();
		}

	}

	public static void za_ylt_server() {
		String url = null;
		Request request = null;
		Response response = null;
		ResponseBody responseBody = null;
		try {
			url = "https://zaylt.njshangka.com/ylt/test";
			logger.debug(url);
			request = new Request.Builder().url(url).build();
			response = okHttpClient.newCall(request).execute();
			logger.debug("response code : " + response.code());
			if (response.code() != 200) {
				throw new RuntimeException("response code : " + response.code());
			}
			responseBody = response.body();
			String responseBody_string = responseBody.string();
			logger.debug(responseBody_string);
			if (responseBody_string != null && !responseBody_string.isEmpty()) {
				JSONObject responseBody_string_JSON = JSON.parseObject(responseBody_string);
				Integer code = responseBody_string_JSON.getInteger("code");
				if (code == null || code != 0) {
					throw new RuntimeException(responseBody_string);
				}
			}
		} catch (Exception e) {
			try {
				j.send(email, "fail on " + url, e.getMessage());
			} catch (Exception e1) {
				logger.info(ExceptionUtils.getStackTrace(e1));
			}
		} finally {
			if (responseBody != null)
				responseBody.close();
			if (response != null)
				response.close();
		}
	}

	public static void za_home_server() {
		String url = null;
		Request request = null;
		Response response = null;
		ResponseBody responseBody = null;
		try {
			url = "https://zayiliao.com/test";
			logger.debug(url);
			request = new Request.Builder().url(url).build();
			response = okHttpClient.newCall(request).execute();
			logger.debug("response code : " + response.code());
			if (response.code() != 200) {
				throw new RuntimeException("response code : " + response.code());
			}
			responseBody = response.body();
			String responseBody_string = responseBody.string();
			logger.debug(responseBody_string);
			if (responseBody_string != null && !responseBody_string.isEmpty()) {
				JSONObject responseBody_string_JSON = JSON.parseObject(responseBody_string);
				Integer code = responseBody_string_JSON.getInteger("code");
				if (code == null || code != 0) {
					throw new RuntimeException(responseBody_string);
				}
			}
		} catch (Exception e) {
			try {
				j.send(email, "fail on " + url, e.getMessage());
			} catch (Exception e1) {
				logger.info(ExceptionUtils.getStackTrace(e1));
			}
		} finally {
			if (responseBody != null)
				responseBody.close();
			if (response != null)
				response.close();
		}
	}

	public static void za_home() {
		String url = null;
		Request request = null;
		Response response = null;
		ResponseBody responseBody = null;
		try {
			url = "https://zayiliao.com";
			logger.debug(url);
			request = new Request.Builder().url(url).build();
			response = okHttpClient.newCall(request).execute();
			logger.debug("response code : " + response.code());
			if (response.code() != 200) {
				throw new RuntimeException("response code : " + response.code());
			}
		} catch (Exception e) {
			try {
				j.send(email, "fail on " + url, e.getMessage());
			} catch (Exception e1) {
				logger.info(ExceptionUtils.getStackTrace(e1));
			}
		} finally {
			if (responseBody != null)
				responseBody.close();
			if (response != null)
				response.close();
		}
	}
}
