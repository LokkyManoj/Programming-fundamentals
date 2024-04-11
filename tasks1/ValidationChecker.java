package com.chainsys.tasks1;

public class ValidationChecker {
	public  boolean inputchecker(int n) 
	{
		if(n<0) {
			System.out.println("Error! Negative number detected. Cannot proceed.");
			return false;
		}
		return true;
	}
	public  boolean doublechecker(double n) 
	{
		if(n<0) {
			System.out.println("Error! Negative number detected. Cannot proceed.");
			return false;
		}
		return true;
	}
	public  boolean numberchecker(String s) 
	{
		try
		{
			Integer.parseInt(s);
			System.out.println("Dont use numbers");
			return false;
			
		}
		catch(Exception e){
			
			return true;
			
		}
	

}


	public boolean characterChecker(char c) {
	    if (!Character.isLetter(c)) {
	        System.out.println("Invalid input: Not a character");
	        return false;
	    }
	    return true;
	}
	
	public boolean stringChecker(String n) 
	{
		try 
		{
		  Integer.parseInt(n);
		  System.out.println("Invalid input. Please enter an integer ");
		  return false;
        
    } 
		catch (NumberFormatException e) 
	{
        
        return true;
    }
}

}
