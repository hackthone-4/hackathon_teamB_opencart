package cmpte2e.e2e;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class alerthandling {
		WebDriver driver;
		By CustomerID=By.xpath("//input[@name='cusid']");
		By submit=By.name("submit");
		
		public alerthandling(WebDriver driver) {
			this.driver=driver;
		}

		public WebElement getcustomerid(){
			return driver.findElement(CustomerID);
		}
		public WebElement clicksubmit(){
			return driver.findElement(submit);
		}
}
