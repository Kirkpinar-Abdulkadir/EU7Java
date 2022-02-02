package day10_ControlFlowStatements_Part4;

public class Task44_SpeedConverter {

	public static void main(String[] args) {
		
		System.out.println("KPH\t\tMPH");
		System.out.println("-------------------");
		
		for (int i=60; i<=130; i+=10) {
			double mph=i*0.6214;
			System.out.println(i+"\t\t"+mph);
		}

	}

}
