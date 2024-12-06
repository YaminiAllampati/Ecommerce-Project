package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.ProductFiltersPage;

public class TestCase8 extends LaunchQuit {
	
	@Test
	public void TC8()
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
	p.clkFiltersdrp();
	
	Assert.assertEquals(p.sortByDrp.getText(), "Best Sellers");
	
	}

}
