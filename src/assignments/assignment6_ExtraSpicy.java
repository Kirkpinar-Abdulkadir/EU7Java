package assignments;

public class assignment6_ExtraSpicy {

	public static void main(String[] args) {
		
//		Q-1
		for(int i=1; i<=7; i++) {
			for(int j=1, p=1; j<=i; j++) {
				System.out.print(p++);
			}
			
		System.out.println();	
		}
		for(int i=1; i<=6;i++) {
			for(int j=i, p=1; j<=6; j++) {
				System.out.print(p++);
			}
		System.out.println();	
		}
		
//		Q-2
		for(int i=1; i<=7; i++) {
			for(int j=i, p=1; j<=7; j++) {
				System.out.print(p++);
			}
		System.out.println();	
		}
		for(int i=1; i<7; i++) {
			for(int j=1, p=1; j<=i+1; j++) {
			System.out.print(p++);
			}
		System.out.println();	
		}
		
//		Q-3
		for(int i=1; i<=7; i++) {
			for(int j=1; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=i; j<=7; j++) {
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
		for(int i=1; i<7; i++) {
			for(int j=i; j<6; j++) {
				System.out.print(" ");
			}
			 for(int j=1, p=7-i; j<=i+1; j++){
				System.out.print(p++ + " ");
			}
		System.out.println();	
			
		}
		
//		Q-4
		for(int i=1; i<=7; i++) {
			for(int j=1; j<=i; j++) {
				if(j%2==1) {
					System.out.print(1);
				}else {
					System.out.print(0);
				}
			}
			System.out.println();
		}
		
//		Q-5
		for(int i=1; i<=7; i++) {
			for(int j=i; j<7; j++) {
				System.out.print(1);
			}
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}
		System.out.println();	
		}
		
//		Q-6
		
		for(int i=1; i<=5; i++) {
			
			for(int j=0, p=i; j<i; j++) {
				System.out.print(p+" ");
				p=p+4-j;
			}
		System.out.println();	
		}

	}

}
