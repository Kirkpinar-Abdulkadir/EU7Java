package day14_Methods_Part2;

public class Task69_primeNumber {

	public static void main(String[] args) {
		
		isPrime(29);

	}
	
	public static int isPrime(int number) {
		
		if (number!=0 && number!=1) {
			if (number==2 || number==3 ||number==5 ||number==7) {
				System.out.println("This is a Prime number");
			}else if(number%2==0 || number%3==0 || number%5==0 || number%7==0 ) {
				System.out.println("This is not a Prime Number");
			}else
				System.out.println("This is a Prime number");
		}else if(number==0 || number==1) {
			System.out.println("This is not a Prime Number");
		}
		
		return number;
	}

}
