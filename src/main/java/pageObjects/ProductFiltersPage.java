package pageObjects;

import java.time.Duration;
import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ProductFiltersPage {
	
	//delivery checkbox
	@FindBy(xpath="(//div[@class=\"a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left\"])[1]")
	WebElement delvryChkBox;
	
	@FindBy(xpath="//button[@class=\"a-button-text a-text-center\"]")
	List<WebElement> prductSize;
	
	//Colour Selection
	@FindBy(xpath="//a[@class=\"a-link-normal s-navigation-item\"]/span//div[@class=\"colorsprite aok-float-left\"]")
	
	List<WebElement> colourChck;
	
	//discount
	//@FindBy(xpath="(//ul[@class=\"a-unordered-list a-nostyle a-vertical a-spacing-medium\"])[3]/span/span")
	@FindBy(xpath="//span[.=\"35% Off or more\"]")
	WebElement discClk;
	
	public void chkBoxDelv()
	{
		delvryChkBox.click();
	}
	public void clickPrductSize() throws InterruptedException
	{
		for(WebElement s : prductSize)
		{
			
			//System.out.println(s.getText());
			if(s.isEnabled())
			{
				if(s.getText().equals("6") || s.getText().equals("8")|| s.getText().equals("9") )
				{
					s.click();
				} 
				/*if(s.getAttribute("value").equals("7") )
				{
					s.click();
				} */
				
			}
			 
		  }
			
		}
	
	public void clickColour() throws InterruptedException
	{
		Thread.sleep(1000);
	//	Assert.assertEquals(true, colourChck.get(0).isEnabled());
		colourChck.get(0).click();
	}
	
	public void clickDiscnt() throws InterruptedException
	{
		/*for(int i=0; i<discClk.size();i++)
		{
			System.out.println(discClk.get(i).getText());
		}
		//Thread.sleep(2000); */
		//discClk.get(2).click();
		discClk.click();
	   
	}
	
	public ProductFiltersPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
