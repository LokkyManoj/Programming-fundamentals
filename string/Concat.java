package com.chainsys.string;

import java.util.Scanner;

public class Concat {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Your Name:");
		String name=input.next();
		System.out.println("Enter Your Father Name:");
		String fname=input.next();
		System.out.println("Your generated Email was "+name.concat(fname)+"@"+"gmail.com");
		
		

	}

}
