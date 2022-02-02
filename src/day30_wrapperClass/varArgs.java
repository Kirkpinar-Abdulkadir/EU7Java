package day30_wrapperClass;

public class varArgs {

	public static void main(String[] args) {
		
		sum(2, 4);
		sum(2, 3, 4, 6);
		sum(5,6,7);
		
		concat("Apple", "Orange","123");
	}

	public static void sum(int... numbers) { // A vararg parameter can take a variable number of arguments
		
		int sum = 0;
		
		for(int value : numbers) {
			sum = sum+value;
			
		}
		System.out.println(sum);
		
	}
	
	public static void concat(String...strs) { 
		
		String newStr = "";
		
		for(String str : strs) {
			newStr = newStr + str.charAt(2);
			
		}
		System.out.println(newStr);
		//return yapilarak da olabilir
		
	}
}
