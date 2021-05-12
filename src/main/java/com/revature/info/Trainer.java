package com.revature.info;

public class Trainer {
	
	private String name;
	private String comment;
	private String co;
	
	public Trainer(String name, String comment) {
		super();
		this.name = name;
		this.comment = comment;
	}
	
	public Trainer() {
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
	
	
	@Override
	public String toString() {
		return "Trainer [name=" + name + ", comment=" + comment + "]";
	}
	
   
	
	

}//end class

