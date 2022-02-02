package Lab_4_day28_29;

public class Q_19 {

	public static void main(String[] args) {
		
		/*Write a method that accepts an array and prints the total of 
		 * the numbers in the array, except ignore sections of numbers starting 
		 * with a 6 and extending to the next 7 (every 6 will be followed by at least one 7).
		 */
		
		int[] c = {1,2,2,6,99,99,7,3,4}; 
		
		System.out.println(between67(c));

	}
	
	public static int between67(int[] arr) {
		
		int sum = 0;
		
		 for(int i=0; i<arr.length; i++) {
			
			if(arr[i] !=6) {
				sum+=arr[i];
			}else {
				for(int j=i; i<arr.length; j++ ) {
					if(arr[j] == 7) {
						i=j;
						break;
					}
				}
			}
		}
		return sum;
	}

}
