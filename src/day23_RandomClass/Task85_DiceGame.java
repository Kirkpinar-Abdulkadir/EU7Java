package day23_RandomClass;

import java.util.Random;

public class Task85_DiceGame {

	public static void main(String[] args) {

		int computersDice;
		int usersDice;
		int comWin=0;
		int userWin=0;
		
		Random rn = new Random();
		
		for(int i=1; i<=10; i++) {
			
			System.out.println("Rolling...");
			
			computersDice = rn.nextInt(6)+1;
			usersDice = rn.nextInt(6)+1;
			System.out.println("Computer: "+ computersDice+", User: "+ usersDice);
			
			if(computersDice>usersDice) {
				comWin++;
			}else if(usersDice>computersDice) {
				userWin++;		
			}
		}
		
		if(comWin>userWin) {
			System.out.println("Grand winner is Computer!!!");
		}else if(comWin<userWin) {
			System.out.println("Grand winner is User!!!");
		}else {
			System.out.println("Tie....");
		}
	}

}
