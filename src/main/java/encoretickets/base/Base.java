package encoretickets.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	public static Properties prop;
	
	public Base(){
		
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("./src/main/java/encoretickets/config/config.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}
public static void init() {
	


System.setProperty("webdriver.chrome.driver", "./src/main/java/encoretickets/utils/drivers/chromedriver");
driver = new ChromeDriver();
	


 driver.manage().window().maximize();
 driver.manage().deleteAllCookies();
 
 driver.get(prop.getProperty("url"));
 
}

}
