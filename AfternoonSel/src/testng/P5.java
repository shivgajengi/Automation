package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class P5 {
	WebDriver driver;
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@BeforeClass
	public void t1() {
		System.out.println("this class tests fb and google");
	}
	
	@AfterClass
	public void t2() {
		System.out.println("fb and google tests are completed");
	}
	
	@Test(priority = 1)
	public void testGoogle() {
		driver.get("http://www.google.com");
		System.out.println("Title: "+driver.getTitle());
		System.out.println("URL: "+driver.getCurrentUrl());
	}
	
	@Test(priority = 2)
	public void testFb() {
		driver.get("http://www.fb.com");
		System.out.println("Title: "+driver.getTitle());
		System.out.println("URL: "+driver.getCurrentUrl());
	}
	
	@BeforeMethod
	public void openApp() {
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	@AfterMethod
	public void closeApp() {
		driver.close();
	}

}
