package com.chainsys.tasks1;

import java.util.Scanner;

public class HalfDiamond {

	public static void main(String[] args) {
		ValidationChecker b=new ValidationChecker();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No");
		int n=sc.nextInt();
		
		if(!b.inputchecker(n)) {
			return;
		}
		 for (int i=0; i<n; i++){ 
			 
             for (int j=n; j>i+1; j--) 
            	 
               System.out.print("  ");
             
             for (int j=0; j<=i*2; j++ ) 
               System.out.print("*"); 
          System.out.println(); 
      } 
		for(int i=n-1;i>0;i--)     
		   {
		      for(int k=n;k>i;k--)     
		         System.out.print("  ");    
		      for(int j=0;j<i*2-1;j++) {
		         System.out.print("*");    
		      }
		      System.out.println();     
		   }
		

	}

}
