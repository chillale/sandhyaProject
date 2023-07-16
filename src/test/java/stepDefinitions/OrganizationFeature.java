package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import utilities.BaseClass;

public class OrganizationFeature extends BaseClass {

	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {
		 driver=new ChromeDriver();
		loginPage = new LoginPage(driver);
		
	}
	@When("user  url {string}")
	public void user_url(String url) {
		driver.get(url);
	}
	

	@When("user  username {string}")
	public void user_username(String uName) {
		loginPage.getUserName().sendKeys(uName);
	}

	@When("user  password {string}")
	public void user_password(String pwd) {
		loginPage.getPwd().sendKeys(pwd);
	}

	@Then("click  login")
	public void click_login() {
		loginPage.getSubmitButton().click();
	}

	@Then("click on Organization module")
	public void click_on_organization_module() {
		driver.findElement(By.linkText("Organizations")).click();;
	}

}
