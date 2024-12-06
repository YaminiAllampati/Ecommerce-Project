package testCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AddToCartPage;
import pageObjects.DDTFile;
import pageObjects.HomePage;
import pageObjects.ProductDetialsPage;
import pageObjects.SignPage;

public class TestCase7 extends LaunchQuit {
	
	
	@Test
	public void TC7() throws EncryptedDocumentException, IOException, InterruptedException
	{
	
	DDTFile d = new DDTFile();
	d.TestCrentials();
	HomePage h = new HomePage(driver);
	h.clickActList(driver);
	h.clickSign();
	SignPage s = new SignPage(driver);
	
	s.signMbNum();
	s.signCtnBtn();
	s.signPswrd();
			//s.signPswrd(pswrd);
	s.signBtn();		Assert.assertEquals(driver.findElement(By.id("nav-logo")).getText(),".in");
	//pick & Search Item
	h.drpItemSelect();
	h.serachItem();
	//List<WebElement> l = driver.findElements(By.xpath("//div[@class=\"left-pane-results-container\"]/div"));
	
	h.autoSugDrpValues(driver);
	
	AddToCartPage c = new AddToCartPage(driver);
	Thread.sleep(1000);
	c.slctProduct();
	
	ProductDetialsPage pd = new ProductDetialsPage(driver);
	String price = pd.prdctPrice();
	System.out.println("Product price  : " + price);
	Assert.assertEquals(driver.findElement(By.xpath("(//span[@class=\"a-price-whole\"])[1]")).getText(), price);
	//Assert.assertEquals(, null);
	

}
}
