package Lab_4_day28_29;

public class Q_24 {

	public static void main(String[] args) {
		
		/*A value is "everywhere" in an array if for every 
		 * pair of adjacent elements in the array, at least one of the pair is that value.
		 * Write a method that accepts an array and a number, 
		 * and prints true if the given number is everywhere in the array.
		 */
		
		int[] x = {1, 2, 1, 3}; 
		int a = 2;
		System.out.println(adjacent(x, a));
		
		int[] y = {1, 2, 1, 3}; 
		int b = 1;
		System.out.println(adjacent(y, b));
	}
	
	public static boolean adjacent(int[] arr, int x) {
		
		for(int i=0; i<arr.length-2; i++) {
			
			if(arr[i]==x) {
				if(arr[i]==arr[i+1] || arr[i]==arr[i+2]) {
					return true;
				}
			}
		}
		
		return false;
	}

}
