package stepDefinations;

import java.io.File;
import java.io.FileInputStream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import h_5.h_5.Login;
import resources.base;

public class stepDefination extends base {
	private static Logger log = LogManager.getLogger(base.class.getName());

	@Before
	public void setUP() {
		System.out.println("launch chrome");
	}

	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
		driver = intializeDriver();
		log.info("browser launch");
	}

	@Then("^click signin$")
	public void click_signin() throws Throwable {
		Login l = new Login(driver);
		Actions act = new Actions(driver);
		act.moveToElement(l.getaccount()).build().perform();
		l.getaccount().click();
		// 1.Test case-->Register user

		l.getregister().click();
		File src = new File("C:\\Users\\vighnharta\\Documents\\h5.xlsx");
		FileInputStream input = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(input);
		XSSFSheet sheet = wb.getSheet("Sheet1");

		String fname = sheet.getRow(1).getCell(0).getStringCellValue();
		l.getfname().sendKeys(fname);

		String lname = sheet.getRow(1).getCell(1).getStringCellValue();
		l.getlname().sendKeys(lname);
		String email = sheet.getRow(1).getCell(2).getStringCellValue();
		l.getemil().sendKeys(email);
		// int tele=(int)sheet.getRow(1).getCell(3).getNumericCellValue();
		// l.getnumber().sendKeys(tele);
		l.getnumber().sendKeys("1236547890");
		String pass = sheet.getRow(1).getCell(4).getStringCellValue();
		l.getpass().sendKeys(pass);
		String confirmpass = sheet.getRow(1).getCell(5).getStringCellValue();
		l.getconfpass().sendKeys(confirmpass);

		l.getradio().click();
		l.getchk().click();
		l.getcontionue().click();
		l.getcontbtn().click();

	}

	@And("^Navigate to \"([^\"]*)\" Site$")
	public void navigate_to_something_site(String strArg1) throws Throwable {

		File src = new File("C:\\Users\\vighnharta\\Documents\\h5.xlsx");
		FileInputStream input = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(input);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		String url = sheet.getRow(1).getCell(6).getStringCellValue();
		driver.get(url);
		wb.close();
	}

	/*@Then("^capture error msg$")
	public void capture_error_msg() throws Throwable {
	    
	}*/
}