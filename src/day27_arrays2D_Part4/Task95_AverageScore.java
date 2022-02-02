package day27_arrays2D_Part4;

public class Task95_AverageScore {

	public static void main(String[] args) {
		
		int[][] scores = {
				{68,75,54,80},
				{100,64,20,50},
				{10,35,40,90}
		};
		
		double totalScore1=0;
		
		for(int scores1 : scores[0]) {
			totalScore1 += scores1;
		}
		System.out.println("Average score of student 1 is: " + totalScore1/scores[0].length);
		
		int totalMathScore=0;
		
		for(int j=0; j<scores.length; j++) {
			totalMathScore += scores[j][0];
		}
		
		System.out.println("Total math score is: " + totalMathScore);

	}

}
