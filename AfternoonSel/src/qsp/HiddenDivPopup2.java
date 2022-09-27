package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenDivPopup2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("57124765");
		Thread.sleep(2000);
		driver.findElement(By.id("dob")).click();//calendar popup gets displayed
		Thread.sleep(2000);
		WebElement monthLB = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select s1 = new Select(monthLB);
		s1.selectByVisibleText("Aug");
		Thread.sleep(2000);
		WebElement yearLB = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select s2 = new Select(yearLB);
		s2.selectByVisibleText("1947");
		Thread.sleep(2000);
		driver.findElement(By.linkText("15")).click();//popup gets handled
		Thread.sleep(2000);
		driver.findElement(By.id("alternative_number")).sendKeys("9087654321");
		Thread.sleep(2000);
		driver.findElement(By.id("renew_policy_submit")).click();
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
	}

}
