package automation.pageLocatorTrangNTH;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;
import automation.pageLocatorTrangNTH.DashboardPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automation.constant.CT_Account;

public class Flights_PAGE {
	private WebDriver driver;

	@FindBy(xpath = "//a[@id='flight-tab']")
	private WebElement Flight_tab;

	@FindBy(xpath = "//a[@id='one-way-tab']")
	private WebElement OneVayTab;

	@FindBy(xpath = "(//input[@class='form-control' and @placeholder='City or airport'])[1]")
	private WebElement Flyingfrom;

	@FindBy(xpath = "(//input[@class='form-control' and @placeholder='City or airport'])[2]")
	private WebElement Flyingto;

	@FindBy(xpath = "(//input[@name='daterange-single'])[1]")
	private WebElement Departing; 

	@FindBy(xpath = "(//div[@class='drp-calendar left single'])[1]")
	private WebElement day_Departing;
	
	@FindBy(xpath = "(//a[@data-toggle='dropdown'])[1]")
	private WebElement Passengers;

	@FindBy(xpath = "(//label[contains(text(),'Adults')])[1]")
	private WebElement Adults_Passengers;

	@FindBy(xpath = "(//input[@name='adult_number'])[1]")
	private WebElement Input_Adults_Passengers;

	@FindBy(xpath = "(//div[@class='qtyDec'])[1]")
	private WebElement Down_Adults_Passengers;

	@FindBy(xpath = "(//div[@class='qtyInc'])[1]")
	private WebElement Up_Adults_Passengers;

	@FindBy(xpath = "(//label[contains(text(),'Children')])[1]")
	private WebElement Children_Passengers;

	@FindBy(xpath = "(//input[@name='child_number'])[1]")
	private WebElement Input_Children_Passengers;

	@FindBy(xpath = "(//div[@class='qtyDec'])[2]")
	private WebElement Down_Children_Passengers;

	@FindBy(xpath = "(//div[@class='qtyInc'])[2]")
	private WebElement Up_Children_Passengers;

	@FindBy(xpath = "(//label[contains(text(),'Infants')])[1]")
	private WebElement Infants_Passengers;

	@FindBy(xpath = "(//input[@name='infants_number'])[1]")
	private WebElement Input_Infants_Passengers;

	@FindBy(xpath = "(//div[@class='qtyDec'])[3]")
	private WebElement Down_Infants_Passengers;

	@FindBy(xpath = "(//div[@class='qtyInc'])[3]")
	private WebElement Up_Infants_Passengers;
	  

	@FindBy(xpath = "(//select[@class='select-contain-select'])[3]")
	private WebElement Coach;
	@FindBy(xpath = "(//select[@class='select-contain-select'])[3]/option[1]")
	private WebElement Select_Economy_Coach;
	@FindBy(xpath = "(//select[@class='select-contain-select'])[3]/option[2]")
	private WebElement Select_Business_Coach;
	@FindBy(xpath = "(//select[@class='select-contain-select'])[3]/option[3]")
	private WebElement Select_Firstclass_Coach;
	@FindBy(xpath = "(//a[contains(text(),'Search Now')])[1]")
	private WebElement btnSearchNow;
	 
	
	
	
	public Flights_PAGE (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
}
	
	public void SearchSS (String NewYork, String Paris, String Keys, String TAB  ) {
		((WebElement) DashboardPage.Flights).click(); 
		Flight_tab.click();   
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		OneVayTab.click();   
		Flyingfrom.sendKeys("Flyingfrom");  
		Flyingto.sendKeys("Flyingto");  
		Departing.click();  
		day_Departing.click();
		Flights_PAGE dateBox = new Flights_PAGE(driver);
		((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('readonly','readonly')",dateBox  );
		dateBox.clear();
		dateBox.sendKeys("25092024");   
		dateBox.sendKeys( Keys.TAB);   
		Passengers.click();  
		Adults_Passengers.click();  
		Up_Adults_Passengers.click(); 
		Up_Infants_Passengers.click(); 
		Up_Children_Passengers.click(); 
		Coach.click();
		Select_Economy_Coach.click();
		btnSearchNow.click();
 		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//		btnSave.click();
//		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//		// dùng JavascriptExecutor để click vào totalClientCard
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", totalClientCard);
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		textboxSearch.sendKeys(companyName);
//		assertTrue(textboxSearch.isDisplayed());
	}
 
	}