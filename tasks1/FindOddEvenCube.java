package com.chainsys.tasks1;

import java.util.Scanner;

public class FindOddEvenCube {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter a Limit:");
		int n=ob.nextInt();
		ValidationChecker b=new ValidationChecker();
		if(!b.inputchecker(n)) {
			return;
		}
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i+" is even");
			}
			else {
				
				System.out.println(i+" is odd");
			}
			
		}
		System.out.println("The cube of "+n+" is:"+n*n*n);

	}

}
