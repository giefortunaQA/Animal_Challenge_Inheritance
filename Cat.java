package com.qa.main;

public class Cat extends Animal implements Walkable{

	@Override
	public void noise() {
		System.out.println("meowww");
		
	}

	@Override
	public void reproduce() {
		System.out.println("I give birth to kittens :3");
	}
	
	protected void scratch() {
		System.out.println("Get away from me hooman");
	}

	@Override
	public void walk() {
		System.out.println("I walk rather elegantly in fact");
		
	}

	@Override
	public void run() {
		System.out.println("Is that a mouse? zoooooom");
		
	}

}
