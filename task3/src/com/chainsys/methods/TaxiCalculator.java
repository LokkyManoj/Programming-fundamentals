package com.chainsys.methods;

public class TaxiCalculator {

	public double couponCode(double n, String b) {
		if (b.equals("COUP_2")) {
			System.out.println("Discount amount: " + (n * 0.02));
			n -= n * 0.02;
		}
		return n;
	}
}
