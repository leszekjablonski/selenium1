package pl.lait.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pl.lait.selenium1.Init;

/*
 * ten test jest do większych testów, jeśli będą jakieś zmiany na stronie
 * to łatwiej je wwrowadzić w teście i uruchomić ponownie test
 */
public class LoginPage {

	WebDriver driver;
	
	@FindBy(name = "userName")// skrócony zapis dostępu do przycisków
	WebElement loginInput;
	
	@FindBy(name = "password")
	WebElement passwordInput;
	
	@FindBy(name = "login")
	WebElement loginBtn;
	
	@FindBy(linkText = "SIGN-ON")
	WebElement signOnLink;
	
	public LoginPage() {
		driver = Init.getDriver();
		PageFactory.initElements(driver, this);
	}
	/**
	 * Open login page - click on SIGN-ON link
	 */
	
	public void goToLoginPage() {
		signOnLink.click();
	}
	/**
	 * login user with provided data
	 * @param login
	 * @param password
	 */
	
	public void loginAs(String login, String password) {
		loginInput.sendKeys(login);
		passwordInput.sendKeys(password);
		loginBtn.click();
	}
	
}
