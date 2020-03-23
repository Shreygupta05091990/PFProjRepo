package pfProj.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.relevantcodes.extentreports.ExtentTest;

import pfProj.base.BasePage;

public class HomePage extends BasePage {
	
	
	public HomePage(WebDriver driver, ExtentTest eTest) {
		this.driver=driver;
		this.eTest=eTest;
		
	}

	@FindBy(css="[class^='zicon-apps-calendar']")
	public WebElement Calendar;
	
	
	@FindBy(css="[class^='zicon-apps-chat']")
	public WebElement Cliq;
	
	@FindBy(css="[class^='zicon-apps-mail']")
	public WebElement Mail;
	
	@FindBy(css="[class^='zicon-apps-crm']")
	public WebElement CRM;
	
	@FindBy(css="[class^='zicon-apps-salesiq']")
	public WebElement SalesIQ;
	
	//	 Reusable methods 	to navigate to calendar page 
	
	//	 Reusable methods 	to navigate to qliq page 

	//	 Reusable methods 	to navigate to CRM page 
	//	 Reusable methods 	to navigate to main page 

	public boolean  verifyDisplayHomePage() {
		
//		String currentURL = driver.getCurrentUrl();
		return(isElementPresent(CRM));
			
		
		
	}
	
	
}
