package com.chainsys.workout;

public class Validation {
	public  boolean inputchecker(int n) 
	{
		if(n<0) {
			System.out.println("Error! Negative number detected. Cannot proceed.");
			return false;
		}
		return true;
	}
	}

