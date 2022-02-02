package Lab_4_day28_29;

public class Q_10 {

	public static void main(String[] args) {
		
		/*Write a method that accepts an array and prints true 
		 * if the array contains 2 twice or 3 twice.
		 */
		int[] x = {2,2}; 
		int[] y = {3,3}; 
		int[] a = {2,3}; 
		int[] b = {12,20,42};  
		int[] c = {2,2,2}; 
		
		System.out.println(hasTwice23(x));
		System.out.println(hasTwice23(y));
		System.out.println(hasTwice23(a));
		System.out.println(hasTwice23(b));
		System.out.println(hasTwice23(c));
		
	}
	
	public static boolean hasTwice23(int[] arr) {
		
		int counter2 = 0;
		int counter3 = 0;
		
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i]==2) {
//				counter2++;
//			}
//			if(arr[i]==3) {
//				counter3++;
//			}
//		}
//		
		for(int value : arr) {
			if(value==2) {
				counter2++;
			}
			if(value==3) {
				counter3++;
			}
		}
		
		if(counter2 == 2 || counter3 == 2) {
			return true;
		}
		return false;
		
	}

}
