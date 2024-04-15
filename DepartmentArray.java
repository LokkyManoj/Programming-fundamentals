package com.chainsys.workout;

import java.util.Arrays;
import java.util.Scanner;

public class DepartmentArray {

	public static void main(String[] args) {
		Validation validate=new Validation();
		String[] depName={"CSE","IT","ECE","EEE","BIOTECH"};
		String[] depId={"100","101","102","103","104"};

		String[][] students={{"Manoj","Gopika"},{"Lalitha","Daniel","Asik","Mathesh" },{"Luffy","Franky","Nami","Zoro","Sanji"},{"Gayathri","Satheesh","kavin","Yalini"},{"Boobesh","Nalini","JaiKissan" } };

		Scanner input=new Scanner(System.in);
		System.out.println("Enter a Department id or name:");
		String input1=input.nextLine();
		if(!validate.isValidInput(input1)) 
		{
            System.out.println("Invalid");
            return; 
            }
		boolean found = false;
		for(int i=0;i<depId.length;i++) {
			if(depId[i].equals(input1)||depName[i].equals(input1)) 
			{
				found = true;
				System.out.println("Students in "+depName[i]+" department:");
				for(String student:students[i])
				{
					System.out.println(student);
				}
				break;
			}
		}

		if(!found)
		{
			System.out.println("No such department exists");
		}
	}

}
