package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selprc {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
	driver.findElement(By.id("policynumber")).sendKeys("1234566");
	driver.findElement(By.id("dob")).click();
	WebElement monthLB = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
	Select s1 = new Select(monthLB);
	s1.selectByVisibleText("Aug");
	Thread.sleep(2000);
	
	WebElement YearLB= driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
	Select s2= new Select(YearLB);
	s2.selectByVisibleText("1997");
	Thread.sleep(2000);
	
	//driver.findElement(By.linkText("15")).click();
	driver.findElement(By.xpath("//a[.='15']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("alternative_number")).sendKeys("23467");
	Thread.sleep(2000);
	driver.findElement(By.id("renew_policy_submit")).click();
	//driver.findElement(By.xpath("//button[@class='submit-login']")).click();
	Thread.sleep(2000);
	driver.close();
	
	
	}

}
