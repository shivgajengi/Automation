package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/qspid/Desktop/2CSA/H.html");
		Thread.sleep(3000);
		
		String path = "./cv/Ganesh.docx";
		File f = new File(path);
		String absolutePath = f.getAbsolutePath();
		System.out.println(absolutePath);
		driver.findElement(By.id("f1")).sendKeys(absolutePath);
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
