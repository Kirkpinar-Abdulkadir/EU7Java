package week6;

import java.util.Arrays;

public class A03_ArrayLoopWithConditions {

	public static void main(String[] args) {

		double[] prices = {22.9, 12.4, 43.12, 65.0, 150.9, 100.87, 90.5, 124.9, 234.56};
		
		// we put a dummy variable wwith the same type.
		for(double price : prices) {
			System.out.println(price);
		}
		
		System.out.println(Arrays.toString(prices));
		System.out.println("**********  Over 100  ************");
		
		//first condition: you want to print out prices over 100.
		
		for(double price : prices) {
			if (price>100) {
			System.out.println(price);
			}
		}
		
		System.out.println("**********  Between 40-150  ************");
		// second cond.=> print the prices between 40 and 150
		
		Arrays.sort(prices);
		System.out.println(Arrays.toString(prices));
		
		for(double price : prices) {
			if (price>40 && price<150) {
			System.out.println(price);
			}
		}
		
		
		System.out.println("**********  number of over 60 ************");

		//third cond.=> count the prices which are more than sixty.
		int count=0;
		
		for(double price : prices) {
			if (price>60 ) {
			count++;
			}
		}
		System.out.println(count);
	}

}
