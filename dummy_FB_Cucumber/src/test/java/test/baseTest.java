package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import page.incorrectpagePage;
import page.loginPage;

public class baseTest {
	
	static WebDriver driver;
	
	loginPage lip;
	
	incorrectpagePage ipp;
	
	@BeforeSuite
	public void driverSetup() {
		
		System.setProperty("webdriver.chrome.driver","/Users/fahmidahaque/Downloads/chromedriver");
		
		 driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com");
	
	}
	
	public void getloginpage() {
		
		
		lip= new loginPage(driver);
	}	
	
	public void getincrrpage() {
		
		
		ipp= new incorrectpagePage(driver);
	}

}
