package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.loginModel;

public class loginPage extends loginModel {
	
	
	public loginPage(WebDriver m) {
		
		super(m);
	}
	
	
	public void typecredentials(String username, String password) {
		
		WebElement u=getusername();
		WebElement p=getpassword();
		
		u.sendKeys(username);
		p.sendKeys(password);
	}
	

	
	public void clickbtn() {
		
		WebElement u=getlogbtn();
		
		u.click();
	}

}
