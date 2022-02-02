package day13_Methods_Part1;

public class PassArg {

	public static void main(String[] args) {
		
		int x=10;
		
		displyValue(10);
		
		displyValue(x);
		
		displyValue(x*4);
		
	}
	
	public static void displyValue(int num1) {
		
		System.out.println("The number is " + num1);

	}
	
}
