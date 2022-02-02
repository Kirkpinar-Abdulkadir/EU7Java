package day08_controlFlowStatements_Part2;

public class Task33_PassFail {

	public static void main(String[] args) {
		
		int marks=100;
		if(marks<60) {
			System.out.println("Fail");
		}else if(marks>=60 && marks<90) {
			System.out.println("Pass");
		}else if(marks>=90 && marks<101) {
			System.out.println("Passed with Distinction");
		}else {
			System.out.println("Invalid score");
		}
	}

}
