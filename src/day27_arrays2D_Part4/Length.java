package day27_arrays2D_Part4;

public class Length {

	public static void main(String[] args) {
		
		int[][] numbers = {
				
				{1,2,3,4},				//row-0
				{5,6},					//row-1
				{7,8,9,10,11,12,13,14}	//row-2
		};
		
		//display the number of rows
		System.out.println(numbers.length);
		
		//display the number of columns in each row
		System.out.println(numbers[0].length);
		System.out.println(numbers[1].length);
		System.out.println(numbers[2].length);
		
		for(int i=0; i<numbers.length; i++) {
			System.out.println("Number of columns in the row " + i + "is : " + numbers[i].length);
		}
		
		System.out.println("-----------------------------");
		
		for(int i=0; i<numbers.length; i++) {
			
			for(int j=0; j<numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
		
		

	}

}
