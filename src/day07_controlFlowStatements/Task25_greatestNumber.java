package day07_controlFlowStatements;

public class Task25_greatestNumber {

	public static void main(String[] args) {
		
		int num1,num2,num3;
		num1=4;
		num2=8;
		num3=1;
		
		if (num1>num2 && num1>num3) {
			System.out.println("Num1 is the greatest number = "+num1);
			}
		if (num2>num1 && num2>num3) {
			System.out.println("Num2 is the greatest number = "+num2);
			}
		if (num3>num1 && num3>num2) {
			System.out.println("Num3 is the greatest number = "+num3);
			}
	}

}
