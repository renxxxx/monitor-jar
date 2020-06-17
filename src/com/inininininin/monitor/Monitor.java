package com.inininininin.monitor;

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
	static String pwd = "pzivczucpondbhhh";
	static OkHttpClient okHttpClient = new OkHttpClient();
	static JavaMail j = new JavaMail("smtp.qq.com", 25, "smtp", "true", email, pwd, email);

	public static void main(String[] args) throws Exception {
		while (true) {
			String url = null;
			Request request = null;
			Response response = null;
			ResponseBody responseBody = null;
			try {
				url = "https://zaylt.njshangka.com/test";
				logger.info(url);
				request = new Request.Builder().url(url).build();
				response = okHttpClient.newCall(request).execute();
				logger.info("response code : " + response.code());
				if (response.code() != 200) {
					throw new RuntimeException("response code : " + response.code());
				}
				responseBody = response.body();
				String responseBody_string = responseBody.string();
				logger.info(responseBody_string);
				if (responseBody_string != null && !responseBody_string.isEmpty()) {
					JSONObject responseBody_string_JSON = JSON.parseObject(responseBody_string);
					Integer code = responseBody_string_JSON.getInteger("code");
					if (code == null || code != 0) {
						throw new RuntimeException(responseBody_string);
					}
				}
			} catch (Exception e) {
				try {
					j.send(email, url, e.getMessage());
				} catch (Exception e1) {
					// TODO: handle exception
				}
			} finally {
				if (responseBody != null)
					responseBody.close();
				if (response != null)
					response.close();
			}

			try {
				url = "https://ypt.njshangka.com/test";
				logger.info(url);
				request = new Request.Builder().url(url).build();
				response = okHttpClient.newCall(request).execute();
				logger.info("response code : " + response.code());
				if (response.code() != 200) {
					throw new RuntimeException("response code : " + response.code());
				}
				responseBody = response.body();
				String responseBody_string = responseBody.string();
				logger.info(responseBody_string);
				if (responseBody_string != null && !responseBody_string.isEmpty()) {
					JSONObject responseBody_string_JSON = JSON.parseObject(responseBody_string);
					Integer code = responseBody_string_JSON.getInteger("code");
					if (code == null || code != 0) {
						throw new RuntimeException(responseBody_string);
					}
				}
			} catch (Exception e) {
				try {
					j.send(email, url, e.getMessage());
				} catch (Exception e1) {
					// TODO: handle exception
				}
			} finally {
				if (responseBody != null)
					responseBody.close();
				if (response != null)
					response.close();
			}

			try {
				url = "https://yichacha.njshangka.com/test";
				logger.info(url);
				request = new Request.Builder().url(url).build();
				response = okHttpClient.newCall(request).execute();
				logger.info("response code : " + response.code());
				if (response.code() != 200) {
					throw new RuntimeException("response code : " + response.code());
				}
				responseBody = response.body();
				String responseBody_string = responseBody.string();
				logger.info(responseBody_string);
				if (responseBody_string != null && !responseBody_string.isEmpty()) {
					JSONObject responseBody_string_JSON = JSON.parseObject(responseBody_string);
					Integer code = responseBody_string_JSON.getInteger("code");
					if (code == null || code != 0) {
						throw new RuntimeException(responseBody_string);
					}
				}
			} catch (Exception e) {
				try {
					j.send(email, url, e.getMessage());
				} catch (Exception e1) {
					// TODO: handle exception
				}
			} finally {
				if (responseBody != null)
					responseBody.close();
				if (response != null)
					response.close();
			}

			try {
				url = "https://hzbsqc.cn/test";
				logger.info(url);
				request = new Request.Builder().url(url).build();
				response = okHttpClient.newCall(request).execute();
				logger.info("response code : " + response.code());
				if (response.code() != 200) {
					throw new RuntimeException("response code : " + response.code());
				}
				responseBody = response.body();
				String responseBody_string = responseBody.string();
				logger.info(responseBody_string);
				if (responseBody_string != null && !responseBody_string.isEmpty()) {
					JSONObject responseBody_string_JSON = JSON.parseObject(responseBody_string);
					Integer code = responseBody_string_JSON.getInteger("code");
					if (code == null || code != 0) {
						throw new RuntimeException(responseBody_string);
					}
				}
			} catch (Exception e) {
				try {
					j.send(email, url, e.getMessage());
				} catch (Exception e1) {
					// TODO: handle exception
				}
			} finally {
				if (responseBody != null)
					responseBody.close();
				if (response != null)
					response.close();
			}

			try {
				url = "https://shipinh.cn/test";
				logger.info(url);
				request = new Request.Builder().url(url).build();
				response = okHttpClient.newCall(request).execute();
				logger.info("response code : " + response.code());
				if (response.code() != 200) {
					throw new RuntimeException("response code : " + response.code());
				}
				responseBody = response.body();
				String responseBody_string = responseBody.string();
				logger.info(responseBody_string);
				if (responseBody_string != null && !responseBody_string.isEmpty()) {
					JSONObject responseBody_string_JSON = JSON.parseObject(responseBody_string);
					Integer code = responseBody_string_JSON.getInteger("code");
					if (code == null || code != 0) {
						throw new RuntimeException(responseBody_string);
					}
				}
			} catch (Exception e) {
				try {
					j.send(email, url, e.getMessage());
				} catch (Exception e1) {
					// TODO: handle exception
				}
			} finally {
				if (responseBody != null)
					responseBody.close();
				if (response != null)
					response.close();
			}

			try {
				url = "http://cloudhousewed.com/test";
				logger.info(url);
				request = new Request.Builder().url(url).build();
				response = okHttpClient.newCall(request).execute();
				logger.info("response code : " + response.code());
				if (response.code() != 200) {
					throw new RuntimeException("response code : " + response.code());
				}
				responseBody = response.body();
				String responseBody_string = responseBody.string();
				logger.info(responseBody_string);
				if (responseBody_string != null && !responseBody_string.isEmpty()) {
					JSONObject responseBody_string_JSON = JSON.parseObject(responseBody_string);
					Integer code = responseBody_string_JSON.getInteger("code");
					if (code == null || code != 0) {
						throw new RuntimeException(responseBody_string);
					}
				}
			} catch (Exception e) {
				try {
					j.send(email, url, e.getMessage());
				} catch (Exception e1) {
					// TODO: handle exception
				}
			} finally {
				if (responseBody != null)
					responseBody.close();
				if (response != null)
					response.close();
			}
			try {
				url = "https://www.njshangka.com/dogCake/test";
				logger.info(url);
				request = new Request.Builder().url(url).build();
				response = okHttpClient.newCall(request).execute();
				logger.info("response code : " + response.code());
				if (response.code() != 200) {
					throw new RuntimeException("response code : " + response.code());
				}
				responseBody = response.body();
				String responseBody_string = responseBody.string();
				logger.info(responseBody_string);
				if (responseBody_string != null && !responseBody_string.isEmpty()) {
					JSONObject responseBody_string_JSON = JSON.parseObject(responseBody_string);
					Integer code = responseBody_string_JSON.getInteger("code");
					if (code == null || code != 0) {
						throw new RuntimeException(responseBody_string);
					}
				}
			} catch (Exception e) {
				try {
					j.send(email, url, e.getMessage());
				} catch (Exception e1) {
					// TODO: handle exception
				}
			} finally {
				if (responseBody != null)
					responseBody.close();
				if (response != null)
					response.close();
			}

			try {
				url = "https://ypt.njshangka.com";
				logger.info(url);
				request = new Request.Builder().url(url).build();
				response = okHttpClient.newCall(request).execute();
				logger.info("response code : " + response.code());
				if (response.code() != 200) {
					throw new RuntimeException("response code : " + response.code());
				}
			} catch (Exception e) {
				try {
					j.send(email, url, e.getMessage());
				} catch (Exception e1) {
					// TODO: handle exception
				}
			} finally {
				if (responseBody != null)
					responseBody.close();
				if (response != null)
					response.close();
			}

			try {
				url = "https://shipinh.cn";
				logger.info(url);
				request = new Request.Builder().url(url).build();
				response = okHttpClient.newCall(request).execute();
				logger.info("response code : " + response.code());
				if (response.code() != 200) {
					throw new RuntimeException("response code : " + response.code());
				}
			} catch (Exception e) {
				try {
					j.send(email, url, e.getMessage());
				} catch (Exception e1) {
					// TODO: handle exception
				}
			} finally {
				if (responseBody != null)
					responseBody.close();
				if (response != null)
					response.close();
			}

			try {
				url = "https://hzbsqc.cn";
				logger.info(url);
				request = new Request.Builder().url(url).build();
				response = okHttpClient.newCall(request).execute();
				logger.info("response code : " + response.code());
				if (response.code() != 200) {
					throw new RuntimeException("response code : " + response.code());
				}
			} catch (Exception e) {
				try {
					j.send(email, url, e.getMessage());
				} catch (Exception e1) {
					// TODO: handle exception
				}
			} finally {
				if (responseBody != null)
					responseBody.close();
				if (response != null)
					response.close();
			}

			try {
				url = "http://cloudhousewed.com";
				logger.info(url);
				request = new Request.Builder().url(url).build();
				response = okHttpClient.newCall(request).execute();
				logger.info("response code : " + response.code());
				if (response.code() != 200) {
					throw new RuntimeException("response code : " + response.code());
				}
			} catch (Exception e) {
				try {
					j.send(email, url, e.getMessage());
				} catch (Exception e1) {
					// TODO: handle exception
				}
			} finally {
				if (responseBody != null)
					responseBody.close();
				if (response != null)
					response.close();
			}

			try {
				url = "http://www.njshangka.com/dogCake/index.html";
				logger.info(url);
				request = new Request.Builder().url(url).build();
				response = okHttpClient.newCall(request).execute();
				logger.info("response code : " + response.code());
				if (response.code() != 200) {
					throw new RuntimeException("response code : " + response.code());
				}
			} catch (Exception e) {
				try {
					j.send(email, url, e.getMessage());
				} catch (Exception e1) {
					// TODO: handle exception
				}
			} finally {
				if (responseBody != null)
					responseBody.close();
				if (response != null)
					response.close();
			}
			Thread.sleep(10000);
		}
	}
}
