package day04_arithmeticOperators;

public class additionConcat {

	public static void main(String[] args) {
		
		//Number + Number = Addition
		System.out.println(2+2);
		System.out.println(20+200);
		
		//Number + String = Concatenation
		System.out.println("hello" + 5 + "hi");
		
		//String + Boolean = Concatenation
		System.out.println("hello" + true);
		
		//String + String = Concatenation
		System.out.println("hello" + "world");
		
		//Boolean + Number
		//System.out.println(true+1); //error (baska dillerde true=1 olarak alabiliyor
		
		System.out.println(2+0+3+"Cybertek");
		System.out.println("Cybertek"+2+0+5);
		System.out.println(2+0+5+"Cbertek"+2+0+5);
		System.out.println(2+0+5+"Cybertek"+(2+0+1));
		//islemleri basamak basamak yaptigindan böyle oluyor. 
		//parantez oldugunda o basamakta once parantezin icini yapiyor.
		
		
	}

}
