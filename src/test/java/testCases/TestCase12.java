package testCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AddToCartPage;
import pageObjects.DDTFile;
import pageObjects.HomePage;
import pageObjects.PagementsPage;
import pageObjects.SignPage;

public class TestCase12 extends LaunchQuit{
	
	@Test
	public void AddandRemoveQuantiesFromCart() throws EncryptedDocumentException, IOException, InterruptedException
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
		s.signBtn();
		Assert.assertEquals(driver.findElement(By.id("nav-logo")).getText(),".in");
		//pick & Search Item
		h.drpItemSelect();
		h.serachItem();
		//List<WebElement> l = driver.findElements(By.xpath("//div[@class=\"left-pane-results-container\"]/div"));
		Thread.sleep(1000);
		h.autoSugDrpValues();
		
		AddToCartPage c = new AddToCartPage(driver);
		c.slctProduct();
		
		c.clickAddtoCart(driver);
		
		c.clkGoToCart();
		
		//c.clickDeSelectChkBox();
		
		c.slctPrdCheck();
		
		c.btnProceedBuy();
		//Assert.assertEquals(true, driver.findElement(By.xpath("//div[@class=\"a-row\"]/h2")).isDisplayed());
		PagementsPage p = new PagementsPage(driver);
		p.slctAddress();
		Thread.sleep(1000);
		p.btnUseThisAddress();
		Thread.sleep(1000);

		p.slctPaymentMethod();
		//p.drpNetBnk();
		p.enterUpiNo();
		
		
		}
		
		


}
