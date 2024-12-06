package testCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import pageObjects.DDTFile;
import pageObjects.HomePage;
import pageObjects.ProductReviewPage;
import pageObjects.SignPage;

public class Testcase14 extends LaunchQuit {
	
	@Test()
	public void TC14() throws EncryptedDocumentException, IOException
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
		s.signBtn();
		h.clickActList(driver);
		h.clkUrOrders();
		
		ProductReviewPage pr = new ProductReviewPage(driver);
		pr.btnProductReview();
		pr.clkprdRating();
		
	}

}
