package com.spring5study.beanIntro;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author Jiahao Wang
 * @create 2022-05-12 19:47
 */
public class SchoolPost implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("在初始化之前执行的方法");
		return bean;
	}
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("在初始化之后执行的方法");
		return bean;
	}


}
