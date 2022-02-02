package day07_controlFlowStatements;

public class ifElseStatement {

	public static void main(String[] args) {
		
		
		int score = 80;
		
		if (score>=70) {
			
			System.out.println("Excellent");
			System.out.println("You passed with grade A");
			
		}else {
			System.out.println("You failed");
			
		}
		
		System.out.println("**************************");
		
		int sales,bonus;
		double commissionRate,salary;
		sales=5200;
		salary=10000;
		
		if (sales>5000) {
				bonus=500;
				commissionRate=1.12;
			
				
		}else {bonus=100;
		commissionRate=1.10;
		
		}
		
		salary=salary*commissionRate+bonus;
		
		System.out.println("Salary = "+salary);
	}

}
