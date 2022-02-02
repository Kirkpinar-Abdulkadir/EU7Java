package Lab_3;

public class Question_3 {

	public static void main(String[] args) {

		System.out.println(extraEnd("Hallo"));
		System.out.println(extraEnd("ab"));
		System.out.println(extraEnd("Hi"));
		System.out.println(extraEnd("a"));

		
	}
	
	public static String extraEnd(String str) {
		
		if(str.length()>=2) {
			
			String newStr = str.substring(str.length()-2);
			return newStr.concat(newStr).concat(newStr); 
			
		}else {
			return "Invalid request";
		}
	}

}
