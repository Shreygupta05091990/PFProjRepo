package pfProj.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pfProj.base.BasePage;
import pfProj.util.Constants;

public class LaunchPage extends BasePage{

    //	Webelements of Launch page 
	@FindBy(className = "zh-customers")
	public WebElement Customers;
	
	
	@FindBy(className ="zh-support")
	public WebElement Support ;

	@FindBy(className ="zh-login")
	public WebElement Login ;

	
	
	@FindBy(className ="zh-signup")
	public WebElement Signup;
	
	// Any other Locators 
	
	
	 
   public LaunchPage(WebDriver driver, ExtentTest eTest) {
		this.driver=driver ;
		this.eTest= eTest;
	   
	   
	}

	//	Reusable methods for Launch Page 
	 public boolean  goToLoginPage() {
		 
		 driver.get(Constants.APP_URL);
		 eTest.log(LogStatus.INFO, "App URl " +Constants.APP_URL + " got opened ");
		 Login.click();
		 eTest.log(LogStatus.INFO ,"Login option got clicked ");
		  LoginPage loginPage= new LoginPage(driver,eTest);
		  PageFactory.initElements(driver, loginPage);
		  boolean loginStatus = loginPage.doLogin();
	 
		  return loginStatus;
	 }
	
}
