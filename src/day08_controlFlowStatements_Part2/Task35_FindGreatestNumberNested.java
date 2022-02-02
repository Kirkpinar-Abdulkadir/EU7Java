package day08_controlFlowStatements_Part2;

public class Task35_FindGreatestNumberNested {

	public static void main(String[] args) {
		
		int n1=10002222;
		int n2=1000;
		int n3=100022;
		
		if(n1>n2 && n1>n3) {
			
			System.out.println("n1 is the bigger");
		
		}else {
			if(n2>n3) {
				System.out.println("n2 is the bigger");
			}else {
				System.out.println("n3 is the bigger");
			}
		}
	}

}
