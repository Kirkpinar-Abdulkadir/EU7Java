package assignments;

public class assignment2 {

	public static void main(String[] args) {
		
		// Q-1
		int gallon=15;
		double liter;
		
		liter=gallon*3.79;
		System.out.println(gallon + " gallon is " + liter + "liter");
		
		// Q-2
		double width=4.5;
		double height=7.9;
		double area=width*height;
		System.out.println("Area = " + area );
		
		// Q-3
		int num1=10, num2=20;
		System.out.println("n1 = " + num1);
		System.out.println("n2 = " + num2);
		System.out.println("----------");
		
		int temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("n1 = " + num1);
		System.out.println("n2 = " + num2);
		
		// Q-4
		int price=95;
		int quarter=(100-price)/25;
		int dimes=(100-price-(quarter*25))/10;
		int nickles=(100-price-(quarter*25)-(dimes*10))/5;
		System.out.println("Your change is " + quarter + " quarters, "+dimes+" dimes, and "+nickles+" nickles");
	}

}
