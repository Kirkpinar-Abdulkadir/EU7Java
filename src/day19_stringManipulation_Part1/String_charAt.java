package day19_stringManipulation_Part1;

public class String_charAt {

	public static void main(String[] args) {
		

		String word = "Computer";
		
		System.out.println(word.length());
		
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(5));
		System.out.println(word.charAt(6));
		System.out.println(word.charAt(7));
		//System.out.println(word.charAt(8));
	
		//++++++++++++++++++++++++++++++++
		
		//check if first character is A
		String word2 = "Apple";
		if (word2.charAt(0)=='A') {
			System.out.println(true);
		}else System.out.println(false);
		
		//++++++++++++++++++++++++++++++++
		
		//check if first and last characters are same
		
		String word3 = "ciivc";
		
		char first = word3.charAt(0);
		//böyle de devam edebilirsin.
		
		if(word3.charAt(0)==word3.charAt(4)) {
			System.out.println(true);
		}else System.out.println(false);
		
		//++++++++++++++++++++++++++++++++
		
		//last index not hard coded.
		
		String word4 = "Java";
		
		char lastChar = word4.charAt(word4.length()-1);
		System.out.println("last char of Java is " + lastChar);
		
	}
}
