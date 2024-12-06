package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PagementsPage {
	
	@FindBy(xpath="(//input[@name=\"submissionURL\"])[2]")
	WebElement addressSelect;
	
	@FindBy(xpath="(//input[@class=\"a-button-input\"])[2]")
	WebElement UseThisAddress;
	
	//payment selection
	//@FindBy(xpath="(//div[@class=\"a-box-inner\"])[1]/div/div")
	//@FindBy(xpath="//div[@class=\"a-fixed-left-grid-col a-col-left\"]")
	@FindBy(xpath="//input[@name=\"ppw-instrumentRowSelection\"]")
	List<WebElement> paymentSelect;
	
	//select Dropdown from net banking
	@FindBy(name="ppw-bankSelection_dropdown")
	WebElement netBankingdrp;
	
	//enter the upi id
	@FindBy(name="__sif_encryptedVPA_collect")
	WebElement upiTxt;
	
	//verify button in UPI option
	@FindBy(name="ppw-widgetEvent:ValidateUpiIdEvent")
	WebElement verifyUPI;
	
	//use this payment method button
	@FindBy(name="ppw-widgetEvent:SetPaymentPlanSelectContinueEvent")
	WebElement paymentBtn;
	
	//offers - No Thanks Button
	@FindBy(id="prime-interstitial-nothanks-button")
	public
	WebElement noThanksBtn;
	
	//Place order & pay
	@FindBy(css="span[id=\"bottomSubmitOrderButtonId-announce\"]")
	public WebElement playAndPayorder;
	
	//coupon code
	@FindBy(name="ppw-claimCode")
	WebElement couponCode;
	//apply Coupon
	@FindBy(name="ppw-claimCodeApplyPressed")
	WebElement applyBtn;
	
	public void slctAddress()
	{
		addressSelect.click();
	}
	
	public void btnUseThisAddress()
	{
		UseThisAddress.click();
	}
	public void slctPaymentMethod() throws InterruptedException
	{
		Thread.sleep(1000);
		System.out.println("size : " + paymentSelect.size());
		Thread.sleep(1000);
		
		WebElement p1 =paymentSelect.get(2);
		if(p1.isDisplayed() && p1.isEnabled())
		{
			p1.click();
			System.out.println("Clickable");
		}
		else
		{
			System.out.println("Not clickable");
		}

		/*for(WebElement s:paymentSelect)
		{
			if(s.getText().equals("Net Banking"))
			s.click();
		} */
	}
	
	public void drpNetBnk()
	{
		Select s = new Select(netBankingdrp);
		s.selectByVisibleText("Bank of India");
	}
	public void enterUpiNo()
	{
		upiTxt.sendKeys("allampati.yamini@ybl");
	}
	public void btnverifyUPI()
	{
		verifyUPI.click();
	}
	public void btnPayment()
	{
		paymentBtn.click();
	}
	public void btnNoThanks()
	{
		noThanksBtn.click();
	}
	public void btnplayAndPayorder()
	{
		playAndPayorder.click();
	}
	public void enterCouponCode()
	{
		couponCode.sendKeys("XASD565@");
	}
	public void clkApplyCpnBtn()
	{
		applyBtn.click();
	}
	public PagementsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
