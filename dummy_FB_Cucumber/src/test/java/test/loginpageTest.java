package test;

import org.testng.annotations.Test;


public class loginpageTest extends baseTest {
	
	
	
	@Test
	public void lptest() {
		
		getloginpage();
		
		
		
		
		lip.typecredentials("user1", "sgsh#234");
		lip.clickbtn();
		
	}
	
	

}
