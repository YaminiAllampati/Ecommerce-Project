package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;


public class TestCase1 extends LaunchQuit {
	
	@Test(retryAnalyzer=pageObjects.RetryAnalyzer.class)
	public void newUserRegister()
	{
		//Homepage
		HomePage h = new HomePage(driver);
		h.clickActList(driver);
		h.clickStartHere();
		
		//registration page
		RegistrationPage r = new RegistrationPage(driver);
		r.setName();
		r.setDrpCtryCode();
		r.setMobileNum();
		r.setPswrd();
		r.clkCtnBtn();
		Assert.assertEquals(driver.getTitle(), "Authenticatio required");
			
	}

}
