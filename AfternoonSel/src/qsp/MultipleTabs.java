package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabs {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.id("tabButton")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("tabButton")).click();
		Thread.sleep(3000);
		
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_CONTROL);
		r1.keyPress(KeyEvent.VK_T);
		r1.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(3000);
		
		Set<String> allWndowHandles = driver.getWindowHandles();
		for(String v : allWndowHandles) {
			if(v.equals(parentWindow)) {
				
			}
			else {
				driver.switchTo().window(v).close();
				Thread.sleep(2000);
			}
		}
		
		
	}

}
