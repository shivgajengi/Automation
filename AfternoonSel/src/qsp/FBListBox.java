package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBListBox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.fb.com");
		driver.findElement(By.xpath("//a[.='Create New Account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("DINGA");
		driver.findElement(By.name("lastname")).sendKeys("PANDEY");
		String mobileTFXpath = "//input[@aria-label='Mobile number or email address']";
		driver.findElement(By.xpath(mobileTFXpath)).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("1234abcd");
		WebElement dayLB = driver.findElement(By.id("day"));
		Select s1 = new Select(dayLB);
		s1.selectByValue("15");
		WebElement monthLB = driver.findElement(By.id("month"));
		Select s2 = new Select(monthLB);
		s2.selectByVisibleText("Aug");
		WebElement yearLB = driver.findElement(By.id("year"));
		Select s3 = new Select(yearLB);
		s3.selectByVisibleText("1947");
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.name("websubmit")).click();
		driver.close();
		
		
		
		
	}

}
