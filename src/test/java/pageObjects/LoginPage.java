package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	@FindBy(name = "user_name")
	WebElement userName;
	
	@FindBy(name = "user_password")
	WebElement pwd;
	
	@FindBy(id = "submitButton")
	WebElement submitButton;
	
	public LoginPage(WebDriver driver) {
		this.ldriver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}
	
	
	

}
