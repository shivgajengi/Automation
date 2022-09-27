package qsp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("http://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		driver.findElement(By.xpath("//div[.='Tasks']")).click();
		driver.findElement(By.xpath("//div[.='Add New']")).click();
		driver.findElement(By.xpath("//div[.='+ New Customer']")).click();
driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys("ab");
		driver.findElement(By.xpath("//div[@class='greyButton cancelBtn']")).click();
		Thread.sleep(3000);	
		//to handle this popup
		Alert a1 = driver.switchTo().alert();
		String alertMsg = a1.getText();
		System.out.println(alertMsg);
		a1.accept();//clicks on OK button
		//a1.dismiss();//clicks on cancel button	
		Thread.sleep(3000);
		driver.findElement(By.id("logoutLink")).click();
		Thread.sleep(3000);	driver.close();
		
		
		
	}

}
