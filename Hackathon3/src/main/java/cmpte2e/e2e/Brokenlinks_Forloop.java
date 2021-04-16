package cmpte2e.e2e;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Brokenlinks_Forloop {
	WebDriver driver;
By no_links=By.tagName("a");

public Brokenlinks_Forloop(WebDriver driver) {
	this.driver=driver;
}

public List<WebElement> linksonwebpage(){
	return driver.findElements(no_links);
}
}
