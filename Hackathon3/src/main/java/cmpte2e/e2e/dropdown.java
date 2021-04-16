package cmpte2e.e2e;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class dropdown {

	WebDriver driver;
	public dropdown(WebDriver driver) {
		this.driver=driver;
	}

	By list_of_computers=By.xpath("//select[@id='searchDropdownBox']");
	
	By selectitem=By.xpath("//select[@id='searchDropdownBox']");
	public List<WebElement> getlist(){
		return driver.findElements(list_of_computers);
	}
	
	public WebElement getietm(){
		return driver.findElement(selectitem);
	}
}
