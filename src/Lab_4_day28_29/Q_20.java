package Lab_4_day28_29;

public class Q_20 {

	public static void main(String[] args) {
		

		/*Write a method that accepts an array and prints true if the array contains a 2 next
		*to a 2 somewhere.
		*/
		
		int[] x = {1,2,2}; 
		int[] y = {1,2,1,2}; 
		int[] a = {2,1,2};
		int[] b = {2,2,1,2}; 
		
		System.out.println(followed2(a));

	}
	
	public static boolean followed2(int[] arr) {
		
		boolean check = false;
		
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]==2 && arr[i+1]==2) {
				check=true;
			}
		}
		return check;
	}

}
