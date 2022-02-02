package day04_arithmeticOperators;

public class contribution {

	public static void main(String[] args) {
		
		//This program calculates the amount that will be contributed to a retirement
		//plan if %5, %8 or %10 monthly pay is withheld
		
		//Variables to hold the monthly pay and the amount of contribution
		double monthlyPay=6000;
		double contribution;
		
		//Calculate and display 5% contribution
		contribution=monthlyPay*0.05;
		System.out.println("%5 is $" + contribution + " per month");
		
		//Calculate and display 8% contribution
		contribution=monthlyPay*0.08;
		System.out.println("8 Percent is $" + contribution + " per month");
				
		//Calculate and display 10% contribution
		contribution=monthlyPay*0.10;
		System.out.println("10 Percent is $" + contribution + " per month");	
		
		System.out.println(6-3*2+7-1);
		
	}

}
