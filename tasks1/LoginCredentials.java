package com.chainsys.tasks1;

import java.util.Scanner;

public class LoginCredentials {

	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter a Username :");
		String name=ob.next();
		ValidationChecker b=new ValidationChecker(); 
		if(!b.numberchecker(name)) {
			return;
		}
		System.out.println("Enter a Password :");
		String password=ob.next();
		String n="^[a-zA-Z_]+$";
		String p="^[0-9]+$";
		if(!name.matches(n)||!password.matches(p)) 
		{
			System.out.println("The given credentials is incorrect");
		}
		else {
			System.out.println("Successfully logined");
		}
		


	}

}
