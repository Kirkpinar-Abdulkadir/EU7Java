package day25_arrays_Part2;

import java.util.Scanner;

public class PayArray {

	public static void main(String[] args) {
		

		//This program stores in an array the hours worked for by 5 employees
		//who all make the same hourly wage.
		//display their gross pay
		
		Scanner sc = new Scanner(System.in);
		
		int[] hours = new int[5];
		
		for(int i=0; i<hours.length; i++) {
			System.out.print("Enter work hours employee " + (i+1) + " : ");
			hours[i]=sc.nextInt();
		}
		
		System.out.println();
		System.out.println("Enter hourly wage:");
		double wage = sc.nextDouble();
		
		for(int i=0; i<hours.length; i++) {
			
			System.out.println("Gross pay employee " + (i+1) + "= $" + wage*hours[i]);
			
		}
		

	}

}
