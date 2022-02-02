package day05_unary_assignment_relational_Operrators;

public class Task19_20_incrementDecrement {

	public static void main(String[] args) {
		
		int a=50;
		int result=--a + a++ +a-- + a++;
		
		//a in memory = 49->50->49->50
		//result=       49 +49 +50 +49 =197
		
		System.out.println("a= "+a);
		System.out.println("result= "+result);
		
//TASK20
		int b=1;
		int resb= -b-- + b++ / -b-- * --b;
		
		// mem= 0,1,0,-1
		// b=  -1+0/-1*-1=-1
		
			
		System.out.println(b);
		System.out.println(resb);
		

	}

}
