package Lab_4_day28_29;

import java.util.Arrays;

public class Q_13 {

	public static void main(String[] args) {
		
		/*Write a method that accepts 2 arrays and consider the sum of the values
		 *  in each array. Print the array which has the largest sum. 
		 *  In event of a tie, print "equal"
		 */
		int[] x = {1,2};
		int[] y = {3,4};
				
		int[] x1 = {5,6};
		int[] y1 = {3,8};
				
		int[] x2 = {1,1};
		int[] y2 = {1,0};
		
		System.out.println(greaterSum(x, y));
		System.out.println(greaterSum(x1, y1));
		System.out.println(greaterSum(x2, y2));
	}
	
	public static String greaterSum(int[] arr1, int[] arr2) {
		
		int sum1 = 0;
		int sum2 = 0;
		
		for(int values : arr1) {
			sum1+=values;
		}
		for(int values : arr2) {
			sum2+=values;
		}
		if(sum1>sum2) {
			return Arrays.toString(arr1);
		}else if(sum2>sum1) {
			return Arrays.toString(arr2);
		}else {
			return  "equal";
		}
		
	}

}
