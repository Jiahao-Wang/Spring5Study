package com.spring5study.beanIntroTest;

import com.spring5study.beanIntro.*;
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

	@Test
	public void testLibrary() {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("bean.xml");

		Library library = context.getBean("library", Library.class);
		System.out.println(library.toString());
	}

	@Test
	public void testStudent() {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("bean1.xml");

		Student student = context.getBean("student", Student.class);
		System.out.println(student.toString());
	}


	// 测试注入对象的list
	@Test
	public void testOrders() {
		//1 加载spring配置文件
		ApplicationContext context =
				new ClassPathXmlApplicationContext("bean3.xml");

		//2 获取配置创建的对象
		Orders orders = context.getBean("orders", Orders.class);
		System.out.println(orders.toString());

	}

	@Test
	public void testSchool(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
		School school = context.getBean("school", School.class);

		System.out.println("第四步 获取创建 bean 实例对象");
		System.out.println(school);

		//手动让 bean 实例销毁
		context.close();
	}

}
