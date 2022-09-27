package qsp;

import org.checkerframework.checker.calledmethods.qual.EnsuresCalledMethodsIf.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class prac2 {
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		java.util.List<WebElement> allLink =  driver.findElements(By.xpath("//a"));
		System.out.println("TotalLinks = " + allLink.size() );
		
		for(int i =0; i< allLink.size();i++)
		{
			System.out.println(allLink.get(i).getText());
		}
		driver.close();
		
	}

}
