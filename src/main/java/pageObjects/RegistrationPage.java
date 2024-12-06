package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
	
	@FindBy(id="ap_customer_name")
	WebElement txtname;
	
	@FindBy(name="countryCode")
	WebElement drpCntryCode;
	
	@FindBy(name="email")
	WebElement txtMobileNum;
	
	@FindBy(name="password")
	WebElement txtpswrd;
	
	@FindBy(id="continue")
	WebElement btnContinue;
	
	
	public void setName()
	{
		txtname.sendKeys("Yamini");
	}
	public void setDrpCtryCode()
	{
		Select s = new Select(drpCntryCode);
		s.selectByValue("AO");
	}
	public void setMobileNum()
	{
		txtMobileNum.sendKeys("8688380891");
	}
	public void setPswrd()
	{
		txtpswrd.sendKeys("9492335791");
	}
	
	public void clkCtnBtn()
	{
		btnContinue.click();
	}
	
	
	public RegistrationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
}