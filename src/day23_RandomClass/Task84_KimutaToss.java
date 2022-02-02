package day23_RandomClass;

import java.util.Random;

public class Task84_KimutaToss {

	public static void main(String[] args) {

		Random rn = new Random();
		
		for(int i=1; i<=10; i++) {
			
			if(rn.nextBoolean()) {
				System.out.println("Head");
			}else {
				System.out.println("Tail");
			}
		}
		
	}

}
