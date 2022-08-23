package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import testobject.AmazonPageFactory;

public class AmazonPageFactoryTest {

	@Test
	public void testAmazonFactory() throws InterruptedException {
       System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		AmazonPageFactory obj=new AmazonPageFactory(driver);
		
		obj.enterEmail("sagar@gmail.com");
		Thread.sleep(3000);
		obj.clicButton();
		Thread.sleep(3000);
		obj.enterPassword("288dla");
		Thread.sleep(3000);
		obj.signInButton();
		Thread.sleep(3000);
		
		driver.close();
	}
}
