package com.shristi.interfaces;

public class Scientific extends Basic implements ScientificCalculator {

	@Override
	public void square(int x) {
		System.out.println("Square of " + x + "is  " + Math.pow(x, 2));

	}

	@Override
	public void cube(int x) {
		System.out.println("Cube of " + x + "is  " + Math.pow(x, 3));

	}

}
