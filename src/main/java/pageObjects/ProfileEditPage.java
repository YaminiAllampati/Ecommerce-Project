package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProfileEditPage {
	
	@FindBy(xpath="(//span[@class=\"a-color-secondary\"])[2]")
	WebElement loginAndSecurity;
	
	//name edit
	@FindBy(id="NAME_BUTTON")
	WebElement editName;
	
	@FindBy(name="customerName")
	WebElement textName;
	
	@FindBy(id="cnep_1C_submit_button")
	WebElement saveNameChge;
	
	//Email add 
	@FindBy(id="EMAIL_BUTTON")
	WebElement emailAddBtn;
	
	@FindBy(name="cvf_email")
	WebElement txtEmail;
	
	@FindBy(name="cvf_action")
	WebElement ctnBtn;
	
	//edit mobile num
	@FindBy(id="MOBILE_NUMBER_BUTTON")
	WebElement editMobNum;
	
	@FindBy(name="countryCode")
	WebElement countryCode;
	
	@FindBy(name="newMobilePhoneNumber")
	WebElement enterNewMB;
	
	@FindBy(id="auth-change-phone-cancel")
	WebElement cancelBtnMN;
	
	
	public void btnloginAndSecurity()
	{
		loginAndSecurity.click();
	}
	public void btnNameEdit()
	{
		editName.click();
	}
	public void updateNameFld()
	{
		textName.clear();
		textName.sendKeys("yamini Allampti");
	}
	public void btnSaveNameChge()
	{
		saveNameChge.click();
	}
	public void btnAddEmail()
	{
		emailAddBtn.click();
	}
	public void setEmail()
	{
		txtEmail.sendKeys("yaminireddy1428@gmail.com");
	}
	public void btnContinue()
	{
		ctnBtn.click();
	}
	public void btnEditMobNum()
	{
		editMobNum.click();
	}
	public void slctCountryCode()
	{
		Select s = new Select(countryCode);
		s.selectByValue("AD");
	}
	public void setNewMobNum()
	{
		enterNewMB.sendKeys("8878798909");
	}
	public void btnCancelMN()
	{
		cancelBtnMN.click();
	}
	public ProfileEditPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
