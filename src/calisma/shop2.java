import java.util.Scanner;

public class shop2 {

	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
				String shoppingListReport = "";
				String item = "";
				String countinue = "";
				double price = 0;
				int count = 1;
				double totalPrice = 0;

		    do{
		      System.out.println("Enter Item" + count + " and its price:");
		      item=scan.nextLine();
		      price=scan.nextDouble();
		      scan.nextLine();
		      totalPrice+=price;

		      shoppingListReport+="Item"+count+"Price"+price;
		      count++;
		      if (count==10)break;

		      System.out.println("Add one more item?");
		      countinue=scan.nextLine();

		      

		    }while(countinue.equals("yes"));
	}

}
