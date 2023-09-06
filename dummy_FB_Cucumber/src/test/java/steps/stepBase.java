package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.Before;
import page.loginPage;

public class stepBase {
	
static WebDriver driver;
	
	loginPage lp;
	
	
	@Before("@Chrome")
	
	public void getChromeDriver() {
		
		driver=getDriver("Chrome");
		
		driver.manage().window().maximize();
		
		lp= new loginPage(driver);   
		
	
	}
	
	public WebDriver getDriver(String browser) {
		
		if (driver==null) {
			
			if (browser.equals("Chrome")) {
				
				System.setProperty("webdriver.chrome.driver", "/Users/fahmidahaque/Downloads/chromedriver");
				driver= new ChromeDriver();
			}
			
		}
		
		return driver;
	
	}

}
