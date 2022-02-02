package Lab_4_day28_29;

import java.util.Arrays;

public class Q_29 {

	public static void main(String[] args) {
		
		/*Write a function that accepts and array. 
		 * For each multiple of 10 in the given array, 
		 * change all the values following it to be that multiple of 10, 
		 * until encountering another multiple of 10.
		 */
		
		int[] x = {2,10,3,4,20,5};
		System.out.println(Arrays.toString(tenRun(x))); // [2, 10, 10, 10, 20, 20]
		
		int[] y = {10,1,20,2,2,2,30,4,5,40}; 
		System.out.println(Arrays.toString(tenRun(y)));

	}
	
	public static int[] tenRun(int[] arr) {
		
		for(int i=0; i<arr.length-1; i++) {
			
			if(arr[i]%10==0) {
				
				int x = arr[i];
				
				if(arr[i+1]%10!=0) {
					
					arr[i+1]=x;
				}
			}
		}
		
		return arr;
	}

}
