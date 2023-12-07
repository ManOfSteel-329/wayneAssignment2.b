package com.coderscampus.HigherLowerGuessingGame;

import java.util.Random;
import java.util.Scanner;

public class HigherLowerGuessingGame {

	public static void main(String[] args) {

		Random random = new Random();
		int theRandomNumber = random.nextInt(100)+1;
		System.out.println(theRandomNumber);
		 
		int userPick = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Please pick a number between 1 amd 100: ");
		String input = scan.nextLine();
		int intInput = Integer.parseInt(input);
		
		userPick = intInput;
		int userAttempts = 1;
		
		boolean win = false;

		while (!win && userAttempts < 5) {
			
			if (userPick < theRandomNumber) {
				System.out.println("Your number is too low");
			}else if (userPick > theRandomNumber) {
				System.out.println("Your number is too high");
			}else if (userPick == theRandomNumber) {
				win = true;
			}
			
			if (!win) {
				System.out.println("Try again: ");
				input = scan.nextLine();
				intInput = Integer.parseInt(input);
				userPick = intInput;
				userAttempts = userAttempts + 1;
			}			
		}
		if (win) { // break in while loop means userAttempts < 4
			System.out.println("You Won!!!");
		}
		if (userAttempts == 5) {
			System.out.println("You Lost!!!");
		}
		// System.out.println("You won!!!");	
		scan.close();
	}

}
