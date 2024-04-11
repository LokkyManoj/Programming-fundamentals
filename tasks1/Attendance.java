package com.chainsys.tasks1;

import java.util.Scanner;

public class Attendance {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter class attended :");
		int attendedclass=ob.nextInt();
		ValidationChecker b=new ValidationChecker();
		if(!b.inputchecker(attendedclass)) {
			return;
		}
		int totalclass=100;
		while(attendedclass>totalclass) {
			System.out.println("Error! attended class was greater than totalclass");
		}
		System.out.print("Do you have medical issuses (Y/N) :");
		char a=ob.next().charAt(0);
	double percentage=((double) attendedclass/totalclass)*100;
		System.out.println("Attendance Percentage :"+percentage);
		if(percentage>=75||a=='Y'||a=='y') 
		{
			System.out.println("You are allowed to write an exam");
		}
		else {
			System.out.println("You are not allowed to write an exam");
		}	


	}

}
