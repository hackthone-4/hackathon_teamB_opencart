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

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hackthone.hackthone5.Login;
import resources.base;


public class stepDefination extends base{
	private static Logger log=LogManager.getLogger(base.class.getName());
	
	@Before
	public void setUP(){
		System.out.println("launch chrome");
	}
 
	 @Given("^Initialize the browser with chrome$")
	    public void initialize_the_browser_with_chrome() throws Throwable {
	        driver=intializeDriver();
	        log.info("browser launch");
	    }

	    @Then("^click signin$")
	    public void click_signin() throws Throwable {
	    	Login l=new Login(driver);
	    	l.getuname().sendKeys("priyanka");
	    	l.getpass().sendKeys("213");
	    	l.getlogin().click();
	    }

	    @And("^Navigate to \"([^\"]*)\" Site$")
	    public void navigate_to_something_site(String strArg1) throws Throwable {
	      driver.get(strArg1);
	    	/*File src=new File("C:\\Users\\vighnharta\\Documents\\cucumber.xlsx");
			FileInputStream input=new FileInputStream(src);
			XSSFWorkbook wb=new XSSFWorkbook(input);
			XSSFSheet sheet=wb.getSheet("Sheet1");
			String url=	sheet.getRow(1).getCell(2).getStringCellValue();
	       driver.get(url);*/
	    }

	    
	    @Then("^capture page title$")
	    public void capture_page_title() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	       System.out.println(driver.getTitle());
	    }

	   /* @After
	    public void failuretestcase(){
	    	
	    	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    	try {
	    		FileHandler.copy(src, new File("C:\\Users\\vighnharta\\Desktop\\hackthone4\\reports\\screenshot.png"));
				
			} catch (Exception e) {
				e.printStackTrace();
			}
	    }*/
	    @After(order=1)
		public void tearDown(){
		   driver.close();
			System.out.println("close the browser");
		}
		
	   
}