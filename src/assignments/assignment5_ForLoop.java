package assignments;

import java.util.Scanner;

public class assignment5_ForLoop {

	public static void main(String[] args) {
		
//		Q_1
//		
//		for(int i=0; i<=1000; i+=10) {
//			
//			System.out.print(i + ",");
//			
//		}
//		
//		Q_2
//		
//		for(int i=3; i<=130; i+=2 ) {
//			
//			System.out.print(i + ",");
//		}
		
//		Q_3
//		int numberOfEvenNumbers=0;
//		
//		for (int i=5; i<=50; i++) {
//			if(i%2==0) {
//				numberOfEvenNumbers++;
//			}
//		}
//		System.out.println("Number of even numbers is: " + numberOfEvenNumbers);
		
//		Q_4
//		
//		Scanner input=new Scanner(System.in);
//		int product=0;
//		
//		while(product<100) {
//			
//			System.out.println("Enter a number between 0-10");
//			int number=input.nextInt();
//			if(number>10) {
//				System.out.println("Invalid number!");
//				continue;
//			}
//			product=product+(number*10);
//			System.out.println("Product is = "+product);
//			
//		}
//		System.out.println("Max product value is reached");
	
//		Q_5
//		for(int i=1; i<=10; i++) {
//			System.out.println("12 X "+i+" = "+12*i);
//		}
		
//		Q_6
//		Scanner scan = new Scanner(System.in);
//		System.out.println("How many numbers do you want to have in Fibonacci series?");
//		int num = scan.nextInt();
//		int pre1=0;
//		int pre2=1;
//		
//		System.out.print(pre1+","+pre2);
//		for(int i=3; i<=num; i++) {
//			int sum=pre1+pre2;
//			System.out.print(","+sum);
//			pre1=pre2;
//			pre2=sum;
//		
//		}
//		
//		int seq=8;
//		int n1=0;
//		int n2=1;
//		int sum=0;
//		
//		for(int i=1; i<=seq; i++) {
//			
//			System.out.print(n1+" ");
//			sum=n1+n2;
//			n1=n2;
//			n2=sum;
//		}
//		
		
		
//		Q_7
//		for(int i=1; i<=100; i++) {
//			if(i%5==0) {
//				System.out.print(i+",");
//			}
//		}
		
//		Q_8
//		int upperBound=1;
//		int sum=0;
//		
//		while(upperBound<=5) {
//			
//			System.out.print(upperBound+" + ");
//			sum+=upperBound;
//			upperBound++;
//		}
//		System.out.println(" = "+sum);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number:");
//		int upperBound=sc.nextInt();
//		
//		int num=1;
//
//		int sum=0;
//
//			while(num<=upperBound) {
//
//				if(num==1) {
//
//					System.out.print(num);
//					
//					sum=sum+num;
//
//					num++;
//
//					continue;
//
//				}
//
//				System.out.print(" + "+num);
//				
//				sum+=num;
//
//				num++;
//
//		}
//
//		System.out.println(" = "+sum);

		/*Q_9
		Write a program for the following logic:
		Print all the odd numbers in comma-separated form from 1 till the end (you may change it):
		if end = 10, OUTPUT = 1, 3, 5, 7, 9
		if end = 11, OUTPUT = 1, 3, 5, 7, 9, 11

		You should use while loop and if-else statements. 
		Note that, there should not be any comma after the last digit.*/
		
		int num=1;
		while(num<=10) {
			if(num%2==1) {
				System.out.print(num+",");
				
			}
			num++;
		}
	
		/*Question-10:

			Print following output using nested for loops:
			1
			22
			333
			4444
			55555
			666666
			7777777*/

//		for(int i=1; i<=7; i++) {
//		
//			for(int p=1; p<=i; p++) {
//				
//				System.out.print(i);
//			}
//			
//		System.out.println();
//		}
		
		
	//Q_11	
//		Print the following output using nested for loops.
//
//		4       3       2      1
//
//		     3       2      1
//
//		         2       1
//
//		              1
//		
//		for(int x=4; x>0; x--) {
//			for(int i=0; i<4-x; i++) {
//				
//				System.out.print(" ");
//			}
//			for(int y=x; y>0; y--) {
//				
//				System.out.print(y+" ");
//			}
//			
//			System.out.println();	
//			
//		}
		
	//Question-12:

//Print following output using nested for loops.
//1 2 3 4 5 6 7 8 9 10
//2 4 6 8 10 12 14 16 18 20
//3 6 9 12 15 18 21 24 27 30
//4 8 12 16 20 24 28 32 36 40
//5 10 15 20 25 30 35 40 45 50
//6 12 18 24 30 36 42 48 54 60
//7 14 21 28 35 42 49 56 63 70
//8 16 24 32 40 48 56 64 72 80
//9 18 27 36 45 54 63 72 81 90
//10 20 30 40 50 60 70 80 90 100
//
//NOTE:
//1. 1st row is table of 1, 2nd row is table of 2 and so on.
//2. You can use space between the digits on the same row.
//		
//		for(int i=1; i<=10; i++) {
//			
//			for (int a=1; a<=10; a++) {
//			
//				System.out.print(a*i+" ");
//			}
//			System.out.println();
//		}
		
//		Question-13:
//
//			Print following chessboard using nested for loops.
//			W B W B W B W B
//			B W B W B W B W
//			W B W B W B W B
//			B W B W B W B W
//			W B W B W B W B
//			B W B W B W B W
//			W B W B W B W B
//			B W B W B W B W
//
//			NOTE:
//			1. Total 8 rows and 8 columns.
//			2. "W" and "B" are in alternate positions (row-wise or column-wise), 
//		you will not find consecutive W or B.
	
//	
//		for(int i=1; i<=8; i++) {
//			if(i%2==0) {
//				for(int j=1; j<=4;j++) {
//					System.out.print("W B ");
//				}
//			}else {
//				for(int j=1; j<=4; j++) {
//					System.out.print("B W ");
//				}
//			}
//		
//			System.out.println();
//		}
//	
//		String a = "W";
//        String b = "B";
//        String c = " ";
//        for (int i = 1; i <= 8; i++) {
//            for (int j = 1; j <= 4; j++) {
//                System.out.print(a + " " + b);
//                System.out.print(" ");
//            }
//            c = a;
//            a = b;
//            b = c;
//            System.out.println(" ");
//        }
	
//		Question-14:
//
//			Write nested loop to draw this pattern
//
//			##
//			#  #
//			#   #
//			#    #
//			#     #
//			#      #
//			#        #

//		for(int i=1; i<=7; i++) {
//			
//			System.out.print("#");
//			
//			for (int j=1; j<i; j++) {
//			
//				System.out.print(" ");
//			
//			}
//			
//			System.out.println("#");
//		}
//	
	}

}
