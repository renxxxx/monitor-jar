package inininininin.monitor;

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

	static String email = "413038044@qq.com";
	static String pwd = "euhiglgjaxribjch";
	static OkHttpClient okHttpClient = new OkHttpClient();
	static JavaxMail j = new JavaxMail("smtp.qq.com", 25, "smtp", "true", email, pwd, email);

	public static void main(String[] args) throws Exception {
		logger.info("enter");
		String path = new File("").getAbsolutePath();

		FileAppender appender = (FileAppender) org.apache.log4j.Logger.getRootLogger().getAppender("rlfile");
		logger.debug(appender.getFile());
		while (true) {
			// logger.debug("enter while (true)");
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

			try {
				url = "https://zaylt.njshangka.com/test";
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

			try {
				url = "https://ypt.njshangka.com/test";
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

			try {
				url = "https://hzbsqc.cn/test";
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

//			try {
//				url = "http://cloudhousewed.com/test";
//				logger.debug(url);
//				request = new Request.Builder().url(url).build();
//				response = okHttpClient.newCall(request).execute();
//				logger.debug("response code : " + response.code());
//				if (response.code() != 200) {
//					throw new RuntimeException("response code : " + response.code());
//				}
//				responseBody = response.body();
//				String responseBody_string = responseBody.string();
//				logger.debug(responseBody_string);
//				if (responseBody_string != null && !responseBody_string.isEmpty()) {
//					JSONObject responseBody_string_JSON = JSON.parseObject(responseBody_string);
//					Integer code = responseBody_string_JSON.getInteger("code");
//					if (code == null || code != 0) {
//						throw new RuntimeException(responseBody_string);
//					}
//				}
//			} catch (Exception e) {
//				try {
//					j.send(email, "fail on " + url, e.getMessage());
//				} catch (Exception e1) {
//					logger.info(ExceptionUtils.getStackTrace(e1));
//				}
//			} finally {
//				if (responseBody != null)
//					responseBody.close();
//				if (response != null)
//					response.close();
//			}

			try {
				url = "https://www.njshangka.com/dogCake/test";
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

			try {
				url = "https://www.njshangka.com/redpack/test";
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

			try {
				url = "https://kefu.jfcs11.com/test";
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

			///////////////////
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

			try {
				url = "https://ypt.njshangka.com";
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

			try {
				url = "https://hzbsqc.cn";
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

//			try {
//				url = "http://cloudhousewed.com";
//				logger.debug(url);
//				request = new Request.Builder().url(url).build();
//				response = okHttpClient.newCall(request).execute();
//				logger.debug("response code : " + response.code());
//				if (response.code() != 200) {
//					throw new RuntimeException("response code : " + response.code());
//				}
//			} catch (Exception e) {
//				try {
//					j.send(email, "fail on " + url, e.getMessage());
//				} catch (Exception e1) {
//					logger.info(ExceptionUtils.getStackTrace(e1));
//				}
//			} finally {
//				if (responseBody != null)
//					responseBody.close();
//				if (response != null)
//					response.close();
//			}

			try {
				url = "http://www.njshangka.com/dogCake/index.html";
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

			try {
				url = "https://www.njshangka.com/redpack/index.html";
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

			try {
				url = "https://www.njshangka.com/urban/index.html";
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

			try {
				url = "https://kefu.jfcs11.com";
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
			Thread.sleep(10000);
			// logger.debug("return while (true)");
		}
		// logger.info("return");
	}
}
