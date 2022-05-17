package com.aop.aspectjannotation;

import org.springframework.stereotype.Component;

/**
 * @author Jiahao Wang
 * @Description 被增强类
 * @create 2022-05-17 19:01
 */
@Component
public class User {
	public void add() {
		System.out.println("add");
	}
}
