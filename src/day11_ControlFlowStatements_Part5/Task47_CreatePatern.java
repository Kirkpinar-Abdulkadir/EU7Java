package day11_ControlFlowStatements_Part5;

public class Task47_CreatePatern {

	public static void main(String[] args) {
		
//		for(int i=1; i<=7; i++) {
//			System.out.println("******");
//		}
		int rows=7;
		int columns=6;
		
		for(int i=1; i<=rows; i++) {
			for (int j=1; j<=columns; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
