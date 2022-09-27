package testng;

import org.testng.Assert;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class P6 {
	WebDriver driver;
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@BeforeMethod
	public void openApp() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}	
	@Test
	public void testActitime() throws InterruptedException {
		driver.get("http://www.google.com");
		String expectedTitle = "facebook";
		String actualTitle = driver.getTitle();
		/*
		 * if(expectedTitle.equals(actualTitle)) { System.out.println("Test is passed");
		 * } else { System.out.println("Test is failed"); Assert.fail(); }
		 */
		Assert.assertEquals(expectedTitle, actualTitle);
		//further stmts wont be executed
		Thread.sleep(3000);
		System.out.println("THE END");
		
	}	
	@AfterMethod
	public void closeApp() {
		driver.close();
	}

}
