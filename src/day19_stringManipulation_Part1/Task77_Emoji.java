package day19_stringManipulation_Part1;

public class Task77_Emoji {

	public static void main(String[] args) {
		
		String emoji = ":/";
		if(emoji.length()!=2) {
			System.out.println("invalid emoji");
			return; //to stop the execution of rest code
		}	
			
			
		if(emoji.charAt(0)==':') {
			if(emoji.charAt(1)==')') {
				System.out.println("Smile");
			}else if(emoji.charAt(1)=='(') {
				System.out.println("Sad");
			}else if(emoji.charAt(1)=='/') {
				System.out.println("Upset");
			}else if(emoji.charAt(1)=='p') {
				System.out.println("Playful");
			}else System.out.println("invalid emoji");

		}else if(emoji.charAt(0)==';') {
			
			if(emoji.charAt(1)==')') {
				System.out.println("Wink");
			}else if(emoji.charAt(1)=='O') {
				System.out.println("Surprised");
			}else System.out.println("invalid emoji");
		
		}else System.out.println("invalid");
			
			
		
	}

}
