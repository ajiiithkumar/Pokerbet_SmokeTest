package StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import helperclass.HelperClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.Registerpages;
import utils.ExtentTestManager;
import utils.UserPropertiesReader;

public class Login {
	
	private WebDriver driver;
    private Registerpages register;

    
    
    
    @Given("Open site login")
    public void open_site_register_email() throws Throwable {
    	try {
        HelperClass.setUpDriver();
        driver = HelperClass.getDriver();
        driver.manage().window().maximize();
		String baseUrl = UserPropertiesReader.baseurl();
		driver.get(baseUrl);
        System.out.println("Site Launched");
        Thread.sleep(1000);
        ExtentTestManager.logInfo("Open Pokerbet Site");
   	}
   	catch(Exception e1)
   	{
    		e1.getMessage();
    		e1.printStackTrace();
   		Thread.sleep(1000);
    		ExtentTestManager.logFail("Open BB Site", driver);
    	}
    }
    
    @And("Click accept cookies login")
    public void click_on_Accept_cookies() throws Throwable {
        try {
        	register = new Registerpages(driver);
        	register.click_accept_cookies();

            System.out.println("Accept cookies is clicked!");
            Thread.sleep(1000);
            ExtentTestManager.logInfo("Click Accept cookies");
        } catch (Exception e3) {
        	e3.getMessage();
            e3.printStackTrace();
            System.out.println("Unable to click Accept cookies!");
            Thread.sleep(1000);
            ExtentTestManager.logFail("Click Accept cookies", driver);
        }
    }
    
    
    
    
    @And("Click promo popup login")
    public void click_on_promo_popup() throws Throwable {
        try {
        	register = new Registerpages(driver);
        	register.click_promopopup();

            System.out.println("Promo popup is clicked!");
            Thread.sleep(1000);
            ExtentTestManager.logInfo("Click Promo popup");
        } catch (Exception e3) {
        	e3.getMessage();
            e3.printStackTrace();
            System.out.println("Unable to click Promo popup!");
            Thread.sleep(1000);
            ExtentTestManager.logFail("Click Promo popup", driver);
        }
    }
	
 @And("Click homepage button login")
    public void click_on_home_button() throws Throwable {
        try {
        
        	register.click_homebutton();

            System.out.println("homebutton is clicked!");
            Thread.sleep(1000);
            ExtentTestManager.logInfo("Click homebutton");
        } catch (Exception e3) {
        	e3.getMessage();
            e3.printStackTrace();
            System.out.println("Unable to click homebutton!");
            Thread.sleep(1000);
            ExtentTestManager.logFail("Click homebutton", driver);
        }
    }
 
 @Given("Click login button login")
 public void click_login_button_login() throws Throwable {
	 try {
     	register = new Registerpages(driver);
     	register.click_login_button();

         System.out.println("login button is clicked!");
         Thread.sleep(1000);
         ExtentTestManager.logInfo("Click login Button");
     } catch (Exception e3) {
     	e3.getMessage();
         e3.printStackTrace();
         System.out.println("Unable to click login button!");
         Thread.sleep(1000);
         ExtentTestManager.logFail("Click login Button", driver);
     }
    
 }

 @Given("Enter username login {string}")
 public void enter_username_login(String string)  throws Throwable{
	 try {
		
	String actualUsername = UserPropertiesReader.getUsername1();
    register.enter_username_login(actualUsername);
    System.out.println("username is entered!");
    Thread.sleep(1000);
    ExtentTestManager.logInfo("username Username");
	}
	catch(Exception e4)
	{
		e4.getMessage();
		e4.printStackTrace();
		Thread.sleep(1000);
		ExtentTestManager.logFail("Enter username", driver);
	}
 }
 @And("Enter login password login (.*)$")
 public void enter_password_login(String password)  throws Throwable{
	 try {
	
	register = new Registerpages(driver);
    register.enter_password_login(password);
    System.out.println("password is entered!");
    Thread.sleep(1000);
    ExtentTestManager.logInfo("password Username");
	}
	catch(Exception e4)
	{
		e4.getMessage();
		e4.printStackTrace();
		Thread.sleep(1000);
		ExtentTestManager.logFail("Enter password", driver);
	}
 }
 @Given("Click on login submit login")
 public void click_on_login_submit_login() throws Throwable {
	 try {
	     	register = new Registerpages(driver);
	     	register.click_logincheck();

	         System.out.println("login button is clicked!");
	         Thread.sleep(1000);
	         ExtentTestManager.logPass("Click login Button", driver);
	     } catch (Exception e3) {
	     	e3.getMessage();
	         e3.printStackTrace();
	         System.out.println("Unable to click login button!");
	         Thread.sleep(1000);
	         ExtentTestManager.logFail("Click login Button", driver);
	     }
 }

 

 @And("Click on Hamburger menu login")
 public void click_on_hamburger_menu_login() throws Throwable {
	 try {
		 register = new Registerpages(driver);
	 register.click_homebutton();

     System.out.println("homebutton is clicked!");
     Thread.sleep(1000);
     ExtentTestManager.logInfo("Click homebutton");
 } catch (Exception e3) {
 	e3.getMessage();
     e3.printStackTrace();
     System.out.println("Unable to click homebutton!");
     Thread.sleep(1000);
     ExtentTestManager.logFail("Click homebutton", driver);
 }
}

 @And("Click on logout button one login")
 public void click_on_logout_button_one_login()  throws Throwable {
     try {
    	 register = new Registerpages(driver);
     	register.click_logout_button();

         System.out.println("logout button is clicked!");
         Thread.sleep(1000);
        
         ExtentTestManager.logPass("Click logout button",driver);
     } catch (Exception e3) {
     	e3.getMessage();
         e3.printStackTrace();
         System.out.println("Unable to click logout button!");
         Thread.sleep(1000);
         ExtentTestManager.logFail("Click logout button", driver);
     }
 }
 
 @And("Click on logout button two login")
 public void click_on_logout_button_two_login()  throws Throwable {
     try {
    	 register = new Registerpages(driver);
     	register.click_logoutbutton_two();

         System.out.println("logout button is clicked!");
         Thread.sleep(1000);
        
         ExtentTestManager.logPass("Click logout button",driver);
     } catch (Exception e3) {
     	e3.getMessage();
         e3.printStackTrace();
         System.out.println("Unable to click logout button!");
         Thread.sleep(1000);
         ExtentTestManager.logFail("Click logout button", driver);
     }
 }
 
 

 @And("^Enter ex username for login login (.*)$")
	public void login_enter_username2(String username) throws Throwable {
		try {
			register.enter_username_login(username);
			System.out.println("Username is entered - Ex User!");
			Thread.sleep(1000);
			ExtentTestManager.logInfo("Enter Username - Ex User");
		}
		catch(Exception e4)
		{
			e4.getMessage();
			e4.printStackTrace();
			Thread.sleep(1000);
			ExtentTestManager.logFail("Enter Username - Ex User", driver);
		}
	}

 
 
 
 
 
 
 


}
