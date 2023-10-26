import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePiker {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Browser Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/datepicker/");

		String expectedday = "17";
		String expectedmonth = "September";
		String expectedyear = "2025";

		driver.switchTo().frame(0);

		driver.findElement(By.id("datepicker")).click();

		while(true) {
			
		String calendertmonth= driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		
		String calendertyear= driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
			if(calendertmonth.equals(expectedmonth) && calendertyear.equals(expectedyear)) {
				
			List<WebElement> daylist=	driver.findElements(By.xpath("//table/tbody/tr/td"));
			
			for( WebElement e:daylist) {
				
				String date =e.getText();
				
				if (date.equals(expectedday)) {
					e.click();
					break;
				}
							
			}
			break;
			}
			else {
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
			}
			//driver.quit();
		}
		
		
			
		
		
		
	}
	
	

}
