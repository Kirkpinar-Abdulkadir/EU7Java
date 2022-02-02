package day10_ControlFlowStatements_Part4;

import java.util.Scanner;

public class Task46_MultiplicationTable {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		System.out.println("Multiplication table for "+num);
		System.out.println("--------------------------");
		
		for(int i=1; i<=10; i++) {
			System.out.println(num+"*"+i+"="+(num*i));
		}
	}

}
