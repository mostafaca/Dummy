package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.incorrectpageModel;

public class incorrectpagePage extends incorrectpageModel {
	
	
	
	public incorrectpagePage(WebDriver x) {
		
		super(x);
		
	}
	
	
	public String readincorrectmessage() throws InterruptedException {
		
		WebElement einmessage=getincorrectm();
		
		String message=einmessage.getText();
		
		return message;
	}

}
