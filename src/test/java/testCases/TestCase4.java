package testCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.DDTFile;
import pageObjects.HomePage;
import pageObjects.ProfileInfoPage;
import pageObjects.SignPage;

public class TestCase4 extends LaunchQuit {
	
	@Test
	public void editProfileInfo() throws EncryptedDocumentException, IOException, InterruptedException
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
		//click on manage profile
		h.clickActList(driver);
		h.clickMngeProfile();
		boolean b = h.ViewBtn();
		System.out.println("Clickable : " + b);
	    Assert.assertEquals(true, b);
		h.clickViewBtn(driver);
		ProfileInfoPage p = new ProfileInfoPage(driver);
		p.clkEditBtn();
		p.editProfileName();
		p.clickEditCtnBtn();
		//preferred Department
	    p.clickPrfrdDep();
		p.clickAddBtnPD();
		p.genderSelect();
		
	}

}
