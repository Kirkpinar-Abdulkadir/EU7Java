package reviews.week4;

public class AmazonTest {

	public static void main(String[] args) {
		
		System.out.println("----Starting Amazon Search Functional Test----");
		openBrowser();
		navigateToAmazonpage();
		searchForAnItem();
		verifyResultsAreDisplayed();
		System.out.println("Amazon test completed-PASS");
		
		System.out.println("------------------------------");
		
		System.out.println("----Starting Amazon Search Functional Test With Loaded Method ----");
		openBrowser();
		navigateToAmazonpage();
		searchForAnItem("JAVA");
		verifyResultsAreDisplayed();
		System.out.println("Amazon test completed-PASS");
	}
	
	public static void openBrowser() {
		
		System.out.println("Launching Chrome Browser");
	}
	
	public static void navigateToAmazonpage () {
		System.out.println("Navigate to https;://www.amazon.com/");
	}
	
	public static void searchForAnItem() {
		System.out.println("Search for WoodenSpoon");
	}
	
	public static void verifyResultsAreDisplayed() {
		System.out.println("PASS: Search results are successfully displayed");
	}
	
	public static void searchForAnItem(String item) {
		System.out.println("Search for "+ item);
	}

}
