package pages;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public LandingPage landingPage;
	public OffersPage offersPage;
	public WebDriver driver;
	public CheckoutPage checkoutPage;
	public TestCRSPage testCRSPage;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}

	public TestCRSPage getTestCRSPage(){
		testCRSPage = new TestCRSPage(driver);
		return testCRSPage;
	}
	
	public LandingPage getLandingPage()
	{

	 landingPage= new LandingPage(driver);
	 return landingPage;
	}
	
	public OffersPage OffersPage()
	{
		offersPage = new OffersPage(driver);
		return offersPage;
	}
	
	public CheckoutPage getCheckoutPage()
	{
		checkoutPage = new CheckoutPage(driver);
		return checkoutPage;
	}
}
