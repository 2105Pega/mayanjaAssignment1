package com.revature.driver;

import com.revature.info.Student;
import com.revature.info.Trainer;

public class Driver {

	public static void main(String[] args) {
		
		Trainer trainer = new Trainer("Jason", "Always fun to work with!");
		Trainer trainer2 = new Trainer();
		
		Student student = new Student("stephen: ", " ");
		Student student2 = new Student();
		
		
		trainer2.setComment("He has a cat!!");
		student2.setComment("This bootcamp is going to be fire!");
		
		System.out.println(trainer.getName() + " is " + trainer.getComment() + " and " + trainer2.getComment() + "\n");
		System.out.println(student.getName() + student2.getComment());
		

	}

}
