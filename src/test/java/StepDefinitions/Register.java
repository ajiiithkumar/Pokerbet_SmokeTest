package StepDefinitions;

import org.openqa.selenium.WebDriver;

import helperclass.HelperClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.Registerpages;
import utils.ExtentTestManager;
import utils.UserPropertiesReader;

public class Register {
	
	private WebDriver driver;
    private Registerpages register;

    
    
    
    @Given("Open site")
    public void open_site_register_email() throws Throwable {
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
    
    @And("Click accept cookies")
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
	
	 @And("Click signup button")
	    public void click_on_signup_button_mob_reg() throws Throwable {
	        try {
	        	register = new Registerpages(driver);
	        	register.click_signup();

	            System.out.println("Signup button is clicked!");
	            Thread.sleep(1000);
	            ExtentTestManager.logInfo("Click Signup Button");
	        } catch (Exception e3) {
	        	e3.getMessage();
	            e3.printStackTrace();
	            System.out.println("Unable to click Signup button!");
	            Thread.sleep(1000);
	            ExtentTestManager.logFail("Click Signup Button", driver);
	        }
	    }
	 
	 @And("Enter firstname {string}" )
	    public void enter_name(String name) throws Throwable {
	    	try {
	    		 register = new Registerpages(driver);
	    	String actualUsername = UserPropertiesReader.getfirstname();
	        register.enter_name(actualUsername);
	        System.out.println("name is entered!");
	        Thread.sleep(1000);
	        ExtentTestManager.logInfo("name Username");
	    	}
	    	catch(Exception e4)
	    	{
	    		e4.getMessage();
	    		e4.printStackTrace();
	    		Thread.sleep(1000);
	    		ExtentTestManager.logFail("Enter name", driver);
	    	}
	 }
	 
	 @And("Enter surname {string}" )
	    public void enter_surname(String surname) throws Throwable {
	    	try {
	    	String actualUsername = UserPropertiesReader.getsurname();
	        register.enter_surname(actualUsername); 
	        System.out.println("surname is entered!");
	        Thread.sleep(1000);
	        ExtentTestManager.logInfo("name surname");
	    	}
	    	catch(Exception e4)
	    	{
	    		e4.getMessage();
	    		e4.printStackTrace();
	    		Thread.sleep(1000);
	    		ExtentTestManager.logFail("Enter surname", driver);
	    	}
	 }
	 
	 @And("Enter newuserusername1 {string}" )
	    public void enter_username(String username) throws Throwable {
	    	try {
	    	String actualUsername = UserPropertiesReader.getUsername1();
	        register.enter_username(actualUsername); 
	        System.out.println("username is entered!");
	        Thread.sleep(1000);
	        ExtentTestManager.logInfo("name username");
	    	}
	    	catch(Exception e4)
	    	{
	    		e4.getMessage();
	    		e4.printStackTrace();
	    		Thread.sleep(1000);
	    		ExtentTestManager.logFail("Enter username", driver);
	    	}
	 }
	 
	 @Given("Enter email {string}")
	 public void enter_email(String email) throws Throwable {
	    	try {
	    	String actualemail = UserPropertiesReader.getemail1();
	        register.enter_email(actualemail); 
	        System.out.println("email is entered!");
	        Thread.sleep(1000);
	        ExtentTestManager.logInfo("enter email");
	    	}
	    	catch(Exception e4)
	    	{
	    		e4.getMessage();
	    		e4.printStackTrace();
	    		Thread.sleep(1000);
	    		ExtentTestManager.logFail("Enter email", driver);
	    	}
	 }


	 @And("Click next button")
	    public void click_on_next_button() throws Throwable {
	        try {
	        	
	        	register.click_nextbutton();

	            System.out.println("next button is clicked!");
	            Thread.sleep(1000);
	            ExtentTestManager.logInfo("next Signup Button");
	        } catch (Exception e3) {
	        	e3.getMessage();
	            e3.printStackTrace();
	            System.out.println("Unable to click next button!");
	            Thread.sleep(1000);
	            ExtentTestManager.logFail("Click next Button", driver);
	        }
	    }
	 @And("Enter passport {string}")
	    public void enter_passport(String passport) throws Throwable {
	    	try {
	    		String actualpassport = UserPropertiesReader.getpassport();
	            register.enter_passport(actualpassport);
	            System.out.println("passport is entered!");
	            Thread.sleep(1000);
	            ExtentTestManager.logInfo("Enter passport");
	        	}
	        	catch(Exception e6)
	        	{
	        		e6.getMessage();
	        		e6.printStackTrace();
	        		Thread.sleep(1000);
	        		ExtentTestManager.logFail("Enter passport", driver);
	        	}
	    }
	 
	 @And("Select source of income")
	  	public void select_source_of_income() throws Throwable {
	  		try {

	  			register.select_source_of_income();
	  			System.out.println("source of income selected!");
	  			Thread.sleep(2000);
	  			ExtentTestManager.logInfo("Select source of income");
	  		}
	  		catch(Exception e9)
	  		{
	  			e9.getMessage();
	  			e9.printStackTrace();
	  			Thread.sleep(1000);
	  			ExtentTestManager.logFail("Select source of income", driver);
	  		}
	  	}
	 @And("Select country")
	  	public void select_country() throws Throwable {
	  		try {

	  			register.select_country();
	  			System.out.println("country selected!");
	  			Thread.sleep(2000);
	  			ExtentTestManager.logInfo("Select country");
	  		}
	  		catch(Exception e9)
	  		{
	  			e9.getMessage();
	  			e9.printStackTrace();
	  			Thread.sleep(1000);
	  			ExtentTestManager.logFail("Select country", driver);
	  		}
	  	}
	 
	 @And("Enter mobnum {string}")
	    public void enter_mobie_number(String mobnum) throws Throwable {
	    	try {
	    		String actualmobnum = UserPropertiesReader.getmobnum();
	            register.enter_mobileno(actualmobnum);
	            System.out.println("mobnum is entered!");
	            Thread.sleep(1000);
	            ExtentTestManager.logInfo("Enter mobnum");
	        	}
	        	catch(Exception e6)
	        	{
	        		e6.getMessage();
	        		e6.printStackTrace();
	        		Thread.sleep(1000);
	        		ExtentTestManager.logFail("Enter mobnum", driver);
	        	}
	    }
	 
	 @And("Enter password - register (.*)$")
	    public void enter_password(String password) throws Throwable {
	    	try {
	    		
	            register.enter_password(password);
	            System.out.println("password is entered!");
	            Thread.sleep(1000);
	            ExtentTestManager.logInfo("Enter password");
	        	}
	        	catch(Exception e6)
	        	{
	        		e6.getMessage();
	        		e6.printStackTrace();
	        		Thread.sleep(1000);
	        		ExtentTestManager.logFail("Enter password", driver);
	        	}
	    }
	 
	 @And("Enter confirm password (.*)$")
	    public void enter_confirm_password(String password) throws Throwable {
	    	try {
	    		register.enter_cpassword(password);
	            System.out.println("confirm password is entered!");
	            Thread.sleep(1000);
	            ExtentTestManager.logInfo("Enter confirm password");
	        	}
	        	catch(Exception e6)
	        	{
	        		e6.getMessage();
	        		e6.printStackTrace();
	        		Thread.sleep(1000);
	        		ExtentTestManager.logFail("Enter confirm password", driver);
	        	}
	    }
	 
	 @And("Click age confirmation")
	    public void click_age_confirmation() throws Throwable {
	        try {
	        	
	        	register.click_age_cnfm();

	            System.out.println("age cnfm is clicked!");
	            Thread.sleep(1000);
	            ExtentTestManager.logInfo("Click age cnfm");
	        } catch (Exception e3) {
	        	e3.getMessage();
	            e3.printStackTrace();
	            System.out.println("Unable to click age cnfm!");
	            Thread.sleep(1000);
	            ExtentTestManager.logFail("Click age cnfm", driver);
	        }
	    }
	 
	 @And("Click register button")
	    public void click_register_button() throws Throwable {
	        try {
	        	
	        	register.click_register_button();

	            System.out.println("register button is clicked!");
	            Thread.sleep(1000);
	            ExtentTestManager.logPass("Click register button",driver);
	        } catch (Exception e3) {
	        	e3.getMessage();
	            e3.printStackTrace();
	            System.out.println("Unable to click register button!");
	            Thread.sleep(1000);
	            ExtentTestManager.logFail("Click register button", driver);
	        }
	    }
	 @And("Click promo popup")
	    public void click_on_promo_popup() throws Throwable {
	        try {
	        
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
		
	 @And("Click homepage button")
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
	 
	 @And("Click on logout button one signup")
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
	 
	 @And("Click on logout button two signup")
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
	 
}