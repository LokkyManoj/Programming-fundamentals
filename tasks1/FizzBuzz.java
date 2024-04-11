package com.chainsys.tasks1;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		ValidationChecker d=new ValidationChecker();
		System.out.println("Enter a:");
		int a=ob.nextInt();
		if(!d.inputchecker(a)) {
			return;
		}
		System.out.println("Enter b:");
		int b=ob.nextInt();
		if(!d.inputchecker(b)) {
			return;
		}
		for(int i=a;i<=b;i++) {
			if(i%3==0&&i%5==0) {
				System.out.println("FizzBuzz");
			}
			else {
			 if(i%3==0) {
				System.out.println("Fizz");
			}
			else if
			(i%5==0){
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}
			 
			}
		}
		

	}

}
