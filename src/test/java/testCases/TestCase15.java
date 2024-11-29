package testCases;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AddToCartPage;
import pageObjects.HomePage;
import pageObjects.SignPage;

public class TestCase15 extends LaunchQuit {
	
	@Test()
	public void TC15()
	{
		
		HomePage h = new HomePage(driver);
		//pick & Search Item
		h.drpItemSelect();
		h.serachItem();
		//List<WebElement> l = driver.findElements(By.xpath("//div[@class=\"left-pane-results-container\"]/div"));
		
		h.autoSugDrpValues();
		
		AddToCartPage c = new AddToCartPage(driver);
		c.slctProduct();
		
		c.clickAddtoCart(driver);
		
		c.btnProceedBuy();
		
		Assert.assertEquals(driver.getTitle(), "Amazon Sign In");
		
		
	}
	
	

}
