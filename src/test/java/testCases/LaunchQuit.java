package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import pageObjects.ITestListeners;

@Listeners(pageObjects.ITestListeners.class)
public class LaunchQuit extends ITestListeners {
	
	//public WebDriver driver;
	
	@BeforeMethod
 	//@Parameters("browser")
	//public void launch(String bwsrName)
	public void launch()
	{
	/*	if(bwsrName.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		if(bwsrName.equals("edge"))
		{
			driver = new EdgeDriver();
		}
		if(bwsrName.equals("firefox"))
		{
			driver = new FirefoxDriver();
		} */
		driver = new EdgeDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
	}
	
	/*@AfterMethod
	public void quit()
	{
		driver.quit();
	} */



}
