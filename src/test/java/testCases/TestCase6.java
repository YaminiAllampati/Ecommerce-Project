package testCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.DDTFile;
import pageObjects.HomePage;
import pageObjects.ProductFiltersPage;
import pageObjects.SignPage;

public class TestCase6 extends LaunchQuit{
	
	@Test
	public void searchWithFilters() throws EncryptedDocumentException, IOException, InterruptedException
	{
		//DDTFile d = new DDTFile();
		//d.TestCrentials();
		HomePage h = new HomePage(driver);
		/*h.clickActList(driver);
		h.clickSign();
		SignPage s = new SignPage(driver);
		s.signMbNum();
		s.signCtnBtn();
		s.signPswrd();
		//s.signPswrd(pswrd);
		s.signBtn();
		Assert.assertEquals(driver.findElement(By.id("nav-logo")).getText(),".in"); */
	
	
	//pick & Search Item
	h.drpItemSelect();
	h.serachItem();
	//List<WebElement> l = driver.findElements(By.xpath("//div[@class=\"left-pane-results-container\"]/div"));
	
	h.clkSearchBtn();
	
	ProductFiltersPage p = new ProductFiltersPage(driver);
	//p.chkBoxDelv();
	//p.clickPrductSize();
	
	WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
	//w.until(ExpectedConditions.elementToBeClickable(p.allDiscntLnk));
	//p.clcAllDiscntLnk(); 
	w.until(ExpectedConditions.visibilityOfAllElements(p.brandchkBox));
	p.slctBrandChkBox();  
	Thread.sleep(1000); 
	//p.clickColour();
	//p.clickDiscnt();
	
	
	}
	
	
	
	

}
