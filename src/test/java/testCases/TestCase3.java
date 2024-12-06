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

import pageObjects.DDTFile;
import pageObjects.HomePage;
import pageObjects.SignPage;

public class TestCase3 extends LaunchQuit{
	
	@Test
	public void incorrectUserSign() throws EncryptedDocumentException, IOException
	{
		DDTFile d = new DDTFile();
		d.TestCrentials();
		HomePage h = new HomePage(driver);
		h.clickActList(driver);
		h.clickSign();
		
		SignPage s = new SignPage(driver);
		/*FileInputStream f = new FileInputStream("C:\\Users\\yamin\\eclipse-workspace\\amazonProject1\\DDT_Amazon\\TestData.xlsx");
	     Workbook w =WorkbookFactory.create(f);
	    String usr = NumberToTextConverter.toText(w.getSheet("Sheet1").getRow(2).getCell(0).getNumericCellValue());
	   String pswrd = NumberToTextConverter.toText(w.getSheet("Sheet1").getRow(2).getCell(1).getNumericCellValue());
		*/
		s.signMbNum1();
		
		s.signCtnBtn(); 
		s.signPswrd1();
		s.signBtn();
		Assert.assertEquals(driver.findElement(By.id("nav-logo")).getText(),".in");
	  //  Assert.assertEquals(driver.findElement(By.xpath("//span[@class=\"a-list-item\"]")).getText(),"Your password is incorrect","Your password is incorrect");
		//String e = driver.findElement(By.xpath("//span[@class=\"a-list-item\"]")).getText();
		//System.out.println(e);
		//Assert.assertEquals(e, "Your password is incorrect");
	 
	}


}
