package day10_ControlFlowStatements_Part4;

public class Task43_SquareTable {

	public static void main(String[] args) {
		
		int square=0;
		System.out.println("Number\t\tNumber Squared");
		System.out.println("------------------------------");
		for (int i=1; i<=10; i++) {
			square=i*i;
			
			System.out.println(i+"\t\t"+square);
		}

	}

}
