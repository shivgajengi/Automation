package testng;

import org.testng.Assert;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class P7 {
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

		SoftAssert s1 = new SoftAssert();
		s1.assertEquals(expectedTitle, actualTitle);

		Thread.sleep(3000);
		System.out.println("THE END");

		s1.assertAll();
	}

	@AfterMethod
	public void closeApp() {
		driver.close();
	}

}
