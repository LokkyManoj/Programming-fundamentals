package com.chainsys.workout;

import java.util.Scanner;

public class FrequencyOfCharacters {

	public static void main(String[] args) {
		Validation validate=new Validation();
		Scanner input=new Scanner(System.in);
		String special="^[@#$%^&*()!]+$";
		String special1="^[A-Za-z]+[@#$%^&*()!]+$";
		System.out.println("Enter a string:");
		String name=input.next();
		if(name.matches(special)||(name.matches(special1))) {
			System.out.println("Dont use Special characters");
			
		}
		else {
			
		
		if(!validate.numberchecker(name)) {
			return;
		}
		int[] freq=new int[name.length()];
	
		char str[]=name.toCharArray();
		for(int i=0;i<name.length();i++) {
			freq[i]=1;
			for(int j=i+1;j<name.length();j++) {
				if(str[i]==str[j]) {
					freq[i]++;
					str[j]='0';
				}
			}
		}
	    for(int i=0;i<freq.length;i++) { 
	       if(str[i]!=' '&&str[i]!='0') 
	          System.out.println("The character "+str[i]+ " occurs" + freq[i]+" times"); 
	}
		}

}
}
