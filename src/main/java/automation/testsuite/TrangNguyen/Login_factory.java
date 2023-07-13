package automation.testsuite.TrangNguyen;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import automation.pageLocatorTrangNTH.*;
import automation.common.CommonBase;
import automation.constant.CT_Account;

public class Login_factory extends CommonBase {
	WebDriver driver;

	@BeforeTest
	public void openChromeDriver() {
		driver = initChromeDrvier(CT_Account.webURL);
	}

//	@Test
//	public void LoginSS() {
//		LoginPage_days14 login = new LoginPage_days14(driver);
//		login.LoginFunction("admin@demo.com", "riseDemo");
//		WebElement titleDasboard = driver.findElement(DashboardPage.textDashboard);
//		assertTrue(titleDasboard.isDisplayed());
//		driver.close();
//	}

	@Test
	public void LoginUSS() {
		LoginPage_days14 login = new LoginPage_days14(driver);
		login.LoginFunction("admi1n@demo.com", "riseDemo");
		WebElement txtError = driver.findElement(LoginPage_days14.errorAuthentication1);
		assertTrue(txtError.isDisplayed());
		driver.close();
	}

	@AfterTest
	public void closeChromeBrower() {
		quitDriver(driver);
	}

}