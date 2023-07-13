package automation.pageLocatorDucTN;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@SuppressWarnings("unused")
public class PageClient {
	private WebDriver driver;
	@FindBy(xpath = "//a[@class='btn btn-default' and @title='Add client']")
	private WebElement btnAddClient;
	@FindBy(xpath = "//input[@type='radio' and @value='organization']")
	private WebElement radioOrg;
	@FindBy(xpath = "//input[@type='radio' and @value='person']")
	private WebElement radioPerson;
	@FindBy(xpath = "//input[@name='company_name']")
	private WebElement textCompanyName;
	@FindBy(xpath = "//div[@id='s2id_created_by']")
	private WebElement checkboxOwner;
	//// Chọn 1 item thứ 3 trong dropdownlist tự customize (dropdownlist không dùng
	//// thẻ chuẩn là select)
	@FindBy(xpath = "//ul[@id='select2-results-3']//li[3]")
	private WebElement ownerItem;
	// Chọn Owner item1
	@FindBy(xpath = "//div[@id='select2-result-label-14']")
	private WebElement johndoe;
	// Chọn Owner item2
	@FindBy(xpath = "//div[@id='select2-result-label-20']")
	private WebElement michael;
	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement textAddress;
	@FindBy(xpath = "//button[@class='btn btn-primary' and @type='submit']")
	private WebElement btnSave;
	@FindBy(xpath = "//span[text()='Total clients']")
	private WebElement totalClientCard;
	@FindBy(xpath = "//input[@type='search']")
	private WebElement textboxSearch;
	@FindBy(xpath = "//td[@class=' all']//a[text()='trangnth@demo.com']")
	private WebElement searchResult;
//MSG

	@FindBy(xpath = "//span[@id='company_name-error']")
	public static By nameBlank = By.xpath("//span[@id='company_name-error']");

	public PageClient(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void AddClient(String companyName, String address) {
		((WebElement) DashboardPage.ClientLink).click();
		btnAddClient.click(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		radioPerson.click();
		textCompanyName.sendKeys(companyName); 
		checkboxOwner.click(); 
		ownerItem.click(); 
		textAddress.sendKeys(address); 
		btnSave.click();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		// dùng JavascriptExecutor để click vào totalClientCard
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", totalClientCard);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		textboxSearch.sendKeys(companyName);
		assertTrue(textboxSearch.isDisplayed());
	}

	public void AddClientUSS_Blank(String companyName, String address) {
		((WebElement) DashboardPage.ClientLink).click();
		btnAddClient.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		radioPerson.click();
		textCompanyName.sendKeys(companyName);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		checkboxOwner.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ownerItem.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		textAddress.sendKeys(address);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		btnSave.click();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		// dùng JavascriptExecutor để click vào totalClientCard
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", totalClientCard);
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		textboxSearch.sendKeys(companyName);
//		assertTrue(textboxSearch.isDisplayed()); 
	}
	public void AddClientUSS(String companyName, String address) {
		((WebElement) DashboardPage.ClientLink).click();
		btnAddClient.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		radioPerson.click();
		textCompanyName.sendKeys(companyName);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		checkboxOwner.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ownerItem.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		textAddress.sendKeys(address);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		btnSave.click();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 //dùng JavascriptExecutor để click vào totalClientCard
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", totalClientCard);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		textboxSearch.sendKeys(companyName);
		assertTrue(textboxSearch.isDisplayed()); 
	}
}
