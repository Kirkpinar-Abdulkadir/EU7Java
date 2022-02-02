package day18_ReadingUserInput;

import java.util.Scanner;

public class Task74_possitivNumber {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);		
		
		int sum=0;
		
		do {
			System.out.print("Enter numbers to add:");
			
			int num = sc.nextInt();		
			if(num<0) {
				System.out.println("you entered a negativ number, that is the end.");
				System.out.println("Total is: " + sum);
				break;
			}
			sum+=num;
			System.out.println("Total is: " + sum);
			
		}while(true);

	}

}
