package testpackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameter {

	@Test
	@Parameters("browser")
	public void testParameter(String browser) {
		System.out.println("Chrome browser Test ==> " +browser);
		
		if(browser.equals("chrome")) {
			
		} else if(browser.equals("firfox")) {
			
		}
		
	}
}
