package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import testobject.FaceBookLoginPage;

public class FaceBookLoginTest {

	@Test
	public void testFaceBookLoginPage() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		FaceBookLoginPage obj=new FaceBookLoginPage(driver);
		
		obj.enterEmail("sagar@123");
		Thread.sleep(3000);
		obj.enterPassword("sagar123");
		Thread.sleep(3000);
		driver.close();
	}
}
