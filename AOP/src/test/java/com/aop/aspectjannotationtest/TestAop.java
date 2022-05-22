package com.aop.aspectjannotationtest;

import com.aop.aspectjannotation.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-17 19:14
 */
public class TestAop {

	@Test
	public void testAopAnno() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

		User user = context.getBean("user", User.class);
		user.add();
	}
}
