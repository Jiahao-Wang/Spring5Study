package com.spring5study.factorybeanIntro;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author Jiahao Wang
 * @create 2022-05-11 18:46
 */
public class MyBean implements FactoryBean {

	// 定义返回 bean
	@Override
	public Object getObject() throws Exception {
		return null;
	}

	@Override
	public Class<?> getObjectType() {
		return null;
	}

	@Override
	public boolean isSingleton() {
		return FactoryBean.super.isSingleton();
	}
}
