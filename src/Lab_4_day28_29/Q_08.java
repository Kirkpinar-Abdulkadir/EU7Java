package Lab_4_day28_29;

public class Q_08 {

	public static void main(String[] args) {
		
		//Write a method that accepts an array and prints true if it contains a 2 or a 3 
		int[] x = {2,5}; 
		int[] y = {4,3}; 
		int[] z = {4,5}; 
		
		System.out.println(has23(x));
		System.out.println(has23(y));
		System.out.println(has23(z));
		
	}
	
	public static boolean has23(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==2 || arr[i]==3) {
				return true;
			}
		}
		return false;
	}

}
