package pages;

import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeoutException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.messages.types.Duration;
import utils.ExtentTestManager;
import utils.UserPropertiesReader;

public class Registerpages {
	public WebDriver driver;
	
	//registration_locators
	
	@FindBy(id = "signup_btn")
	WebElement btn_signup;
	
	@FindBy(xpath = "//*[@src=\"https://pbqa.digient.co/assets/images/ic-hamburger.svg\"]")
	WebElement btn_homepage;
	
	@FindBy(id = "name")
	WebElement txt_firstname;
	
	@FindBy(id = "Surname")
	WebElement txt_surname;
	
	@FindBy(id = "user_name")
	WebElement txt_username;
	
	@FindBy(id = "user_email")
	WebElement txt_email;
	
	@FindBy(xpath = "//*[text()=\"Next\"]")
	WebElement btn_next;
	
	@FindBy(id = "passport")
	WebElement txt_passport;
	
	@FindBy(id = "SourceofIncome")
	WebElement drp_source_of_income;
	
	@FindBy(id = "Country")
	WebElement drp_country;
	
	@FindBy(id = "UserMobileno")
	WebElement txt_mobileno;
	
	
	@FindBy(id = "UserPassword")
	WebElement txt_password;
	
	@FindBy(id = "UserConfirmPassword")
	WebElement txt_cpassword;
	
	@FindBy(id = "age_cnfrm")
	WebElement btn_agetickbox;
	
	@FindBy(id = "registerbtn")
	WebElement btn_register;
	
	@FindBy(id = "promo-popup")
	WebElement btn_promopopup;
	
	
	@FindBy(xpath = "//*[text()='Accept']")
	WebElement btn_cookies;
	
	
	
	@FindBy(xpath = "(//*[@class=\"menu_desktopicon\"])[7]")
	WebElement btn_logout;
	
	//login_locators
	
	@FindBy(xpath = "(//*[@src=\"https://pbqa.digient.co/assets/images/ic-enter.svg\"])[1]")
	WebElement btn_login;
	
	@FindBy(id = "Username")
	WebElement txtlogin_username;
	
	@FindBy(id = "Password")
	WebElement txtlogin_password;
	
	@FindBy(id = "login_check")
	WebElement btn_logincheck;
	
	@FindBy(xpath = "//*[text()='Logout'and @class='common-btn logout-btn']")
	WebElement btn_logouttwo;
	

	@FindBy(xpath = "//*[@class=\"dont-show-link text-center mb-0\"]")
	WebElement btn_bannerclose;
	//gameplay
	
	@FindBy(xpath = "(//*[@title=\"casino\"])[1]")
	WebElement btn_casino_page;
	
	@FindBy(id = "search_games")
	WebElement txt_search_slot;
	
	@FindBy(xpath = "//*[@alt=\"Dice Twice - Cassino - Pokerbet\"]")
	WebElement btn_gamename;
	
	@FindBy(xpath = "//*[@class=\"svg dt landscape\"]")
	WebElement btn_soundoff;
	
	@FindBy(xpath = "(//*[@class='btn-new__text'])[1]")
	WebElement btn_slot_playnow;
	
	@FindBy(xpath = "//*[@class=\"text help-screen_button dt landscape\"]")
	WebElement btn_gamecontinue;
	
	@FindBy(xpath = "(//*[@class=\"close game-close\"])[1]")
	WebElement btn_gameclose;
	
	//profile
	
	@FindBy(xpath = "//*[text()=\"My Account\"]")
	WebElement btn_myaccount;
	
	@FindBy(xpath = "//*[text()=\"- Profile\"]")
	WebElement btn_profile;
	
	@FindBy(xpath = "//*[@id=\"enter_verifycodesend_div\"]")
	WebElement btn_email_verify01;
	
	@FindBy(xpath = "//*[@id=\"user_verify_code\"]")
	WebElement txt_emailverifycode;
	
	@FindBy(xpath = "//*[@id=\"verify_code\"]")
	WebElement btn_email_verify02;
	
	
	@FindBy(xpath = "//*[@id=\"send_otp\"]")
	WebElement btn_mobile_verify01;
	
	@FindBy(xpath = "//*[@id=\"user_otp_no\"]")
	WebElement txt_mobileverifycode;
	
	@FindBy(xpath = "//*[@id=\"verify_otp\"]")
	WebElement btn_mobile_verify02;
	
	@FindBy(xpath = "//*[text()=\"Submit\"]")
	WebElement btn_profile_submit;
	
	@FindBy(id = "address")
	WebElement txt_profile_address;
	
	@FindBy(id = "cityId")
	WebElement txt_profile_city;
	
	//KYC
	
	@FindBy(xpath = "//*[text()=\"- Verify Account(KYC)\"]")
	WebElement btn_kyc_menu;
	
	@FindBy(id = "proof")
	WebElement btn_kyc_select_proof;
	
	@FindBy(id = "document_number")
	WebElement txt_document_number_kyc;
	
	@FindBy(id = "address")
	WebElement txt_address_kyc;
	
	@FindBy(id = "cityId")
	WebElement txt_city_kyc;
	
	@FindBy(id = "userfile")
	WebElement front_image_kyc;
	
	@FindBy(id = "userfile1")
	WebElement back_image_kyc;
	
	@FindBy(id = "doc_submit")
	WebElement btn_submit_id_kyc;
	
	@FindBy(id = "acc_no")
	WebElement txt_account_no_bank;
	
	@FindBy(id = "bank_name")
	WebElement txt_bankname;
	
	@FindBy(id = "acc_holder_name")
	WebElement txt_acc_holder_name;
	
	@FindBy(id = "branch_name")
	WebElement txt_branch_name;
	
	@FindBy(id = "add_acc")
	WebElement btn_add_bank;
	
	@FindBy(id = "profile_error_msg")
	WebElement verify_kyc;
	
	//Change Password Locators
	
		@FindBy(xpath = "//*[text()=\"- Settings\"]")
		WebElement btn_settings;
		
		@FindBy(id = "nav-id4")
		WebElement btn_changepassword_menu;
		
		@FindBy(id = "current_password")
		WebElement txt_current_password;
		
		@FindBy(id = "new_password")
		WebElement txt_new_password;
		
		@FindBy(id = "confirm_password")
		WebElement txt_confirm_password;
		
		@FindBy(id = "change_pass_btn")
		WebElement btn_submit_change_password;
		
		@FindBy(xpath = "//*[contains(text(),'Password changed successfully')]")
		WebElement txt_verify_change_password_success;
		
		//Forgot Password Locators 
		
		@FindBy(xpath = "//*[contains(text(),'Forgot Password?')]")
		WebElement btn_forgot_password;
		
		@FindBy(id = "user_email_mobile")
		WebElement txt_email_forgot_password;
		
		@FindBy(id = "submit_forgotpassword")
		WebElement btn_submit_forgot_password;
		
		@FindBy(xpath = "//*[contains(text(),'Please check your email for the password reset link.')]")
		WebElement txt_forgot_password_mailsent_msg;
		
		@FindBy(xpath = "//*[contains(text(),'Sign in')]")
		WebElement btn_signup_gmail;
		
		@FindBy(id = "identifierId")
		WebElement txt_email_gmail;
		
		@FindBy(xpath = "//*[contains(text(),'Next')]")
		WebElement btn_next_gmail;
		
		@FindBy(xpath = "//*[@id='password']")
		WebElement txt_password_gmail;

		@FindBy(xpath = "//span[@email='support@betbarter.com' and @name='support']")
		WebElement btn_open_mail;
		
		@FindBy(xpath = "//a[contains(text(), 'Change Password')]")
		WebElement btn_link_gmail;
		
		@FindBy(id = "newpassword")
		WebElement txt_newpassword_frgt;
		
		@FindBy(id = "confirmpassword")
		WebElement txt_confirmpassword_frgt;
		
		@FindBy(id = "submit_forgotpassword")
		WebElement btn_submit_frgtpass;
		
		@FindBy(xpath = "//*[contains(text(),'Password updated successfully.')]")
		WebElement txt_frgtpassword_success;
		
		//Footer Validation locators
		
		@FindBy(xpath = "//span[contains(text(),'About Us')]")
		WebElement btn_about_us;
		
		@FindBy(xpath = "//*[contains(text(),'Pokerbet is one of the upcoming providers for online gaming entertainment across Sports Betting, Online and Live Casino operating in the emerging and the regulated markets.')]")
		WebElement txt_aboutus_success;
		
		@FindBy(xpath = "(//span[contains(text(),'Payment Methods')])[1]")
		WebElement btn_payment_methods;
		
		@FindBy(xpath = "//*[contains(text(),'Deposit Now')]")
		WebElement txt_paymentmethods_success;
		
		@FindBy(xpath = "(//span[contains(text(),'Sportsbook Rules')])[1]")
		WebElement btn_sportsbook_rules;
		
		@FindBy(xpath = "//*[contains(text(),'1. Introduction')]")
		WebElement txt_sportsbookrules_success;
		
		@FindBy(xpath = "//a[normalize-space()='Glossary']")
		WebElement btn_glossary;
		
		@FindBy(xpath = "//*[contains(text(),'Sports Markets Glossary')]")
		WebElement txt_glossary_success;
		
		@FindBy(xpath = "(//span[contains(text(),'Affiliates')])[1]")
		WebElement btn_affiliates;
		
		@FindBy(xpath = "//*[contains(text(),'Interested in becoming an affiliate?')]")
		WebElement txt_affiliates_success;
		
		
		@FindBy(xpath = "//img[@src='https://skyinfopartners.com/wp-content/plugins/popup-builder/public/img/theme_1/close.png']")
		WebElement clk_affiliates_popup;
		
		
		@FindBy(xpath = "(//span[contains(text(),'T&C')])[1]")
		WebElement btn_terms_conditions;
		
		@FindBy(xpath = "//span[normalize-space()='Terms & Conditions']")
		WebElement txt_termsconditions_success;
		
		@FindBy(xpath = "(//span[contains(text(),'FAQs')])[1]")
		WebElement btn_faqs;
		
		@FindBy(xpath = "(//div[@class='text-container'])[1]")
		WebElement txt_faqs_success;
		
		@FindBy(xpath = "(//span[contains(text(),'Privacy Policy')])[1]")
		WebElement btn_privacy_policy;
		
		@FindBy(xpath = "//*[contains(text(),'Privacy Policy')]")
		WebElement txt_privacypolicy_success;
		
		@FindBy(xpath = "//*[text()=\"Responsible Gaming\"]")
		WebElement btn_responsible_gambling;
		
		@FindBy(xpath = "//span[normalize-space()='Responsible Gaming']")
		WebElement txt_responsiblegambling_success;
		
		@FindBy(xpath = "(//span[contains(text(),'Exchange Rules')])[1]")
		WebElement btn_exchange_rules;
		
		@FindBy(xpath = "//*[contains(text(),'1. Introduction')]")
		WebElement txt_exchange_rules_success;
		
		@FindBy(xpath = "//a[normalize-space()='KYC Policy']")
		WebElement btn_kyc_policy;
		
		@FindBy(xpath = "//span[normalize-space()='Know Your Customer Policy']")
		WebElement txt_kyc_policy;
		
		@FindBy(xpath = "//a[normalize-space()='Self-Exclusion Policy']")
		WebElement btn_self_exclusion;
		
		@FindBy(xpath = "//p[contains(text(),'If you feel you are at risk of developing a gambli')]")
		WebElement txt_self_exclusion;
		
		//History
		
		@FindBy(xpath = "//img[@src=\"https://pbqa.digient.co/assets/images/menu-icons/ic-transfer.svg\"]")
		WebElement btn_transaction_drpdown;
		
		@FindBy(xpath = "(//a[normalize-space()='- All Transaction'])[1]")
		WebElement btn_all_transaction;
		
		@FindBy(xpath = "(//a[@class='nav-link'])[3]")
		WebElement btn_game_history;
		
		@FindBy(xpath = "(//td[@class='success'])[1]")
		WebElement txt_bet_trans_verify;
		
		@FindBy(xpath = "(//td[@data-content='Payout'])[1]")
		WebElement txt_game_hist_verify;
	
	public Registerpages(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void click_signup()
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btn_signup);
		wait.until(ExpectedConditions.elementToBeClickable(btn_signup));
		btn_signup.click();
	}
	
	public void click_bannerclose()
	{
		WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.elementToBeClickable(btn_bannerclose));
        btn_bannerclose.click();
	}
	public void click_accept_cookies()
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btn_signup);
		wait.until(ExpectedConditions.elementToBeClickable(btn_cookies));
		btn_cookies.click();
	}
	
	
	
	public void enter_name(String name)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElements(txt_firstname));
        txt_firstname.sendKeys(name);
	}
	
	public void enter_surname(String surname)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElements(txt_surname));
		txt_surname.sendKeys(surname);
	}

	public void enter_username(String username)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElements(txt_username));
		txt_username.sendKeys(username);
	}
	
	public void enter_email(String email)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElements(txt_email));
        txt_email.sendKeys(email);
	}
	public void click_nextbutton()
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btn_signup);
		wait.until(ExpectedConditions.elementToBeClickable(btn_next));
		btn_next.click();
	}
	public void select_sourceofincome(String passport)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElements(txt_passport));
        txt_passport.sendKeys(passport);
	}
	
	public void enter_passport(String passport)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElements(txt_passport));
        txt_passport.sendKeys(passport);
	}
	
	public void select_country()
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(drp_country));
		//drpdwn_gender.click();
        Select select1 = new Select(drp_country);
		select1.selectByVisibleText("South Africa");
	}
	public void select_source_of_income()
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(drp_source_of_income));
		//drpdwn_gender.click();
        Select select1 = new Select(drp_source_of_income);
		select1.selectByVisibleText("Salary");
	}
	
	public void enter_mobileno(String mobnum)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElements(txt_mobileno));
		txt_mobileno.sendKeys(mobnum);
	}
	
	public void enter_password(String password)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElements(txt_password));
        txt_password.sendKeys(password);
	}
	public void enter_cpassword(String password)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElements(txt_cpassword));
        txt_cpassword.sendKeys(password);
	}
	
	public void click_register_button()
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btn_signup);
		wait.until(ExpectedConditions.elementToBeClickable(btn_register));
		btn_register.click();
	}

	public void click_age_cnfm() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btn_signup);
		wait.until(ExpectedConditions.elementToBeClickable(btn_agetickbox));
		btn_agetickbox.click();
	}
	
	public void click_promopopup()
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btn_signup);
		wait.until(ExpectedConditions.elementToBeClickable(btn_promopopup));
		btn_promopopup.click();
	}
	
	public void click_homebutton() throws Throwable {
	    WebDriverWait wait = new WebDriverWait(driver, 10);
	    boolean clicked = false;

	    while (!clicked) {
	        try {
	            // Wait for the modal to be invisible
	            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("login-popup")));

	            // Re-locate the element
	            WebElement btn_homepage = wait.until(ExpectedConditions.elementToBeClickable(
	                By.xpath("//*[@src='https://pbqa.digient.co/assets/images/ic-hamburger.svg']")
	            ));
	            
	            // Click the button using JavaScript to avoid click interception issues
	            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", btn_homepage);
	            clicked = true; // Set flag to exit the loop
	        } catch (StaleElementReferenceException e) {
	            // If a StaleElementReferenceException is thrown, it means the element reference has changed
	            System.out.println("StaleElementReferenceException caught, retrying...");
	            // Optionally add a sleep here if needed
	            Thread.sleep(1000); // Adjust sleep time as necessary
	        } catch (Exception e) {
	            e.printStackTrace();
	            break; // Exit the loop for other exceptions
	        }
	    }
	}




	
	public void click_logout_button()
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btn_signup);
		wait.until(ExpectedConditions.elementToBeClickable(btn_logout));
		btn_logout.click();
	}
	
	//login
	
	public void enter_username_login (String username)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElements(txtlogin_username));
        txtlogin_username.sendKeys(username);
	}
	
	public void enter_password_login (String password)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElements(txtlogin_password));
        txtlogin_password.sendKeys(password);
	}
	
	public void click_logincheck()
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btn_signup);
		wait.until(ExpectedConditions.elementToBeClickable(btn_logincheck));
		btn_logincheck.click();
	}
	
	public void click_login_button() {
	    WebDriverWait wait = new WebDriverWait(driver, 10);

	    try {
	        // Wait for the login button to be clickable
	        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(btn_login));
	        
	        // Scroll into view if necessary
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", loginButton);
	        
	        // Click the login button
	        loginButton.click();
	    } catch (Exception e) {
	        System.out.println("An error occurred while clicking the login button.");
	        e.printStackTrace();
	    }
	}


	public void click_logoutbutton_two()
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btn_signup);
		wait.until(ExpectedConditions.elementToBeClickable(btn_logouttwo));
		btn_logouttwo.click();
	}
	
	//gameplay
	
	public void clickOnCasinoPage() {
	    try {
	        btn_casino_page.click();
	    } catch (StaleElementReferenceException e) {
	        // Re-locate the element and click again
	        btn_casino_page = driver.findElement(By.xpath("(//*[@title=\"casino\"])[1]"));
	        btn_casino_page.click();
	    }
	}


	
	public void enter_casino_search() throws Throwable
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(txt_search_slot));
		String gamename = UserPropertiesReader.gamename();
        txt_search_slot.sendKeys(gamename);
		Thread.sleep(3000);
	}
	
	public void click_gamename() {
	    try {
	        btn_gamename.click();
	    } catch (StaleElementReferenceException e) {
	        // Re-locate the element and click again
	    	
	    	
	    	btn_gamename = driver.findElement(By.xpath("//*[@alt=\"Dice Twice - Cassino - Pokerbet\"]"));
	    			
	    	btn_gamename.click();
	    }
	}
	
	public void click_game_soundoff() {
	    try {
	        // Switch to the iframe containing the element
	        driver.switchTo().frame("game-iframe");

	        WebDriverWait wait = new WebDriverWait(driver, 240);
	        // Wait for the element to be clickable
	        WebElement soundOffButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='svg dt landscape'])[2]"))); // Update the XPath accordingly
	        soundOffButton.click();
	        
	        // Optionally switch back to default content if needed
	        driver.switchTo().defaultContent();
	    } catch (NoSuchElementException e) {
	        System.out.println("Element not found: " + e.getMessage());
	    } catch (Exception e) {
	        System.out.println("An unexpected error occurred: " + e.getMessage());
	    }
	}

	public void click_game_continue() {
	    try {
	        // Switch to the iframe containing the element
	        driver.switchTo().frame("game-iframe");

	        WebDriverWait wait = new WebDriverWait(driver, 240);
	        // Wait for the element to be visible and clickable
	        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class=\"sound-loader play-icon\"]")));
	        wait.until(ExpectedConditions.elementToBeClickable(element));
	        element.click();

	        // Switch back to the default content after interacting with the element
	        driver.switchTo().defaultContent();
	    } catch (NoSuchElementException e) {
	        System.out.println("Element not found: " + e.getMessage());
	    } catch (Exception e) {
	        System.out.println("An unexpected error occurred: " + e.getMessage());
	    }
	}


	public void click_game_spin() throws Throwable {
	    try {
	        // Switch to the iframe containing the element
	        driver.switchTo().frame("game-iframe");

	        WebDriverWait wait = new WebDriverWait(driver, 10);

	        // Scroll the button into view using JavaScript
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btn_slot_playnow);

	        // Wait until the button is clickable
	        wait.until(ExpectedConditions.elementToBeClickable(btn_slot_playnow));

	        // Click the button
	        btn_slot_playnow.click();

	        // Optionally switch back to the default content if needed
	        driver.switchTo().defaultContent();
	    } catch (NoSuchElementException e) {
	        System.out.println("Element not found: " + e.getMessage());
	    } catch (Exception e) {
	        System.out.println("An unexpected error occurred: " + e.getMessage());
	    }
	}

	public void click_gameclose()
	{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(btn_gameclose));
        btn_gameclose.click();
	}
	
	//profile
	
	public void click_myaccount()
	{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(btn_myaccount));
        btn_myaccount.click();
	}
	
	public void click_profile()
	{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(btn_profile));
        btn_profile.click();
	}
	
	public void click_emailverify01()
	{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(btn_email_verify01));
        btn_email_verify01.click();
	}
	
	public void enter_emailcode()
	{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(txt_emailverifycode));
        btn_email_verify01.click();
	}
	
	public void click_emailverify02()
	{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(btn_email_verify02));
        btn_email_verify02.click();
	}
	
	public void click_mobileverify01()
	{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(btn_mobile_verify01));
        btn_mobile_verify01.click();
	}
	
	public void enter_mobilecode()
	{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(txt_mobileverifycode));
        txt_mobileverifycode.click();
	}
	
	public void click_mobileverify02()
	{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(btn_mobile_verify02));
        btn_mobile_verify02.click();
	}
	
	public void click_profile_submit()
	{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(btn_profile_submit));
        btn_profile_submit.click();
	}
	
	public void click_profile_address(String address)
	{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(txt_profile_address));
        txt_profile_address.sendKeys(address);
	}
	
	public void click_profile_city(String city)
	{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(txt_profile_city));
        txt_profile_city.sendKeys(city);
	}

	
	//KYC
	public void click_kyc()
	{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(btn_kyc_menu));
        btn_kyc_menu.click();
	}
	public void select_proof_of_identity()
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(btn_kyc_select_proof));
		//drpdwn_gender.click();
        Select select1 = new Select(btn_kyc_select_proof);
		select1.selectByVisibleText("Passport");
	}
	
	public void enter_kyc_document_number(String documentno)
	{
		 // Wait until the document number input element is clickable
	    WebDriverWait wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.elementToBeClickable(txt_document_number_kyc));

	    // Create a JavascriptExecutor instance
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    
	    // Set the value of the document number input element to the provided document number
	    String script = "arguments[0].value = '" + documentno + "'";
	    js.executeScript(script, txt_document_number_kyc);
	}

	public void enter_kyc_address(String address)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElements(txt_address_kyc));
        txt_address_kyc.sendKeys(address);
	}
	
	public void enter_kyc_city(String city)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElements(txt_city_kyc));
        txt_city_kyc.sendKeys(city);
	}
	
	public void upload_front_img_kyc() throws Throwable {
	    WebDriverWait wait = new WebDriverWait(driver, 10);
	    String absolutePath = System.getProperty("user.dir") + "\\src\\test\\resources\\sample images\\image.jpg";
	    front_image_kyc.sendKeys(absolutePath);
	}

	public void upload_back_img_kyc() throws Throwable {
	    WebDriverWait wait = new WebDriverWait(driver, 10);
	    String absolutePath = System.getProperty("user.dir") + "\\src\\test\\resources\\sample images\\image.jpg";
	    back_image_kyc.sendKeys(absolutePath);
	}
	
	public void click_kyc_submitID()
	{
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btn_submit_id_kyc);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", btn_submit_id_kyc);
        
       
	}
	
	public void enter_account_no(String accountno) {
	    // Scroll the element into view
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txt_account_no_bank);
	    
	    // Wait until the element is clickable
	    WebDriverWait wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.elementToBeClickable(txt_account_no_bank));
	    
	    // Send the account number to the element
	    txt_account_no_bank.sendKeys(accountno);
	}


	public void select_bank_name()
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(txt_bankname));
		//drpdwn_gender.click();
        Select select1 = new Select(txt_bankname);
		select1.selectByVisibleText("African Bank");
	}
	
	public void enter_account_holder_name(String holdername)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElements(txt_acc_holder_name));
        txt_acc_holder_name.sendKeys(holdername);
	}
	public void enter_branch_name(String branchname)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElements(txt_branch_name));
        txt_branch_name.sendKeys(branchname);
	}
	public void click_add_bank_button()
	{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(btn_add_bank));
        btn_add_bank.click();
	}
	
	public void verify_kyc_success()
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
	    wait.until(ExpectedConditions.visibilityOf(verify_kyc));
	    Assert.assertTrue(verify_kyc.isDisplayed());
	}
	
	//Change Password Functionality Methods
	
		public void click_settings()
		{
			WebDriverWait wait = new WebDriverWait(driver, 10);
	        wait.until(ExpectedConditions.elementToBeClickable(btn_settings));
	        btn_settings.click();
		}
		
		public void click_changepassword_menu()
		{
			WebDriverWait wait = new WebDriverWait(driver, 10);
	        wait.until(ExpectedConditions.elementToBeClickable(btn_changepassword_menu));
	        btn_changepassword_menu.click();
		}
		
		public void enter_current_password()
		{
			WebDriverWait wait = new WebDriverWait(driver, 10);
	        wait.until(ExpectedConditions.elementToBeClickable(txt_current_password));
	        txt_current_password.sendKeys("Test@123");
		}
		
		public void enter_new_password()
		{
			WebDriverWait wait = new WebDriverWait(driver, 10);
	        wait.until(ExpectedConditions.elementToBeClickable(txt_new_password));
	        txt_new_password.sendKeys("Test@1234");
		}
		
		public void enter_confirm_password()
		{
			WebDriverWait wait = new WebDriverWait(driver, 10);
	        wait.until(ExpectedConditions.elementToBeClickable(txt_confirm_password));
	        txt_confirm_password.sendKeys("Test@1234");
		}
		
		public void click_submit_change_password() {
		    // Scroll the element into view
		    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btn_submit_change_password);

		    // Wait until the element is clickable
		    WebDriverWait wait = new WebDriverWait(driver, 10);
		    wait.until(ExpectedConditions.elementToBeClickable(btn_submit_change_password));

		    // Click the element
		    btn_submit_change_password.click();
		}

		
		public void verify_changepassword_success()
		{
			WebDriverWait wait = new WebDriverWait(driver, 20);
		    wait.until(ExpectedConditions.visibilityOf(txt_verify_change_password_success));
		    Assert.assertTrue(txt_verify_change_password_success.isDisplayed());
		}
		
		//Forgot Password Functionality Methods
		
		public void click_forgot_password()
		{
			WebDriverWait wait = new WebDriverWait(driver, 10);
	        wait.until(ExpectedConditions.elementToBeClickable(btn_forgot_password));
	        btn_forgot_password.click();
		}
		
		public void enter_emailID_forgotpassword(String email)
		{
			WebDriverWait wait = new WebDriverWait(driver, 10);
	        wait.until(ExpectedConditions.elementToBeClickable(txt_email_forgot_password));
	        txt_email_forgot_password.sendKeys(email);
		}
		
		
		public void click_submit_forgot_password()
		{
			WebDriverWait wait = new WebDriverWait(driver, 10);
	        wait.until(ExpectedConditions.elementToBeClickable(btn_submit_forgot_password));
	        btn_submit_forgot_password.click();
		}
		
		public void verify_forgotpassword_mailsent()
		{
			WebDriverWait wait = new WebDriverWait(driver, 20);
		    wait.until(ExpectedConditions.visibilityOf(txt_forgot_password_mailsent_msg));
		    Assert.assertTrue(txt_forgot_password_mailsent_msg.isDisplayed());
		}
		
		public void click_signup_gmail()
		{
			WebDriverWait wait = new WebDriverWait(driver, 10);
	        wait.until(ExpectedConditions.elementToBeClickable(btn_signup_gmail));
	        btn_signup_gmail.click();
		}
		
		public void enter_emailID_gmail(String email)
		{
			WebDriverWait wait = new WebDriverWait(driver, 10);
	        wait.until(ExpectedConditions.elementToBeClickable(txt_email_gmail));
	        txt_email_gmail.sendKeys(email);
		}
		
		public void click_next_gmail()
		{
			WebDriverWait wait = new WebDriverWait(driver, 10);
	        wait.until(ExpectedConditions.elementToBeClickable(btn_next_gmail));
			btn_next_gmail.click();
		}
		
		public void enter_password_gmail(String password) {
		    WebDriverWait wait = new WebDriverWait(driver, 10);
		    
		    // Wait for the password field to be visible and clickable
		    wait.until(ExpectedConditions.visibilityOf(txt_password_gmail));
		    wait.until(ExpectedConditions.elementToBeClickable(txt_password_gmail));
		    
		    // Scroll to the password field and click using JavaScript
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("arguments[0].scrollIntoView(true);", txt_password_gmail);
		    js.executeScript("arguments[0].click();", txt_password_gmail);
		    
		    // Send the password
		    txt_password_gmail.sendKeys(password);
		    
		    System.out.println("Password entered successfully.");
		}


		
		public void open_mail_gmail() throws InterruptedException {
			//WebDriverWait wait = new WebDriverWait(driver, 10);
	        //wait.until(ExpectedConditions.elementToBeClickable(btn_open_mail));
			Thread.sleep(10000);
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", btn_open_mail);
		}

		public void click_on_link_gmail()
		{
			WebDriverWait wait = new WebDriverWait(driver, 10);
	        wait.until(ExpectedConditions.elementToBeClickable(btn_link_gmail));
	        btn_link_gmail.click();
		}
		
		public void enter_newpass_frgt()
		{
			WebDriverWait wait = new WebDriverWait(driver, 10);
	        wait.until(ExpectedConditions.elementToBeClickable(txt_newpassword_frgt));
	        txt_newpassword_frgt.sendKeys("Test@123");
		}
		
		public void enter_confirmpass_frgt()
		{
			WebDriverWait wait = new WebDriverWait(driver, 10);
	        wait.until(ExpectedConditions.elementToBeClickable(txt_confirmpassword_frgt));
	        txt_confirmpassword_frgt.sendKeys("Test@123");
		}
		
		public void click_on_submit_frgt()
		{
			WebDriverWait wait = new WebDriverWait(driver, 10);
	        wait.until(ExpectedConditions.elementToBeClickable(btn_submit_frgtpass));
	        btn_submit_frgtpass.click();
		}
		
		public void verify_forgotpassword_success()
		{
			WebDriverWait wait = new WebDriverWait(driver, 20);
		    wait.until(ExpectedConditions.visibilityOf(txt_frgtpassword_success));
		    Assert.assertTrue(txt_frgtpassword_success.isDisplayed());
		}
		//Footer Validation Methods
		
		public void open_aboutus_footer()
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btn_about_us);
	        wait.until(ExpectedConditions.elementToBeClickable(btn_about_us));
	        JavascriptExecutor executor = (JavascriptExecutor) driver;
	        executor.executeScript("arguments[0].click();", btn_about_us);
	        
		}
		
		public void verify_aboutus_success()
		{
			WebDriverWait wait = new WebDriverWait(driver, 20);
		    wait.until(ExpectedConditions.visibilityOf(txt_aboutus_success));
		    Assert.assertTrue(txt_aboutus_success.isDisplayed());
		}
		
		public void open_paymentmethods_footer() throws Throwable
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btn_payment_methods);
			wait.until(ExpectedConditions.elementToBeClickable(btn_payment_methods));
			JavascriptExecutor executor = (JavascriptExecutor) driver;
	        executor.executeScript("arguments[0].click();", btn_payment_methods);
	        
		}
		
		public void verify_paymentmethods_success()
		{
			WebDriverWait wait = new WebDriverWait(driver, 20);
		    wait.until(ExpectedConditions.visibilityOf(txt_paymentmethods_success));
		    Assert.assertTrue(txt_paymentmethods_success.isDisplayed());
		}
		
		
		public void open_sportsbookrules_footer()
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btn_sportsbook_rules);
	        wait.until(ExpectedConditions.elementToBeClickable(btn_sportsbook_rules));
	        JavascriptExecutor executor = (JavascriptExecutor) driver;
	        executor.executeScript("arguments[0].click();", btn_sportsbook_rules);
	        
		}
		
		public void verify_sportsbookrules_success()
		{
			WebDriverWait wait = new WebDriverWait(driver, 20);
		    wait.until(ExpectedConditions.visibilityOf(txt_sportsbookrules_success));
		    Assert.assertTrue(txt_sportsbookrules_success.isDisplayed());
		}
		
		public void open_termscond_footer()
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btn_terms_conditions);
	        wait.until(ExpectedConditions.elementToBeClickable(btn_terms_conditions));
	        JavascriptExecutor executor = (JavascriptExecutor) driver;
	        executor.executeScript("arguments[0].click();", btn_terms_conditions);
	        
		}
		
		public void verify_termscond_success()
		{
			WebDriverWait wait = new WebDriverWait(driver, 20);
		    wait.until(ExpectedConditions.visibilityOf(txt_termsconditions_success));
		    Assert.assertTrue(txt_termsconditions_success.isDisplayed());
		}
		
		public void open_faqs_footer()
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btn_faqs);
	        wait.until(ExpectedConditions.elementToBeClickable(btn_faqs));
	        JavascriptExecutor executor = (JavascriptExecutor) driver;
	        executor.executeScript("arguments[0].click();", btn_faqs);
	        
		}
		
		public void verify_faqs_success()
		{
			WebDriverWait wait = new WebDriverWait(driver, 20);
		    wait.until(ExpectedConditions.visibilityOf(txt_faqs_success));
		    Assert.assertTrue(txt_faqs_success.isDisplayed());
		}
		
		public void open_privacy_policy_footer()
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btn_privacy_policy);
	        wait.until(ExpectedConditions.elementToBeClickable(btn_privacy_policy));
	        JavascriptExecutor executor = (JavascriptExecutor) driver;
	        executor.executeScript("arguments[0].click();", btn_privacy_policy);
	        
		}
		
		public void verify_privacy_policy_success()
		{
			WebDriverWait wait = new WebDriverWait(driver, 20);
		    wait.until(ExpectedConditions.visibilityOf(txt_privacypolicy_success));
		    Assert.assertTrue(txt_privacypolicy_success.isDisplayed());
		}
		
		public void open_responsible_gambling_page_footer() {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btn_responsible_gambling);
	        wait.until(ExpectedConditions.elementToBeClickable(btn_responsible_gambling));
	        JavascriptExecutor executor = (JavascriptExecutor) driver;
	        executor.executeScript("arguments[0].click();", btn_responsible_gambling);
	        
		}
		
		public void verify_responsible_gambling_page_footer() {
			WebDriverWait wait = new WebDriverWait(driver, 20);
		    wait.until(ExpectedConditions.visibilityOf(txt_responsiblegambling_success));
		    Assert.assertTrue(txt_responsiblegambling_success.isDisplayed());
		}
		
		public void open_exchange_rules_footer()
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btn_exchange_rules);
	        wait.until(ExpectedConditions.elementToBeClickable(btn_exchange_rules));
	        JavascriptExecutor executor = (JavascriptExecutor) driver;
	        executor.executeScript("arguments[0].click();", btn_exchange_rules);
	        
		}
		
		public void verify_exchange_rules_success()
		{
			WebDriverWait wait = new WebDriverWait(driver, 20);
		    wait.until(ExpectedConditions.visibilityOf(txt_exchange_rules_success));
		    Assert.assertTrue(txt_exchange_rules_success.isDisplayed());
		}
		
		public void open_glossary_page_footer() 
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btn_glossary);
		        wait.until(ExpectedConditions.elementToBeClickable(btn_glossary));
		        JavascriptExecutor executor = (JavascriptExecutor) driver;
		        executor.executeScript("arguments[0].click();", btn_glossary);
			}
			
		public void verify_glossary_footer()
		{
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(txt_glossary_success));
			Assert.assertTrue(txt_glossary_success.isDisplayed());
		}
		
		
		public void open_affiliates_page_footer() 
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btn_affiliates);
		        wait.until(ExpectedConditions.elementToBeClickable(btn_affiliates));
		        JavascriptExecutor executor = (JavascriptExecutor) driver;
		        executor.executeScript("arguments[0].click();", btn_affiliates);
			}
			
		public void verify_affiliates_page_footer() throws Throwable {
		        WebDriverWait wait = new WebDriverWait(driver, 20);

		        // Store the initial window handle
		        String mainWindowHandle = driver.getWindowHandle();
		        //open_affiliates_page_footer();
		        Set<String> windowHandles = driver.getWindowHandles();
		        windowHandles.remove(mainWindowHandle);
		        String newWindowHandle = windowHandles.iterator().next();
		        driver.switchTo().window(newWindowHandle);
		        Thread.sleep(5000);
		        driver.close();
		        // Switch back to the main window
		        driver.switchTo().window(mainWindowHandle);
			//driver.switchTo().alert().dismiss();
			//wait.until(ExpectedConditions.visibilityOf(txt_affiliates_success));
			//Assert.assertTrue(txt_affiliates_success.isDisplayed());
		}
		
		//History Page Methods
		
		
		public void click_transaction_drpdown()
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
	        wait.until(ExpectedConditions.elementToBeClickable(btn_transaction_drpdown));
	        btn_transaction_drpdown.click();
	        
		}
		
		public void click_all_transactions()
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
	        wait.until(ExpectedConditions.elementToBeClickable(btn_all_transaction));
	        btn_all_transaction.click();
	        
		}
		
		public void verify_all_trans_page() {
		    // WebDriverWait with a timeout of 20 seconds
		    WebDriverWait wait = new WebDriverWait(driver, 20);

		    // Wait until the element is visible
		    WebElement betTransElement = wait.until(ExpectedConditions.visibilityOf(txt_bet_trans_verify));
		    
		    // Scroll the page to bring the element into view
		    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", betTransElement);
		    
		    // Verify the element is displayed
		    Assert.assertTrue(betTransElement.isDisplayed());
		}

		public void click_game_history() throws InterruptedException {
		    // WebDriverWait with a timeout of 30 seconds
		    WebDriverWait wait = new WebDriverWait(driver, 30);
		    
		    // Wait until the button is clickable
		    WebElement gameHistoryButton = wait.until(ExpectedConditions.elementToBeClickable(btn_game_history));
		    
		    // Scroll the page up to bring the button into view
		    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", gameHistoryButton);
		    
		    // Optional: Small pause to ensure the element is fully in view
		    Thread.sleep(500); // Adjust time if necessary
		    
		    // Attempt to click the button
		    try {
		        gameHistoryButton.click();
		    } catch (ElementClickInterceptedException e) {
		        // If click is intercepted, use JavaScript to click
		        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", gameHistoryButton);
		    }
		}


		
		public void verify_game_hist_page() {
		    // WebDriverWait with a timeout of 20 seconds
		    WebDriverWait wait = new WebDriverWait(driver, 20); // Use this if Duration.ofSeconds() causes an error
		    
		    // Wait until the element is visible
		    WebElement gameHistElement = wait.until(ExpectedConditions.visibilityOf(txt_game_hist_verify));
		    
		    // Scroll the page to bring the element into view
		    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", gameHistElement);
		    
		    // Verify the element is displayed
		    Assert.assertTrue(gameHistElement.isDisplayed());
		}



		
}