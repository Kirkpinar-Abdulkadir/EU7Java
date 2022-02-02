package Lab_3;

public class Question_5 {

	public static void main(String[] args) {

		System.out.println(firstHalf("WooWoo"));
		System.out.println(firstHalf("HelloThere"));
		System.out.println(firstHalf("abcdef"));

		
	}
	
	public static String firstHalf(String str) {
		
		return str.substring(0, str.length()/2); 
	
		 
	}

}
