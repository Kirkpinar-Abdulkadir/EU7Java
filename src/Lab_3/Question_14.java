package Lab_3;

public class Question_14 {

	public static void main(String[] args) {

		System.out.println(endsLy("oddly"));
		System.out.println(endsLy("y"));
		System.out.println(endsLy("oddy"));

		
		
	}
	
	public static boolean endsLy(String str) {
		
		if(str.length()>=2 && str.substring(str.length()-2).equals("ly")) { 
			return true;
		}else {
			return false;
		}
	
		
		
	}

}
