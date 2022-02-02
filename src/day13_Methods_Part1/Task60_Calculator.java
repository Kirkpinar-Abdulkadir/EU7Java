package day13_Methods_Part1;

public class Task60_Calculator {

	public static void main(String[] args) {

		calculator(5, 89, "+");
		calculator(5, 89, "-");
		calculator(5, 89, "*");
		calculator(5, 89, "/");
		
	}
	
	public static void calculator(double num1, double num2, String operator) {
		
		switch (operator) {
		case"+":
			System.out.println(num1+num2);
			break;
		case"-":
			System.out.println(num1-num2);
			break;
		case"*":
			System.out.println(num1*num2);
			break;
		case"/":
			System.out.println(num1/num2);
			break;
		}
		
	}

}
