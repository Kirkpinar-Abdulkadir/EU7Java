package day18_ReadingUserInput;

import java.util.Scanner;

public class UserInput2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Provide a sentence and I will repeat it:");
		
		//String str = sc.next(); bu methodla arasinda bosluk olmayan Stringler okunur.
		
		String str2 = sc.nextLine(); //bununla da bosluklu olanlar okunur.
		
		System.out.println(str2);
		
				
	}

}
