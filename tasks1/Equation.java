package com.chainsys.tasks1;

import java.util.Scanner;

public class Equation {

	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		ValidationChecker d=new ValidationChecker();
		System.out.print("Enter a:");
		int a=ob.nextInt();
		
		if(!d.inputchecker(a)) {
			return;
		}
		System.out.print("Enter b:");
		int b=ob.nextInt();
		if(!d.inputchecker(b)) {
			return;
		}
	
		for(int i=a;i<=b;i++) 
		{
			int c=(2*(i*i)+i+5);
			System.out.println(c);
		}
		

	}

}
