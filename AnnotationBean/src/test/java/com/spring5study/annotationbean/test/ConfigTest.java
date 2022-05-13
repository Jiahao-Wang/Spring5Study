package com.spring5study.annotationbean.test;

import com.spring5study.annotationbean.Student;
import com.spring5study.annotationbean.config.SpringConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Jiahao Wang
 * @create 2022-05-12 21:39
 */
public class ConfigTest {
	@Test
	public void testStudent(){
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Student student = context.getBean("student", Student.class);
		student.print();
		System.out.println(student.course.getCname());
	}
}
