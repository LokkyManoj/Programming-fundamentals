package com.chainsys.methods;

import java.util.Scanner;

public class TaxiMain {

	public static void main(String[] args) {
		Validation valid = new Validation();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Name:");
		String name = input.next();
		if (!valid.numberchecker(name)) {
			return;
		}
		System.out.println("Enter a Distance:");
		int distance = input.nextInt(), farePerkm = 0;
		if (!valid.inputchecker(distance)) {
			return;
		}

		System.out.println("Enter a cab type:(Micro/Prime/Mini):");
		String type = input.next();
		if (!valid.numberchecker(type)) {
			return;
		}
		CabFare1 input1 = new CabFare1();

		switch (type.toLowerCase()) {
		case "micro":
			farePerkm = 10;
			break;
		case "mini":
			farePerkm = 15;
			break;
		case "prime":
			farePerkm = 20;
			break;
		default:
			System.out.println("Error");
		}

		double totalAmount = input1.totalAmount(distance, farePerkm);
		System.out.println("Total amount:" + totalAmount);
		if (totalAmount > 2000) {
			System.out.println("2% discount is available");
			System.out.println("Enter coupon code:");
			String coupon = input.next();
			CouponCalculator input2 = new CouponCalculator();
			double discountedAmount = input2.couponCode(totalAmount, coupon);
			System.out.println("Discounted amount: " + discountedAmount);
		} else {
			System.out.println("You are not eligible for any discount.");
		}

		input.close();

	}

}
