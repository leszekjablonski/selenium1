package pl.lait.selenium1;

import org.junit.Before;
import org.junit.runners.MethodSorters;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.*;

@Ignore
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginTest {

	WebDriver driver = null;
	
	@Before
	public void openPage() {
		driver = Init.getDriver();
	}
	@Ignore
	@Test
	public void clickOnMenuItems() {
		Init.sleep(2);
        driver.findElement(By.linkText("SIGN-ON")).click();
        Init.sleep(1);
        driver.findElement(By.linkText("REGISTER")).click();
        Init.sleep(1);
        driver.findElement(By.linkText("SUPPORT")).click();
        Init.sleep(1);
        driver.findElement(By.linkText("CONTACT")).click();
        Init.sleep(1);
        driver.findElement(By.linkText("SIGN-ON")).click();
        Init.sleep(1);
        driver.findElement(By.name("userName")).sendKeys("leszek");
        driver.findElement(By.name("password")).sendKeys("leszek");
        Init.sleep(1);
        driver.findElement(By.name("login")).click();
        Init.sleep(1);
        driver.findElement(By.linkText("SIGN-OFF")).click();
        Init.sleep(1);
		
	}
	@Ignore
	@Test
	public void reservation() {
		driver.findElement(By.linkText("SIGN-ON")).click();
        driver.findElement(By.name("userName")).sendKeys("leszek");
        driver.findElement(By.name("password")).sendKeys("leszek");
        driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]"
				+ "/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]"
				+ "/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
		
		Select passCount = new Select(driver.findElement(By.name("passCount")));
		passCount.selectByValue("2");
		
		Select fromPort = new Select(driver.findElement(By.name("fromPort")));
		fromPort.selectByValue("Frankfurt");
		
		driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]"
				+ "/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]"
				+ "/td/form/table/tbody/tr[14]/td/input")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]"
				+ "/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]"
				+ "/td/form/p/input")).click();
		driver.findElement(By.name("buyFlights")).click();
		
		Init.sleep(2);
	}
	
	@After
	public void tearDown() {
		Init.endTest();
	}
}
