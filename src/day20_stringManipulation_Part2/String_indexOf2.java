package day20_stringManipulation_Part2;

public class String_indexOf2 {

	public static void main(String[] args) {
		
		// index of with 2 values
		
		String list = "html-selenium-angular-jenkins-grid";
		
		int firstDash = list.indexOf("-");
		System.out.println(firstDash);
		
		int secondDash = list.indexOf("-", 5);
		//int secondDash = list.indexOf("-", list.indexOf("-")+1);
		System.out.println(secondDash);
		
		int thirdDash = list.indexOf("-", secondDash+1);
		System.out.println(thirdDash);
		
		int lastDash = list.lastIndexOf("-"); //sona gidig geriye gelerek ariyor.
		System.out.println(lastDash);
		
	
		

	}

}
