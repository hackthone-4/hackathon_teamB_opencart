package cmpte2e.e2e;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendarhandling {
WebDriver driver;


By selectdate=By.xpath("//*[@id='travel_date']");
By datepicker=By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']");
By date=By.xpath("//div[@class='datepicker-days']//th[@class='next']");
By dates=By.className("day");

public calendarhandling(WebDriver driver) {
	this.driver=driver;
}

public WebElement getselectdate(){
	return driver.findElement(selectdate);
}

public WebElement getdatepicker(){
	return driver.findElement(datepicker);
}

public WebElement getdate(){
	return driver.findElement(date);
}
public List<WebElement> getdates(){
	return driver.findElements(dates);
}



}
