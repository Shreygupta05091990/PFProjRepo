package pfProj.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


import com.relevantcodes.extentreports.LogStatus;

import pfProj.pages.LaunchPage;
import pfProj.tests.base.BaseTest;
import pfProj.util.Constants;


public class LoginTest extends BaseTest{
		
	
	
	@Test
	public void testLogin() {
		
		 
		 eTest = eReport.startTest("LoginTest");
		
		eTest.log(LogStatus.INFO,"LoginTest has  started");
		
		openBrowser(Constants.Browser_Type);
		
		 
		LaunchPage launchPage = new LaunchPage(driver, eTest);
		PageFactory.initElements(driver, launchPage);
		boolean loginStatus = launchPage.goToLoginPage();
		
		 if (loginStatus) {
			 
			 	reportPass("Login Test got Passed");	 
		 }
		 else {
			 	 reportFail("Login Testcase got Failed");
		 }
		 
	}	 
		 
		 	
	@AfterMethod
	public void testClosure(){
		if (eReport!=null) {
			
			eReport.endTest(eTest);
			eReport.flush();
		}
		
	 if (driver!=null) {
		 driver.quit();
	 }
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
