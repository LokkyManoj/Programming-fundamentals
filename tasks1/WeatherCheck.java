package com.chainsys.tasks1;

import java.util.Scanner;

public class WeatherCheck {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.print("Is it raining (Y/N):");
		char a=ob.next().charAt(0);
		ValidationChecker b=new ValidationChecker();
		if(!b.characterChecker(a)) {
			return;
		}
		if(a=='Y'||a=='y') {
			System.out.println("Get An Umbrella");
		}
		System.out.println("Enter a degree: ");
		int degree=ob.nextInt();
		if(!b.inputchecker(degree)) {
			return;
		}
		
		if(degree<32) {
			System.out.println("Bring a heavy jacket");
			
		}
		else if(degree>=32&&degree<=50) {
			System.out.println("Bring a light jacket");
		}
		else {
			System.out.println("No need of jacket");
		}
		

	}

}
