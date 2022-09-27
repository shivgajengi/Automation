package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.cleartrip.com");
		Thread.sleep(3000);
	driver.findElement(By.cssSelector(" svg[class=' c-pointer c-neutral-900']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("ban");
		Thread.sleep(2000);
List<WebElement> allSuggs = driver.findElements(By.xpath("//p[contains(.,'Ban') and not(contains(.,'Bank'))]"));
		System.out.println("Total suggestions: "+allSuggs.size());
		System.out.println("=====================================");
		for(int i=0;i<allSuggs.size();i++) {
			System.out.println(allSuggs.get(i).getText());
		}
		
		allSuggs.get(0).click();
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
		
		

	}

}
