package cmpte2e.e2e;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class buttonenaledordisabled {
	WebDriver driver;
	By button=By.xpath("//span[@class='slider round']");
	
	public buttonenaledordisabled(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement getbutton(){
		return driver.findElement(button);
		
	}
	
}
