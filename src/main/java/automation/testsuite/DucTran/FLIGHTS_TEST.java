package automation.testsuite.DucTran;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_Account;
import automation.pageLocatorDucTN.Flights_PAGE;

@SuppressWarnings("unused")
public class FLIGHTS_TEST extends CommonBase{
	WebDriver driver;
	@BeforeTest
	public void openSystemUnderTest() {
		driver = initDriverTest(CT_Account.OpenFlights);
	}

	@Test
	public void Search_SS() { 

		Flights_PAGE FlightsPage = new Flights_PAGE(driver); 
		FlightsPage.SearchSS("NewYork", "Paris","","");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); 
}}
