package com.aop.aspectjannotation;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-22 18:10
 */
public class Log implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("after returning");
	}
}
