package Week3;

public class PrintAllLettes {

	public static void main(String[] args) {
		
		// Print all the letters from A to Z
		
		for(char i='A'; i<='Z'; i++) {
			
			System.out.print(i+" ");
			
		}
		
		System.out.println();
		for (int i=65; i<=90; i++) {
			
			System.out.print((char)i +" ");
			
		}
		
		
		System.out.println("");

		for(int i = 'z'; i>='a'; i--) {  // this is an example of implicit casting-compiler
			
			System.out.print((char)i+" ");// this is an example of explicit casting- we do it
		}
		
		
		
		
		
	}

}
