package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLogin {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver = new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		//go to fb
		driver.get("http://www.fb.com");
		//type mail id in text field
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9594281612");
		Thread.sleep(3000);
		//type password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Zhinga@123.");
		Thread.sleep(3000);
		//click on login button
		driver.findElement(By.xpath("//button[@value='1']")).click();
		Thread.sleep(8000);
		driver.findElement(By.cssSelector("svg[aria-label='Your profile']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[.='Log Out']")).click();
		Thread.sleep(8000);
		driver.close();
	}

}
