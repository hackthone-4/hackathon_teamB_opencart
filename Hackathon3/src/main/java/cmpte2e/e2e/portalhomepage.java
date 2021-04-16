package cmpte2e.e2e;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class portalhomepage {
WebDriver driver;
	By searchbox=By.xpath("//input[@placeholder='Skills, Designations, Companies']");
	
	public WebElement getsearch(){
		return driver.findElement(searchbox);
	}
	public portalhomepage(WebDriver driver) {
		this.driver=driver;
	}

}
