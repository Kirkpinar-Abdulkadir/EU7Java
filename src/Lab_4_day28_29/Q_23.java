package Lab_4_day28_29;

import java.util.Arrays;

public class Q_23 {

	public static void main(String[] args) {
		
		/*Write a method that accepts a number and create and prints 
		 * a new array of length number, containing the numbers 0,1,2,...number-1.
		 */
		
		System.out.println(Arrays.toString(fizzArray(4)));
		System.out.println(Arrays.toString(fizzArray(1)));
		System.out.println(Arrays.toString(fizzArray(10)));
	
		

	}
	
	public static int[] fizzArray(int x) {
		
		int[] arr = new int[x];
		
 		for(int i=0; i<x; i++) {
			arr[i] = i;
		}
 		return arr;
	}

}
