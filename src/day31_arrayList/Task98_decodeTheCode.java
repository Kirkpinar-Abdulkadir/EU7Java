package day31_arrayList;

public class Task98_decodeTheCode {

	public static void main(String[] args) {
		
		String str1 = "&^%^1&8O^^..ne. .52||{{T.*@,(wo#$ %^*f!@%^<<i86876ve&%^$ ^%$S$..,,!i!%*&#x&*@!$";
        System.out.println(decodeTheCode(str1));

        
        String str2 = "N000000i%$!,n9!!!!<e>>>>> 43.***T#$#%hr##<e><e>><{{ ###f##00o00###u%$#$##$#r";
        System.out.println(decodeTheCode(str2));

	}
	
	public static String decodeTheCode(String str) {
		
		String newStr="";
		
		for(int i=0; i<str.length(); i++) {
			if(Character.isAlphabetic(str.charAt(i)) || str.charAt(i) == ' '){
				newStr = newStr+str.charAt(i);
			}
		}
		
		String[] arr = newStr.split(" ");
		
		String code="";
		
		for(String value : arr) {
			
			code = code + stringDigit(value) + " ";
			
		}
		return code;
	}
	
	public static String stringDigit(String s) {
		
		s = s.toUpperCase();
		
		switch(s) {
		case "ZERO":
			s ="0";
			break;
			
		case "ONE":
			s ="1";
			break;
		case "TWO":
			s ="2";
			break;
		case "THREE":
			s ="3";
			break;
		case "FOUR":
			s ="4";
			break;
		case "FIVE":
			s ="5";
			break;
		case "SIX":
			s ="6";
			break;
		case "SEVEN":
			s ="7";
			break;
		case "EIGHT":
			s ="8";
			break;
		case "NINE":
			s ="9";
			break;
		}	
		return s;
			
			
			
		
			
		
	}

}
