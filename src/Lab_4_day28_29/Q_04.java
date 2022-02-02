package Lab_4_day28_29;

public class Q_04 {

	public static void main(String[] args) {
		
		//Write a method that accepts an array and prints the sum of all elements in the array 
		
		int[] x = {1,2,3}; 
		int[] y = {5,11,2}; 
		int[] z = {7,0,0}; 
		int[] a = {3,-2,10,4}; 
		
		System.out.println(sumArray(x));
		System.out.println(sumArray(y));
		System.out.println(sumArray(z));
		System.out.println(sumArray(a));
		
	}
	
	public static int sumArray(int[] arr) {
		
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}

}
