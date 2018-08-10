package pl.lait.Steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.*;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import pl.lait.pageObject.LoginPage;
import pl.lait.selenium1.Init;

public class LoginPageStepDefs {
	
	WebDriver driver = Init.getDriver();	
	LoginPage loginPage;
	
	@Given("^I open main page$")
	public void i_open_main_page() throws Throwable {
	    //już jestem na stronie "main"
	}

	@When("^I click SIGN-ON link$")
	public void i_click_SIGN_ON_link() throws Throwable {
		loginPage = new LoginPage();
		loginPage.goToLoginPage();
	}

	@Then("^I should see login page$")
	public void i_should_see_login_page() throws Throwable {
	    System.out.println(driver.getTitle());
	}

}
