package com.aop.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-17 17:38
 */
public class UserDaoProxy implements InvocationHandler {

	// 这个 obj 是被代理的对象
	private Object obj;


	// 通过有参构造器传入被代理的对象
	public UserDaoProxy(Object obj) {
		this.obj = obj;
	}


	// 在这写增强的逻辑
	// proxy：被代理的对象
	// method：被代理的方法（是个数组哦
	// args：传入的参数
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		// 可以用 method.getName() 来判断不同方法，然后运行不同逻辑

		// 执行之前：
		System.out.println("before execute: " + method.getName());

		// 被增强的方法执行：
		Object res = method.invoke(obj, args);

		// 执行之后：
		System.out.println("after execute:");

		return res;
	}
}
