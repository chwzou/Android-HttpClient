package com.levelup.http;

import java.net.HttpURLConnection;


public interface CookieManager {
	public void setCookieHeader(HttpRequest request);
	public void setCookieResponse(HttpRequest request, HttpURLConnection resp);
}
