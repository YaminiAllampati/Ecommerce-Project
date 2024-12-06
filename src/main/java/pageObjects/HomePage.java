package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	//register page
	@FindBy(id="nav-link-accountList")
	WebElement lnk_acntlist;
	
	@FindBy(xpath="//a[.=\"Start here.\"]")
	WebElement lnk_StartHere;
	
	//sign page
	@FindBy(id="nav-flyout-ya-signin")
	WebElement lnksign;
	
	//Manage profile
	@FindBy(xpath="//button[.=\"Manage Profiles\"]")
	WebElement mngeProfile;
	
	//view Profile
	@FindBy(xpath="//a[@data-testid=\"profile-view-button\"]")
	WebElement lnkView;
	
	//ItemSearch
	@FindBy(id="searchDropdownBox")
	WebElement drpItem;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement srchItem;
	
	//@FindBy(xpath="//div[@class=\"two-pane-results-container\"]/div/div")
	@FindBy(css ="div.s-suggestion-container")
	public List<WebElement> autosugDrp;
	
	////search button
	
	@FindBy(id="nav-search-submit-button")
	WebElement searchBtn;
	
	//your orders
	@FindBy(id="nav_prefetch_yourorders")
	WebElement yourOrders;
	
	//your account
	@FindBy(xpath="//span[.=\"Your Account\"]")
	WebElement urAccount;
	
	//assertion - testcase5
	@FindBy(xpath="//h2[.=\"Results\"]")
	public WebElement resultIcon;
	
	
	
	
	public void clickActList(WebDriver driver)
	{
        Actions a = new Actions(driver);
		a.moveToElement(lnk_acntlist).perform();	
	}
	
	public void clickStartHere()
	{
		lnk_StartHere.click();
	}
	
	public void clickSign()
	{
		lnksign.click();
	}
	
	public void clickMngeProfile()
	{
		mngeProfile.click();
	}
	public boolean ViewBtn()
	{
		
		return  lnkView.isEnabled();
		
	}
	
	public void clickViewBtn(WebDriver driver)
	{
		Actions a = new Actions(driver);
		a.doubleClick(lnkView).perform();
	}
	
	public void drpItemSelect()
	{
		Select s = new Select(drpItem);
		s.selectByVisibleText("Shoes & Handbags");
	}
	
	public void serachItem()
	{
		srchItem.sendKeys("shoes");
	}
	
	public void autoSugDrpValues(WebDriver driver)
	{
		
		for(int i=0;i<autosugDrp.size(); i++)
		{
			String as = autosugDrp.get(i).getText();
			System.out.println(as);
		} 
		 WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		 w.until(ExpectedConditions.elementToBeClickable(autosugDrp.get(3)));
		autosugDrp.get(2).click();

	}
	public void clkSearchBtn()
	{
		searchBtn.click();
	}
	public void clkUrOrders()
	{
		yourOrders.click();
	}
	public void clkUrAccount()
	{
		urAccount.click();
	}
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	
	


}
