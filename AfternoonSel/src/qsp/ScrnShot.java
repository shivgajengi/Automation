package qsp;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrnShot {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.com");
	
		//convert webdriver to takesscreenshot interface
		TakesScreenshot ts = (TakesScreenshot)driver;
		//takes the screenshot
		File source = ts.getScreenshotAs(OutputType.FILE);
		//create a destination folder to store screenshot
		File destination = new File("./images/amazon.png");
		//copy the screenshot from source to destination
		FileUtils.copyFile(source, destination);
		
		driver.close();
	}

}
