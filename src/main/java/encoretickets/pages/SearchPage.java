package encoretickets.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import encoretickets.base.Base;

public class SearchPage extends Base {
	
	@FindBy(xpath="//input[@type='search']")
	WebElement search;
	@FindBy(xpath="//span[@class='search-results-product__thumbnail t-text-super']")
	WebElement searchresults;
	@FindBy(xpath="//button[@type='submit']//span[text()='Find Tickets']")
	WebElement findtickets;
	
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}

	
	public void search() {
		
		search.sendKeys("TINA");
		searchresults.click();
		findtickets.click();
		
	}


	
	
	
	
	
	
	
	
}
