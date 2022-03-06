package com.rohan.spring.springcoreadvanced.stereotype.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
@Component("inst")
@Scope("prototype")
public class Instructor {

//	@Value("10")
//	@Value("#{6+4}")
//	@Value("#{T(java.lang.Math).abs(-10)}")
	@Value("#{new Integer(6+4)}")
//	@Value("#{T(java.lang.Integer).MIN_VALUE}")
	private int id;

//	@Value("Bharath Thippireddy")
//	@Value("#{'Bharath Thippireddy'}")
//	@Value("#{'Bharath Thippireddy'.toUpperCase()}")
	@Value("#{new String('Bharath Thippireddy')}")
	private String name;

//	@Value("#{2+5>4}")
//	@Value("#{2+5>4?false:true}")
	@Value("#{2+5>4?true:false}")
	private boolean active;

	@Value("#{topics}")
	private List<String> topics;

	@Autowired
	private Profile profile;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", active=" + active + ", topics=" + topics + ", profile="
				+ profile + "]";
	}
}
