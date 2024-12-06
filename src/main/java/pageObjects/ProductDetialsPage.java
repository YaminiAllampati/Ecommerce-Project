package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetialsPage {
	
	@FindBy(xpath="(//span[@class=\"a-price-whole\"])[1]")
    WebElement price;
	
	public String prdctPrice()
	{
		return price.getText();
	}

	public ProductDetialsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
