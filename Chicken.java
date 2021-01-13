package com.qa.main;

public class Chicken extends Bird implements Walkable{

	@Override
	public void noise() {
		System.out.println("cuckadoodledoo");
	}
	
	protected void turnToFriedChicken() {
		System.out.println("Eat me I'm a delicious fried chicken!");
	}

	@Override
	public void walk() {
		System.out.println("I can cross a road");
		
	}

	@Override
	public void run() {
		System.out.println("I can run too");
		
	}
	
}
