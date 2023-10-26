package TestNG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifiyTitleTest {
	
	@Test
	public void titletest()
	
	{
		
		String expectedtitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.ebay.com/");
		String axpectedtitle = driver.getTitle();
		Assert.assertEquals(axpectedtitle, expectedtitle);
		
		
	}

}
