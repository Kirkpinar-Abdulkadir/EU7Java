package Lab_3;

public class Question_10 {

	public static void main(String[] args) {

		System.out.println(frontAgain("edited"));
		System.out.println(frontAgain("edit"));
		System.out.println(frontAgain("ed"));
		
	}
	
	public static boolean frontAgain(String str) {
		
		return str.substring(0, 2).equals(str.substring(str.length()-2));
	}

}
