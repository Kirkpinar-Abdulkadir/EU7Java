package day13_Methods_Part1;

public class Task58_GreaterNumber {

	public static void main(String[] args) {
		
		greaterNumber();
		
	}
	public static void greaterNumber() {
		int num1=7;
		int num2=6;
		
		if (num1>num2) {
			System.out.println("The greater number is " + num1);
		}else if(num2>num1) {
			System.out.println("The greater number is " + num2);
		}else {
			System.out.println("Numbers are equal ");
		}
	}

}
