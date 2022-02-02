package Lab_4_day28_29;

public class Q_16 {

	public static void main(String[] args) {
		
		/*Write a method that accepts an array and prints the 
		 * number of even numbers in the array.
		 */
		int[] x = {2,1,2,3,4};
		int[] y = {2,2,0};
		int[] z = {1,3,5};
		
		System.out.println(even(x));		
							
	}
	
	public static int even(int[] arr) {
		
		int count=0;
		for(int value : arr) {
			if((value%2) == 0) {
				count++;
			}
		}
		return count;
	}
	

}
