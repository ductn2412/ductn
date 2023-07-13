package automation.testsuite.DucTran;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import automation.common.CommonBase;
import automation.constant.CT_Account;

public class Client_test extends CommonBase {
	WebDriver driver;
	@BeforeTest
	public void openchromeDriver() {
		driver= initChromeDrvier(CT_Account.webURL);
	}
	
	public void addClient() {
		@SuppressWarnings("unused")
		Login_factory login = new Login_factory();
// 		login.LoginFunction("","");
// 		 //sau đăng nhập thì click client link trên trang dashboad
// 
	}
}
