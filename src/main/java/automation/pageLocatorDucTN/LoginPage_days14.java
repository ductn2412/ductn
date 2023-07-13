package automation.pageLocatorTrangNTH;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_days14 {
	private WebDriver driver;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement txtEmail;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement txtPass;

	@FindBy(xpath = "//button[contains(text(),'Sign in')]")
	private WebElement btnLogin;

	@FindBy(xpath = "//div[@class='alert alert-danger']")
	public static By errorAuthentication1;

	@FindBy(xpath = "//span[@class='Please enter a valid email address")
	public static By ErrorUsername;

	@FindBy(xpath = "//span[@id='email-error']")
	public static By Emailisrequired;

	@FindBy(xpath = "//span[@id='email-error']")
	public static By Emailisinvalid;

	@FindBy(xpath = "//span[@id='email-error']")
	public static By PWisrequired;

	public LoginPage_days14(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void LoginFunction(String email, String password) {
		txtEmail.clear();
 		txtEmail.clear();
 		txtEmail.sendKeys(email);
 		txtPass.clear();
 		txtPass.sendKeys(password);
 		btnLogin.click(); 
	}
}
