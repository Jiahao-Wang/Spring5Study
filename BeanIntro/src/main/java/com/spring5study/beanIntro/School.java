package com.spring5study.beanIntro;

/**
 * @author Jiahao Wang
 * @create 2022-05-12 19:42
 */
public class School {
	private String name;

	public School() {
		System.out.println("第一步 执行无参数构造创建 bean 实例");
	}

	public School(String name) {
		this.name = name;
		System.out.println("第一步 执行无参数构造创建 bean 实例");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("第二步 调用 set 方法设置属性值");
	}

	//创建执行的初始化的方法
	public void initMethod() {
		System.out.println("第三步 执行初始化的方法");
	}

	//创建执行的销毁的方法

	public void destroyMethod() {
		System.out.println("第五步 执行销毁的方法");
	}
}
