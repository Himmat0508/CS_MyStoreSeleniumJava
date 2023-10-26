package TestNg_New;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {
	
	WebDriver driver;
	
	@BeforeMethod
	@Parameters ("browser" )
	public void LaunchBriwser(String browser){
		
		switch (browser) {
		case "chrome": WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
			
			break;
		case "msedge": WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();


		default:
			driver = null;
			break;
		}
		
		
		
	}
	@Test
	public void verifytitle() {
		driver.get("https://www.google.com/");
		String expetedTitle = "Google";
		
		String actualtitel = driver.getTitle();
		
		Assert.assertEquals(expetedTitle, actualtitel);
	}
	@AfterMethod
	public void browserclose() {
		driver.quit();
	}
	

}
