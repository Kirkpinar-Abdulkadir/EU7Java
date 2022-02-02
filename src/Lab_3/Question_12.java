package Lab_3;

public class Question_12 {

	public static void main(String[] args) {

		System.out.println(catDog("Catdog"));
		System.out.println(catDog("catcat"));
		System.out.println(catDog("lcatlcadodog"));	
		
	}
	
	public static boolean catDog(String str) {
		
		int countCat = 0;
		int countDog = 0;
		
		for(int i=0, j=3; i<=str.length()-3; i++ , j++) {
			
			if(str.substring(i, j).equalsIgnoreCase("cat")) { //case sensitiv olmuyor.
				countCat++;
			}
			if(str.substring(i, j).equalsIgnoreCase("dog")) {
				countDog++;
			}	
		}
		return countCat==countDog;
		
	}

}
