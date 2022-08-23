package testpackage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelMethodExecution {

	@Test
	public void testLinkedinLoginPage() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.linkedin.com/login");

		driver.manage().window().maximize();

		System.out.println("Title " + driver.getTitle());

		Thread.sleep(10000);
		
		WebElement signInHeading = driver.findElement(By.xpath("//h1[@class='header__content__heading ']"));
		
		WebElement subHeading = driver.findElement(By.xpath("//p[text()='Stay updated on your professional world']"));
		
		// Verify heading should Sign in
		
		assertEquals(signInHeading.getText(), "Sign in");
		
		System.out.println("First assertion is passed..");
		
		
		// Verify subheading is displayd or not
		
		assertTrue(subHeading.isDisplayed());
		
		System.out.println("second assertion is passed..");
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Test
	public void testGoogle() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();

		System.out.println("Title " + driver.getTitle());

		Thread.sleep(10000);
		
		WebElement googleSearchTextfield = driver.findElement(By.xpath("//input[@name='q']"));
		
		assertTrue(googleSearchTextfield.isDisplayed());
		
		Thread.sleep(3000);
		driver.close();
		
	}
}