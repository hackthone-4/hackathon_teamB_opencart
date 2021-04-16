package cmpte2e.e2e;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class fileupload {
WebDriver driver;
	
	By upload=By.xpath("//input[@id='attachCV']");
	
	public fileupload(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement uploadfile(){
		return driver.findElement(upload);
		}
	
	
}
