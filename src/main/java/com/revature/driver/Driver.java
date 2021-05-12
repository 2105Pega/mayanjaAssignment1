package com.revature.driver;

import com.revature.info.Trainer;

public class Driver {

	public static void main(String[] args) {
		
		Trainer trainer = new Trainer("Jason", "Always fun to work with!");
		Trainer trainer2 = new Trainer();
		
		trainer2.setComment("He has a cat!!");
		
		System.out.println(trainer.getName() + " is " + trainer.getComment() + " and " + trainer2.getComment());
		

	}

}
