package day03_variables_dataTypes;

public class primitiveVariables {

	public static void main(String[] args) {
		
		byte b1 = 21;
		byte b2 = -25;
		//byte b3 = 128; 128 byte limitinin disinda oldugundan hata verir
		
		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);
		
		short s1 = -32768;
		short s2 = 32767;
		short s3 = 500;
		
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);
		
		int i1 = -214768;
		int i2 = 20;
		int i3 = 100_000;
		int i4 = 100000;
		
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		System.out.println("i3 = " + i3);
		
		long l1 = 5000; //Suffix L is optional. Literal 5000 is of int type
		long l2 = -2147483649l; //Suffix L is mandatory, this number is out of int range
		
		long creditCardNumber = 6475_7564_9873_3856l;
		
		System.out.println("l1 = " + l1);
		System.out.println("l2 = " + l2);
		System.out.println("creditCardNumber = " + creditCardNumber);
		
		//Floating numbers :default is double
		float f1 = 2.1f;
		double d1 = 3.14;
		
		System.out.println("f1 = " + f1);
		System.out.println("d1 = " + d1);
		
		char c1 = 'A';
		char c2 = 65; //Decimal value corresponding to character 'A' ASCII
				
		char c3 = '\u0041'; //bu da A ya denk geliyor. unicode table dan bakilabilir
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		boolean status =true;
		boolean status2=false;
		
		System.out.println("Eligible to take the exam: " + status);
		
		String name= "Abdul";
		System.out.println("My name is " + name);
		
	}
	

}