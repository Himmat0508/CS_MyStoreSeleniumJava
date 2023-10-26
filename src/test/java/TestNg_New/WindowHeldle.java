package TestNg_New;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHeldle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Browser Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		String firstWindow= driver.getWindowHandle();
		driver.findElement(By.id("newTabBtn")).click();
		
	Set<String> fullwindow =	driver.getWindowHandles();
	/*String Secondwindo = "";
	
	for ( String currentwindow:fullwindow) {
		if (!currentwindow.equals(firstWindow) ) {
			
			Secondwindo = currentwindow;
			
		}
		driver.switchTo().window(Secondwindo);

	}
	driver.findElement(By.id("alertBox")).click();*/
	
	Iterator<String> it = fullwindow.iterator();
	
	String prent = it.next();
	String child = it.next();
	
	driver.switchTo().window(child);
	
	driver.findElement(By.id("alertBox")).click();
	
	driver.switchTo().alert().accept();
	
	driver.switchTo().window(prent);
	
	Thread.sleep(3000);
	driver.quit();

		
	}

}
