package Week2;

import java.util.Scanner;

public class AssignmentOperatorsReview {

	public static void main(String[] args) {
		
		// 1.create a scanner object and import
		Scanner input=new Scanner (System.in);
		
		//2. promt User
		System.out.println("Provide how much you ake hourly:");
		
		//3.pick the value from konsol
		int hourlyRate = input.nextInt(); // the part that you need to know right now
		
		
		
		
		//hard coded
		//int hourlyRate=50;
		int weeklyHours=40;
		int monthlyTax=200;
		
		//how much i make monthly aftre Tax, use shorthand operators
		int monthlyPayCheck=0;
		monthlyPayCheck += hourlyRate*weeklyHours;
		monthlyPayCheck *= 4;
		monthlyPayCheck -= monthlyTax;
		
		System.out.println("Yoursalary is "+monthlyPayCheck);
	}

}
