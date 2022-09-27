package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Act1 {
	WebDriver driver ;//global variable can be used in all the methods.
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test(priority = 1)
	public void openApp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));		
	}
	@Test(priority = 2)
	public void testApp() throws InterruptedException {		
		driver.get("http://www.vtiger.com");
		WebElement resources = driver.findElement(By.xpath("(//a[contains(.,'Resources')])[1]"));
		Actions a1 = new Actions(driver);
		Thread.sleep(3000);
		a1.moveToElement(resources).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[contains(.,'Contact Us')])[1]")).click();
		Thread.sleep(3000);
		WebElement contactNo = driver.findElement(By.xpath("//p[contains(.,'Bengaluru')]/../p[2]"));
		System.out.println(contactNo.getText());	
	}
	@Test(priority = 3)
	public void closeApp() {
		driver.close();	}	
}
