package com.chainsys.string;

import java.util.Scanner;

import com.chainsys.tasks1.ValidationChecker;

public class ToggleCharacters {

	public static void main(String[] args) {
	Scanner toggle=new Scanner(System.in);
	ValidationChecker b=new ValidationChecker();
	System.out.print("Enter a String:");
	String name=toggle.next();
	 
	if(!b.numberchecker(name)) {
		return;
	}
	
	String backup="";
	for(int i=0;i<name.length();i++) {
		if(Character.isLowerCase(name.charAt(i))) {
			backup+=Character.toUpperCase(name.charAt(i));
		}
		
	}
	System.out.println("The Toggled result is:"+backup);

	}

}
