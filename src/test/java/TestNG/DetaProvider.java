package TestNG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;


public class DetaProvider {
	
	@Test
	public void apsart() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		
		String expected = "Wikipedia";
		String actual = driver.getTitle();
		
		Assert.assertEquals(expected, actual);
		
		System.out.println("verifiying the title");
		
		WebElement wic = driver.findElement(By.xpath("//*[text()='Wikipedia']"));
		assertEquals(false, null)
	
		
	}

	

}

