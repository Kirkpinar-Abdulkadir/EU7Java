package Lab_4_day28_29;

import java.util.Arrays;

public class Q_09 {

	public static void main(String[] args) {
		
		/* Write a method that accepts an array and prints a new array
		 * with double the length where its last element is the same as the original array,
		 */
		int[] x = {4,5,6}; 
		
		System.out.println(Arrays.toString(newArr(x)));

	}
	
	public static int[] newArr(int[] arr) {
		
		int[] arr1 = new int[arr.length*2];
		
		arr1[arr1.length-1] = arr[arr.length-1];
		
		return arr1;
	}

}
