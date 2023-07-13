package automation.testsuite.DucTran;
 
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;
 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.pageLocatorDucTN.PageClient;
import automation.common.CommonBase;
import automation.constant.CT_Account;
import automation.pageLocatorDucTN.DashboardPage;
import automation.pageLocatorDucTN.LoginPage_days14;

@Test
@SuppressWarnings("unused")
public class ClientTestFactory_Days15 extends CommonBase {
	WebDriver driver;
	@BeforeTest
	public void openSystemUnderTest() {
		driver = initDriverTest(CT_Account.webURL);
	}

	@SuppressWarnings("static-access")
	public void AddClient_SS() { 
		//thuc hien login
		LoginPage_days14 Login_page = new LoginPage_days14(driver);
		Login_page.LoginFunction("admin@demo.com", "riseDemo");
		//hien thi man hinh dashboard
		DashboardPage dashboard = new DashboardPage(driver);
		AssertJUnit.assertTrue(dashboard.textDashboard.isDisplayed());
		//vao man hinh client va add client
		PageClient clientpage = new PageClient(driver);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		clientpage.AddClient("demo01@demo.com", "mee");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); 
	}
	
	@SuppressWarnings("static-access")
	public void AddClientUSS_Blank() { 
		//thuc hien login
		LoginPage_days14 Login_page = new LoginPage_days14(driver);
		Login_page.LoginFunction("admin@demo.com", "riseDemo");
		//hien thi man hinh dashboard
		DashboardPage dashboard = new DashboardPage(driver);
		AssertJUnit.assertTrue(dashboard.textDashboard.isDisplayed());
		//vao man hinh client va add client
		PageClient clientpage = new PageClient(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		clientpage.AddClientUSS_Blank("", "mee");
		WebElement nameBlank = driver.findElement(PageClient.nameBlank);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		AssertJUnit.assertTrue(nameBlank.isDisplayed());
		driver.close();
	}
	
	@SuppressWarnings("static-access")
	public void AddClientUSS() { 
		//thuc hien login
		LoginPage_days14 Login_page = new LoginPage_days14(driver);
		Login_page.LoginFunction("admin@demo.com", "riseDemo");
		//hien thi man hinh dashboard
		DashboardPage dashboard = new DashboardPage(driver);
		AssertJUnit.assertTrue(dashboard.textDashboard.isDisplayed());
		//vao man hinh client va add client
		PageClient clientpage = new PageClient(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		clientpage.AddClientUSS(" ", "mee");
		WebElement nameBlank = driver.findElement(PageClient.nameBlank);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		AssertJUnit.assertTrue(nameBlank.isDisplayed());
		driver.close();
	}
	@AfterTest
	public void closeChromeBrower() {
        driver.close();
	}
}
