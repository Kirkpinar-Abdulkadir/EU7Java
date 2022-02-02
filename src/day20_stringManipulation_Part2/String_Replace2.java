package day20_stringManipulation_Part2;

public class String_Replace2 {

	public static void main(String[] args) {
		
		String sentence = "Coding is fun, it is my hobby!!";
		
		String withNoSpace = sentence.replace(" ", "");
		
		System.out.println(sentence);
		System.out.println(withNoSpace);
		
		//replace "," with "&"
		String sentece = sentence.replace(",", "&");
		System.out.println(sentece);
		
		
		String mixed = "&^@#j$a-v|a@#$";
		mixed = mixed.replace("&^@#", "");
		System.out.println(mixed);
		mixed = mixed.replace("@#$", "");
		System.out.println(mixed);
		mixed=mixed.replace("$", "").replace("-", "").replace("|","");
		System.out.println(mixed);
		
		String result = "About 8,930,000,000 results (0.68 seconds)";
		
		result = result.replace("About ", "").replace(" results (0.68 seconds)", "");
			
		System.out.println(result);
		
	}

}
