package testobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FaceBookLoginPage {


	WebDriver driver;
	
	public FaceBookLoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By emailTextField=By.id("email");
	By passwordTextField=By.id("pass");
	
	public void enterEmail(String email) {
		driver.findElement(emailTextField).sendKeys(email);
		
	}
	
	public void enterPassword(String pass) {
		driver.findElement(passwordTextField).sendKeys(pass);
	}
}
