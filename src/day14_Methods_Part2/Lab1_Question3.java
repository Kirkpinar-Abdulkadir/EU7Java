package day14_Methods_Part2;

public class Lab1_Question3 {

	public static void main(String[] args) {
			specialEleven(22);
			specialEleven(23); 
			specialEleven(24);
			specialEleven(1);
			
			
		}
		
		public static void specialEleven(int number) {
			
			if(number>=11 && (number%11==0 || (number-1)%11==0)) {
				System.out.println(true);
				
			}else {
				System.out.println(false);
				
			}
			
		}
}
