package cmpte2e.e2e;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class windowhandling {
	WebDriver driver;
	By click_link = By.xpath("//div[normalize-space()='Jobs']");
	By text=By.xpath("//h2[normalize-space()='Browse Jobs by Locations']");
	public windowhandling(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getjobslinks() {
		return driver.findElement(click_link);
	}
	public WebElement gettext() {
		return driver.findElement(text);
	}
}
