package Week3;

public class NestedLoopExample {

	public static void main(String[] args) {
		
		for ( int row = 1   ; row <= 3 ; row++ ) {

            for ( int column = 1 ; column<=5 ; column++) { // for nested loop

                 System.out.print(column+" "); // initialization should be inside the loop
            }

            System.out.println("");

        }
		
		
	}

}
