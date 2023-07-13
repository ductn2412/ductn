package automation.testsuite.TrangNguyen;
 
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;
 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.pageLocatorTrangNTH.PageClient;
import automation.common.CommonBase;
import automation.constant.CT_Account;
import automation.pageLocatorTrangNTH.DashboardPage;
import automation.pageLocatorTrangNTH.LoginPage_days14;

public class ClientTestFactory_Days15 extends CommonBase {
	WebDriver driver;
	@BeforeTest
	public void openSystemUnderTest() {
		driver = initDriverTest(CT_Account.webURL);
	}

	@Test
	public void AddClient_SS() { 
		//thuc hien login
		LoginPage_days14 Login_page = new LoginPage_days14(driver);
		Login_page.LoginFunction("admin@demo.com", "riseDemo");
		//hien thi man hinh dashboard
		DashboardPage dashboard = new DashboardPage(driver);
		assertTrue(dashboard.textDashboard.isDisplayed());
		//vao man hinh client va add client
		PageClient clientpage = new PageClient(driver);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		clientpage.AddClient("demo01@demo.com", "mee");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); 
	}
	
	@Test
	public void AddClientUSS_Blank() { 
		//thuc hien login
		LoginPage_days14 Login_page = new LoginPage_days14(driver);
		Login_page.LoginFunction("admin@demo.com", "riseDemo");
		//hien thi man hinh dashboard
		DashboardPage dashboard = new DashboardPage(driver);
		assertTrue(dashboard.textDashboard.isDisplayed());
		//vao man hinh client va add client
		PageClient clientpage = new PageClient(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		clientpage.AddClientUSS_Blank("", "mee");
		WebElement nameBlank = driver.findElement(PageClient.nameBlank);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		assertTrue(nameBlank.isDisplayed());
		driver.close();
	}
	
	@Test
	public void AddClientUSS() { 
		//thuc hien login
		LoginPage_days14 Login_page = new LoginPage_days14(driver);
		Login_page.LoginFunction("admin@demo.com", "riseDemo");
		//hien thi man hinh dashboard
		DashboardPage dashboard = new DashboardPage(driver);
		assertTrue(dashboard.textDashboard.isDisplayed());
		//vao man hinh client va add client
		PageClient clientpage = new PageClient(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		clientpage.AddClientUSS(" ", "mee");
		WebElement nameBlank = driver.findElement(PageClient.nameBlank);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		assertTrue(nameBlank.isDisplayed());
		driver.close();
	}
	@AfterTest
	public void closeChromeBrower() {
        driver.close();
	}
}
