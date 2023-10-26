
package TestNg_New;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderWithExel {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void browserclose() {
		driver.quit();
	}

}
