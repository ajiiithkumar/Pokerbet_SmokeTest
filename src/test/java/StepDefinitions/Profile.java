package StepDefinitions;

import org.openqa.selenium.WebDriver;

import helperclass.HelperClass;
import io.cucumber.java.en.And;
import pages.Registerpages;
import utils.ExtentTestManager;
import utils.UserPropertiesReader;

public class Profile {
	
	private WebDriver driver;
    private Registerpages register;
    
	@And("Open Site profile")
	public void open_site_profile() throws Throwable {
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

	@And("close cookies profile")
	public void close_cookies_profile() throws Throwable{
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

	@And("Click on login button profile")
	public void click_on_login_button_profile()throws Throwable {
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

	@And("Enter username profile {string}")
	public void enter_username_for_login_profile(String string)throws Throwable {
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

	@And("Enter password profile (.*)$")
	public void enter_login_password_profile_test(String password) throws Throwable{
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

	@And("Click on login submit profile")
	public void click_on_login_submit_profile() throws Throwable{
		 try {
		     	register = new Registerpages(driver);
		     	register.click_logincheck();

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


	
	@And("Click on my account dropdown profile")
	public void click_on_my_account_dropdown_profile() throws Throwable{
		 try {
		     	register = new Registerpages(driver);
		     	register.click_myaccount();

		         System.out.println("my aacount is clicked!");
		         Thread.sleep(1000);
		         ExtentTestManager.logInfo("Click my account");
		     } catch (Exception e3) {
		     	e3.getMessage();
		         e3.printStackTrace();
		         System.out.println("Unable to click my account!");
		         Thread.sleep(1000);
		         ExtentTestManager.logFail("Click my account", driver);
		     }
	}

	@And("Click on my profile in dropdown profile")
	public void click_on_my_profile_in_dropdown_profile() throws Throwable{
		 try {
		     	register = new Registerpages(driver);
		     	register.click_profile();

		         System.out.println("Profile is clicked!");
		         Thread.sleep(1000);
		         ExtentTestManager.logInfo("Click Profile");
		     } catch (Exception e3) {
		     	e3.getMessage();
		         e3.printStackTrace();
		         System.out.println("Unable to click Profile!");
		         Thread.sleep(1000);
		         ExtentTestManager.logFail("Click Profile", driver);
		     }
	}

	@And("Click Send OTP for Email")
	public void click_send_otp_for_email() throws Throwable{
		 try {
		     	register = new Registerpages(driver);
		     	register.click_emailverify01();
		     	
		         System.out.println("Email verify is clicked!");
		         Thread.sleep(30000);
		         ExtentTestManager.logPass("Click Email verify", driver);
		     } catch (Exception e3) {
		     	e3.getMessage();
		         e3.printStackTrace();
		         System.out.println("Unable to Email verify!");
		         Thread.sleep(1000);
		         ExtentTestManager.logFail("Click Email verify", driver);
		     }
	}

	@And("Click verify OTP for Email")
	public void click_verify_otp_for_email() throws Throwable{
		 try {
		     	register = new Registerpages(driver);
		     	register.click_emailverify02();

		         System.out.println("Email verify is clicked!");
		         Thread.sleep(1000);
		         ExtentTestManager.logPass("Click Email verify", driver);
		     } catch (Exception e3) {
		     	e3.getMessage();
		         e3.printStackTrace();
		         System.out.println("Unable to Email verify!");
		         Thread.sleep(1000);
		         ExtentTestManager.logFail("Click Email verify", driver);
		     }
	}

	

	@And("Click Send OTP for Mobile")
	public void click_send_otp_for_mobile() throws Throwable{
		 try {
		     	register = new Registerpages(driver);
		     	register.click_mobileverify01();

		         System.out.println("Email verify is clicked!");
		         Thread.sleep(30000);
		         ExtentTestManager.logPass("Click Email verify", driver);
		     } catch (Exception e3) {
		     	e3.getMessage();
		         e3.printStackTrace();
		         System.out.println("Unable to Email verify!");
		         Thread.sleep(1000);
		         ExtentTestManager.logFail("Click Email verify", driver);
		     }
	}

	@And("Click verify OTP for Mobile")
	public void click_verify_otp_for_mobile() throws Throwable{
		 try {
		     	register = new Registerpages(driver);
		     	register.click_mobileverify02();

		         System.out.println("Email verify is clicked!");
		         Thread.sleep(1000);
		         ExtentTestManager.logPass("Click Email verify", driver);
		     } catch (Exception e3) {
		     	e3.getMessage();
		         e3.printStackTrace();
		         System.out.println("Unable to Email verify!");
		         Thread.sleep(1000);
		         ExtentTestManager.logFail("Click Email verify", driver);
		     }
	}

	

	@And("Click submit button for profile")
	public void click_submit_button_for_profile() throws Throwable{
		 try {
		     	register = new Registerpages(driver);
		     	register.click_profile_submit();

		         System.out.println("Profile submit is clicked!");
		         Thread.sleep(1000);
		         ExtentTestManager.logPass("Click Profile submit", driver);
		     } catch (Exception e3) {
		     	e3.getMessage();
		         e3.printStackTrace();
		         System.out.println("Unable to Profile submit!");
		         Thread.sleep(1000);
		         ExtentTestManager.logFail("Click Profile submit", driver);
		     }
	}

	@And("Enter address profile (.*)$")
	public void enter_address_profile(String address) throws Throwable{
		 try {
		     	register = new Registerpages(driver);
		     	register.click_profile_address(address);

		         System.out.println("Profile address is entered!");
		         Thread.sleep(1000);
		         ExtentTestManager.logInfo("profile address is entered");
		     } catch (Exception e3) {
		     	e3.getMessage();
		         e3.printStackTrace();
		         System.out.println("Unable to enter address!");
		         Thread.sleep(1000);
		         ExtentTestManager.logFail("Enter profile address", driver);
		     }
	}
	@And("Enter city profile (.*)$")
	public void verify_if_profile_is_submitted_successfully(String city) throws Throwable{
		 try {
		     	register = new Registerpages(driver);
		     	register.click_profile_city(city);

		         System.out.println("Profile city is entered!");
		         Thread.sleep(1000);
		         ExtentTestManager.logInfo("profile city is entered");
		     } catch (Exception e3) {
		     	e3.getMessage();
		         e3.printStackTrace();
		         System.out.println("Unable to enter city!");
		         Thread.sleep(1000);
		         ExtentTestManager.logFail("Enter profile city", driver);
		     }
	}

	@And("Click on Hamburger menu profile")
	public void click_on_hamburger_menu_profile() throws Throwable{
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

	@And("Click on logout button one - profile")
	public void click_on_logout_button_one_profile() throws Throwable{
		  try {
		    	 register = new Registerpages(driver);
		     	register.click_logout_button();

		         System.out.println("logout button is clicked!");
		         Thread.sleep(1000);
		        
		         ExtentTestManager.logInfo("Click logout button");
		     } catch (Exception e3) {
		     	e3.getMessage();
		         e3.printStackTrace();
		         System.out.println("Unable to click logout button!");
		         Thread.sleep(1000);
		         ExtentTestManager.logFail("Click logout button", driver);
		     }
	}
	
	@And("Click on logout button two - profile")
	public void click_on_logout_button_two_profile() throws Throwable{
		  try {
		    	 register = new Registerpages(driver);
		     	register.click_logoutbutton_two();

		         System.out.println("logout button is clicked!");
		         Thread.sleep(1000);
		        
		         ExtentTestManager.logInfo("Click logout button");
		     } catch (Exception e3) {
		     	e3.getMessage();
		         e3.printStackTrace();
		         System.out.println("Unable to click logout button!");
		         Thread.sleep(1000);
		         ExtentTestManager.logFail("Click logout button", driver);
		     }
	}
}
