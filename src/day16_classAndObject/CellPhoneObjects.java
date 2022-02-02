package day16_classAndObject;

public class CellPhoneObjects {

	public static void main(String[] args) {
		
		
		CellPhone cell1= new CellPhone();
		
		cell1.brand="Apple";
		cell1.color="Black";
		cell1.price=999.99;
		cell1.screenSize=13;
		
		System.out.println(cell1.brand);
		System.out.println(cell1.screenSize);
		
		cell1.call();
		cell1.message();
		cell1.takeAPhoto();
		
	}

}
