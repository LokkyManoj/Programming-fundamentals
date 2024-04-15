package com.chainsys.workout;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Validation validate=new Validation();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Year:");
		int year=sc.nextInt();
		 if(!validate.inputchecker(year)) {
				return;
			}
			else{
		if(year%400==0) {
			System.out.println("This is leap year");
		}
		else if(year%4==0&&year%100!=0)
		{
System.out.println("This is leap year");
	}
		else {
			System.out.println("This is not leap year");
		}
		}
	}

}
