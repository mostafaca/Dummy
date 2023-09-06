package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class incorrectpageModel extends baseModel {
	
	
	public incorrectpageModel(WebDriver l) {
		
		super(l);
		
	}
	
	public WebElement getincorrectm() throws InterruptedException {
		
		Thread.sleep(10000);
		
		WebElement eim=driver.findElement(By.xpath("//div[@class='pam uiBoxGray']/child::div/child::span[text()]"));
		
		
		return eim;
	}
	
	//span[text()='The password you entered is incorrect.']
	
	//div[contains(text(),'The password you’ve entered is incorrect. ')]

}
