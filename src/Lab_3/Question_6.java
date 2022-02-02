package Lab_3;

public class Question_6 {

	public static void main(String[] args) {

		System.out.println(withoutEnd("Hello"));
		System.out.println(withoutEnd("Java"));

		
	}
	
	public static String withoutEnd(String str) {
		
		return str.substring(1, str.length()-1);
		
	
	}

}
