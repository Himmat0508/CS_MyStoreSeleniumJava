package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DetaProviderDemo2 {
	
	@BeforeMethod
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		
	}
	
	
	@DataProvider(name ="create")
	public Object[][] dataSet1()
	{
		Object[][] serachdata= new Object[2][1];
		serachdata[0][0] = "Taj Mahal";
		serachdata[1][0] = "India Gat";
		
		return serachdata;
		
				
	}

	@Test(dataProvider = "create")
	public void DetaProvide(String keyword) {

		
		WebElement search =  driver.findElement(By.name("q"));
		search.sendKeys(keyword);
		search.sendKeys(Keys.ENTER);
	}

	public void trundown(){
		
	driv
	}
			
			
				
				
				
	}


