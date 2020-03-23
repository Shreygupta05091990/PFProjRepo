	package pfProj.tests.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import junit.framework.Assert;
import pfProj.util.Constants;
import pfProj.util.ExtentManager;

public class BaseTest {
	
	public WebDriver  driver= null ;
	public ExtentReports eReport=ExtentManager.getInstance();
	public   ExtentTest eTest;
	
		public void openBrowser(String browserType) {
			
			if (browserType.equalsIgnoreCase("firefox")){
				
				System.setProperty("webdriver.gecko.driver", Constants.FIREFOX_DRIVER);
				
				  driver = new  FirefoxDriver();
				  
			}else if (browserType.equalsIgnoreCase("chrome")){
				
				
				System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER);
				driver = new  FirefoxDriver();
				
				
			}
			
			eTest.log(LogStatus.INFO,"Successfully opened the browser "+ browserType);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			
			
		}
	
	
	
	public void  reportPass(String message) {
		
		 eTest.log(LogStatus.PASS, message);
		 
	}

	
	public void reportFail(String message) {
		
		
		eTest.log(LogStatus.FAIL, message);
		Assert.fail(message);
	}


	

}
