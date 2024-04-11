package com.chainsys.tasks1;

import java.util.Scanner;

public class ShopDiscount {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		int amount=ob.nextInt();
		ValidationChecker b=new ValidationChecker();
		if(!b.inputchecker(amount)) {
			return;
		}
		int unit=100;
		int totalcost=amount*unit;
		if(totalcost>=1000) 
		{
			totalcost-=(totalcost*10/100);
		}
		
System.out.println("Total cost:"+totalcost);
	}

}
