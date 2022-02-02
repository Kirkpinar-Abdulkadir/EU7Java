package reviews.week4;

public class SalaryTest {

	public static void main(String[] args) {
		
		week4.salary shevki = new week4.salary();
		shevki.setInfo(70, 45, 0.19);
		
		System.out.println(shevki.salaryAfterTax());
		
		week4.salary hande = new week4.salary();
		hande.setInfo(100, 35, 0.15);
		System.out.println(hande.salaryAfterTax());
		
		
	}

}
