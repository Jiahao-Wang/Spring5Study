package com.spring5study.annotationbean;

import org.springframework.stereotype.Component;

/**
 * @author Jiahao Wang
 * @create 2022-05-12 21:12
 */
@Component(value = "c")
public class Course {
	private String cname;

	public Course(){
		cname = "course";
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}
}
