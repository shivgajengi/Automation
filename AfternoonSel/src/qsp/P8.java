package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P8 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/qspid/Desktop/2CSA/B.html");
		driver.findElement(By.id("un")).sendKeys("DINGA");
		Thread.sleep(2000);
		driver.findElement(By.name("n1")).sendKeys("1234567890");
		Thread.sleep(2000);
		driver.findElement(By.linkText("forgot password???")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.className("lg")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("cl")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
