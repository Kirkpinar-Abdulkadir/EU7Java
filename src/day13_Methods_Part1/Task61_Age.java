package day13_Methods_Part1;

public class Task61_Age {

	public static void main(String[] args) {

		ageCalculator(2021, 1979);
	}
	
	public static void ageCalculator(int currentYear, int birthYear) {
		
		System.out.println("Your age is: "+(currentYear-birthYear));
	}
}
