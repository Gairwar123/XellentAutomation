package testobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPageFactory {

	WebDriver driver;
	
	@FindBy(name="email")
	WebElement enterEmail;
	
	@FindBy(id="continue")
	WebElement contButton;
	
	@FindBy(name="password")
	WebElement enterPassword;
	
	@FindBy(id="signInSubmit")
	WebElement signInButton;
	
	public AmazonPageFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmail(String email) {
		enterEmail.sendKeys(email);
	}
	
	public void clicButton() {
		contButton.click();
	}
	
	public void enterPassword(String password) {
		enterPassword.sendKeys(password);
	}
	
	public void signInButton() {
		signInButton.click();
	}
}
