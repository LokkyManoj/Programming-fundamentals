package com.chainsys.string;

import java.util.Scanner;

public class Replace {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str =input.nextLine();
		System.out.println("Enter a string that want to change:");
		String oldStr =input.nextLine();
		System.out.println("Enter a new string:");
		String newStr =input.nextLine();
		String newString = str.replace(oldStr, newStr);
		System.out.println(newString);

	}

}
