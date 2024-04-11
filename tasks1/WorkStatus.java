package com.chainsys.tasks1;

import java.util.Scanner;

public class WorkStatus {

	public static void main(String[] args) {
		
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter your Gender(M/F):");
		char gender=ob.next().charAt(0);
		System.out.println("Are u Married(Y/N):");
		char status=ob.next().charAt(0);
		ValidationChecker b=new ValidationChecker();
		if(!b.characterChecker(gender)) {
			return;
		}
		System.out.print("Enter your Age :");
		int age=ob.nextInt();
		if(!b.characterChecker(status)) {
			return;
		}
		
		if(!b.inputchecker(age)) {
			return;
		}
		if((gender=='M'||gender=='m') &&(age>=20&&age<=40)) 
		{
			System.out.println("You can work in anywhere");
		}
		else if((gender=='M'||gender=='m')&&(age>=40&&age<=60))
		{
			System.out.println("You will work only in urban areas");
		}
		else if(gender=='F'||gender=='f') {
			System.out.println("You will work only in urban areas");
		}
		else {
			System.out.println("Error");
		}

	}

}
