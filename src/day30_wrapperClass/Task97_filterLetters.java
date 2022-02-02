package day30_wrapperClass;

public class Task97_filterLetters {

	public static void main(String[] args) {
		
		String str = "(((W&e**_lco73me %t%o co!@$,,<r>e <J>>>$@av```~a777.||}{";
		
		
		System.out.println(filter(str));

	}
	
	public static String filter(String s) {
		String newStr="";
		
		for(int i=0; i<s.length(); i++) {
			if(Character.isAlphabetic(s.charAt(i)) || s.charAt(i) == ' '){
				newStr = newStr+s.charAt(i);
			}
		}
		return newStr;
	}

}
