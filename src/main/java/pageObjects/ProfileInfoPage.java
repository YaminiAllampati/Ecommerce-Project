package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileInfoPage {
	
	@FindBy(xpath="//button[@class=\"edit-pencil-icon-button\"]")
	WebElement BtnEdit;
	
	@FindBy(id="editProfileNameInputId")
	WebElement txtProfileName;
	
	@FindBy(xpath="(//span[@class=\"a-button-inner\"])[6]")
	WebElement BtnCtn;
	//about you section
	@FindBy(xpath="(//div[@class=\"profile-hub-attributes-section\"])[1]/div//button")
	List<WebElement> btnPrefrdDep;
	
	@FindBy(xpath="//button[@class=\"attribute-action\"]")
	WebElement BtnAddPD;
	
	@FindBy(xpath="//button[.=\"Women\"]")
	WebElement genderSlct;
	
	public void clkEditBtn()
	{
		BtnEdit.click();
	}
	public void editProfileName()
	{
		txtProfileName.clear();
		txtProfileName.sendKeys("Yamini A");
	}
	
	public void clickEditCtnBtn()
	{
		BtnCtn.click();
	}
	
	public void clickPrfrdDep() throws InterruptedException
	{
		
	    for(int i=0; i<btnPrefrdDep.size(); i++)
	    {
	    	String pd = btnPrefrdDep.get(i).getText();
	    	System.out.println(pd);
	    }
	    Thread.sleep(1000);
	    btnPrefrdDep.get(4).click();
	    
	}
	
	public void clickAddBtnPD()
	{
		BtnAddPD.click();
	}
	public void genderSelect()
	{
	   genderSlct.click();

	}

	public ProfileInfoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
