package hackthone.hackthone5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	
	public WebDriver driver;
	
	public Login(WebDriver driver) {
		this.driver=driver;
	}
	
	By uname=By.xpath("//input[@id='email']");
	By pass=By.xpath("//input[@id='pass']");
	By login=By.xpath("//button[normalize-space()='Log In']");
	
	public WebElement getuname(){
	return driver.findElement(uname);
	}
	
	public WebElement getpass(){
		return driver.findElement(pass);
		}
	
	public WebElement getlogin(){
		return driver.findElement(login);
		}
	
	
	
	

	
	
}
