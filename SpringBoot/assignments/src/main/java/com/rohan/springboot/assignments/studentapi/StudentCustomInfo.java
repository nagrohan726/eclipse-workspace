package com.rohan.springboot.assignments.studentapi;

import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class StudentCustomInfo implements InfoContributor {

	@Override
	public void contribute(Builder builder) {
		boolean isLogging = true;

		builder.withDetail("Logging", isLogging);
	}

}
