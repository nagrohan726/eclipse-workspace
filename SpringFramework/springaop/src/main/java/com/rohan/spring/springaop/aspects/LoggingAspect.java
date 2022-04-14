package com.rohan.spring.springaop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	@Before("execution(* com.rohan.spring.springaop.ProductServiceImpl.multiply(..))")
	public void logBefore(JoinPoint joinPoint) {
		System.out.println("Before Calling the method");
	}

	@After("execution(* com.rohan.spring.springaop.ProductServiceImpl.multiply(..))")
	public void logAfter(JoinPoint joinPoint) {
		System.out.println("After the method invocation");
	}

}
