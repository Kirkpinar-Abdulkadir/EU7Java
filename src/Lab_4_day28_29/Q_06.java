package Lab_4_day28_29;

import java.util.Arrays;

public class Q_06 {

	public static void main(String[] args) {
		/*Write a method that accepts an array and figure out which is greatest element 
		 * in the array, a and set all the other elements to be that value. 
		 * Print the changed array.
		 */
		int[] x = {1,2,3};
		int[] y = {11,5,9}; 
		int[] a = {110,5,98,0,1200,11,-4};

		System.out.println(Arrays.toString(greatestElement(x)));
		System.out.println(Arrays.toString(greatestElement(y)));
		System.out.println(Arrays.toString(greatestElement(a)));
	}
	
	public static int[] greatestElement(int[] arr) {
		
		int greatest = arr[0];
		
		for(int i=0; i<arr.length-1; i++) {
			
			if(arr[i+1]>greatest) {
			
				greatest = arr[i+1];
			
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = greatest;
		}
		return arr;
	}

}
