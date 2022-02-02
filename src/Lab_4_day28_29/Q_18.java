package Lab_4_day28_29;

public class Q_18 {

	public static void main(String[] args) {

		//Write a function that accepts an array and prints the sum of the numbers in the array. 
		//Except the number 13 is very unlucky, so it does not count and numbers 
		//that come immediately after a 13 also do not count
		
		
		int[] x = {1,2,2,1};
		int[] y = {1,1};
		int[] a = {1,2,2,1,13}; 
		int[] b = {1,13,2,1,13,3};
		
		System.out.println(sum(b));
	}
	
	public static int sum(int[] arr) {
		
		int sum=0;
		for (int i=0; i<arr.length; i++) {
			if(arr[i] != 13) {
				sum+=arr[i];
			}else {
				break;
			}
		}
		return sum;
	}

}
