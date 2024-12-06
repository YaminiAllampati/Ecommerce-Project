package pageObjects;

import java.time.Duration;
import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ProductFiltersPage {
	
	//delivery checkbox
	@FindBy(xpath="(//div[@class=\"a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left\"])[1]")
	WebElement delvryChkBox;
	
	//product size
	@FindBy(xpath="//button[@class=\"a-button-text a-text-center\"]")
	List<WebElement> prductSize;
	
	//BrandSelection
	@FindBy(xpath="//div[@id=\"brandsRefinements\"]/ul/span/span")
	public List<WebElement> brandchkBox;
	
	//alldisconts
	@FindBy(id="p_n_deal_type/26921226031")
	public WebElement allDiscntLnk;
	//Colour Selection
	@FindBy(xpath="//a[@class=\"a-link-normal s-navigation-item\"]/span//div[@class=\"colorsprite aok-float-left\"]")
	
	public List<WebElement> colourChck;
	
	//discount
	//@FindBy(xpath="(//ul[@class=\"a-unordered-list a-nostyle a-vertical a-spacing-medium\"])[3]/span/span")
	@FindBy(xpath="//div[@id =\"p_n_pct-off-with-tax/2665398031\"]/ul/span/span")
	public List<WebElement> discClk;
	
	/*< ---------TestCase -08 webelements--------->  */
	@FindBy(css="select[name=\"s\"]")
	WebElement filtersIcon;
	
	@FindBy(css ="span[class=\"a-dropdown-prompt\"]")
	public WebElement sortByDrp;
	
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
	public void slctBrandChkBox()
	{
		try {
		for(int i=0; i<brandchkBox.size(); i++)
		{
			if(brandchkBox.get(i).isDisplayed() && brandchkBox.get(i).isSelected() )
			{
			String b = brandchkBox.get(i).getText();
			   {
			      if(b.equals("ASIAN") || b.equals("Puma"))
			      {
				    brandchkBox.get(i).click();
			       }
		       }
		     }
		}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public void clcAllDiscntLnk()
	{
		allDiscntLnk.click();
	}
	public void clickColour() throws InterruptedException
	{
		Thread.sleep(1000);
	//	Assert.assertEquals(true, colourChck.get(0).isEnabled());
		colourChck.get(0).click();
	}
	
	public void clickDiscnt() throws InterruptedException
	{
		for(int i=0; i<discClk.size();i++)
		{
			if(discClk.get(i).isEnabled())
			{
			System.out.println(discClk.get(i).getText());
			//discClk.get(i).click();
			}
		}
		//Thread.sleep(2000); 
		discClk.get(2).click();
		//discClk.click();
	   
	}
	
	public void clkFiltersdrp()
	{
		Select s = new Select(filtersIcon);
		s.selectByVisibleText("Best Sellers");
	}
	
	
	public ProductFiltersPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
