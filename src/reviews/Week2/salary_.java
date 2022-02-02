package Week2;

public class salary_ {

	public static void main(String[] args) {
		
		// Salary Calculation
		int hourlyRate = 60; // in dollars
		double taxRate = 0.3; //  deduct from yearly salary
		int weeklyHour = 40; 
		// you are working 48 weeks a year
		// totalTax = salary*taxrate
		// calculate how much I will make a year after Tax deducted
		
		//annual salary before tax
		int salary=(48*weeklyHour)*hourlyRate;
		System.out.println("Salary = "+salary);
		
		//yearly tax
		double totalTax=salary*taxRate;
		System.out.println("Total Tax = "+totalTax);
		
		//net salary
		double salaryAfterTax=salary-totalTax;
		System.out.println("Net Salary = "+salaryAfterTax);
		
		
		
		
		
		
	}

}
