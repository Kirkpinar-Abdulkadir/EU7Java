package assignments;

public class Lab_1 {

	public static void main(String[] args) {
		
		//stringTimes("Hi", 3);
		//love6(1, 5);
		//specialEleven(1);
		//deerPlay(95, true);
		//caughtSpending(85, true);
		//cigarParty(70, true);
	}

	public static void stringTimes(String a, int x) {
		
		for (int y=1; y<=x; y++) {
			System.out.print(a);
		}
	}
	
	public static void love6(int num1, int num2) {
		
		if (num1==6 || num2==6 || num1+num2==6 || num1-num2==6 || num2-num1==6 ) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
	
	public static void specialEleven(int num) {
		
		if(num%11==0 || num%11==1) { 
			// 1 de yazsak true olacak. onun icin (num-1)%11==0 koymaliyiz
			
			System.out.println(true);
			
		}else {
			
			System.out.println(false);
		}
	}

	
	public static void deerPlay(int temp, boolean isSummer) {
		
		if(isSummer) {
			if(temp>=60 && temp<=100) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}else if(temp>=60 && temp<=90) {
			System.out.println(true);
			}else {
			System.out.println(false);
		}
	}
	
	
	public static void caughtSpending(int speed, boolean birthday) {
		
		int result=0;
		
		if (birthday) {
			speed-=5;
		}
		if (speed<=60) {
			result=0;
		}else if(speed>60 && speed<=80) {
			result=1;
		}else if(speed>80) {
			result=2;
		}
		System.out.println(result);
		
	}
	
	
	public static void cigarParty(int cigars, boolean isWeekend) {
		
		if(isWeekend) {
			if(cigars>=40) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}else if(cigars>=40 && cigars<=60) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
	
}
