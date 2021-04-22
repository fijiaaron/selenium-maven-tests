package faa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import driver.DriverFactory;


public class WebDriverTest
{
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeMethod
	public void setup()
	{
		driver = new DriverFactory().getChromeDriver();
		wait = new WebDriverWait(driver, 10);
	}

	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
