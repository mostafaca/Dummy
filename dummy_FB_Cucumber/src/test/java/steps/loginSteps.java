package steps;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.incorrectpagePage;
import page.loginPage;

public class loginSteps {
	
	WebDriver driver=stepBase.driver;
	
	loginPage lip= new loginPage(driver);
	
	incorrectpagePage ip;
	
	
	@Given("I am in the Home page {string}")
	public void i_am_in_the_home_page(String link) {
	   
		driver.get(link);
	}

	@When("I entered {string} and {string}")
	public void i_entered_and(String uname, String pword) {
		
		lip.typecredentials(uname, pword);
	}

	@When("I click on the login button")
	public void i_click_on_the_login_button() {
		
		lip.clickbtn();
	}

	@Then("I am in the incorrect message page, the {string} will show up.")
	public void i_am_in_the_incorrect_message_page_the_will_show_up(String expectedfromFeatureFile) throws InterruptedException {
		
		
		ip= new incorrectpagePage(driver);
		
		String actualfromWebPage=ip.readincorrectmessage();
		
		Assert.assertEquals(actualfromWebPage, expectedfromFeatureFile);
			
	}

}
