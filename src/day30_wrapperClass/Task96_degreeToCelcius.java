package day30_wrapperClass;

import java.util.Arrays;

public class Task96_degreeToCelcius {

	public static void main(String[] args) {
		

		String str="Today weather is sunny and 72 degree. It is aperfect day to practice java.";
		
		String[] arr = str.split(" ");
		
		double degreeF=0;
		
		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equalsIgnoreCase("degree.")) {
				
				degreeF = Double.parseDouble(arr[i-1]);
			}
		}
		System.out.println(degreeF);
		
		double degreeC=(degreeF-32)*5/9;
		
		System.out.println(degreeC);
		
		System.out.println(degreeF + " degree is equal to " + Math.round(degreeC) + " celcius");
		
	}

}
