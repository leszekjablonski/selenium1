package pl.lait.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pl.lait.selenium1.Init;

public class Reservation3Page {
	
	WebDriver driver;
	
	@FindBy(xpath = "/html/body/div[1]/table/tbody/tr/td[2]"
			+ "/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]"
			+ "/td/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[1]/input")
	WebElement firstNameInput;	
	@FindBy(xpath = "/html/body/div[1]/table/tbody/tr/td[2]"
			+ "/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]"
			+ "/td/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")
	WebElement lastNameInput;	
	@FindBy (xpath = "/html/body/div[1]/table/tbody/tr/td[2]"
			+ "/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]"
			+ "/td/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[3]/select")
	WebElement mealSelect;	
	@FindBy (xpath = "/html/body/div[1]/table/tbody/tr/td[2]"
			+ "/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]"
			+ "/td/form/table/tbody/tr[5]/td/table/tbody/tr[2]/td[1]/input")
	WebElement first2NameInput;	
	@FindBy (xpath = "/html/body/div[1]/table/tbody/tr/td[2]"
			+ "/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]"
			+ "/td/form/table/tbody/tr[5]/td/table/tbody/tr[2]/td[2]/input")
	WebElement last2NameInput;	
	@FindBy(xpath = "/html/body/div[1]/table/tbody/tr/td[2]"
			+ "/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]"
			+ "/td/form/table/tbody/tr[5]/td/table/tbody/tr[2]/td[3]/select")
	WebElement meal2Select;	
	@FindBy (name = "creditCard")
	WebElement cardSelect;	
	@FindBy (name = "creditnumber")
	WebElement cardNumberInput;	
	@FindBy (name = "cc_exp_dt_mn")
	WebElement monthExpirationSelect;	
	@FindBy (name = "cc_exp_dt_yr")
	WebElement yearExpirationSelect;	
	@FindBy (xpath = "/html/body/div[1]/table/tbody/tr/td[2]"
			+ "/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]"
			+ "/td/form/table/tbody/tr[8]/td/table/tbody/tr[2]/td[1]/input")
	WebElement cardFirstNameInput;	
	@FindBy (xpath = "/html/body/div[1]/table/tbody/tr/td[2]"
			+ "/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]"
			+ "/td/form/table/tbody/tr[8]/td/table/tbody/tr[2]/td[2]/input")
	WebElement cardMiddleNameInput;	
	@FindBy (xpath = "/html/body/div[1]/table/tbody/tr/td[2]"
			+ "/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]"
			+ "/td/form/table/tbody/tr[8]/td/table/tbody/tr[2]/td[3]/input")
	WebElement cardLastNameInput;	
	@FindBy (name = "ticketLess")
	WebElement ticketLessInput;	
	@FindBy (name = "billAddress1")
	WebElement addressInput;	
	@FindBy (name = "billAddress2")
	WebElement address2Input;	
	@FindBy (name = "billCity")
	WebElement cityInput;	
	@FindBy (name = "billState")
	WebElement stateInput;	
	@FindBy (name = "billZip")
	WebElement zipInput;	
	@FindBy (name = "billCountry")
	WebElement billCountrySelect;	
	@FindBy (xpath = "/html/body/div[1]/table/tbody/tr/td[2]"
			+ "/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]"
			+ "/td/form/table/tbody/tr[15]/td[2]/input")
	WebElement sameAddressInput;	
	@FindBy (name = "delAddress1")
	WebElement delAddressInput;	
	@FindBy (name = "delAddress2")
	WebElement delAddress2Input;	
	@FindBy (name = "delCity")
	WebElement delCityInput;	
	@FindBy (name = "delState")
	WebElement delStateInput;	
	@FindBy (name = "delZip")
	WebElement delZipInput;	
	@FindBy (name = "delCountry")
	WebElement delBillCountrySelect;	
	@FindBy (xpath = "/html/body/div[1]/table/tbody/tr/td[2]"
			+ "/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]"
			+ "/td/form/table/tbody/tr[24]/td/input")
	WebElement securePurchaseBtn;
	
	public Reservation3Page() {
		driver = Init.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public void fillTheReservation3Page() {
		firstNameInput.sendKeys("Leszek");
		lastNameInput.sendKeys("Jabłoński");
		first2NameInput.sendKeys("Monika");
		last2NameInput.sendKeys("Jabłońska");		
		Init.sleep(2);
		Select meal = new Select(mealSelect);
		meal.selectByVisibleText("Low Calorie");
		Select meal2 = new Select(meal2Select);
		meal2.selectByVisibleText("Vegetarian");
		Init.sleep(2);
		Select card = new Select(cardSelect);
		card.selectByVisibleText("Visa");
		cardNumberInput.sendKeys("0123456789");
		Select monthExpiration = new Select(monthExpirationSelect);
		monthExpiration.selectByVisibleText("07");
		Select yearExpiration = new Select(yearExpirationSelect);
		yearExpiration.selectByVisibleText("2009");
		cardFirstNameInput.sendKeys("Leszek");
		cardMiddleNameInput.sendKeys("Władysław");
		cardLastNameInput.sendKeys("Jabłoński");
		ticketLessInput.click();
		Init.sleep(2);	
		addressInput.clear();
		addressInput.sendKeys("U mnie działa 1/300");
		delAddress2Input.sendKeys("na parterze po lewej stronie");
		cityInput.clear();
		cityInput.sendKeys("Drop Database");
		stateInput.clear();
		stateInput.sendKeys("Lublin");
		delZipInput.clear();
		delZipInput.sendKeys("11111");
		Select billCountry = new Select(billCountrySelect);
		billCountry.selectByVisibleText("POLAND");
		sameAddressInput.click();
		Init.sleep(2);
		delAddressInput.clear();
		delAddressInput.sendKeys("U mnie działa 1/300");
		address2Input.sendKeys("na parterze po lewej stronie");
		delCityInput.clear();
		delCityInput.sendKeys("Drop Database");
		delStateInput.clear();
		delStateInput.sendKeys("Lublin");
		zipInput.clear();
		zipInput.sendKeys("11111");
		Select delBillCountry = new Select(delBillCountrySelect);
		delBillCountry.selectByVisibleText("POLAND");
		Init.sleep(2);
		driver.switchTo().alert().accept();
		securePurchaseBtn.click();
		Init.sleep(2);
//		Iterator<String> iterator = handles.iterator();
//        while (iterator.hasNext()){
//            subWindowHandler = iterator.next();
//        }
	}
}
