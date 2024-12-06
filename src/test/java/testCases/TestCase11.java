package testCases;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AddToCartPage;
import pageObjects.DDTFile;
import pageObjects.HomePage;
import pageObjects.PagementsPage;
import pageObjects.SignPage;

public class TestCase11 extends LaunchQuit{
	
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

		p.slctPaymentMethod();
		//p.drpNetBnk();
		p.enterUpiNo();
		
		p.btnverifyUPI();
		Thread.sleep(3000);
		p.btnPayment();
		//Thread.sleep(2000);
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(10));
		wt.until(ExpectedConditions.elementToBeClickable(p.noThanksBtn));
		p.btnNoThanks();
		FluentWait<WebDriver> f = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(1)).ignoring(TimeoutException.class);
		f.until(ExpectedConditions.elementToBeClickable(p.playAndPayorder));
		p.btnplayAndPayorder();
		
		
		}

	}

		
		


