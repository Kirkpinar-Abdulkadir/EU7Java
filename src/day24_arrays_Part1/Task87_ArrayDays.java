package day24_arrays_Part1;

import java.util.Scanner;

public class Task87_ArrayDays {

	public static void main(String[] args) {
		
		String[] dayName = new String[7];
		
		dayName[0] = "Monday";
		dayName[1] = "Tuesday";
		dayName[2] = "Wednesday";
		dayName[3] = "Thursday";
		dayName[4] = "Friday";
		dayName[5] = "Saturday";
		dayName[6] = "Sunday";
		
		System.out.println("Enter day's index number:");
		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt();
		
		System.out.println("Today is " + dayName[index]);

	}

}
