package StepDefinitions;

import org.openqa.selenium.WebDriver;

import helperclass.HelperClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Registerpages;
import utils.ExtentTestManager;
import utils.UserPropertiesReader;

public class History {
	private WebDriver driver;
    private Registerpages register;
	
	@Given("Open Site - hist")
    public void open_site_history() throws Throwable {
		try {
			Thread.sleep(3000);
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
    

    @And("close cookies - hist")
    public void close_cookies_hist() throws Throwable {
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
    
    @And("close banners - hist")
    public void close_banners_hist() throws Throwable {
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
    
  	@And("Click on login button - hist")
  	public void click_on_login_button_for_history() throws Throwable {
  		try {
  			register = new Registerpages(driver);
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
  	
  	@And("^Enter username for login - hist (.*)$")
  	public void login_enter_username1_history(String username) throws Throwable {
  		try {
  			register = new Registerpages(driver);
  			register.enter_username_login(username);
  			System.out.println("Username is entered - New User!");
  			Thread.sleep(1000);
  			ExtentTestManager.logInfo("Enter Username - New User");
  		}
  		catch(Exception e4)
  		{
  			e4.getMessage();
  			e4.printStackTrace();
  			Thread.sleep(1000);
  			ExtentTestManager.logFail("Enter Username - New User", driver);
  		}
  	}


  	@And("^Enter login password - hist (.*)$")
  	public void login_enter_password1_history(String password) throws Throwable {
  		try {
  			register = new Registerpages(driver);
  			register.enter_password_login(password);
  			System.out.println("Password is entered - New User!");
  			Thread.sleep(1000);
  			ExtentTestManager.logInfo("Enter Password - New User");
  		}
  		catch(Exception e6)
  		{
  			e6.getMessage();
  			e6.printStackTrace();
  			Thread.sleep(1000);
  			ExtentTestManager.logFail("Enter Password - New User", driver);
  		}
  	}


  	@And("Click on login submit - hist")
  	public void login_click_on_submit1_button_history() throws Throwable {
  		try {
  			register = new Registerpages(driver);
  			register.click_logincheck();
  			System.out.println("Submit Button is clicked!");
  			ExtentTestManager.logInfo("Click Submit");
  		}
  		catch(Exception e9)
  		{
  			e9.getMessage();
  			e9.printStackTrace();
  			Thread.sleep(1000);
  			ExtentTestManager.logFail("Click Submit", driver);
  		}
  	}
  	
  	
  	
  	@And("close promo pop up - hist")
  	public void close_promo_popup_history() throws Throwable {
  		try {
  			register = new Registerpages(driver);
  			register.click_bannerclose();
  			System.out.println("promo pop up is closed!");
  			ExtentTestManager.logInfo("Close promo pop up");
  		}
  		catch(Exception e9)
  		{
  			e9.getMessage();
  			e9.printStackTrace();
  			Thread.sleep(1000);
  			ExtentTestManager.logInfo("Close promo pop up");
  		}
  	}
  	
  	@And("Click on Hamburger menu - hist")
    public void click_on_hamburger_menu_kyc() throws Throwable{
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
  	
  	@And("Click on Transactions dropdown - hist")
  	public void open_trans_drpdwn() throws Throwable {
  		try {
  			register = new Registerpages(driver);
  			register.click_transaction_drpdown();
  			System.out.println("Transaction Dropdown is opened!");
  			ExtentTestManager.logInfo("Open Transaction History dropdown");
  		}
  		catch(Exception e9)
  		{
  			e9.getMessage();
  			e9.printStackTrace();
  			Thread.sleep(1000);
  			ExtentTestManager.logFail("Open Transaction History dropdown", driver);
  		}
  	}
  	
  	@And("Click on All Transactions - hist")
  	public void open_all_trans() throws Throwable {
  		try {
  			register = new Registerpages(driver);
  			register.click_all_transactions();
  			System.out.println("All Transactions page is opened!");
  			ExtentTestManager.logInfo("Open All Transaction page");
  		}
  		catch(Exception e9)
  		{
  			e9.getMessage();
  			e9.printStackTrace();
  			Thread.sleep(1000);
  			ExtentTestManager.logFail("Open All Transaction page", driver);
  		}
  	}
  	
  	@And("Verify records in All Transaction page - hist")
  	public void verify_records_Alltrans() throws Throwable {
  		try {
  			register = new Registerpages(driver);
  		register.verify_all_trans_page();
  		System.out.println("All Transactions Records - Verified");
  		Thread.sleep(1000);
  		ExtentTestManager.logPass("All Transactions Records - Verified", driver);
  		}
  		catch(Exception e10)
  		{
  			e10.getMessage();
  			e10.printStackTrace();
  			Thread.sleep(1000);
  			ExtentTestManager.logFail("All Transactions Records - Verified", driver);
  		}

  	}
  	
  	@And("Click on Game History - hist")
  	public void open_game_hist() throws Throwable {
  		try {
  			register = new Registerpages(driver);
  			register.click_game_history();
  			System.out.println("Game History page is opened!");
  			ExtentTestManager.logInfo("Open Game History page");
  		}
  		catch(Exception e9)
  		{
  			e9.getMessage();
  			e9.printStackTrace();
  			Thread.sleep(1000);
  			ExtentTestManager.logFail("Open Game History page", driver);
  		}
  	}
  	
  	@And("Verify records in Game History page - hist")
  	public void verify_records_gamehist() throws Throwable {
  		try {
  			register = new Registerpages(driver);
  		register.verify_game_hist_page();
  		System.out.println("Game History Records - Verified");
  		Thread.sleep(1000);
  		ExtentTestManager.logPass("Game History Records - Verified", driver);
  		Thread.sleep(4000);
  		}
  		catch(Exception e10)
  		{
  			e10.getMessage();
  			e10.printStackTrace();
  			Thread.sleep(1000);
  			ExtentTestManager.logFail("Game History Records - Verified", driver);
  		}

  	}
  	
  	@And("Click on logout button one - hist")
  	public void click_on_logout_btn_one_hist() throws Throwable{
  		
  		try {
  			register = new Registerpages(driver);
  			Thread.sleep(3000);
  			register.click_logout_button();
  			System.out.println("Logout Button one is clicked!");
  			ExtentTestManager.logInfo("Click Logout Button one");
  		}
  		catch(Exception e9)
  		{
  			e9.getMessage();
  			e9.printStackTrace();
  			Thread.sleep(1000);
  			ExtentTestManager.logFail("Click Logout Button one", driver);
  		}
  		
  	}
  	
	@And("Click on logout button two - hist")
  	public void click_on_logout_btn_two_hist() throws Throwable{
  		
  		try {
  			
  			register = new Registerpages(driver);
  			Thread.sleep(3000);
  			register.click_logoutbutton_two();
  			System.out.println("Logout Button one is clicked!");
  			ExtentTestManager.logInfo("Click Logout Button two");
  			UserPropertiesReader.incrementUsername1();
            UserPropertiesReader.incrementUsername2();
            //UserPropertiesReader.incrementPassport();
            UserPropertiesReader.incrementDocumentNo();
            UserPropertiesReader.incrementAccountNo();
            UserPropertiesReader.incrementMobileNumber();
            
  		}
  		catch(Exception e9)
  		{
  			e9.getMessage();
  			e9.printStackTrace();
  			Thread.sleep(1000);
  			ExtentTestManager.logFail("Click Logout Button two", driver);
  		}
  		
  	}
}
