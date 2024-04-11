package com.chainsys.tasks1;

import java.util.Scanner;

public class RightTriangle {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter n:");
		int n=ob.nextInt();
		ValidationChecker b=new ValidationChecker();
		if(!b.inputchecker(n)) {
			return;
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println("");
		}

	}

}
