package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	
	public WebDriver driver;
	//click login
	By popup=By.xpath("//a[@class='ltkpopup-close']");
	By login=By.xpath("//*[@id='header-wrapper']/header/div[2]/div[4]/ul/li[2]/div");
	By sign_in=By.xpath("//*[@id='header-wrapper']/header/div[2]/div[4]/ul/li[2]/div/div/div/a");
	By create_acct=By.xpath("//*[@id='createAccountBtn']/span");
	By firstname=By.xpath("//input[@id='dwfrm_profile_customer_firstname']");
	By lastname=By.xpath("//input[@id='dwfrm_profile_customer_lastname']");
	By gmail=By.xpath("//input[@id='dwfrm_profile_customer_email']");
	By confirmed_gmail=By.xpath("//input[@id='dwfrm_profile_customer_emailconfirm']");
	By pass=By.xpath("//input[@id='dwfrm_profile_login_password']");
	By confirmed_pass=By.xpath("//input[@id='dwfrm_profile_login_passwordconfirm']");
	//By privacy_link=By.xpath("//a[@id='privacyPolicy']");
	By create_acc_btn=By.xpath("//button[@name='dwfrm_profile_confirm']");
	
	//login
	By name=By.xpath("//*[@id='dwfrm_login_username']");
	By enterpass=By.xpath("//*[@id='dwfrm_login_password']");
	By loginbtn=By.xpath("//*[@id='dwfrm_login']/fieldset/div[3]/div[2]/button");
	
	//navigate to luminac app
	By lightlingapp=By.xpath("/html/body/div[4]/div[2]/header/div[3]/div[2]/ul/li[1]/a");
	By celinglight=By.xpath("//*[@id='nav-tab-01']/ul/li/div[1]/span/a");
	
	//select item
	By selectitem=By.xpath("//*[@id='nav-tab-01']/ul/li/div[1]/a[1]");
	
	// //click large Chandeliers
	By Chandeliers=By.xpath("//span[normalize-space()='Large Chandeliers']");
	
	//Click checkbox
	By checkbox=By.xpath("//a[@title='Click to Refine By Transitional']//input[@type='checkbox']");
	
	//add to cart
	By cart=By.xpath("//*[@id='4da38b65fe7220993b0c959bfe']/div[1]/div[4]/a");
	By number=By.xpath("//*[@id='Quantity']");
	By click_cart=By.xpath("//*[@id='add-to-cart']");
	
	//view cart
	By viewcart=By.xpath("//*[@id='mcBookMark']");
	
	//search item 
	By search=By.xpath("//*[@id='searchinput']");
	
	//Live chat
	By livechat=By.xpath("//div[@id='LPMlabel-1617706804012-5']");
	
	//remove item from cart
	By remove=By.xpath("//*[@id='dwfrm_cart']/fieldset/table/tbody/tr[1]/td[2]/table/tbody/tr[1]/td[3]/div/span[1]");
	
	//apply coupon
	By entercoupon=By.xpath("//*[@id='dwfrm_cart']/fieldset/table/tfoot/tr[2]/td/div[1]/input");
	By cliclapply=By.xpath("//*[@id='dwfrm_cart']/fieldset/table/tfoot/tr[2]/td/div[1]/button");
	
	//Enter zip code
	By zip=By.xpath("//*[@id='rightcol-summary']/div/table/tbody/tr[4]/td/div/input[1]");
	By clickgo=By.xpath("//*[@id='rightcol-summary']/div/table/tbody/tr[4]/td/div/input[2]");
	
	//add item
	By additem=By.xpath("/html[1]/body[1]/div[3]/div[5]/div[2]/div[2]/form[1]/fieldset[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/span[2]");
	
	//Navigate back to home page
	
	public Login(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getl(){
		return driver.findElement(login);
	}
	public WebElement sign_in(){
		return driver.findElement(sign_in);
	}
	public WebElement create_acct(){
		return driver.findElement(create_acct);
	}
	public WebElement firstname(){
		return driver.findElement(firstname);
	}
	public WebElement lastname(){
		return driver.findElement(lastname);
	}
	
	public WebElement getlightlingapp(){
		return driver.findElement(lightlingapp);
	}
	
	public WebElement getcelinglight(){
		return driver.findElement(celinglight);
	}
	
	
	public WebElement gmail(){
		return driver.findElement(gmail);
	}
	public WebElement confirmed_gmail(){
		return driver.findElement(confirmed_gmail);
	}
	public WebElement pass(){
		return driver.findElement(pass);
	}
	public WebElement confirmed_pass(){
		return driver.findElement(confirmed_pass);
	}
	/*public WebElement privacy_link(){
		return driver.findElement(privacy_link);
	}*/
	public WebElement create_acc_btn(){
		return driver.findElement(create_acc_btn);
	}
	
	public WebElement entername(){
		return driver.findElement(name);
	}
	
	public WebElement getpass(){
		return driver.findElement(enterpass);
	}
	
	public WebElement clicklogin(){
		return driver.findElement(loginbtn);
	}
	
	public WebElement getPopUp()
	{
		return driver.findElement(popup);
	}
	
	public WebElement getitem(){
		return driver.findElement(selectitem);
	}
	public WebElement getChandeliers(){
		return driver.findElement(Chandeliers);
	}
	public WebElement getcheckox(){
		return driver.findElement(checkbox);
	}
	public WebElement getcart(){
		return driver.findElement(cart);
	}
	public WebElement getnumber(){
		return driver.findElement(number);
	}
	public WebElement getclickcart(){
		return driver.findElement(click_cart);
	}
	public WebElement getviewcart(){
		return driver.findElement(viewcart);
	}
	public WebElement getsearch(){
		return driver.findElement(search);
	}
	public WebElement getremoveitem(){
		return driver.findElement(remove);
	}
	public WebElement getlivechat(){
		return driver.findElement(livechat);
	}
	public WebElement getentercoupon(){
		return driver.findElement(entercoupon);
	}
	public WebElement getclickapply(){
		return driver.findElement(cliclapply);
	}
	public WebElement getadditem(){
		return driver.findElement(additem);
	}
	public WebElement getzip(){
		return driver.findElement(zip);
	}
	public WebElement getzipclick(){
		return driver.findElement(clickgo);
	}
	
	
}
