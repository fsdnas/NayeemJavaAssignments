package com.shristi.interfaces;

public class Main {

	public static void main(String[] args) {
		BasicCalculator b = new Basic();
		b.add(100, 430);
		b.difference(39, 89);
		b.product(23, 98);
		b.divide(130, 3);
		System.out.println();

		ScientificCalculator sc = new Scientific();
		sc.add(100, 430);
		sc.difference(39, 89);
		sc.product(23, 98);
		sc.divide(130, 3);
		sc.square(2);
		sc.cube(3);

		System.out.println();

	}

}
