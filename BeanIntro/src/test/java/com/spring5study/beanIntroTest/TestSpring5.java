package com.spring5study.beanIntroTest;

import com.spring5study.beanIntro.Book;
import com.spring5study.beanIntro.Order;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author Jiahao Wang
 * @create 2022-05-10 22:51
 */
public class TestSpring5 {
	@Test
	public void testBook() {
		//1 加载spring配置文件
		ApplicationContext context =
				new ClassPathXmlApplicationContext("bean.xml");

		//2 获取配置创建的对象
		Book book = context.getBean("book", Book.class);
		System.out.println(book.toString());
	}

	@Test
	public void testOrder() {
		//1 加载spring配置文件
		ApplicationContext context =
				new ClassPathXmlApplicationContext("bean.xml");

		//2 获取配置创建的对象
		Order order = context.getBean("order", Order.class);
		System.out.println(order.toString());

	}
}
