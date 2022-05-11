package com.spring5study.beanIntro;

/**
 * @author Jiahao Wang
 * @create 2022-05-11 12:22
 */
public class Library {
	private Book b;

	public Book getB() {
		return b;
	}

	public void setB(Book b) {
		this.b = b;
	}

	public String toString () {
		return b.toString();
	}
}
