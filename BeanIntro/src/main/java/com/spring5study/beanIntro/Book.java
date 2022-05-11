package com.spring5study.beanIntro;

/**
 * @author Jiahao Wang
 * @create 2022-05-10 22:42
 */
public class Book {

	private String bname;
	private String bauthor;

	public Book () {}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getBauthor() {
		return bauthor;
	}

	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}

	public String toString (){
		return "bname = " + bname + ", bauthor = " + bauthor;
	}
}
