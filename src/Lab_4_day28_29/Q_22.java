package Lab_4_day28_29;

public class Q_22 {

	public static void main(String[] args) {
		
		/*Write a method that accepts an array and prints true 
		 * if the number 1's is greater than the number 4's
		 */
		int[] x = {1,4,1}; 
		int[] y = {1,4,1,4}; 
		int[] z = {1,1};
		
		System.out.println(number1s4s(x));
		System.out.println(number1s4s(y));
		System.out.println(number1s4s(z));

	}
	
	public static boolean number1s4s(int[] arr) {
		
		int count1=0;
		int count4=0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==1) {
				count1++;
			}else if(arr[i]==4) {
				count4++;
			}
		}
		
		if(count1>count4)return true;
		
		return false;
	}

}
