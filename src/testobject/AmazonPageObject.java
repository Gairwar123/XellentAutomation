package testobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonPageObject {

	WebDriver driver;
	public AmazonPageObject(WebDriver driver) {
		this.driver=driver;
	}
	
	By userName=By.name("email");
	By contiButton=By.id("continue");
	By passWord=By.name("password");
	By signInButton=By.id("signInSubmit");
	
	public void enterEmail(String email) {
		driver.findElement(userName).sendKeys(email);
	}
	
	public void contButton() {
		driver.findElement(contiButton).click();
	}
	
	public void enterPassword(String password) {
		driver.findElement(passWord).sendKeys(password);
	}
	
	public void signButton() {
		driver.findElement(signInButton).click();
	}
}
