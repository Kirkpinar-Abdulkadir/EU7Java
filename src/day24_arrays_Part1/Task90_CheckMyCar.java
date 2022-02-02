package day24_arrays_Part1;

public class Task90_CheckMyCar {

	public static void main(String[] args) {
		
		String[] cars = {"BMW","Mercedes","Ford","Honda","Fiat","VW"};
		boolean isHonda=false;
		for(int i=0; i<cars.length; i++) {
			
			if(cars[i].equals("Honda")) {
				isHonda=true;
			}	
		}
		
		if(isHonda) {
			System.out.println("I found your car Honda in this array!");
		}else {
			System.out.println("I could not find your car Honda in this array!");
		}

	}

}
