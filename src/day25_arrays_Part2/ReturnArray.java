package day25_arrays_Part2;

public class ReturnArray {

	public static void main(String[] args) {
		
		double[] values = getArray();
		
		for(double val : values) {
			System.out.print(val + "  ");
		}

	}
	
	public static double[] getArray() {
		double[] array = {1.2,2.3,4.4,5.6};
		return array;
	}

}
