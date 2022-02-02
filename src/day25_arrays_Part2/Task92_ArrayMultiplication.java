package day25_arrays_Part2;

import java.util.Arrays;

public class Task92_ArrayMultiplication {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0; i<numbers.length; i++) {
			numbers[i] *=19; 
		}
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println(Arrays.toString(numbers)); //array formatta yazmak icin.
	}

}
