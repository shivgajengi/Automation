package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox3 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/qspid/Desktop/2CSA/Hotel.html");
		WebElement oberoiLB = driver.findElement(By.id("oberoi"));
		Thread.sleep(2000);
		Select s1 = new Select(oberoiLB);
		s1.selectByIndex(2);//santra
		Thread.sleep(2000);
		s1.selectByIndex(3);//old monk
		Thread.sleep(2000);
		s1.deselectByIndex(3);//UnsupportedOperationException
		Thread.sleep(2000);
		System.out.println(s1.isMultiple());
		driver.close();

	}

}
