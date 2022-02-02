package day24_arrays_Part1;

public class ArrayCreation {

	public static void main(String[] args) {

		int score1=85;
		int score2=85;
		int score3=90;
		int score4=85;
		int score5=100;
		//..
		//..
		int score100=10;
		
		int avgScore = (score1+score2+score3+score4+score5)/5;
		System.out.println(avgScore);
		
		int[] scores = new int[5];
		scores[0] = 80;
		scores[1] = 85;
		scores[2] = 90;
		scores[3] = 100;
		scores[4] = 50;
		
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[3]);
		System.out.println(scores[4]);
		
		int avgScore2 = (scores[0]+scores[1]+scores[2]+scores[3]+scores[4])/5;
		System.out.println(avgScore2);
		
		
		
		//option-1
		int[] numbers;
		numbers = new int[3];
		
		//option-2
		int[] numbers1 = new int[4];
		float[] temp = new float[100];
		String words[] = new String[5]; //köseli parantez var name den sonra da konulabilir.
		
		System.out.println(numbers[2]); //accessing array
		System.out.println(temp[82]);
		System.out.println(words[3]);
		
		
		
	}

}
