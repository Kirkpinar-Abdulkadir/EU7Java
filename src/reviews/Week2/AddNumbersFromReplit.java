package Week2;

import java.util.Scanner;

public class AddNumbersFromReplit {

	public static void main(String[] args) {
		//WRITE YOUR CODE HERE:
				int num1, num2, num3, num4, sum; // declared the variable

				Scanner scan = new Scanner (System.in);

				System.out.println("Enter 4 numbers:");
				num1 = scan.nextInt();
				num2 = scan.nextInt();
				num3 = scan.nextInt();
				num4 = scan.nextInt();
				
				// not necessary but you can close that object
				scan.close();


				sum = num1 + num2 + num3 + num4 ;

				System.out.println("Sum of numbers: "+sum);
	}

}
