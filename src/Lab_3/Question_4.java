package Lab_3;

public class Question_4 {

	public static void main(String[] args) {

		System.out.println(firstTwo("Hello"));
		System.out.println(firstTwo("abcdefg"));
		System.out.println(firstTwo("ab"));
		System.out.println(firstTwo("X"));
		System.out.println(firstTwo(""));


		
	}
	
	public static String firstTwo(String str) {
		
		if(str.isEmpty()) {
			return "";
		}else if(str.length()==1) {
			return str;
		}else  {
			
			return str.substring(0, 2);
		}
		
	}

}
