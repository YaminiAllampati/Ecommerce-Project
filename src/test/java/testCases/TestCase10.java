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
import pageObjects.SignPage;

public class TestCase10 extends LaunchQuit {
	
	@Test
	public void AddandRemoveQuantiesFromCart() throws EncryptedDocumentException, IOException, InterruptedException
	{
		DDTFile d = new DDTFile();
		d.TestCrentials();
		HomePage h = new HomePage(driver);
		h.clickActList(driver);
		h.clickSign();
		SignPage s = new SignPage(driver);
		//FileInputStream f = new FileInputStream("C:\\Users\\yamin\\eclipse-workspace\\amazonProject1\\DDT_Amazon\\TestData.xlsx");
	   //  Workbook w =WorkbookFactory.create(f);
	   // String usr = NumberToTextConverter.toText(w.getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue());
	  // String pswrd = NumberToTextConverter.toText(w.getSheet("Sheet1").getRow(1).getCell(1).getNumericCellValue());
		//s.signMbNum(usr);
		s.signMbNum();
		s.signCtnBtn();
		//Assert.assertEquals(, null);
		s.signPswrd();
				//s.signPswrd(pswrd);
		s.signBtn();
		Assert.assertEquals(driver.findElement(By.id("nav-logo")).getText(),".in");
		h.clickActList(driver);
		h.drpItemSelect();
		h.serachItem();
		//List<WebElement> l = driver.findElements(By.xpath("//div[@class=\"left-pane-results-container\"]/div"));
		
		h.autoSugDrpValues(driver);
		
		AddToCartPage c = new AddToCartPage(driver);
		c.slctProduct();
		
		c.clickAddtoCart(driver);
		
		c.clkGoToCart();
		
		//c.clickDeSelectChkBox();
		
		//c.chkItem();
		
		c.clickAddItemQunty();
		
		c.clickRmveItemQunty();
		
		c.clckDelItemFromCart();
		
		Assert.assertEquals(true, driver.findElement(By.xpath("//div[@class=\"a-row\"]/h2")).isDisplayed());
		
		
		}
		
		

}
