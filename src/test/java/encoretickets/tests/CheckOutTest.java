package encoretickets.tests;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import encoretickets.base.Base;
import encoretickets.pages.CheckoutPage;
import encoretickets.pages.DateSelectionPage;
import encoretickets.pages.SearchPage;

public class CheckOutTest extends Base{
	SearchPage searchpage;
	DateSelectionPage dateselectionPage;
	CheckoutPage checkoutPage;
	

	public CheckOutTest() {
		super();
	} 
	
	@BeforeMethod
	public void setUp(){
		
		init();
		searchpage = new SearchPage();
		dateselectionPage = new DateSelectionPage();
		checkoutPage = new CheckoutPage();
	
	
	}
		
	@Test
	public void searchText(){
		searchpage.search();
		
	}
	
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
