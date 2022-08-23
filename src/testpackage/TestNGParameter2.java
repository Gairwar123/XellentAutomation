package testpackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameter2 {

	@Test
	@Parameters("browser")
	public void testParameter(String browser) {
		System.out.println("firefox browser test==> " +browser);
		
		if(browser.equals("chrome")) {
			
		} else if(browser.equals("firfox")) {
			
		}
		
	}
}
