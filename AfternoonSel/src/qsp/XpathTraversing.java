package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTraversing {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/qspid/Desktop/2CSA/F.html");
		driver.findElement(By.xpath("//a[.='JAVA']/parent::td/following-sibling::td/child::a")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[.='SQL']/../../td[2]/a")).click();
		driver.navigate().back();
		Thread.sleep(4000);
		driver.close();
	}

}
