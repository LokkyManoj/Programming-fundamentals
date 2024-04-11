package com.chainsys.tasks1;

import java.util.Scanner;

public class EvenDigits {

	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter n :");
		int n=ob.nextInt();
		ValidationChecker b=new ValidationChecker();
		if(!b.inputchecker(n)) {
			return;
		}
		if(n<0) {
			System.out.println("Cannot further proceed");
		}
		int temp=0;
		while(n>0) 
		{
			temp=n%10;
			if(temp%2==0) {
				System.out.println(temp+" is even");
			}
			n=n/10;
			
		}
		
	
		

	}

}
