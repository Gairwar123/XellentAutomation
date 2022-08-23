package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import testobject.FaceBookPageFactory;

public class FaceBookPageFactoryTest {

	@Test
	public void testFaceBookPageFactory() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		FaceBookPageFactory obj= new FaceBookPageFactory(driver);
		obj.enterEmail("sagar@124");
		Thread.sleep(3000);
		obj.enterPassword("sagar123");
		Thread.sleep(3000);
		driver.close();
	}
}
