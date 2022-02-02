package day15_Methods_Part3;

public class Task68_Retirement {

	public static void main(String[] args) {
		
		yearsUntilRetirement("mike", 2000);
		
	}
	
	public static void yearsUntilRetirement(String name, int year) {
		
		int retirementAge= 65 - calculateAge(year);
		
		System.out.println(name+" retires in "+retirementAge+" years");
		
	}
	
	public static int calculateAge(int yearBirth) {
		
		return 2019-yearBirth;
		
	}

}
