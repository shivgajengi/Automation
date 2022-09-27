package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledTextField {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/qspid/Desktop/2CSA/I.html");
		Thread.sleep(3000);
			
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('un').value='ABCD'");
		
		Thread.sleep(3000);
		driver.close();

	}

}
