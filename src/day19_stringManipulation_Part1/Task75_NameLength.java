package day19_stringManipulation_Part1;

import java.util.Scanner;

public class Task75_NameLength {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your fullname");
		String name = sc.nextLine();
		
		System.out.println("Total characters: " + name.length());
	}

}
