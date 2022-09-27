package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		
		Thread.sleep(3000);
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_CONTROL);
		r1.keyPress(KeyEvent.VK_P);
		r1.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(5000);
		r1.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		r1.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		driver.close();
		

	}

}
