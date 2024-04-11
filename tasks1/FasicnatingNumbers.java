package com.chainsys.tasks1;

import java.util.Scanner;

public class FasicnatingNumbers {
		    
		    static boolean facinateFinder(int num) {
		        String concatenated = String.valueOf(num) + String.valueOf(num * 2) + String.valueOf(num * 3);
		        if (concatenated.length() != 9) {
		            return false;
		        }
		        for (int i = 1; i <= 9; i++) {
		            if (!concatenated.contains(String.valueOf(i))) {
		                return false;
		            }
		        }
		        return true;
		    }

		    public static void main(String[] args) {
		        int number;
		        String facinate = "123456789";
		        Scanner sc = new Scanner(System.in);
		        System.out.println("enter num 1 :");
		        number = sc.nextInt();
		        ValidationChecker validate = new ValidationChecker();
		        if(validate.inputchecker(number)) {
		            if(facinateFinder(number)) {
		                System.out.println("facinating number");
		            }
		            else {
		                System.out.println("not facinating number");
		            }
		        }
		    }
		}

	
