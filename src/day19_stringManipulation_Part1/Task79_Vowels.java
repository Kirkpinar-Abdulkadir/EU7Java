package day19_stringManipulation_Part1;

public class Task79_Vowels {

	public static void main(String[] args) {
		
		String word = "CybertekSchool";
		
		for (int i=0; i<word.length(); i++) {
			char ch=word.charAt(i);
			if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				System.out.print(ch);
				if(i!= word.length()-2) {
					System.out.print(',');
				}
			}	
		}
		
	}

}
