package day15_Methods_Part3;

public class Task70_displayHighScore {

	public static void main(String[] args) {
		
		
		displayHighScorePosition("mike", 500);
		displayHighScorePosition("Tom", 2100);
		
	}

	public static int calculateHighScorePosition(int score) {
		
		if (score>=1000) {
			return 1;
		}else if (score>=500 && score<1000) {
			return 2;
		}else if (score>=100 && score<500) {
			return 3;
		}else {
			return 4;
		}
		
		
	}

	public static void displayHighScorePosition(String playerName, int highScorePosition) {
		
		System.out.println(playerName + " managed to get into positin " +
		calculateHighScorePosition(highScorePosition) + " in the high score table");
		
	}

}
