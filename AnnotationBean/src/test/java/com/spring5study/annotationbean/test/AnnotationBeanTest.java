package com.spring5study.annotationbean.test;

import com.spring5study.annotationbean.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Jiahao Wang
 * @create 2022-05-12 20:30
 */
public class AnnotationBeanTest {

	@Test
	public void testStudent(){
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Student student = context.getBean("student", Student.class);
		student.print();
		System.out.println(student.course.getCname());
	}

}
