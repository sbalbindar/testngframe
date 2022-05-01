package encoretickets.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import encoretickets.base.Base;

public class DateSelectionPage extends Base {

	@FindBy(xpath="//span[@aria-label='April 30, 2022']")
	WebElement date;
	@FindBy(xpath="//span[@class='c-quick-search__timeslot-time'][text()='14:30']")
	WebElement time;
	@FindBy(xpath="//div[@class='full-fat-calendar__redirect-button gr-col gr-col--redirect-button full-fat-cta']//button[2]")
	WebElement pickyourseats;
	
	public DateSelectionPage() {
	PageFactory.initElements(driver, this);
	}
}
