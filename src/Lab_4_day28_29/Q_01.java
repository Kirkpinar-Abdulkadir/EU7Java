package Lab_4_day28_29;

public class Q_01 {

	public static void main(String[] args) {
		/*Write a method that accepts an array and return 
		 * true if 6 appears as either the first or last element in the array. 
		 * The array will be length 1 or more.
		 *int[] x = {1,2,6}; = > true 
		 *int[] y = {6,1,2,3}; = > true 
		 *int[] z = {13,6,1,2,3}; = > false
		 */
		int[] x = {1,2,6}; 
		int[] y = {6,1,2,3}; 
		int[] z = {13,6,1,2,3}; 
		System.out.println(isSix(x));
		System.out.println(isSix(y));
		System.out.println(isSix(z));
		
	}
	
	public static boolean isSix(int[] numbers) {
		
		if(numbers.length>=1) {
			if(numbers[numbers.length-1] == 6 || numbers[0] == 6 ) {
				return true;
			}
		}
		return false;
	}

}
