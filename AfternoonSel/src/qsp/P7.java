package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P7 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver ajay = new ChromeDriver();
	ajay.manage().window().maximize();
	ajay.get("http://www.facebook.com");
	Thread.sleep(2000);
	ajay.findElement(By.id("abcd")).sendKeys("7397843598");
	Thread.sleep(2000);
	ajay.findElement(By.id("1234")).sendKeys("ajay1234");
	Thread.sleep(2000);
	ajay.findElement(By.name("login")).click();
	Thread.sleep(2000);
	
	ajay.close();
}
}
