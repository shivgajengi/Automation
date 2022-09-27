package qsp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(2000);
		String parentWindowHandle = driver.getWindowHandle();
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("windowButton")).click();
		//to handle this popup
		
		
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		for(String v : allWindowHandles) {
			if(v.equals(parentWindowHandle)) {
				
			}
			else {
				driver.switchTo().window(v).close();
				Thread.sleep(2000);
			}
		}
		
		
		
		
		
	}

}
