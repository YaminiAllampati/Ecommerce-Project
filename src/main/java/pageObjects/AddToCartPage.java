package pageObjects;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCartPage {
	
	WebDriver driver;
	@FindBy(xpath="//span[@class=\"a-size-base-plus a-color-base a-text-normal\"]")
	List<WebElement> clkPrdct;
	
	//AddtoCart
	@FindBy(id="add-to-cart-button")
	WebElement btnAddtoCart;
	
	//Go to cart
	@FindBy(xpath="//span[@id=\"sw-gtc\"]")
	WebElement BtnGoToCart;
	
	//deselect prpduct
	@FindBy(id="deselect-all")
	WebElement clkDeSlctChk;
	
	//Item select
	@FindBy(xpath="(//i[@class=\"a-icon a-icon-checkbox\"])[2]")
	WebElement prductChk;
	
	//Item select
	@FindBy(xpath="(//div[@class=\"sc-list-item-content\"]//span[@class=\"a-label a-checkbox-label\"])")
	List<WebElement> slctItem;
	
	//addQuantity
	//@FindBy(xpath="(//div[@class=\"sc-item-content-group\"]/div//button)[2]")
	@FindBy(xpath="//span[@class=\"a-icon a-icon-small-add\"]")
	WebElement clkAddItemQunty;
	
	//remove qauntity
	@FindBy(xpath="//span[@class=\"a-icon a-icon-small-remove\"]")
	WebElement clkRmveItemQunty;
	
	//Delete item
	@FindBy(xpath="//span[@class=\"a-icon a-icon-small-trash\"]")
	WebElement delItem;
	
	//proceedToBuy
	@FindBy(name="proceedToRetailCheckout")  
	WebElement prcdBuy;
	//assertion
	
	public void slctProduct()
	{
		clkPrdct.get(3).click();
	}
	
	public void clickAddtoCart(WebDriver driver)
	{
		Set<String> wh =driver.getWindowHandles();
		System.out.println(wh);
		Iterator<String> i = wh.iterator();
		String pId = i.next();
		String cId = i.next();
        driver.switchTo().window(cId);
		btnAddtoCart.click();
	}
	
	public void clkGoToCart()
	{
		BtnGoToCart.click();
	}
	
	public void clickDeSelectChkBox()
	{
		clkDeSlctChk.click();
	}
	public void chkItem()
	{
		slctItem.get(3).click();
	}
	public void slctPrdCheck()
	{
		prductChk.click();
		}
	public void clickAddItemQunty() throws InterruptedException
	{
		
		//clkAddItemQunty.click();
		//Thread.sleep(1000);
		//driver.navigate().refresh();
		for(int i=0;i<3;i++)
		{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
		w.until(ExpectedConditions.elementToBeClickable(clkAddItemQunty));
	    clkAddItemQunty.click();
		 Thread.sleep(1000);
		}  
	}
	public void clickRmveItemQunty()
	{
		clkRmveItemQunty.click();
		}
	
	public void clckDelItemFromCart()
	{
		delItem.click();
	}
	
	public void btnProceedBuy()
	{
		prcdBuy.click();
	}
	public AddToCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
