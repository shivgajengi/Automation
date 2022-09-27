package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(id="username")
	private WebElement untb;
	@FindBy(name="pwd")
	private WebElement pwtb;
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginBtn;
	LoginPage(WebDriver driver){
	//untb = driver.findElement(By.id("username"));
	//pwtb = driver.findElement(By.name("pwd"));
	//loginBtn = driver.findElement(By.xpath("//div[.='Login ']"));
	PageFactory.initElements(driver, this);//POM
	}
	public void setUsername(String un) throws InterruptedException {
		untb.sendKeys(un);
		Thread.sleep(2000);
	}
	public void setPassword(String pw) throws InterruptedException {
		pwtb.sendKeys(pw);
		Thread.sleep(2000);
	}
	public void clickLogin() throws InterruptedException {
		loginBtn.click();
		Thread.sleep(2000);
	}
}
