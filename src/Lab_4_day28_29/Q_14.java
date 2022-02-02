package Lab_4_day28_29;

import java.util.Arrays;

public class Q_14 {

	public static void main(String[] args) {
		
		//Write a method that accepts 2 arrays and prints a new array 
		//containing all their elements
		
		int[] x = {1,2};
		int[] y = {3,4,7};
				
		System.out.println(Arrays.toString(combination(x, y)));
		 
		
		
	}
	
	public static int[] combination(int[] arr1, int[] arr2) {
		
		int[] newArray = new int [arr1.length+arr2.length];
		
		for(int i=0; i<arr1.length; i++) {
			
			newArray[i] = arr1[i];
		
		}
		for(int j=arr1.length, x=0; j<newArray.length; j++, x++) {
			
			newArray[j] = arr2[x];
		
		}
		
		return newArray;
	}

}
