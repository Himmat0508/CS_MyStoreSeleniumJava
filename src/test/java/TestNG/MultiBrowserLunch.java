package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiBrowserLunch {

	// public static String browser = "edge";
	public static WebDriver driver; /// we can hendal all the browesr by wedriver
	// public static FirefoxDriver driver;
	// public static ChromeDriver driver1;

	@Parameters({"browser"})
@Test 
	public void lonchApplicstion(String browser) {

		if (browser.equals("Firefox")) { // one
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("chrome")) // two
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) // three
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();

		driver.switchTo().parentFrame();
		System.out.println(driver.getTitle());
		driver.close();

	}

}
