package Week3;

public class WhileLoopExamples {

	public static void main(String[] args) {
		
		// factorial question
		// 5!=?
		
		int number=5; //starting point of my loop
		int factorial = 1;
		
		while(number>1) {
			
			factorial*=number;
			number--;
		}
		System.out.println("number = "+ number +" Factorial = "+factorial );
		
		
		System.out.println("-------------DO WHILE-------------");
		
		int numberOne = 10;
		int numberTwo = 300;
		int total = 0;
		
		do {
			total += numberOne + numberTwo;
		} while (total < 1000);
		System.out.println(total);
		
	}	
}
