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
import hackthone.hackthone5.Login;

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
		//act.moveToElement(l.getaccount()).build().perform();
		//l.getaccount().click();
		// 1.Test case
		
		 /* l.getregister().click(); File src=new
		 File("C:\\Users\\vighnharta\\Documents\\h5.xlsx"); FileInputStream
		  input=new FileInputStream(src); XSSFWorkbook wb=new
		  XSSFWorkbook(input); XSSFSheet sheet=wb.getSheet("Sheet1");
		  
		  String fname= sheet.getRow(1).getCell(0).getStringCellValue();
		  l.getfname().sendKeys(fname);
		  
		  String lname= sheet.getRow(1).getCell(1).getStringCellValue();
		  l.getlname().sendKeys(lname); String email=
		  sheet.getRow(1).getCell(2).getStringCellValue();
		  l.getemil().sendKeys(email); 
		  //int tele=(int)sheet.getRow(1).getCell(3).getNumericCellValue();
		 // l.getnumber().sendKeys(tele); 
		  l.getnumber().sendKeys("1236547890");
		  String pass=sheet.getRow(1).getCell(4).getStringCellValue();
		  l.getpass().sendKeys(pass); String confirmpass=
		  sheet.getRow(1).getCell(5).getStringCellValue();
		  l.getconfpass().sendKeys(confirmpass);
		  
		  l.getradio().click(); l.getchk().click(); l.getcontionue().click();
		  l.getcontbtn().click();*/
		//2.test case
		/* l.getregister().click(); File src=new
				 File("C:\\Users\\vighnharta\\Documents\\h5.xlsx"); FileInputStream
				  input=new FileInputStream(src); XSSFWorkbook wb=new
				  XSSFWorkbook(input); XSSFSheet sheet=wb.getSheet("Sheet1");
				  
				  String fname= sheet.getRow(1).getCell(0).getStringCellValue();
				  l.getfname().sendKeys(fname);
				  
				  String lname= sheet.getRow(1).getCell(1).getStringCellValue();
				  l.getlname().sendKeys(lname); String email=
				  sheet.getRow(1).getCell(2).getStringCellValue();
				  l.getemil().sendKeys(email); 
				  //int tele=(int)sheet.getRow(1).getCell(3).getNumericCellValue();
				 // l.getnumber().sendKeys(tele); 
				  l.getnumber().sendKeys("");
				  String pass=sheet.getRow(1).getCell(4).getStringCellValue();
				  l.getpass().sendKeys(pass); String confirmpass=
				  sheet.getRow(1).getCell(5).getStringCellValue();
				  l.getconfpass().sendKeys(confirmpass);
				  
				  l.getradio().click(); l.getchk().click(); l.getcontionue().click();
				  l.getcontbtn().click();*/
				
		//3.get title
		String title = driver.getTitle();
		System.out.println(title);
		log.info("Title of we page" + title);
		
		//4.login
		/*l.getaccount().click();
		l.getlogin().click();
		File src = new File("C:\\Users\\vighnharta\\Documents\\h5.xlsx");
		FileInputStream input = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(input);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		String email = sheet.getRow(1).getCell(2).getStringCellValue();
		l.getemil().sendKeys(email);
		String pass = sheet.getRow(1).getCell(4).getStringCellValue();
		l.getpass().sendKeys(pass);
		l.getloginbtn().click();
		
		//5.test case
		act.moveToElement(l.getdekstops()).build().perform();
		l.getdekstops().click();
		l.getmac1().click();
		l.getimac().click();
		l.getaddtocart().click();
		
		String msg=l.getsuccessmsg().getText();
		log.info(msg);
		File src1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); try
		  { FileHandler.copy(src1, new File(
		 "C:\\Users\\vighnharta\\Desktop\\mockhackthone5\\reports\\snap.png"));
		  
		  } catch (Exception e) { e.printStackTrace(); 
		  } 
		*/
		//6.testcase
		l.getlaptops().click();
		l.getmore().click();
		l.gethp().click();
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	     js.executeScript("window.scrollBy(0,1000)");
	     
	     l.getdate().sendKeys("2021-05-05");
	     l.getaddtocart2().click();
	     l.getbasket().click();
	     
	     JavascriptExecutor js1 = (JavascriptExecutor) driver;
	     js1.executeScript("window.scrollBy(0,1000)");
	     l.getcheckout2().click();
	     Thread.sleep(3000);
	     l.getradio3().click();
	     l.getcontinue3().click();
	     
	     l.getfname2().sendKeys("priyanka");
	     l.getlname2().sendKeys("sonawane");
	     l.getemail2().sendKeys("priyanka@gmail.com");
	     l.gettelephone2().sendKeys("1236447950");
	     l.getaddress().sendKeys("shirpur");
	     l.getcity().sendKeys("dhule");
	     l.getpostal().sendKeys("425405");
	     Select select=new Select(l.getcountry());
	     select.selectByVisibleText("India");
	     
	     Select select2=new Select(l.getstate());
	     select2.selectByVisibleText("Maharashtra");
	     l.getcont4().click();
	     
	     l.getdelevery().sendKeys("hello");
	     l.getcont5().click();
	     
	     Thread.sleep(3000);
	     l.getterms().click();
	     l.getcont6().click();
	     Thread.sleep(3000);
	     l.getconfrimorder().click();
	     
	     File src2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); try
		  { FileHandler.copy(src2, new File(
		 "C:\\Users\\vighnharta\\Desktop\\mockhackthone5\\reports\\snap2.png"));
		  
		  } catch (Exception e) { e.printStackTrace(); 
		  } 
	     
	     
	}

	@And("^Navigate to \"([^\"]*)\" Site$")
	public void navigate_to_something_site(String strArg1) throws Throwable {

		File src = new File("C:\\Users\\vighnharta\\Documents\\h5.xlsx");
		FileInputStream input = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(input);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		String url = sheet.getRow(1).getCell(6).getStringCellValue();
		driver.get(url);
	}

	 @Then("^order with resiter user$")
	    public void order_with_resiter_user() throws Throwable {
		 Login l=new Login(driver);
		 l.getlaptops().click();
			l.getmore().click();
			l.gethp().click();
			
			 JavascriptExecutor js = (JavascriptExecutor) driver;
		     js.executeScript("window.scrollBy(0,1000)");
		     
		     l.getdate().sendKeys("2021-05-05");
		     l.getaddtocart2().click();
		     l.getbasket().click();
		     
		     JavascriptExecutor js1 = (JavascriptExecutor) driver;
		     js1.executeScript("window.scrollBy(0,1000)");
		     l.getcheckout2().click();
		     Thread.sleep(3000);
		     l.getradio5().click();
		     l.getcontinue3().click();
		     
		     l.getfname2().sendKeys("priyanka");
		     l.getlname2().sendKeys("sonawane");
		     l.getemail2().sendKeys("priyanka@gmail.com");
		     l.gettelephone2().sendKeys("1236447950");
		     l.getpass2().sendKeys("123654");
		     l.getpass3().sendKeys("123654");
		     l.getaddress().sendKeys("shirpur");
		     l.getcity().sendKeys("dhule");
		     l.getpostal().sendKeys("425405");
		     Select select=new Select(l.getcountry());
		     select.selectByVisibleText("India");
		     
		     Select select2=new Select(l.getstate());
		     select2.selectByVisibleText("Maharashtra");
		     Thread.sleep(3000);
		    driver.findElement(By.xpath("//*[@id='collapse-payment-address']/div/div[4]/div/input[1]")).click();
		    Thread.sleep(3000);
		     driver.findElement(By.xpath("//*[@id='button-register']")).click();
		     
		     Thread.sleep(3000);
		     driver.findElement(By.xpath("//*[@id='button-shipping-address']")).click();;
		     l.getdelevery().sendKeys("hello");
		     l.getcont5().click();
		     
		     Thread.sleep(3000);
		     l.getterms().click();
		     l.getcont6().click();
		     Thread.sleep(3000);
		     l.getconfrimorder().click();
		     
		   
	    }

	 
	 @Then("^upload file$")
	    public void upload_file() throws Throwable {
		 Login l=new Login(driver);
		 l.getcomponent().click();
		 l.getmonitors().click();
		 l.getapple().click();
		 Thread.sleep(3000);
		 l.getcheckbox4().click();
		 l.gettext().sendKeys("testing");
		  
		 Select select=new Select(l.getselect());
		select.selectByVisibleText("Yellow (+$2.00)");
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
	     js1.executeScript("window.scrollBy(0,500)");
		l.getarea().sendKeys("testing");
		l.getfileupload().sendKeys("C:\\Users\\vighnharta\\Documents\\h5.xlsx");
		Thread.sleep(3000);
		l.getaddtocat().click();
		
		 
		 
	    }
	 
	 @Then("^update account$")
	    public void update_account() throws Throwable {
		 Login l=new Login(driver);
		 Actions act=new Actions(driver);
		 act.moveToElement(l.getaccount()).build().perform();
	     l.getlogin().click();
			File src = new File("C:\\Users\\vighnharta\\Documents\\h5.xlsx");
			FileInputStream input = new FileInputStream(src);
			XSSFWorkbook wb = new XSSFWorkbook(input);
			XSSFSheet sheet = wb.getSheet("Sheet1");
			String email = sheet.getRow(1).getCell(2).getStringCellValue();
			l.getemil().sendKeys(email);
			String pass = sheet.getRow(1).getCell(4).getStringCellValue();
			l.getpass().sendKeys(pass);
			l.getloginbtn().click();
			
		Thread.sleep(3000);
		l.geteditaccount().click();

	     Thread.sleep(3000);
	     l.getcont7().click();
	     
	     JavascriptExecutor js2 = (JavascriptExecutor) driver;
	     js2.executeScript("window.scrollBy(0,1000)");
	     
	     l.getlog2().click();
	     
	     driver.navigate().back();
	    }


	

	 
	 	/*
	 * @After(order=1) public void tearDown(){ driver.close();
	 * System.out.println("close the browser"); }
	 */

}