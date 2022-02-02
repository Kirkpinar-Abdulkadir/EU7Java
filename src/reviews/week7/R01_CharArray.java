package week7;

import java.util.Arrays;

public class R01_CharArray {

	public static void main(String[] args) {
		
		char[] letters = {'l', 'i', 's', 't', 'e', 'n'};
		
		for(char value : letters) {
			System.out.print(value+" ");
		}
		System.out.println();
		
		//What are Strings? -> sequence of chars, collection of chars
		
		String word = new String(letters);
		System.out.println(word);
		
		String word2 = "silent";
		
		char[] letters2 = word2.toCharArray();
		
		System.out.println(Arrays.toString(letters2));
		
		for(char each : word2.toCharArray()) {
			System.out.print(each + " ");
		}
		
		
			
	}

}
