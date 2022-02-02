package day07_controlFlowStatements;

public class Task28_revenue {
	
	public static void main(String[] args) {

		/*Task: Revenue can be calculated as the selling price of the product times 
		 * the quantity sold, i.e. revenue = price × quantity. 
		 * Write a program that asks the user to enter product price and 
		 * quantity and then calculate the revenue. If the revenue is more than 
		 * 5000 a discount is 10% offered. Program should display the discount 
		 * and net revenue.*/
		
		/* benim yazdigim:
		
		double revenue,price;
		int quantity;
		price=25;
		quantity=275;
		revenue=price*quantity;
		
		
		if (revenue>5000) {
			 price=price*0.9;
			 System.out.println("Discount = 10%\n"+"Total Revenue = "+ (price*quantity));
		 }
		if (revenue<=5000){
			 System.out.println("Discount = 0\n"+"Total Revenue = "+ (price*quantity));
		 } */
		
		// onun yazdigi
		
		double price = 19.99;
		int quantity =  2000;
		
		double revenue;
		double discount=0;
		
		revenue=price*quantity;
		
		if(revenue>5000) {
			
			discount = revenue*0.1;
			revenue=revenue-discount;
		}
		
		System.out.println("discount = " + discount);
		System.out.println("revenue = " + revenue);

	}
}
