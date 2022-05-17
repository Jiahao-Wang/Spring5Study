package com.aop.jdkproxy;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-17 17:37
 */
public class UserDaoImpl implements UserDao{
	@Override
	public int add(int a, int b) {
		System.out.println("a + b:");
		return a + b;
	}

	@Override
	public String update(String id) {
		return id;
	}
}
