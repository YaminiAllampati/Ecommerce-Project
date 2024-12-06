package testCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import pageObjects.DDTFile;
import pageObjects.HomePage;
import pageObjects.ProfileInfoPage;
import pageObjects.SignPage;

public class TestCase5 extends LaunchQuit {
	
	@Test
	public void itemSearch() throws EncryptedDocumentException, IOException
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
	//pick & Search Item
	   h.drpItemSelect();
	   h.serachItem();
	    //List<WebElement> l = driver.findElements(By.xpath("//div[@class=\"left-pane-results-container\"]/div"));
	   
	  // WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
	  // w.until(ExpectedConditions.elementToBeClickable(h.autosugDrp.get(4)));
	   h.autoSugDrpValues(driver);
	   //hard assert
	   Assertion a = new Assertion();
	   a.assertEquals(h.resultIcon.getText(),"Results");
	
	
	}
	
	
}


