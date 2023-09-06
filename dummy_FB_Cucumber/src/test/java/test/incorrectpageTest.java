package test;

import org.testng.annotations.Test;

public class incorrectpageTest extends baseTest {
	
	
	@Test
	public void icmtest() throws InterruptedException {
		
		getincrrpage();
		
		System.out.println("Message : "+ipp.readincorrectmessage());
		
		
		
		
		
		
		
		
	}

}
