package com.chainsys.methods;

public class CouponCalculator {
	public double couponCode(double n,String b) {
		if(n>2000&&n<5000) {
			
			System.out.println("2% discount is available");
			if(b.equals("COUP_2")) {
				System.out.println("Discount amount:"+(n*0.02));
				n-=n*0.02;
			}
			else if(n>5000) {
				
				System.out.println("5% discount is available");
				if(b.equals("COUP_5")) {
					System.out.println("Discount amount:"+(n*0.05));
					n-=n*0.05;
				}
			}
		}
		return n;
	}

	

}
