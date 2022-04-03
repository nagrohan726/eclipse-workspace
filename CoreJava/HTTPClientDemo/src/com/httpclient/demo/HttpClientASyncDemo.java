package com.httpclient.demo;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class HttpClientASyncDemo {

	public static void main(String[] args)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {

		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder(new URI("https://fakerestapi.azurewebsites.net/api/v1/activities"))
				.GET().build();

		request = HttpRequest.newBuilder(new URI("https://fakerestapi.azurewebsites.net/api/v1/activities"))
				.POST(BodyPublishers.ofString("{\r\n" + "    \"id\": 0,\r\n" + "    \"title\": \"string\",\r\n"
						+ "    \"dueDate\": \"2022-04-01T10:20:16.765Z\",\r\n" + "    \"completed\": true\r\n" + "  }"))
				.header("Content-Type", "application/json").build();

		CompletableFuture<HttpResponse<String>> response = client.sendAsync(request, BodyHandlers.ofString());
		String body = response.thenApply(HttpResponse::body).get();
		System.out.println(body);

	}

}
