package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/qspid/Desktop/2CSA/Hotel.html");
		Thread.sleep(1000);
		WebElement tajLB = driver.findElement(By.id("taj"));
		Select s1 = new Select(tajLB);
		s1.selectByIndex(1);//samosa
		Thread.sleep(1000);
		s1.selectByValue("ch");// chinese bhel
		Thread.sleep(1000);
		s1.selectByVisibleText("VEG BIRYANI");// veg biryani	
		List<WebElement> allOptions = s1.getOptions();
		System.out.println("All options inside the list box:");
		for(int i=0;i<allOptions.size();i++) {
			System.out.println(allOptions.get(i).getText());
		}
		System.out.println("==========================================");
		List<WebElement> selectedOptions = s1.getAllSelectedOptions();
		System.out.println("Selected Options:");
		for(int i=0;i<selectedOptions.size();i++) {
			System.out.println(selectedOptions.get(i).getText());
		}
		System.out.println("==========================================");
		WebElement firstOption = s1.getFirstSelectedOption();
		System.out.println("First Option: "+firstOption.getText());
		System.out.println("==========================================");
		System.out.println(s1.isMultiple());//true
		System.out.println("==========================================");
	 	WebElement allOpts = s1.getWrappedElement();
	 	System.out.println("All the options using wrapped element:");
	 	System.out.println(allOpts.getText()); 	
		driver.close();
		
		
		
		
		
		
		
		
		
		
	}
}
