package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownloadPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.fb.com");
		
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_CONTROL);
		r1.keyPress(KeyEvent.VK_S);
		r1.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(3000);
		r1.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		driver.close();

	}

}
