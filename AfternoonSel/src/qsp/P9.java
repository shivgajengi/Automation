package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P9 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/qspid/Desktop/2CSA/C.html");
		driver.findElement(By.tagName("a")).click();//link-1
		driver.navigate().back();
		driver.findElement(By.xpath("//a[contains(@href,'amaz')]")).click();
		driver.navigate().back();
		driver.close();
		

	}

}
