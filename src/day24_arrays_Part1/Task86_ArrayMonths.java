package day24_arrays_Part1;

import java.util.Scanner;

public class Task86_ArrayMonths {

	public static void main(String[] args) {

		String[] monthName = new String[12];
		monthName[0] = "January";
		monthName[1] = "February";
		monthName[2] = "March";
		monthName[3] = "April";
		monthName[4] = "May";
		monthName[5] = "June";
		monthName[6] = "July";
		monthName[7] = "August";
		monthName[8] = "September";
		monthName[9] = "October";
		monthName[10] = "November";
		monthName[11] = "December";
		
		System.out.println("Enter month number:");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		System.out.println(monthName[month-1]);
		
		
	}

}
