package faa;

import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SimpleSeleniumTest extends WebDriverTest
{
	@Test
	public void openHomePage()
	{
		driver.get("https://www.faa.gov");
		assertThat(driver.getTitle()).contains("Federal Aviation Administration");
		driver.quit();
	}
	
}
