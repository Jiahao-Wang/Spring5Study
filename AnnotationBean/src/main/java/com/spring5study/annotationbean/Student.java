package com.spring5study.annotationbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author Jiahao Wang
 * @create 2022-05-12 20:28
 */

// @Component(value = "student")  里面的值可以不写，默认是首字母小写的类名
// 这个值 相当于 xml 里面的 bean id
@Component
public class Student {

	@Autowired
	@Qualifier(value = "c")
//	@Resource(name = "c")
	public Course course;

	@Value(value = "abc")
	public String name;

	public void print(){
		System.out.println("In student: " + name);
	}
}
