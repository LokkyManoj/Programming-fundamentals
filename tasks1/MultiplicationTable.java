package com.chainsys.tasks1;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		ValidationChecker d=new ValidationChecker();
		System.out.println("Enter a limit:");
		int a=ob.nextInt();
		if(!d.inputchecker(a)) {
			return;
		}
		System.out.println("Enter a number to be  multiply:");
		int b=ob.nextInt();
		if(!d.inputchecker(b)) {
			return;
		}
		
		for(int i=1;i<=a;i++) {
			System.out.println(i+"*"+b+"="+i*b);
		}
		

	}

}
