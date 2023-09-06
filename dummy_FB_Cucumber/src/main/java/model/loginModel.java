package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginModel extends baseModel {
	
	public loginModel(WebDriver p) {
		
		super(p);
		
	}
	
	
	public WebElement getusername() {
		
		
		WebElement euser=driver.findElement(By.xpath("//input[@name='email']"));
		
		
		return euser;
	}
	
	public WebElement getpassword() {
		
		
		WebElement epassw=driver.findElement(By.xpath("//input[@name='pass']"));
		
		
		return epassw;
	}
	
	public WebElement getlogbtn() {
		
		
		WebElement epassw=driver.findElement(By.xpath("//button[@name='login']"));
		
		
		return epassw;
	}


}
