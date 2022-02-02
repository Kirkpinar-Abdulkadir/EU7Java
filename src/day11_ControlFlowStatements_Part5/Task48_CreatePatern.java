package day11_ControlFlowStatements_Part5;

public class Task48_CreatePatern {

	public static void main(String[] args) {
		
		int rows=7;
		
		for(int i=1; i<=rows; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}	
	}

}
