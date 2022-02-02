package Lab_4_day28_29;

public class Q_21 {

	public static void main(String[] args) {
		
		/*Write a method that accepts an array and prints true if the sum of
		 *  all 2's in the array is exactly 8
		 */
		int[] x = {2, 3, 2, 2, 4, 2}; 
		int[] y = {2, 3, 2, 2, 4, 2, 2};  
		
		System.out.println(sumOfTwos(x));
		System.out.println(sumOfTwos(y));
		
		
	}
	
	public static boolean sumOfTwos(int[] arr) {
		
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==2) {
				sum+=arr[i];
			}
		}
		if(sum==8) return true;
		
		
		return false;
	}

}
