import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepiker2 {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Browser Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.goibibo.com/hotels/?gihp");
		
	
		String expectedday = "15";
		String expectedmonthyear = "November 2023";
		

		//driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//div[text()='Check-in']")).click();


		while(true) {

			String calendertmonthyear= driver.findElement(By.xpath("//span[@data-testid='currentCalendarMonthName']")).getText();


			if(calendertmonthyear.equals(expectedmonthyear)) {

				List<WebElement> daylist=	driver.findElements(By.xpath("//li[@class='date_is_selectable_true']"));

				for(WebElement e : daylist  ) {

					String clenderday = e.getText();


					if(clenderday.equals(expectedday)) {
					e.click();
						break;					}
			}
				break;
			}
			else {
				driver.findElement(By.xpath("//span[@data-testid='currentCalendarMonthName']")).click();
			}
			
			//Thread.sleep(2000);
			//driver.close();
		}





	}

}
