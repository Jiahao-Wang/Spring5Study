package com.spring5study.beanIntro;

/**
 * @author Jiahao Wang
 * @create 2022-05-10 22:47
 */
public class Order {

	private String oname;
	private String address;

	public Order (String oname, String address) {
		this.oname = oname;
		this.address = address;
	}

	public String toString (){
		return "oname = " + oname + ", address = " + address;
	}
}
