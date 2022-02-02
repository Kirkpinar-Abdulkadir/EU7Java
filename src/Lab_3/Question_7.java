package Lab_3;

public class Question_7 {

	public static void main(String[] args) {

		System.out.println(comboString("Hello", "hi"));
		System.out.println(comboString("hi", "Hello"));
		System.out.println(comboString("aaa", "b"));


		
	}
	
	public static String comboString(String str1, String str2) {
		
		if(str1.length()>str2.length()) {
			
			return str2.concat(str1).concat(str2);
					
		}else if(str2.length()>str1.length()) {
			
			return str1.concat(str2).concat(str1);
			
		}else {
			return "Strings are equal";
		}
	}

}
