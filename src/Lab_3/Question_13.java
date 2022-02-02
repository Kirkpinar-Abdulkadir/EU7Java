package Lab_3;

public class Question_13 {

	public static void main(String[] args) {

		System.out.println(doubleChar("The"));
		System.out.println(doubleChar("Abcd"));
	
		
	}
	
	public static String doubleChar(String str) {
		
		String strNew = "";
		
		for(int i=0; i<str.length(); i++) {
			
			strNew = strNew + str.substring(i, i+1).concat(str.substring(i, i+1));
			
		}
		return strNew;
		
	}

}
