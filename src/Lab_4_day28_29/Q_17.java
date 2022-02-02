package Lab_4_day28_29;

public class Q_17 {

	public static void main(String[] args) {
		
		/*Write a method that accepts an array and print the difference 
		 * between the largest and smallest values in the array.
		 */
		int[] x = {10,3,5,6}; 
		int[] y = {7,2,10,9}; 
		int[] z = {2,10,7,2}; 
		
		System.out.println(difference(y));
	}
	
	public static int difference(int[] arr) {
		
		int greatest = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]>greatest) {
			
				greatest = arr[i];
			
			}
		}
		int smallest = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]<smallest) {
			
				smallest = arr[i];
			
			}
		}
		
		return greatest-smallest;
	}

}
