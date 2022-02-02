package day10_ControlFlowStatements_Part4;

import java.util.Scanner;

public class Task45_RepeatedGreaterNumber {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("How many times do you want to compare");
		int comp=scan.nextInt();
		
		for (int i=1 ;i<=comp ; i++) {
		System.out.println("Enter 2 numbers");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
			if(num1>num2) {
				System.out.println("Number 1 is greater");
				
			}else if(num1<num2){
				System.out.println("Number 2 is greater");
			
			}else if(num1==num2){
				System.out.println("Numbers are equal");
			}
		
		
		}
	}

}
