package Lab_3;

public class Question_8 {

	public static void main(String[] args) {

		System.out.println(left2("Hello"));
		
	}
	
	
	public static String left2(String str) {
		
		String strNew =str.substring(2)+str.substring(0, 2);
		return strNew;
		
		//return str.substring(2).concat(str.substring(0, 2));
	}

}
