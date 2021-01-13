package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		Animal chicken=new Chicken();
		chicken.noise();
		((Chicken)(chicken)).turnToFriedChicken();

	}

}
