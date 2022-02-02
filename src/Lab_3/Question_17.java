package Lab_3;

public class Question_17 {

	public static void main(String[] args) {

		System.out.println(isPalindrome("level"));
		System.out.println(isPalindrome("racecar"));
		System.out.println(isPalindrome("cemil"));
		System.out.println(isPalindrome("Taco cat"));


	}
	
	public static boolean isPalindrome(String str) {
		
		String reverse="";
		
		for(int i=str.length()-1; i>=0; i--) {
			
		reverse = reverse + str.substring(i, i+1);
		
		//reverse = reverse + str.charAt(i); burada concat() kullanilamaz, + ile olur
			
		}
		
		if(reverse.replace(" ", "").equalsIgnoreCase(str.replace(" ", ""))) {
			return true;
		}else {
			return false;
		}
	}

}
