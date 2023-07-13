package automation.pageLocatorDucTN;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@SuppressWarnings("unused")
public class DashboardPage {
//	public static By textDashboard = By.xpath("//ul[@id='sidebar-menu']/descendant::span[text()='Dashboard']");
//	public static By ClientLink = By.xpath("https://rise.fairsketch.com/clients");
	WebDriver driver;
	@FindBy(xpath="//ul[@id='sidebar-menu']/descendant::span[text()='Dashboard']")
	public static WebElement textDashboard;
	
	@FindBy(xpath="//span[@class='menu-text ' and normalize-space()='Clients']")
	public static WebElement ClientLink;
//web máy bay
	
	@FindBy(xpath="//a[@id='flight-tab']")
	public static WebElement Flights;
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		 
	}

}
