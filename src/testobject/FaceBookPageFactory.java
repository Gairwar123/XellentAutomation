package testobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookPageFactory {

	WebDriver driver;
	
	@FindBy(id="email")
	WebElement emailText;
	
	@FindBy(id="pass")
	WebElement passText;
	
	public FaceBookPageFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmail(String email) {
		emailText.sendKeys(email);
	}
	
	public void enterPassword(String pass) {
		passText.sendKeys(pass);
	}
}
