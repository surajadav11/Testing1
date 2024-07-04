package com.nimap_infotech_stepdef;

import java.util.List;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login 
{
	
	
	WebDriver driver;
	@Before
	public void launchBrowser(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Selenium\\126\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
	}

	@Given("^Test Field Force Url is accessed$")
	public void test_Field_Force_Url_is_accessed() throws Throwable {
		driver.get("https://testffc.nimapinfotech.com/dashboard");
		driver.manage().window().maximize();
		Thread.sleep(2000);

	}

	@When("^Enter Login valid data$")
	public void enter_Login_valid_data() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("surajadav7874@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("suraj2110@#");
		Thread.sleep(3000);

	}

	@When("^click on sign in button$")
	public void click_on_sign_in_button() throws Throwable {
		String str=JOptionPane.showInputDialog("Enter your captch");
		System.out.println(str);
		driver.findElement(By.xpath("//*[@id=\"kt_login\"]"
				+ "/div/div[2]/kt-login/div[2]/div/form/div[3]"
				+ "/kt-captcha/div/div/form/input")).sendKeys(str);
		//click sign in
		driver.findElement(By.id("kt_login_signin_submit")).click();
		Thread.sleep(3000);

	}

	@Then("^User should be login$")
	public void user_should_be_login() throws Throwable {
		 boolean res=driver.getPageSource().contains("Dashboard");
			if(res){
				System.out.println("user Login is successfully");
				
			}
			else
			{
				System.out.println("login valid Username and Password Enter !!");
			}
	}

	@When("^click on punch in option$")
	public void click_on_punch_in_option() throws Throwable {

	}

	@When("^user login with valid data$")
	public void user_login_with_valid_data() throws Throwable {
		driver.get("https://testffc.nimapinfotech.com/dashboard");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("surajadav7874@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("suraj2110@#");
		Thread.sleep(3000);
		String str=JOptionPane.showInputDialog("Enter your captch");
		System.out.println(str);
		driver.findElement(By.xpath("//*[@id=\"kt_login\"]"
				+ "/div/div[2]/kt-login/div[2]/div/form/div[3]/kt-captcha/div/div/form/input")).sendKeys(str);
		//click sign in
		driver.findElement(By.id("kt_login_signin_submit")).click();
		Thread.sleep(3000);
		
		
	}

	@When("^navigate to My Coustomer page$")
	public void navigate_to_My_Coustomer_page() throws Throwable {
		driver.navigate().to("https://testffc.nimapinfotech.com/customers");
		Thread.sleep(2000);

	}

	@When("^Fill all dateials of New Coustomer$")
	public void fill_all_dateials_of_New_Coustomer() throws Throwable {
		driver.findElement(By.xpath("//*[@id='kt_content']/div/ng-component/kt-customers-list/mat-drawer-container"
				+ "/mat-drawer-content/kt-portlet/div/kt-portlet-header/div[4]/button[1]/span")).click();
		Thread.sleep(2000);
		//customer name
		driver.findElement(By.xpath("//*[@id='mat-input-12']")).sendKeys("Sada");
		driver.findElement(By.xpath("//*[@id='mat-input-12']")).sendKeys(Keys.TAB);
		//Ref no
		driver.findElement(By.id("mat-input-13")).sendKeys("399752");
		driver.findElement(By.id("mat-input-13")).sendKeys(Keys.TAB);
		//contact person name
		driver.findElement(By.id("mat-input-14")).sendKeys("Mallik");
		driver.findElement(By.id("mat-input-14")).sendKeys(Keys.TAB);
		//mobile no
		driver.findElement(By.id("mat-input-15")).sendKeys("7589374834");
		driver.findElement(By.id("mat-input-15")).sendKeys(Keys.TAB);
		//telephone no
		driver.findElement(By.id("mat-input-16")).sendKeys("02327-8323223");
		driver.findElement(By.id("mat-input-16")).sendKeys(Keys.TAB);
		//email
		driver.findElement(By.id("mat-input-17")).sendKeys("shiv1@gmail.com");
		driver.findElement(By.id("mat-input-17")).sendKeys(Keys.TAB);
		// Contact person designation
		driver.findElement(By.id("mat-input-18")).sendKeys("Gadhinglaj");
		
		Thread.sleep(2000);
		//country
		driver.findElement(By.xpath("//*[@id=\"mat-select-14\"]/div/div[1]/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"mat-option-373\"]/span")).click();
		Thread.sleep(2000);
		
		//state
		driver.findElement(By.xpath("//*[@id=\"mat-select-15\"]/div/div[1]/span")).click();
		Thread.sleep(2000);
		
		List<WebElement>allstate=driver.findElements(By.xpath("//div[@class='cdk-overlay-pane']"
				+ "//div[@class='ng-star-inserted']//span"));
		
		dropdownSelect(allstate,"Maharashtra");
		
		Thread.sleep(2000);
		//city
		driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/kt-customers-edit-dialog/div[1]/form/div/div[6]/div[4]")).click();
		List<WebElement>citys=driver.findElements(By.xpath("//div[@class='ng-star-inserted']//span"));
		dropdownSelect(citys,"Kolhapur");

		}

	@When("^click on save button$")
	public void click_on_save_button() throws Throwable {
		driver.findElement(By.xpath("//*[@id='mat-dialog-0']"
				+ "/kt-customers-edit-dialog/div[2]/div/div/div/button[2]/span")).click();
	
	}

	@Then("^new coustomer should be added$")
	public void new_coustomer_should_be_added() throws Throwable {
boolean res= driver.getPageSource().contains("Sada");
if(res){
	System.out.println("New Coustomer is added");
}
else{
	System.out.println("No any-one Coustomer add!!");
}
	}

	@When("^Enter data of login$")
	public void enter_data_of_login() throws Throwable {
		driver.get("https://testffc.nimapinfotech.com/dashboard");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("shivchougule1201@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("shiv1234");
		Thread.sleep(3000);
		String str=JOptionPane.showInputDialog("Enter your captch");
		System.out.println(str);
		driver.findElement(By.xpath("//*[@id=\"kt_login\"]"
				+ "/div/div[2]/kt-login/div[2]/div/form/div[3]/kt-captcha/div/div/form/input")).sendKeys(str);

	}

	@When("^click Sign in with OTP button$")
	public void click_Sign_in_with_OTP_button() throws Throwable {
driver.findElement(By.id("kt_login_signinwithotp_submit")).click();
Thread.sleep(3000);
//OTP
		String str1=JOptionPane.showInputDialog("Enter your OTP");
		System.out.println(str1);
		
		Thread.sleep(9000);
		driver.findElement(By.xpath("//input[@id='mat-input-46' and @class='mat-input-element mat-form-field-autofill-control cdk-text-field-autofill-monitored ng-pristine ng-invalid ng-touched']")).sendKeys(str1);
		Thread.sleep(2000);
		driver.findElement(By.id("//*[@id='kt_login_signin_submit']")).click();
	}

	@Then("^user should be dashboard page$")
	public void user_should_be_dashboard_page() throws Throwable {
		 boolean res=driver.getPageSource().contains("Dashboard");
			if(res){
				System.out.println("user Login is successfully");
				
			}
			else
			{
				System.out.println("Enter valid login data Username and Password !!");
			}

	}

	@When("^chick on Forgot Password link$")
	public void chick_on_Forgot_Password_link() throws Throwable {
driver.findElement(By.linkText("Forgot Password")).click();
	}

	@Then("^Forgot Password page is open$")
	public void forgot_Password_page_is_open() throws Throwable {
boolean forgotp=driver.getPageSource().contains("Forgot Password?");
if(forgotp){
	System.out.println("Forgot password page should open");
}
	}

	@When("^Enter Email Id or Mobile no$")
	public void enter_Email_Id_or_Mobile_no() throws Throwable {
driver.findElement(By.xpath("//*[@id='mat-input-143']")).sendKeys("shivchougule1201@gmail.com");
String str=JOptionPane.showInputDialog("Enter Your Captch code");
System.out.println(str);
driver.findElement(By.xpath("//*[@id='kt_login']/div/div[2]/kt-forgot-password/div/div/"
		+ "form/div[1]/kt-captcha/div/div/form/input")).sendKeys(str);

	}

	@When("^ckick submit button$")
	public void ckick_submit_button() throws Throwable {
driver.findElement(By.id("kt_login_signin_submit")).click();
Thread.sleep(3000);
	}

	@Then("^Reset Password page should open$")
	public void reset_Password_page_should_open() throws Throwable {
		boolean forgotp=driver.getPageSource().contains("Reset Password?");
		if(forgotp){
			System.out.println("Reset password page should open");
		}
	}

	@When("^Enter OTP and set new Password then click submit$")
	public void enter_OTP_and_set_new_Password_then_click_submit() throws Throwable {
		//OTP
		String str=JOptionPane.showInputDialog("Enter Your OTP");
		System.out.println(str);
		driver.findElement(By.xpath("//*[@id='mat-input-144']")).sendKeys(str);
		//new password
		driver.findElement(By.id("//*[@id='mat-input-145']")).sendKeys("Shiva@1234");
		//confirm password
		driver.findElement(By.id("//*[@id='mat-input-146']")).sendKeys("Shiva@1234");
		//submit
		driver.findElement(By.xpath("//*[@id='kt_login_signin_submit']")).click();
		Thread.sleep(3000);
		
	}

	@Then("^user should be successfully login with new password$")
	public void user_should_be_successfully_login_with_new_password() throws Throwable {
		 boolean res=driver.getPageSource().contains("Dashboard");
			if(res){
				System.out.println("user Login is successfully with new password");
				
			}
			else
			{
				System.out.println("valid Username and Password Enter !!");
			}


	}
	@After
	public void logout() throws Exception{
		driver.findElement(By.xpath("//*[@id='kt_header']/kt-topbar/div/kt-user-profile/div/div[1]/div/img")).click();
		Thread.sleep(6000);
		driver.findElement(By.linkText("SIGN OUT")).click();
		System.out.println("Logout is successfully!!");
	}
	public static void dropdownSelect(List<WebElement> alloptions, String option) {
		for (WebElement s:alloptions) {

			if (s.getText().equals(option)) {
				s.click();
				break;
			}

		}
	}

}
