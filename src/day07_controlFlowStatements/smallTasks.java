package day07_controlFlowStatements;

public class smallTasks {

	public static void main(String[] args) {
		
		//1-write an if statemen that assigns 5 tü x when y is equal to 20
		int x,y;
		x=1;
		y=20;
		
		if (y==20) {x=5;
						
		}
		System.out.println("x = "+ x + "\n"+ "y = " + y);
		
		System.out.println("\n******************************\n\n");
		
		//2-write an if statement that multiplies payrate 
		//by 1.5 if hours is greater than 40
		double payRate;
		int hours;
		payRate=1000;
		hours=50;
		
		if (hours>40) {payRate= payRate*1.5;

		}
		System.out.println("Payrate = "+payRate);
		
		System.out.println("\n******************************\n\n");
		
		
		//3-write an if statement that sets the variable fee to 50 
		//if the boolean variable max is true
		
		boolean max=true;
		int fee=40;
		
		if (max==true) {fee=50;
		}
		System.out.println("Fee = "+ fee);
		
		System.out.println("\n******************************\n\n");
		
		
		//4-write an if statement that assigns 20 to the variable a 
		//if variable b is 50 or c is greater an equal to 100
		
		int a,b,c;
		a=1; b=50; c=90;
		if (b==50&&c>=100) {a=20;
		}
		System.out.println("a = "+ a + ", b = "+ b +", c = "+ c);
		
		System.out.println("\n******************************\n\n");
		
		
		//5-write an if statement "Ideal Temp" if the tem is between 70 and 80
		
		float temp=75.2f;
		if (temp>=70 && temp<=80) {
			System.out.println("Ideal Temp");
		}
		
	}

}
