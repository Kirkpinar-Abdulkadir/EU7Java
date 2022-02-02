package day08_controlFlowStatements_Part2;

public class Task32_LargestNumber {

	public static void main(String[] args) {
		
		int num1=400;
		int num2=700;
		int num3=500;
		
		if(num1>num2 && num1>num3) {
			System.out.println("Number1 "+num1+" is the greatest");
			
		}else if(num2>num1 && num2>num3) {
			System.out.println("Number2 "+num2+" is the greatest");
			
		}else if(num3>num1 && num3>num2) {
			System.out.println("Number3 "+num3+" is the greatest");
		
		}else {	
			System.out.println("Numbers are equal");
		}

	}

}
