package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.ReadExcelData;

public class MainTest extends BaseTest {

	@Test(dataProviderClass = ReadExcelData.class, dataProvider = "excelData")
	public void loginTest(String emailId, String password) {
		driver.findElement(By.linkText(loc.getProperty("signin_link"))).click();
		driver.findElement(By.id(loc.getProperty("email_field"))).sendKeys(emailId);
		driver.findElement(By.xpath(loc.getProperty("next_button"))).click();
		driver.findElement(By.id(loc.getProperty("pwd_field"))).sendKeys(password);
		driver.findElement(By.id(loc.getProperty("login_button"))).click();
		driver.findElement(By.id(loc.getProperty("all_apps"))).click();
	}

}
