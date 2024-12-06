package testCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AddToCartPage;
import pageObjects.DDTFile;
import pageObjects.HomePage;
import pageObjects.PagementsPage;
import pageObjects.SignPage;

public class TestCase13 extends LaunchQuit{

 @Test
public void TC13() throws EncryptedDocumentException, IOException, InterruptedException
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
	h.autoSugDrpValues(driver);
	
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
	Thread.sleep(2000);
	p.btnUseThisAddress();
	Thread.sleep(2000);

	p.enterCouponCode();
	p.clkApplyCpnBtn();
	
	Assert.assertEquals(driver.findElement(By.xpath("(//div[@class=\"a-alert-content\"]/p)[2]")).getText(), "The promotional code you entered is not valid.");
	
}
}
