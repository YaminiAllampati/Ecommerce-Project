package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductReviewPage {
	
	@FindBy(id="a-autoid-6-announce")
	WebElement prdctReview;
	
	//review - 5 star
		@FindBy(xpath="(//div[@class=\"a-section a-spacing-top-micro\"]/button)[5]")
		WebElement prdRating;
	
	public void btnProductReview()
	{
		prdctReview.click();
	}
	
	public void clkprdRating()
	{
		prdRating.click();
	}
	
	
	
	public ProductReviewPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
