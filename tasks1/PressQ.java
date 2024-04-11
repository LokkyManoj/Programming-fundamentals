package com.chainsys.tasks1;

import java.util.Scanner;

public class PressQ {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        int sum = 0;
		        int count = 0;
		        long product = 1;

		        System.out.println("Enter integers (press 'q' to quit):");
		        ValidationChecker b=new ValidationChecker();
		        
		        while (true) {
		            String input = scanner.next();
		            if(!b.stringChecker(input)) {
						return;
					}

		            if (input.equalsIgnoreCase("q")) {
		                break;
		            }

		            
		                int number = Integer.parseInt(input);
		                sum += number;
		                product *= number;
		                count++;
		           
		        }

		        if (count > 0) {
		            double average = (double) sum / count;
		            System.out.println("Average of given numbers: " + average);
		            System.out.println("Product of given numbers: " + product);
		        } else {
		            System.out.println("No valid numbers entered.");
		        }

		       
		    }
		}





