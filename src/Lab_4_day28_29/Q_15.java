package Lab_4_day28_29;

import java.util.Arrays;

public class Q_15 {

	public static void main(String[] args) {
		
		/*Write a method that accepts an array and swap the first and
		 *  last element in the array. Print the modified array
		 */
		
		int[] z = {8,6,7,9,5};
		
		System.out.println(Arrays.toString(swap(z)));

	}
	
	public static int[] swap(int[] arr) {
		
		int x = arr[0];
		arr[0] = arr[arr.length-1];
		arr[arr.length-1] = x;
		
		return arr;
	}

}
