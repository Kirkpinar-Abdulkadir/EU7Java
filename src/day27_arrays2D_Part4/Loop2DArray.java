package day27_arrays2D_Part4;

public class Loop2DArray {

	public static void main(String[] args) {
		

		int[][] numbers = {
				
				{1,2,3,},				//row-0
				{4,5},					//row-1
				{7,8,9}					//row-2
		};
		
		
		
		for(int row=0; row<numbers.length; row++) {
			
			for(int column=0; column<numbers[row].length; column++) {
				System.out.print(numbers[row][column] + " ");
			}
			System.out.println();
		}

	}

}
