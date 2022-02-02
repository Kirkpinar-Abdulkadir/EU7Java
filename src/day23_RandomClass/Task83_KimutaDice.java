package day23_RandomClass;

import java.util.Random;
import java.util.Scanner;

public class Task83_KimutaDice {

	public static void main(String[] args) {

		int dice1;
		int dice2;
		String answer;
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		
		do {
			
			System.out.println("rolling the dice...");
			dice1 = rn.nextInt(6)+1;
			dice2 = rn.nextInt(6)+1;
						
			System.out.println("Their values are: " + dice1+" "+dice2 );
			System.out.println("Roll them again (y=yes)");
			answer = sc.next();
			
			
		} while (answer.equalsIgnoreCase("y"));
		
	}

}
