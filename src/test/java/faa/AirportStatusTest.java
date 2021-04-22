package faa;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class AirportStatusTest extends WebDriverTest
{
	@Test
	public void getAirportStatus() 
	{
		driver.get("https://www.faa.gov/");
		driver.manage().window().maximize();
		
	
	    driver.findElement(By.id("airportCode")).sendKeys("KGPI");
	    driver.findElement(By.id("checkAirport")).click();

	    By airportInfo = By.cssSelector(".airportInfo");
	    
	    wait.until(presenceOfElementLocated(airportInfo));
	    
	    String airport = driver.findElement(By.cssSelector(".airportInfo")).getText();
	    String status = driver.findElement(By.cssSelector(".delayData > h3")).getText();
	    String weather = driver.findElement(By.cssSelector(".weatherData > p:nth-child(1)")).getText();
	    String temperature =  driver.findElement(By.cssSelector(".weatherData > p:nth-child(2)")).getText();
	    String wind = driver.findElement(By.cssSelector(".weatherData > p:nth-child(3)")).getText();
	    String lastUpdated = driver.findElement(By.cssSelector(".weatherData > p:nth-child(4)")).getText();
	    
	    
	    System.out.println("Airport: " + airport);
	    System.out.println("status: " + status);
	    System.out.println("weather: " + weather);
	    System.out.println("temperature: " + temperature);
	    System.out.println("wind: " + wind);
	    System.out.println("lastUpdated: " + lastUpdated);
	    
	    assertThat(status).isEqualTo("On Time");
	}
}
