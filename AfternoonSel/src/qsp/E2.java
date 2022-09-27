package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		
		WebElement textBox = driver.findElement(By.name("q"));
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		textBox.sendKeys("selenium");//StaleElementReferenceException
		Thread.sleep(3000);
		driver.close();
	}

}
