package StepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import helperclass.HelperClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Registerpages;
import utils.ExtentTestManager;
import utils.UserPropertiesReader;

public class Forgetpassword {
	private WebDriver driver;
    private Registerpages register;
    
    @Given("Open Site Desktop - frgt")
    public void open_site_password() throws Throwable {
    	try {
            HelperClass.setUpDriver();
            driver = HelperClass.getDriver();
            driver.manage().window().maximize();
    		String baseUrl = UserPropertiesReader.baseurl();
    		driver.get(baseUrl);
            System.out.println("Site Launched");
            Thread.sleep(1000);
            ExtentTestManager.logInfo("Open pokerbet Site");
        	}
        	catch(Exception e1)
        	{
        		e1.getMessage();
        		e1.printStackTrace();
        		Thread.sleep(1000);
        		ExtentTestManager.logFail("Open BB Site", driver);
        	}
    }

    @And("close cookies - frgt")
    public void close_cookies_password() throws Throwable {
    	try {
			register = new Registerpages(driver);
        register.click_accept_cookies();
        System.out.println("Accept Cookies is closed!");
        Thread.sleep(1000);
        ExtentTestManager.logInfo("Close Cookies");
    	}
    	catch(Exception e2)
    	{
    		e2.getMessage();
    		e2.printStackTrace();
    		Thread.sleep(1000);
			ExtentTestManager.logInfo("Close Cookies");
    	}
    }
    
    @And("close banners - frgt")
    public void close_banners_password() throws Throwable {
    	try {
        register = new Registerpages(driver);
        register.click_bannerclose();
        System.out.println("Banner is closed!");
        Thread.sleep(1000);
        ExtentTestManager.logInfo("Close Banners");
    	}
    	catch(Exception e2)
    	{
    		e2.getMessage();
    		e2.printStackTrace();
    		Thread.sleep(1000);
			ExtentTestManager.logInfo("Close Banners");
    	}
    }
    
  	@And("Click on login button - frgt")
  	public void click_on_login_button_for_password() throws Throwable {
  		try {
  			register.click_login_button();
  			System.out.println("Login button is clicked!");
  			Thread.sleep(1000);
  			ExtentTestManager.logInfo("Click Login Button");
  		} catch (Exception e3) {
  			e3.getMessage();
  			e3.printStackTrace();
  			System.out.println("Unable to click Login button!");
  			Thread.sleep(1000);
  			ExtentTestManager.logFail("Click Login Button", driver);
  		}
  	}
  	
  	@And("Click on forgot password - frgt")
  	public void click_on_forgot_password_button() throws Throwable {
  		try {
  			register.click_forgot_password();
  			System.out.println("Forgot Password is clicked!");
  			Thread.sleep(1000);
  			ExtentTestManager.logInfo("Click Forgot Password");
  		} catch (Exception e3) {
  			e3.getMessage();
  			e3.printStackTrace();
  			System.out.println("Unable to click Forgot Password!");
  			Thread.sleep(1000);
  			ExtentTestManager.logFail("Click Forgot Password", driver);
  		}
  	}
  	
  	@And("Enter email ID - frgt {string}")
  	public void enter_emailID_frgtpassword(String email) throws Throwable {
  		try {
			String actualEmail = UserPropertiesReader.getemail1();
			System.out.println("Actual Email: " + actualEmail);
			register.enter_emailID_forgotpassword(actualEmail);
  			System.out.println("EmailID is entered - Forgot Password!");
  			Thread.sleep(1000);
  			ExtentTestManager.logInfo("Enter EmailID - Forgot Password");
  		}
  		catch(Exception e6)
  		{
  			e6.getMessage();
  			e6.printStackTrace();
  			Thread.sleep(1000);
  			ExtentTestManager.logFail("Enter EmailID - Forgot Password", driver);
  		}
  	}
  	
  	@And("Click on submit to send mail - frgt")
  	public void click_on_send_mail_frgtpassword() throws Throwable {
  		try {
  			register.click_submit_forgot_password();
  			System.out.println("Submit is clicked!");
  			Thread.sleep(1000);
  			ExtentTestManager.logInfo("Click Submit - Forgot Password");
  		} catch (Exception e3) {
  			e3.getMessage();
  			e3.printStackTrace();
  			System.out.println("Unable to click submit - Forgot Password!");
  			Thread.sleep(1000);
  			ExtentTestManager.logFail("Click Submit - Forgot Password", driver);
  		}
  	}
  	
  	@And("Verify success msg for mail sent - frgt")
  	public void verify_mailsent_success_msg() throws Throwable {
  		try {

  			register.verify_forgotpassword_mailsent();
  			System.out.println("Forgot Password Mail sent - success!");
  			ExtentTestManager.logPass("Forgot Password Mail sent - Success", driver);
  		}
  		catch(Exception e9)
  		{
  			e9.getMessage();
  			e9.printStackTrace();
  			Thread.sleep(1000);
  			ExtentTestManager.logFail("Forgot Password Mail sent - Success", driver);
  		}
  	}
  	
  	@And("Open Gmail - frgt")
  	public void launch_gmail() throws Throwable {
  		try {

  			driver.get("https://www.gmail.com/");
  			System.out.println("Gmail is launched!");
  			ExtentTestManager.logInfo("Launch Gmail");
  			register.click_signup_gmail();
  			System.out.println("Signup is clicked!");
  			ExtentTestManager.logInfo("Click Signup");
  		}
  		catch(Exception e9)
  		{
  			e9.getMessage();
  			e9.printStackTrace();
  			Thread.sleep(1000);
  			ExtentTestManager.logFail("Launch Gmail / Click Signup", driver);
  		}
  	}

	@And("Enter email ID in Gmail - frgt {string}")
	public void enter_emailID_gmail(String email) throws Throwable {
		try {
			register = new Registerpages(driver);
			String actualEmail = UserPropertiesReader.getemail1();
			System.out.println("Actual Email: " + actualEmail);
			register.enter_emailID_gmail(actualEmail);
			System.out.println("EmailID is entered - Gmail!");
			Thread.sleep(1000);
			ExtentTestManager.logInfo("Enter EmailID - Gmail");
			register.click_next_gmail();
			System.out.println("Next is clicked - Gmail!");
		} catch (Exception e6) {
			e6.getMessage();
			e6.printStackTrace();
			Thread.sleep(1000);
			ExtentTestManager.logFail("Enter EmailID - Gmail", driver);
		}
	}

	@And("Enter password in Gmail (.*)$")
	public void enter_password_in_gmail_frgt(String password) throws Throwable {
	    try {
	        register = new Registerpages(driver);
	        register.enter_password_gmail(password);
	        System.out.println("Password is entered - Gmail!");
	        ExtentTestManager.logInfo("Enter Password - Gmail");
	        register.click_next_gmail();
	        System.out.println("Next is clicked - Gmail!");
	    } catch (Exception e) {
	        e.printStackTrace();
	        ExtentTestManager.logFail("Enter Password - Gmail", driver);
	    }
	}






	@And("Open mail in Gmail - frgt")
  	public void open_mail_gmail() throws Throwable {
  		try {
  			register.open_mail_gmail();
  			System.out.println("Open Mail in Gmail");
  			Thread.sleep(1000);
  			ExtentTestManager.logInfo("Open Mail - Gmail");
  		} catch (Exception e3) {
  			e3.getMessage();
  			e3.printStackTrace();
  			System.out.println("Unable to open mail - Gmail!");
  			Thread.sleep(1000);
  			ExtentTestManager.logFail("Open Mail - Gmail", driver);
  		}
  	}
  	
  	@And("Open forgot password link in Gmail - frgt")
  	public void open_link_gmail() throws Throwable {
  		try {
  			register.click_on_link_gmail();
  			System.out.println("Forgot Password link is opened");
  			Thread.sleep(1000);
  			
  			//Switching Tabs 
			
			Set<String> tabs = driver.getWindowHandles();
			Iterator<String> it = tabs.iterator();
			String tab1 = it.next();
			String tab2 = it.next();
			driver.switchTo().window(tab1);
			driver.close();
			driver.switchTo().window(tab2);
			Thread.sleep(2000);
			
  			ExtentTestManager.logPass("Open Forgot Password Link", driver);
  			
  		} catch (Exception e3) {
  			e3.getMessage();
  			e3.printStackTrace();
  			System.out.println("Unable to open Forgot Password link!");
  			Thread.sleep(1000);
  			ExtentTestManager.logFail("Open Forgot Password Link", driver);
  		}
  	}
  	
  	@And("Enter New password - frgt")
  	public void enter_newpass_frgt() throws Throwable {
  		try {
  			register.enter_newpass_frgt();
  			System.out.println("New password is Entered");
  			Thread.sleep(1000);
  			ExtentTestManager.logInfo("Enter New password");
  		} catch (Exception e3) {
  			e3.getMessage();
  			e3.printStackTrace();
  			System.out.println("Unable to Enter New password");
  			Thread.sleep(1000);
  			ExtentTestManager.logFail("Enter New password", driver);
  		}
  	}
  	
  	@And("Enter Confirm password - frgt")
  	public void enter_confirmpass_frgt() throws Throwable {
  		try {
  			register.enter_confirmpass_frgt();
  			System.out.println("Confirm password is Entered");
  			Thread.sleep(1000);
  			ExtentTestManager.logPass("Enter Confirm password", driver);
  		} catch (Exception e3) {
  			e3.getMessage();
  			e3.printStackTrace();
  			System.out.println("Unable to Enter Confirm password");
  			Thread.sleep(1000);
  			ExtentTestManager.logFail("Enter Confirm password", driver);
  		}
  	}
  	
  	@And("Click Submit - frgt")
  	public void click_submit_frgtpass() throws Throwable {
  		try {
  			register.click_on_submit_frgt();
  			System.out.println("Submit Button is clicked");
  			Thread.sleep(1000);
  			ExtentTestManager.logInfo("Click Submit - Forgot Password");
  		} catch (Exception e3) {
  			e3.getMessage();
  			e3.printStackTrace();
  			System.out.println("Unable to Click Submit - Forgot Password");
  			Thread.sleep(1000);
  			ExtentTestManager.logFail("Click Submit - Forgot Password", driver);
  		}
  	}
  	
  	@Then("Verify if Forgot password change is successful")
  	public void verify_frgtpass_success() throws Throwable {
  		try {
  			
  			register.verify_forgotpassword_success();
  			System.out.println("Forgot Password - Change Success");
  			Thread.sleep(1000);
  			ExtentTestManager.logPass("Forgot Password - Change Success", driver);
  		} catch (Exception e3) {
  			e3.getMessage();
  			e3.printStackTrace();
  			System.out.println("Forgot Password - Change Fail");
  			Thread.sleep(1000);
  			ExtentTestManager.logFail("Forgot Password - Change Success", driver);
  		}
  	}
}
