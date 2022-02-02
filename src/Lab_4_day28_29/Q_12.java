package Lab_4_day28_29;

public class Q_12 {

	public static void main(String[] args) {
		
		/*Write a method that accepts two arrays and prints 
		 * how many of the arrays have 1 as their first element
		 */
		int[] x = {1,2,3}; 
		int[] y = {1,3}; 
				
		int[] x1 = {7,2,3}; 
		int[] y1 = {1};
		
		int[] x2 = {3,2,4}; 
		int[] y2 = {4,3,4};
		
		System.out.println(first1(x, y));
		System.out.println(first1(x1, y1));
		System.out.println(first1(x2, y2));

	}
	
	public static int first1(int[] arr1, int[] arr2) {
		
		int count = 0;
		if(arr1[0] == 1) {
			count++;
		}
		if(arr2[0] == 1) {
			count++;
		}
		return count;
	}
	

}
