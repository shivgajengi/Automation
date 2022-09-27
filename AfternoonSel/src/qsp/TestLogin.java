package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.actitime.com/login.do");
		
		LoginPage l1 = new LoginPage(driver);
		l1.setUsername("abcd");
		l1.setPassword("1234");
		l1.clickLogin();
		Thread.sleep(3000);
		l1.setUsername("dinga");
		l1.setPassword("000000");
		l1.clickLogin();
		Thread.sleep(3000);
		driver.close();

	}

}
