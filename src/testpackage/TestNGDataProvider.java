package testpackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {
 
	@Test(dataProvider="credentials")
	public void testDataProvider(String email, String password) {
		System.out.println("Email== > " +email+ " Password==> "+password);
	}
	
	@DataProvider(name= "credentials") 
		public Object[][] getData() {
			
			return new Object[][] {{"support@gmail.com", "Support@123"},{"admin@gamil.com", "admin@123"},{"consult@gmail.com", "consult@123"}};
		}
	
	
}

