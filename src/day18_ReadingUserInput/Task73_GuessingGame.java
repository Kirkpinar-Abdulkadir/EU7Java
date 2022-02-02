package day18_ReadingUserInput;

import java.util.Scanner;

public class Task73_GuessingGame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int secretNumber=9;
		int userInput=0;
		
		System.out.println("Guess the number between 1-20:");
		
		while(userInput!=secretNumber) {
			
			userInput = sc.nextInt();
			 if(userInput<secretNumber) {
				 System.out.println("Enter a bigger number:");
			 }
			 if (userInput>secretNumber) {
				 System.out.println("Enter a smaller number");
			 }
		}
		System.out.println("Congrats! You found the number.");
		
		
		/*Ozzy wav
		 
		int userInput;
		int secretNumber=8;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number:");
		
		
		do {
			
			userInput=sc.nextInt();
			
			if(userInput<secretNumber) {
				System.out.print("Enter a bigger number:");
			}else if(userInput>secretNumber) {
				System.out.print("Enter a smaller number:");
			}else {
				System.out.print("Congrat you got it...");
			}
			
		}while(userInput != secretNumber);
		 */
	}

}
