import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		
		    //WRITE YOUR CODE HERE:
//		    
//		    Scanner scan = new Scanner(System.in);
//		    String item1, item2, item3, report;
//		    double price1, price2, price3, totalPrice;
//
//		    System.out.println("Enter Item1 and its price");
//		    item1=scan.next();
//		    price1=scan.nextDouble();
		    
		    Scanner scan=new Scanner(System.in);
		    System.out.println("Enter number of coupons");
		    int coupons=scan.nextInt();
		    
		    if (coupons>=3){
		      int candies=coupons/10;
		      int gumballs=(coupons-(candies*10))/3;
		      System.out.println("Number of Candies: "+candies);
		      System.out.println("Number of Gumballs: "+gumballs);
		    }else {
		      System.out.println("Not enough coupons");
		    }
		    
		  }
		}