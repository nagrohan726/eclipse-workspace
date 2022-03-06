package com.rohan.spring.springcoreadvanced.autowiring.propertyplaceholder.assignment;

public class WebService {

	private String url;
	private String userName;
	private String password;

	public WebService(String url, String userName, String password) {
		this.url = url;
		this.userName = userName;
		this.password = password;
	}

	@Override
	public String toString() {
		return "WebService [url=" + url + ", userName=" + userName + ", password=" + password + "]";
	}

}
