package day20_stringManipulation_Part2;

public class Task81_replaceTimeStamp {

	public static void main(String[] args) {
		
		String date = "10/10/2019 14:59:00";
		System.out.println(date);
				
		System.out.println(timeStamp(date));

		
	}
	
	public static String timeStamp(String date) {
		
		String stampedTime = date.replace("/", "").replace(" ", "").replace(":", "");
		
		return stampedTime;
		
	}

}
