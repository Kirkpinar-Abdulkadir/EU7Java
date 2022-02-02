package day24_arrays_Part1;

import java.util.Random;
import java.util.Scanner;

public class Task88_ArrayCars {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		
		
		String[] cars = new String[7];
		
		
		cars[0] = "Honda";
		cars[1] = "Toyota";
		cars[2] = "Nissan";
		cars[3] = "BMW";
		cars[4] = "Mercedes";
		cars[5] = "Porsche";
		cars[6] = "Ferrari";
		
		System.out.println("Enter the index number of your dream car:");
		int index = sc.nextInt();
		
		System.out.println("Your dream car's price is:");
		
		if(cars[index].equals("Honda")||cars[index].equals("Toyota")||cars[index].equals("Nissan")) {
			
			System.out.println(rn.nextInt(20001)+20000); //((max-min)+1)+min
			
		}else if(cars[index].equals("BMW")||cars[index].equals("Mercedes")) {
			
			System.out.println(rn.nextInt(30001)+50000);
			
		}else if(cars[index].equals("Porsche")||cars[index].equals("Ferrari")) {
			
			System.out.println(rn.nextInt(50001)+100000);
			
		}
		
	}

}
