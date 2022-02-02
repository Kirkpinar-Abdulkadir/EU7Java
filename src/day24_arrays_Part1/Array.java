package day24_arrays_Part1;

public class Array {

	public static void main(String[] args) {
		
//		int[] myList = new int[4];
//		myList[0]=1;
//		myList[1]=2;
//		myList[2]=3;
//		myList[3]=4;
		
		int[] myList = {10,20,30,40};
		
		System.out.println(myList);
		System.out.println(myList[0]);
		System.out.println(myList[1]);
		System.out.println(myList[2]);
		System.out.println(myList[3]);
		
		String[] myArray = {"Apple","Samsung","LG"};
		
		
		System.out.println(myList.length);
		System.out.println(myArray.length);
		
		for(int i=0; i<myList.length; i++) {
			System.out.println(myList[i]);
		}
		
		int[] scores = {80,90,45,56,78,23,56,80,21,100,54};
		int avgScore=0;
		int total=0;
		for(int i=0; i<scores.length; i++) {
			
			total+=scores[i];
			
		}
		avgScore = total/scores.length;
		System.out.println("Average is: " + avgScore);
		
		
		
	}

}
