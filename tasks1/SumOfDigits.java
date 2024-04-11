package com.chainsys.tasks1;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
	Scanner ob=new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=ob.nextInt();
	 ValidationChecker b=new ValidationChecker();
     if(!b.inputchecker(n)) {
			return;
		}
	int temp,sum=0;
	
	while(n>0)
	{
		temp=n%10;
		sum+=temp;
		n=n/10;
		
	}
	System.out.println("The sum of digits :"+sum);
	

	}

}
