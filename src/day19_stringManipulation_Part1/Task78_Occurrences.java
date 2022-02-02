package day19_stringManipulation_Part1;

public class Task78_Occurrences {

	public static void main(String[] args) {
		
		
		String word = "abcabqcabc";
		char check = 'a';
		int count=0;
		
		for (int i=0; i<word.length(); i++) {
			
			if(word.charAt(i)==check) {
				count++;
			}
		}
		System.out.println("Number of "+ check + " in this string is: " + count);

	}

}
