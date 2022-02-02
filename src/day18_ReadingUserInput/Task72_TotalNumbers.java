package day18_ReadingUserInput;

import java.util.Scanner;

public class Task72_TotalNumbers {

	public static void main(String[] args) {
		
				
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter 3 numbers:");
				int num1=sc.nextInt();
				int num2=sc.nextInt();
				int num3=sc.nextInt();
				
				System.out.println("Total is: "+(num1+num2+num3));
	}

}
