package com.revature.info;

public class Student {
	
	private String name;
	private String comment;
	public Student(String name, String comment) {
		super();
		this.name = name;
		this.comment = comment;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	

}
