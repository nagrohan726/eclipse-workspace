package com.rohan.spring.springcore.set;

import java.util.Set;

public class CarDealer {

	private String name;
	private Set<String> models;

	public String getName() {
		return name;
	}

	public void setName(String dealer) {
		this.name = dealer;
	}

	public Set<String> getModels() {
		return models;
	}

	public void setModels(Set<String> models) {
		this.models = models;
	}

}
