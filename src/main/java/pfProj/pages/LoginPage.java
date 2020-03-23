package pfProj.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pfProj.base.BasePage;
import pfProj.util.Constants;

public class LoginPage extends BasePage{
	
	
	
	
	
	@FindBy(id = "lid")
	public WebElement EmailField ;
	
	
	@FindBy(id = "pwd")
	public WebElement PasswordField;
	
	@FindBy(id = "sign_submit")
	public WebElement SignInButton;
	
	// Any Other WebElement on Login page 
	
	// Reusable Methods 
	
	public LoginPage(WebDriver driver, ExtentTest eTest) {
		
		this.driver=driver;
		this.eTest=eTest;
		
	}

	public boolean  doLogin() {
		EmailField.sendKeys(Constants.USER_NAME);
		eTest.log(LogStatus.INFO, "Username got entered on to Login page");
		PasswordField.sendKeys(Constants.PASSWORD);
		eTest.log(LogStatus.INFO, "Password  got entered on to Login page");
		SignInButton.click();
		eTest.log(LogStatus.INFO, "SIgn in button got clicked");
		HomePage homePage = new HomePage(driver,eTest);
		PageFactory.initElements(driver, homePage);
		boolean loginStatus  =homePage.verifyDisplayHomePage();
		
		return loginStatus;
		
		
		// Selenium automation code for logging into the  application
		
		
		
		
		
		
	}
	// Any Other Re-usable methods  
}
