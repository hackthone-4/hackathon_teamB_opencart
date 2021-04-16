package cmpte2e.e2e;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Mouseover_Keyboard {
	WebDriver driver;
	By jobs_link = By.xpath("//div[@class='mTxt'][normalize-space()='Jobs']");

	
	By clickjobsearch=By.xpath("//a[@href='https://www.naukri.com'][normalize-space()='Search Jobs']");
	By key = By.xpath("//input[@id='qsb-keyskill-sugg']");
	
	By click_checkbox=By.xpath("//label[@for='chk-Pune-cityTypeGid-']//i[@class='fleft naukicon naukicon-checkbox']");
	public Mouseover_Keyboard(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getlink() {
		return driver.findElement(jobs_link);
	}

	public WebElement getkey() {
		return driver.findElement(key);
	}

	public WebElement getjobsearch() {

		return driver.findElement(clickjobsearch);
	}
	public WebElement checkbox() {

		return driver.findElement(click_checkbox);
	}
}
