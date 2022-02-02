package day30_wrapperClass;

public class parsingValues {

	public static void main(String[] args) {
		

			String numberAsString = "2018";
			System.out.println(numberAsString);
			
			int number = Integer.parseInt(numberAsString); //String i int e dönüstürüyor
			System.out.println(number);
			
			numberAsString = numberAsString+1;
			number = number+1;
			
			System.out.println(numberAsString);
			System.out.println(number);
			
			
			double number2 = Double.parseDouble(numberAsString);
			System.out.println(number2);
			
			int i = 10;
			String s = String.valueOf(i); //it will return string
			System.out.println(s); 

			String s2 = Integer.toString(i); //it will return string also
			System.out.println(s2+1);
	}

}
