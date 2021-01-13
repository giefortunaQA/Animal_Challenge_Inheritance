package com.qa.main;

public class Bird extends Animal{

	protected boolean isABird=true;
	@Override
	public void noise() {
		System.out.println("tweet tweet");
		
	}

	@Override
	public void reproduce() {
		System.out.println("I lay eggs");
		
	}
	
	protected void feathers() {
		System.out.println("I have feathers");
	}

}
