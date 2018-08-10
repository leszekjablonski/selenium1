package pl.lait.selenium1;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pl.lait.pageObject.LoginPage;
import pl.lait.pageObject.Reservation2Page;
import pl.lait.pageObject.Reservation3Page;
import pl.lait.pageObject.ReservationPage;
@Ignore
public class Login2Test {
	
	WebDriver driver;
	
	@Before
	public void openPage() {
		driver = Init.getDriver();
	}
	
	@Test
	public void loginWithPageObject() {
		LoginPage loginPage = new LoginPage();
		loginPage.goToLoginPage();
		loginPage.loginAs("leszek", "leszek");
		
		ReservationPage reservPage = new ReservationPage();
		reservPage.fillTheReservationForm();
		
		Reservation2Page reserv2Page = new Reservation2Page();
		reserv2Page.chooseFlights();
		
		Reservation3Page reserv3Page = new Reservation3Page();
		reserv3Page.fillTheReservation3Page();
	}
	
	@After
	public void tearDown() {
		Init.endTest();
	}

}
