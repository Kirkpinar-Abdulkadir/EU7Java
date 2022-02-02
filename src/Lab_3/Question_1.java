package Lab_3;

public class Question_1 {

	public static void main(String[] args) {

		System.out.println(helloName("Bob"));
		System.out.println(helloName("Alice"));
		System.out.println(helloName("X"));
		
	}
	
	public static String helloName(String name) {
		
		//String greeting="Hello ";
		//System.out.println(greeting.concat(name).concat("!"));
		
		return "Hello ".concat(name).concat("!");
	}

}
