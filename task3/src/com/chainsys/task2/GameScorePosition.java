package com.chainsys.task2;

import java.util.Scanner;

import com.chainsys.tasks1.ValidationChecker;

public class GameScorePosition 
{
	public static int calculateHighScorePosition(int score) 
    {
        if (score>=1000)
        {
            return 1;
        }
        else if(score>=500&&score<1000)
        {
            return 2;
        }
        else if(score>=100&&score<500)
        {
            return 3;
        }
        else
        {
            return 4;
        }
    }
	public static void displayHighScorePosition(String name, int position)
	{
        System.out.println("Player name:"+name);
        System.out.println("Place:"+position);
    }

    public static void main(String[] args){
    	ValidationChecker d=new ValidationChecker();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter name: ");
		String name = input.nextLine();
		if(!d.numberchecker(name)) {
			return;
		}
		System.out.print("Enter score: ");
		int points = input.nextInt();
		int position = calculateHighScorePosition(points);
		displayHighScorePosition(name, position);
		}
}

