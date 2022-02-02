package day04_arithmeticOperators;


//This programme calculates hourly wages plus overtime

public class wages {

	public static void main(String[] args) {

		double regularWage;
		double basePay=25.75;
		double regularHours=40;
		double overtimeWages;
		double overTimePay=37.5;
		double overTimeHours=15;
		double totalWage;
		
		regularWage=basePay*regularHours;
		overtimeWages=overTimePay*overTimeHours;
		totalWage=regularWage+overtimeWages;
		
		System.out.println("Wages for this week are $ " + totalWage);
		

	}

}
