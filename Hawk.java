package com.qa.main;

public class Hawk extends Bird implements Flyable{

	@Override
	public void noise() {
		System.out.println("*hawk sounds*");;
	}

	@Override
	protected void feathers() {
		System.out.println("I have big boi feathers");
	}

	@Override
	public void fly() {
		System.out.println("I fly really fast!");
		
	}
	
}
