package com.chainsys.task2;

import java.util.Scanner;

public class TeenNumberChecker {
	public boolean isTeen(int n) {
		for(int i=13;i<=19;i++) {
			if(n==i) {
				return(true);
			}
		}
		return(false);
		
		
	}
	public boolean hasTeen(int n1,int n2,int n3) {
		for(int i=13;i<=19;i++) {
			if(n1==i||n2==i||n3==i) {
				return true;
			}
		}
		return false;
	}
	

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number:");
		 int num=input.nextInt();
		 TeenNumberChecker checker=new TeenNumberChecker();
		 boolean result1 = checker.isTeen(num);
		 System.out.println(result1);
		 System.out.println("Enter three numbers:");
		    int num1 = input.nextInt();
		    int num2 = input.nextInt();
		    int num3 = input.nextInt();
		    boolean result2=checker.hasTeen(num1, num2, num3);
		 System.out.println(result2);
		

	}

}
