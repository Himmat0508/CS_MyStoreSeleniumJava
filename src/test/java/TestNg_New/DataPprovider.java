package TestNg_New;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataPprovider {
	
	@DataProvider( name = "provider")
public Object[][] serchdemo(){
	
	Object[][] searchkey= new Object[3][2];
	searchkey[0][0] = "India";
	searchkey[0][1] = "Qutub Miinar";
	
	searchkey[1][0] = "ager";
	searchkey[1][1] = "Taj mahal";
	
	searchkey[2][0] = "jaipur";
	searchkey[2][1] = "Hava Mahal";
	
	return searchkey;
	
	
}
	@Test(dataProvider = "provider")
	public void TestgoogleSearch(String Cuntry,String Movmant) {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com/");
	
	driver.findElement(By.name("q")).sendKeys(Cuntry + "  " +Movmant);
	driver.findElement(By.name("btnK")).click();
	}
	
	
}
