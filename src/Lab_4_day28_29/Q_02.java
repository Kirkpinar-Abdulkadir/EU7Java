package Lab_4_day28_29;

public class Q_02 {

	public static void main(String[] args) {
		
		/*Write a method that accepts an array and check the length of the array first.
		 *If the length is more than one, check if the first element and last element are equal.
		 *if it is print true, if not print false.
		 *If the length is not more than 1, print not valid an array
		 */
		
		int[] x = {1,2,3}; 
		int[] y = {1,2,3,1}; 
		int[] z = {1,2,1}; 
		int[] k = {1}; 
		
		System.out.println(firstLast(x));
		System.out.println(firstLast(y));
		System.out.println(firstLast(z));
		System.out.println(firstLast(k));
		
	}
	
	public static String firstLast(int[] arr) {
		
		if(arr.length<=1) {
			
			return "Invalid array";
			
		}else if(arr[0] == arr[arr.length-1]) {
			
			return "true";
			
		}else {
			return "false";
		}
		
	}	

}
