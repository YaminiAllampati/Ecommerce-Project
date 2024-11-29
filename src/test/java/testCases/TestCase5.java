package testCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.ProfileInfoPage;
import pageObjects.SignPage;

public class TestCase5 extends LaunchQuit {
	
	@Test
	public void itemSearch() throws EncryptedDocumentException, IOException
	{
	
	HomePage h = new HomePage(driver);
	h.clickActList(driver);
	h.clickSign();
	
	SignPage s = new SignPage(driver);

	FileInputStream f = new FileInputStream("C:\\Users\\yamin\\eclipse-workspace\\amazonProject1\\DDT_Amazon\\TestData.xlsx");
     Workbook w =WorkbookFactory.create(f);
    String usr = NumberToTextConverter.toText(w.getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue());
    String pswrd = NumberToTextConverter.toText(w.getSheet("Sheet1").getRow(1).getCell(1).getNumericCellValue());
	s.signMbNum(usr);
	s.signCtnBtn();
	s.signPswrd(pswrd);
	s.signBtn();
	Assert.assertEquals(driver.findElement(By.id("nav-logo")).getText(),".in");
	//pick & Search Item
	h.drpItemSelect();
	h.serachItem();
	//List<WebElement> l = driver.findElements(By.xpath("//div[@class=\"left-pane-results-container\"]/div"));
	
	h.autoSugDrpValues();
	
	
	}
	
	
}


