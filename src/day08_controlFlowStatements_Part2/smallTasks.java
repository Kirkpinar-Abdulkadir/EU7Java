package day08_controlFlowStatements_Part2;

public class smallTasks {

	public static void main(String[] args) {
		
		// 1-write an if-else statement that assigns 20 to variable y if the variables 
		// x is greater 100. otherwise, it should assign 0 to the variable y.
		
		int x=200;
		int y=10;
		if (x>100) {
			y=20;
			
		}else {y=0;
		
		}
		
		System.out.println("y ="+y);	

		
		//2- write an if-else statement that assigns 1 to x when y is equal to 100.
		//otherwise it should assign 0 to x
		
		
		if (y==100) {
			x=1;
		}else {
			x=0;
		}
		System.out.println("x ="+x);
		
		//3-write an if-else statement that assigns 0 to the variable b 
		//and assign 1 to the variable c if the variable is less than 10.
		//otherwise it should assign -99 the variable b and 0 variable c.
		
		int a,b,c;
		a=0;b=0;c=0;
		if (a<10) {
			b=0; c=1;
		}else {b=-99; c=0;
			
		}
		System.out.println("b ="+b+"\nc ="+c);
		
		
		
	}

}
