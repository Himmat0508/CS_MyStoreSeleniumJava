import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshoet {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Browser Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://sellglobal.ebay.in/seller-center/home/");
		
		//Full page SS
		//TakesScreenshot sc = (( TakesScreenshot)driver);
		
	//File src=	sc.getScreenshotAs(OutputType.FILE);
	
	//File des = new File("C:\\Users\\DELL\\eclipse-workspace\\WebPortal\\SecreenShort\\fullpage.png");
	
	//FileUtils.copyFile(src, des);
			
	//particule section SS
	
	WebElement section = driver.findElement(By.xpath("/html/body/div[2]/section[9]/div/div/div/div/div/h2"));
	
	section.click();
	
	File sec = section.getScreenshotAs(OutputType.FILE);
	
	File ter = new File("C:\\Users\\DELL\\eclipse-workspace\\WebPortal\\SecreenShort\\section.png");
	
	FileUtils.copyFile(sec, ter);
	
	driver.close();
	
		
			
		
	}

}
