package com.chainsys.string;

import java.util.Scanner;

import com.chainsys.tasks1.ValidationChecker;

public class NumberOfCharacters {

	public static void main(String[] args) {
		Scanner number=new Scanner(System.in);
		ValidationChecker b=new ValidationChecker();
		System.out.println("Enter a UserName:(username must be within 10 characters)");
		String userName=number.next();
		
		if(!b.numberchecker(userName)) {
			return;
		}
		int count=0;
		for(int i=0;i<userName.length();i++) {
			count++;
			
			
		}
		System.out.println("The length of your username is "+count);
		if(count>10) {
			System.out.println("Too long!");
		}
		else {
			System.out.println("UserName Taken!");
		}

	}

}
