package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// open the browser and go to google
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		//type java in search text box
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(1000);
		//print the count of all the suggestions
		List<WebElement> allAutoSuggs = driver
				.findElements(By.xpath("//span[contains(.,'ava')]"));
		System.out.println("Total suggestions: "+allAutoSuggs.size());
		System.out.println("=========================");	
		//print all the suggestions
		for(int i=0;i<allAutoSuggs.size();i++) {
			System.out.println(allAutoSuggs.get(i).getText());
		}	
		//click on the 4th suggestion
		allAutoSuggs.get(3).click();
		Thread.sleep(3000);
		//close the browser
		driver.close();
		
		
		
		
		
		

	}

}
