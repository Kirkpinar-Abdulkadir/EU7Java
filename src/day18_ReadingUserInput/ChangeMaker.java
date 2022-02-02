package day18_ReadingUserInput;

import java.util.Scanner;

public class ChangeMaker {

	public static void main(String[] args) {
		
		//enter a whole number from 1-99 and I will find a combination of coins
		//that equals that amount of change.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your change value:");
		int attempt = 1;
		
		
		while(attempt<=4) {
			
			
			int change = sc.nextInt();
			if(change>=1 && change<=99) {
				changeMaker(change);
				break;
			}else if(attempt==3) {
				System.out.println("Sorry, You can not try any more!");
				break;
			}else {
				System.out.println("Invalid change, please try again:");
				attempt++;
			}
			
		}
		
	}
	
	public static void changeMaker (int change) {
		
		int quarters = change/25;
		int dimes = (change%25)/10;
		int nickles = (change-(quarters*25+dimes*10))/5;
		int pennies = change-(quarters*25+dimes*10+nickles*5);
		
		System.out.println(change + " cents in coins can be given as:" );
		System.out.println(quarters + " quarters");
		System.out.println(dimes + " dimes");
		System.out.println(nickles + " nickles");
		System.out.println(pennies + " pennies");
	}

}
