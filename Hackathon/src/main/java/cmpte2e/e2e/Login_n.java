package cmpte2e.e2e;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_n {
	
	public WebDriver driver;
	//click login
	By login=By.xpath("//button[normalize-space()='Login']");
	
	By name=By.xpath("//input[@id='usernameField']");
	By pass=By.xpath("//input[@id='passwordField']");
	By click_link=By.xpath("//button[normalize-space()='Login']");
	
	public Login_n(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement getl(){
		return driver.findElement(login);
	}
	
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
