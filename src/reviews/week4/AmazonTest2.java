package week4;

import reviews.week4.AmazonTest;

public class AmazonTest2 {

	public static void main(String[] args) {
		

		System.out.println("----Starting Amazon Search Functional Test----");
		AmazonTest.openBrowser();
		AmazonTest.navigateToAmazonpage();
		AmazonTest.searchForAnItem("Selenium");
		AmazonTest.verifyResultsAreDisplayed();
		System.out.println("Amazon test completed-PASS");
		
	}
}
