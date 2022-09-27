package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleEle {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

//	public static void main(String[] args) {
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://www.google.com");
//		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
//		System.out.println("Total links: " + allLinks.size());
//		System.out.println("=============================");
//
//		for (int i = 0; i < allLinks.size(); i++) {
//			System.out.println(allLinks.get(i).getText());
//		}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		java.util.List<WebElement> allLink =  driver.findElements(By.xpath("//a"));
		System.out.println("fk TotalLinks = " + allLink.size() );
		
		for(int i =0; i< allLink.size();i++)
		{
			System.out.println("ourlinks"+ allLink.get(i).getText());
		}
		driver.close();
		

		driver.close();

	}

}
