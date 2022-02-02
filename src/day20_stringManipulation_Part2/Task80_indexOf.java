package day20_stringManipulation_Part2;

public class Task80_indexOf {

	public static void main(String[] args) {
		checkedString("Your order confirmation number is XYZ", "confirmation");

	}
	
	public static void checkedString(String str1, String str2) {
		if(str1.contains(str2)) {
			System.out.println("Pos of str2 is:" + str1.indexOf(str2));
		}else {
			System.out.println("not found");
		}
	}

}
