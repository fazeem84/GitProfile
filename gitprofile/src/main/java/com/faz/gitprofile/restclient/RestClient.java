package com.faz.gitprofile.restclient;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public class RestClient {
	public String sendGetRequest(String url) throws Exception {

		CloseableHttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(url);
		
		System.out.println(url);
		// add request header
		// request.addHeader("User-Agent", USER_AGENT);
		HttpResponse response = client.execute(request);
		// HttpResponse response = client.execute(request);

		System.out.println("Response Code : " + response.getStatusLine().getStatusCode());
		String result = EntityUtils.toString(response.getEntity());
		System.out.println(result);
		
		return result;
	}
}
