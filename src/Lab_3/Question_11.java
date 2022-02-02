package Lab_3;

public class Question_11 {

	public static void main(String[] args) {
		
		System.out.println(countHi("abc hi ho"));
		System.out.println(countHi("ABChi hi"));
		System.out.println(countHi("hihi"));

	}
	
	public static int countHi(String str) {
		
		int count = 0;
		for(int i=0, j=2; i<=str.length()-2; i++ ,j++) {
		
			if(str.substring(i, j).equals("hi")) {
				count++;
			}
		}
		return count;
	
	}

}
