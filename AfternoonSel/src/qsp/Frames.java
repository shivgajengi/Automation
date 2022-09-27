package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/qspid/Desktop/2CSA/Page1.html");
		driver.findElement(By.id("a1")).sendKeys("123");
		driver.switchTo().frame(0);
		driver.findElement(By.id("a2")).sendKeys("ABC");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("a1")).sendKeys(" 456");
		driver.switchTo().frame("f1");
		driver.findElement(By.id("a2")).sendKeys(" MNO");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("a1")).sendKeys(" 789");
		WebElement page2Frame = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(page2Frame);
		driver.findElement(By.id("a2")).sendKeys(" XYZ");
		driver.close();
	}

}
