package cmpte2e.e2e;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Dataprovider {
	WebDriver driver;
	public Login_Dataprovider(WebDriver driver) {
		this.driver=driver;
	}
	
	By name=By.xpath("//input[@id='usernameField']");
	By pass=By.xpath("//input[@id='passwordField']");
	By click_link=By.xpath("//button[normalize-space()='Login']");
	
	public WebElement getname(){
		return driver.findElement(name);
	}
	
	public WebElement getpass(){
		return driver.findElement(pass);
	}
	
	public WebElement getlogin(){
		return driver.findElement(click_link);
	}
}
