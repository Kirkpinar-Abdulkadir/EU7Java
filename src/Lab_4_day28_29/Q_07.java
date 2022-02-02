package Lab_4_day28_29;

import java.util.Arrays;

public class Q_07 {

	public static void main(String[] args) {
		/*Write a method that accepts 2 arrays and prints 
		 * the second array containing the first and last elements from the first array.
		 */
		int[] x = {1,2,3,6,9};
		int[] y = {}; 

		int[] a = {7,4,6,2};
		int[] b = {}; 
		
		System.out.println(Arrays.toString(firstAndLast(x, y)));

	}
	
	public static int[] firstAndLast(int[] arr1, int[] arr2) {
		
		arr2 = new int[2];
		
		arr2[0] = arr1[0];
		arr2[1] = arr1[arr1.length-1];
		
		return arr2;
	}

}
