package cmpte2e.e2e;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObject.Login;
import resources.base;

public class stepdefinationssdemo extends base {
	 @Given("^Initialize the browser with chrome$")
	    public void initialize_the_browser_with_chrome() throws Throwable {
	        driver=intializeDriver();
	        
	    }

	    @Then("^click signin$")
	    public void click_signin() throws Throwable {
	    	File src=new File("C:\\Users\\vighnharta\\Documents\\cucumber.xlsx");
			FileInputStream input=new FileInputStream(src);
			XSSFWorkbook wb=new XSSFWorkbook(input);
			XSSFSheet sheet=wb.getSheet("Sheet1");
			
	     }

	    @And("^Navigate to \"([^\"]*)\" Site$")
	    public void navigate_to_something_site(String strArg1) throws Throwable {
	    	File src=new File("C:\\Users\\vighnharta\\Documents\\cucumber.xlsx");
			FileInputStream input=new FileInputStream(src);
			XSSFWorkbook wb=new XSSFWorkbook(input);
			XSSFSheet sheet=wb.getSheet("Sheet1");
			String url=	sheet.getRow(0).getCell(3).getStringCellValue();
	       driver.get(url);
	    }

}