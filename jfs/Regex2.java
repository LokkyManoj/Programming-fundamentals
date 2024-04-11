package com.chainsys.jfs;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		String userName="^[a-zA-z]+$";
		System.out.println("Enter your UserName:");
		String name=input.next();
		while(!name.matches(userName)) {
			System.out.println("Give the correct UserName!");
			System.out.print("Enter your UserName(eg:Manoj) :");
			name=input.next();
		}
		String emailPattern="^[a-zA-Z0-9]+@[a-zA-Z]+\\.[A-Za-z]{2,}$";
		System.out.println("Enter your emailID :");
		String mailID=input.next();
		
		while(!mailID.matches(emailPattern)) {
			System.out.println("Give the correct emailID");
			System.out.print("Enter your email(eg: puli@gmail.com) :");
			mailID=input.next();
		}
		String passWordpattern="^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[_.$#@%&]{8,}+$";
		System.out.println("Enter your Password :");
		String pass=input.next();
		while(!pass.matches(passWordpattern)){
			System.out.println("Give the correct password");
			System.out.print("Enter your Password(eg:Welcome@123) :");
			pass=input.next();
		}
		System.out.println("Successfully logged in");
		
		
		
	}

}
