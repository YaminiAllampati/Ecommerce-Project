package pageObjects;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SignPage extends DDTFile{
	
	@FindBy(id="ap_email")
	WebElement textMbNum;
	
	@FindBy(id="continue")
	WebElement sgnCtnBtn;
	
	@FindBy(id="ap_password")
	WebElement sgnPswrd;
	
	@FindBy(id="signInSubmit")
	WebElement sgnBtn;
	
	public void signMbNum() throws EncryptedDocumentException, IOException
	{
			textMbNum.sendKeys(us1);
	} 

	/*public void signMbNum(String usr) throws EncryptedDocumentException, IOException
	{
		
		textMbNum.sendKeys(usr);
	}  */
	public void signCtnBtn()
	{
		sgnCtnBtn.click();
	}
	public void signPswrd()
	{
		
		sgnPswrd.sendKeys(ps1);
	} 
	/*public void signPswrd(String pswrd)
	{
		
		sgnPswrd.sendKeys(pswrd);
	}  */
	//invalid
	public void signMbNum1() throws EncryptedDocumentException, IOException
	{
			textMbNum.sendKeys(us2);
	} 
	public void signPswrd1()
	{
		
		sgnPswrd.sendKeys(ps2);
	} 
	public void signBtn()
	{
		sgnBtn.click();
	}
	
	public SignPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	

}
