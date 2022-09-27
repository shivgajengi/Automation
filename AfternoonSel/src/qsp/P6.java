package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/qspid/Desktop/2CSA/B.html");
		driver.findElement(By.id("un")).sendKeys("pritam mane");
		driver.findElement(By.name("n1")).sendKeys("pass@123");
		driver.findElement(By.linkText("forgot password???")).click();
		driver.navigate().back();
		driver.findElement(By.className("lg")).click();
		driver.findElement(By.className("cl")).click();
		driver.close();

	}

}
