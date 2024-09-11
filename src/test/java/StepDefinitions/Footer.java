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

public class Footer {
	private WebDriver driver;
	private Registerpages register;
	
	 @Given("Open Site - footer")
	    public void open_site_footer() throws Throwable {
		 try {
				HelperClass.setUpDriver();
				driver = HelperClass.getDriver();
				driver.manage().window().maximize();
				String baseUrl = UserPropertiesReader.baseurl();
				driver.get(baseUrl);
				System.out.println("Site Launched");
				Thread.sleep(1000);
				ExtentTestManager.logInfo("Open pokerbet Site");
			} catch (Exception e1) {
				e1.getMessage();
				e1.printStackTrace();
				Thread.sleep(1000);
				ExtentTestManager.logFail("Open pokerbet Site", driver);
			}
	    }

	    @And("close cookies - footer")
	    public void close_cookies_footer() throws Throwable {
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
	    
	    @And("close banners - footer")
	    public void close_banners_footer() throws Throwable {
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
	    
	  	@And("Click on login button - footer")
	  	public void click_on_login_button_footer() throws Throwable {
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

	  	@And("^Enter username for login - footer (.*)$")
	  	public void login_enter_username1_footer(String username) throws Throwable {
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


	  	@And("^Enter login password - footer (.*)$")
	  	public void login_enter_password1_footer(String password) throws Throwable {
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


	  	@And("Click on login submit - footer")
	  	public void login_click_on_submit1_button_footer() throws Throwable {
	  		try {
	  			 register = new Registerpages(driver);
	  			register.click_logincheck();
	  			System.out.println("Submit Button is clicked!");
	  			ExtentTestManager.logPass("Click Submit", driver);
	  		}
	  		catch(Exception e9)
	  		{
	  			e9.getMessage();
	  			e9.printStackTrace();
	  			Thread.sleep(1000);
	  			ExtentTestManager.logFail("Click Submit", driver);
	  		}
	  	}
	  	
	  	
	  	
	  	@And("close promo pop up - footer")
	  	public void close_promo_popup() throws Throwable {
	  		try {

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
	  	
	  	
	  	@And("Open Payment Methods page - footer")
	  	public void open_paymentmethods_footer() throws Throwable {
	  		try {
	  			
	  			register.open_paymentmethods_footer();
	  			System.out.println("Payments Method page is opened!");
	  			ExtentTestManager.logInfo("Open Payments Method Page");
	  		}
	  		catch(Exception e9)
	  		{
	  			e9.getMessage();
	  			e9.printStackTrace();
	  			Thread.sleep(1000);
	  			ExtentTestManager.logFail("Open Payments Method Page", driver);
	  		}
	  	}
	  	
	  	@And("Verify Payment Methods page - footer")
	  	public void verify_paymentmethods_footer() throws Throwable {
	  		try {

	  		register.verify_paymentmethods_success();
	  		System.out.println("Payments Method page - Success");
	  		Thread.sleep(1000);
	  		ExtentTestManager.logPass("Payments Method page - Success", driver);
	  		}
	  		catch(Exception e10)
	  		{
	  			e10.getMessage();
	  			e10.printStackTrace();
	  			Thread.sleep(1000);
	  			ExtentTestManager.logFail("Payments Method page - Success", driver);
	  		}
	  	}
	  	
	  	@And("Open About Us page - footer")
	  	public void open_aboutus_footer() throws Throwable {
	  		try {
	  			
	  			register.open_aboutus_footer();
	  			System.out.println("About us page is opened!");
	  			ExtentTestManager.logInfo("Open About Us Page");
	  		}
	  		catch(Exception e9)
	  		{
	  			e9.getMessage();
	  			e9.printStackTrace();
	  			Thread.sleep(1000);
	  			ExtentTestManager.logFail("Open About Us Page", driver);
	  		}
	  	}
	  	
	  	@And("Verify About Us page - footer")
	  	public void verify_aboutus_footer() throws Throwable {
	  		try {

	  		register.verify_aboutus_success();
	  		System.out.println("About Us page - Success");
	  		Thread.sleep(1000);
	  		ExtentTestManager.logPass("About Us page - Success", driver);
	  		}
	  		catch(Exception e10)
	  		{
	  			e10.getMessage();
	  			e10.printStackTrace();
	  			Thread.sleep(1000);
	  			ExtentTestManager.logFail("About Us page - Success", driver);
	  		}
	  	}
	  	
	  	
	  	@And("Open Sportsbook Rules page - footer")
	  	public void open_sportsrule_footer() throws Throwable {
	  		try {
	  			
	  			register.open_sportsbookrules_footer();
	  			System.out.println("Sportsbook Rules page is opened!");
	  			ExtentTestManager.logInfo("Open Sportsbook Rules Page");
	  		}
	  		catch(Exception e9)
	  		{
	  			e9.getMessage();
	  			e9.printStackTrace();
	  			Thread.sleep(1000);
	  			ExtentTestManager.logFail("Open Sportsbook Rules Page", driver);
	  		}
	  	}
	  	
	  	@And("Verify Sportsbook Rules page - footer")
	  	public void verify_sportsrule_footer() throws Throwable {
	  		try {

	  		register.verify_sportsbookrules_success();
	  		System.out.println("Sportsbook Rules page - Success");
	  		Thread.sleep(1000);
	  		ExtentTestManager.logPass("Sportsbook Rules page - Success", driver);
	  		}
	  		catch(Exception e10)
	  		{
	  			e10.getMessage();
	  			e10.printStackTrace();
	  			Thread.sleep(1000);
	  			ExtentTestManager.logFail("Sportsbook Rules page - Success", driver);
	  		}
	  	}
	  	
	  	@And("Open Terms and Conditions page - footer")
	  	public void open_termscond_footer() throws Throwable {
	  		try {
	  			
	  			register.open_termscond_footer();
	  			System.out.println("Terms and Conditions page is opened!");
	  			ExtentTestManager.logInfo("Open Terms and Conditions Page");
	  		}
	  		catch(Exception e9)
	  		{
	  			e9.getMessage();
	  			e9.printStackTrace();
	  			Thread.sleep(1000);
	  			ExtentTestManager.logFail("Open Terms and Conditions Page", driver);
	  		}
	  	}
	  	
	  	@And("Verify Terms and Conditions page - footer")
	  	public void verify_termscond_footer() throws Throwable {
	  		try {

	  		register.verify_termscond_success();
	  		System.out.println("Terms and Conditions page - Success");
	  		Thread.sleep(1000);
	  		ExtentTestManager.logPass("Terms and Conditions page - Success", driver);
	  		}
	  		catch(Exception e10)
	  		{
	  			e10.getMessage();
	  			e10.printStackTrace();
	  			Thread.sleep(1000);
	  			ExtentTestManager.logFail("Terms and Conditions page - Success", driver);
	  		}
	  	}
	  	
	  	@And("Open FAQs page - footer")
	  	public void open_faqs_footer() throws Throwable {
	  		try {
	  			
	  			register.open_faqs_footer();
	  			System.out.println("FAQs page is opened!");
	  			ExtentTestManager.logInfo("Open FAQs Page");
	  		}
	  		catch(Exception e9)
	  		{
	  			e9.getMessage();
	  			e9.printStackTrace();
	  			Thread.sleep(1000);
	  			ExtentTestManager.logFail("Open FAQs Page", driver);
	  		}
	  	}
	  	
	  	@And("Verify FAQs page - footer")
	  	public void verify_faqs_footer() throws Throwable {
	  		try {

	  		register.verify_faqs_success();
	  		System.out.println("FAQs page - Success");
	  		Thread.sleep(1000);
	  		ExtentTestManager.logPass("FAQs page - Success", driver);
	  		}
	  		catch(Exception e10)
	  		{
	  			e10.getMessage();
	  			e10.printStackTrace();
	  			Thread.sleep(1000);
	  			ExtentTestManager.logFail("FAQs page - Success", driver);
	  		}
	  	}
	  	
	  	@And("Open Privacy Policy page - footer")
	  	public void open_privacypolicy_footer() throws Throwable {
	  		try {
	  			
	  			register.open_privacy_policy_footer();
	  			System.out.println("Privacy Policy page is opened!");
	  			ExtentTestManager.logInfo("Open Privacy Policy Page");
	  		}
	  		catch(Exception e9)
	  		{
	  			e9.getMessage();
	  			e9.printStackTrace();
	  			Thread.sleep(1000);
	  			ExtentTestManager.logFail("Open Privacy Policy Page", driver);
	  		}
	  	}
	  	
	  	@And("Verify Privacy Policy page - footer")
	  	public void verify_privacypolicy_footer() throws Throwable {
	  		try {

	  		register.verify_privacy_policy_success();
	  		System.out.println("Privacy Policy page - Success");
	  		Thread.sleep(1000);
	  		ExtentTestManager.logPass("Privacy Policy page - Success", driver);
	  		}
	  		catch(Exception e10)
	  		{
	  			e10.getMessage();
	  			e10.printStackTrace();
	  			Thread.sleep(1000);
	  			ExtentTestManager.logFail("Privacy Policy page - Success", driver);
	  		}
	  	}
	  	
	  	@And("Open Responsible Gambling page - footer")
	  	public void open_responsiblegame_footer() throws Throwable {
	  		try {
	  			
	  			register.open_responsible_gambling_page_footer();
	  			System.out.println("Responsible Gaming page is opened!");
	  			ExtentTestManager.logInfo("Open Responsible Gaming Page");
	  		}
	  		catch(Exception e9)
	  		{
	  			e9.getMessage();
	  			e9.printStackTrace();
	  			Thread.sleep(1000);
	  			ExtentTestManager.logFail("Open Responsible Gaming Page", driver);
	  		}
	  	}
	  	
	  	@And("Verify Responsible Gambling page - footer")
	  	public void verify_responsiblegame_footer() throws Throwable {
	  		try {
	  		register.verify_responsible_gambling_page_footer();
	  		System.out.println("Responsible Gaming page - Success");
	  		Thread.sleep(1000);
	  		ExtentTestManager.logPass("Responsible Gaming page - Success", driver);
	  		}
	  		catch(Exception e10)
	  		{
	  			e10.getMessage();
	  			e10.printStackTrace();
	  			Thread.sleep(1000);
	  			ExtentTestManager.logFail("Responsible Gaming page - Success", driver);
	  		}
	  	}

	    	
	  	@And("Open Exchange Rules page - footer")
	  	public void open_exch_rules_footer() throws Throwable {
	  		try {
	  			
	  			register.open_exchange_rules_footer();
	  			System.out.println("Exchange Rules page is opened!");
	  			ExtentTestManager.logInfo("Open Exchange Rules Page");
	  		}
	  		catch(Exception e9)
	  		{
	  			e9.getMessage();
	  			e9.printStackTrace();
	  			Thread.sleep(1000);
	  			ExtentTestManager.logFail("Open Exchange Rules Page", driver);
	  		}
	  	}
	  	
	  	@And("Verify Exchange Rules page - footer")
	  	public void verify_exch_rules_footer() throws Throwable {
	  		try {

	  		register.verify_exchange_rules_success();
	  		System.out.println("Exchange Rules page - Success");
	  		Thread.sleep(1000);
	  		ExtentTestManager.logPass("Exchange Rules page - Success", driver);
	  		}
	  		catch(Exception e10)
	  		{
	  			e10.getMessage();
	  			e10.printStackTrace();
	  			Thread.sleep(1000);
	  			ExtentTestManager.logFail("Exchange Rules page - Success", driver);
	  		}
	  	}
	  	
	  	@And("Open Glossary page - footer")
	  	public void open_glossary_page_footer() throws Throwable {
		try {
	  			
	  			register.open_glossary_page_footer();
	  			System.out.println("Glossary page is opened!");
	  			ExtentTestManager.logInfo("Open Glossary page");
	  		}
	  		catch(Exception e9)
	  		{
	  			e9.getMessage();
	  			e9.printStackTrace();
	  			Thread.sleep(1000);
	  			ExtentTestManager.logFail("Open Glossary page", driver);
	  		}
	  	}
	 
	  	@And("Verify Glossary page - footer")
	  	public void verify_glossary_page_footer() throws Throwable {
	 		try {

	 	  		register.verify_glossary_footer();
	 	  		System.out.println("Glossary page - Success");
	 	  		Thread.sleep(1000);
	 	  		ExtentTestManager.logPass("Glossary page - Success", driver);
	 	  		}
	 	  		catch(Exception e10)
	 	  		{
	 	  			e10.getMessage();
	 	  			e10.printStackTrace();
	 	  			Thread.sleep(1000);
	 	  			ExtentTestManager.logFail("Glossary page - Success", driver);
	 	  		}
	 	  	}
	  	
	  	@Then("Open Affiliates page - footer")
	  	public void open_affiliates_page_footer() throws Throwable {
		try {
	  			
	  			register.open_affiliates_page_footer();
	  			System.out.println("Affiliate page is opened!");
	  			ExtentTestManager.logInfo("Open Affiliate page");
	  		}
	  		catch(Exception e9)
	  		{
	  			e9.getMessage();
	  			e9.printStackTrace();
	  			Thread.sleep(1000);
	  			ExtentTestManager.logFail("Open Affiliate page", driver);
	  		}
	  	}	
	  	@Then("Verify Affiliates page - footer")
	  	public void verify_affiliates_page_footer() throws Throwable {
	  	 		try {

	  	 	  		register.verify_affiliates_page_footer();
	  	 	  		System.out.println("Affiliate page - Success");
	  	 	  		Thread.sleep(1000);
	  	 	  		ExtentTestManager.logPass("Affiliate page - Success", driver);
	  	 	  		}
	  	 	  		catch(Exception e10)
	  	 	  		{
	  	 	  			e10.getMessage();
	  	 	  			e10.printStackTrace();
	  	 	  			Thread.sleep(1000);
	  	 	  			ExtentTestManager.logFail("Affiliate page - Success", driver);
	  	 	  		}
	  	 	  	}
	  	
	  	@When("Click on Hamburger menu - footer")
	  	public void click_on_hamburger_menu_footer() throws Throwable{
	  		
	  		try {
	  			Thread.sleep(5000);
	  			register.click_homebutton();
	  			System.out.println("Hamburger Menu is opened!");
	  			ExtentTestManager.logInfo("Open Hamburger Menu");
	  		}
	  		catch(Exception e9)
	  		{
	  			e9.getMessage();
	  			e9.printStackTrace();
	  			Thread.sleep(1000);
	  			ExtentTestManager.logFail("Open Hamburger Menu", driver);
	  		}
	  		
	  	}
	  	
	  	@And("Click on logout button one - footer")
	  	public void click_on_logout_btn_one_footer() throws Throwable{
	  		
	  		try {
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
	  	
		@And("Click on logout button two - footer")
	  	public void click_on_logout_btn_two_footer() throws Throwable{
	  		
	  		try {
	  			Thread.sleep(3000);
	  			register.click_logoutbutton_two();
	  			System.out.println("Logout Button one is clicked!");
	  			ExtentTestManager.logInfo("Click Logout Button one");
	  			Thread.sleep(3000);
	  		}
	  		catch(Exception e9)
	  		{
	  			e9.getMessage();
	  			e9.printStackTrace();
	  			Thread.sleep(1000);
	  			ExtentTestManager.logFail("Click Logout Button one", driver);
	  		}
	  		
	  	}
	  	
}
