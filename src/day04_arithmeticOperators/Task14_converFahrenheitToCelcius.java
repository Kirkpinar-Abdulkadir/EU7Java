package day04_arithmeticOperators;

public class Task14_converFahrenheitToCelcius {

	public static void main(String[] args) {
		
		double cel,fahr;
		final double rate=1.8;
		cel=99.9;
		fahr=cel*rate+32;
		System.out.println(cel+" celcius is equal to "+fahr+" fahrenheit");
		
		//söyle de yazilabilir. bu formül daha güzel....#
		
		fahr=9*cel/5+32;
		System.out.println(cel+" celcius is equal to "+fahr+" fahrenheit");
		
		
		

	}

}
