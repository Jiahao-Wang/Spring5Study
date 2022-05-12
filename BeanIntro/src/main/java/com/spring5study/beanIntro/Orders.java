package com.spring5study.beanIntro;

import java.util.List;

/**
 * @author Jiahao Wang
 * @create 2022-05-11 18:22
 */
public class Orders {
	private List<Order> orders;

	public List<Order> getOrders() {
		return orders;
	}


	@Override
	public String toString() {
		return "Orders{" +
				"orders=" + orders +
				'}';
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
}
