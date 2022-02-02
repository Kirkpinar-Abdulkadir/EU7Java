package week7;

import java.util.Arrays;

public class R03_IsAnagram {

	public static void main(String[] args) {
		
		// I want to review Arrays utility class
		
		System.out.println(isAnagram("listen1", "silent"));

	}
	
	public static boolean isAnagram(String word1, String word2) {
		
		boolean flag = false;
		if(word1.length()!=word2.length()) {
			return flag;
		}
		
		word1 = word1.toLowerCase().replaceAll(" ", "");
		word2 = word2.toLowerCase().replaceAll(" ", "");
		
		char[] charArr1 = word1.toCharArray();
		char[] charArr2 = word2.toCharArray();
		
		Arrays.sort(charArr1);
		Arrays.sort(charArr2);
		
		if(Arrays.equals(charArr1, charArr2)) {
			flag = true;
			
		}
		
		
		
		
		return flag;
		
	}

}
