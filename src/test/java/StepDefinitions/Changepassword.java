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

public class Changepassword {
	private WebDriver driver;
	private Registerpages register;

	@Given("Open Site password")
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
		} catch (Exception e1) {
			e1.getMessage();
			e1.printStackTrace();
			Thread.sleep(1000);
			ExtentTestManager.logFail("Open pokerbet Site", driver);
		}
	}

	@And("close cookies password")
	public void close_cookies_register() throws Throwable {
		try {
			register = new Registerpages(driver);
			register.click_accept_cookies();
			System.out.println("Accept Cookies is closed!");
			Thread.sleep(1000);
			ExtentTestManager.logInfo("Close Cookies");
		} catch (Exception e2) {
			e2.getMessage();
			e2.printStackTrace();
			Thread.sleep(1000);
			ExtentTestManager.logInfo("Close Cookies");
		}
	}

	@And("Click on login button password")
	public void click_on_login_button_for_password() throws Throwable {
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

	@And("Enter username for login password {string}")
	public void login_enter_username1_password(String username) throws Throwable {
		try {
			register = new Registerpages(driver);
			String actualUsername = UserPropertiesReader.getUsername1();
			register.enter_username_login(actualUsername);
			System.out.println("Username is entered - New User!");
			Thread.sleep(1000);
			ExtentTestManager.logInfo("Enter Username - New User");
		} catch (Exception e4) {
			e4.getMessage();
			e4.printStackTrace();
			Thread.sleep(1000);
			ExtentTestManager.logFail("Enter Username - New User", driver);
		}
	}

	@And("^Enter login password password (.*)$")
	public void login_enter_password1_password(String password) throws Throwable {
		try {
			register.enter_password_login(password);
			System.out.println("Password is entered - New User!");
			Thread.sleep(1000);
			ExtentTestManager.logInfo("Enter Password - New User");
		} catch (Exception e6) {
			e6.getMessage();
			e6.printStackTrace();
			Thread.sleep(1000);
			ExtentTestManager.logFail("Enter Password - New User", driver);
		}
	}

	@And("Click on login submit password")
	public void login_click_on_submit1_button_password() throws Throwable {
		try {

			register.click_logincheck();
			System.out.println("Submit Button is clicked!");
			ExtentTestManager.logInfo("Click Submit");
		} catch (Exception e9) {
			e9.getMessage();
			e9.printStackTrace();
			Thread.sleep(1000);
			ExtentTestManager.logFail("Click Submit", driver);
		}
	}

	@And("close promo pop up password")
	public void close_promo_popup_password() throws Throwable {
		try {
			
			register.click_promopopup();
			System.out.println("promo pop up is closed!");
			ExtentTestManager.logInfo("Close promo pop up");
		} catch (Exception e9) {
			e9.getMessage();
			e9.printStackTrace();
			Thread.sleep(1000);
			ExtentTestManager.logInfo("Close promo pop up");
		}
	}

	@And("close banners password")
	public void close_banners_password() throws Throwable {
		try {

			register.click_bannerclose();
			System.out.println("Hamburger Menu is opened!");
			ExtentTestManager.logInfo("Open Hamburger Menu");
		} catch (Exception e9) {
			e9.getMessage();
			e9.printStackTrace();
			Thread.sleep(1000);
			ExtentTestManager.logFail("Open Hamburger Menu", driver);
		}

	}

	@And("Click on Hamburger menu password")
	public void click_on_hamburger_menu_password() throws Throwable {

		try {

			register.click_homebutton();
			System.out.println("Hamburger Menu is opened!");
			ExtentTestManager.logInfo("Open Hamburger Menu");
		} catch (Exception e9) {
			e9.getMessage();
			e9.printStackTrace();
			Thread.sleep(1000);
			ExtentTestManager.logFail("Open Hamburger Menu", driver);
		}

	}

	@And("Click on my account dropdown password")
	public void open_myacc_drpdown_password() throws Throwable {
		try {

			register.click_myaccount();
			System.out.println("My Account dropdown is clicked!");
			ExtentTestManager.logInfo("Open My Account dropdown");
		} catch (Exception e9) {
			e9.getMessage();
			e9.printStackTrace();
			Thread.sleep(1000);
			ExtentTestManager.logFail("Open My Account dropdown", driver);
		}
	}

	@And("Click on settings in dropdown password")
	public void open_settings_password() throws Throwable {
		try {

			register.click_settings();
			System.out.println("Settings is clicked!");
			Thread.sleep(2000);
			ExtentTestManager.logPass("Open Settings", driver);
		} catch (Exception e9) {
			e9.getMessage();
			e9.printStackTrace();
			Thread.sleep(1000);
			ExtentTestManager.logFail("Open Settings", driver);
		}
	}

	@And("Click on change password submenu")
	public void open_changepassword_submenu() throws Throwable {
		try {

			register.click_changepassword_menu();
			System.out.println("Change password page is opened!");
			Thread.sleep(2000);
			ExtentTestManager.logPass("Open Change password page", driver);
		} catch (Exception e9) {
			e9.getMessage();
			e9.printStackTrace();
			Thread.sleep(1000);
			ExtentTestManager.logFail("Open Change password page", driver);
		}
	}

	@And("Enter current password")
	public void enter_current_password() throws Throwable {
		try {

			register.enter_current_password();
			System.out.println("Current Password is entered!");
			Thread.sleep(2000);
			ExtentTestManager.logInfo("Enter Current Password");
		} catch (Exception e9) {
			e9.getMessage();
			e9.printStackTrace();
			Thread.sleep(1000);
			ExtentTestManager.logFail("Enter Current Password", driver);
		}
	}

	@And("Enter new password")
	public void enter_new_password() throws Throwable {
		try {

			register.enter_new_password();
			System.out.println("New Password is entered!");
			Thread.sleep(2000);
			ExtentTestManager.logInfo("Enter New Password");
		} catch (Exception e9) {
			e9.getMessage();
			e9.printStackTrace();
			Thread.sleep(1000);
			ExtentTestManager.logFail("Enter New Password", driver);
		}
	}

	@And("Enter confirm password")
	public void enter_confirm_password() throws Throwable {
		try {

			register.enter_confirm_password();
			System.out.println("Confirm Password is entered!");
			Thread.sleep(2000);
			ExtentTestManager.logPass("Enter Confirm Password", driver);
		} catch (Exception e9) {
			e9.getMessage();
			e9.printStackTrace();
			Thread.sleep(1000);
			ExtentTestManager.logFail("Enter Confirm Password", driver);
		}
	}

	@And("Click submit change password")
	public void click_submit_change_password() throws Throwable {
		try {

			register.click_submit_change_password();
			System.out.println("Submit is clicked for Change password!");
			Thread.sleep(2000);
			ExtentTestManager.logPass("Submit - Change Password", driver);
		} catch (Exception e9) {
			e9.getMessage();
			e9.printStackTrace();
			Thread.sleep(1000);
			ExtentTestManager.logFail("Submit - Change Password", driver);
		}
	}

	@And("verify change password success")
	public void verify_change_password_success() throws Throwable {
		try {

			register.verify_changepassword_success();
			System.out.println("Change Password success!");
			ExtentTestManager.logPass("Change Password - Success", driver);
			Thread.sleep(5000);
		} catch (Exception e9) {
			e9.getMessage();
			e9.printStackTrace();
			Thread.sleep(1000);
			ExtentTestManager.logFail("Change Password - Success", driver);
		}
	}

	@And("Click on logout button one - password")
	public void click_on_logout_btn_one_password() throws Throwable {

		try {
			Thread.sleep(3000);
			register.click_logout_button();
			System.out.println("Logout Button one is clicked!");
			ExtentTestManager.logInfo("Click Logout Button one");
		} catch (Exception e9) {
			e9.getMessage();
			e9.printStackTrace();
			Thread.sleep(1000);
			ExtentTestManager.logFail("Click Logout Button one", driver);
		}
	}

	@And("Click on logout button two - password")
	public void click_on_logout_btn_two_password() throws Throwable {

		try {
			Thread.sleep(3000);
			register.click_logoutbutton_two();
			System.out.println("Logout Button one is clicked!");
			ExtentTestManager.logInfo("Click Logout Button one");
		} catch (Exception e9) {
			e9.getMessage();
			e9.printStackTrace();
			Thread.sleep(1000);
			ExtentTestManager.logFail("Click Logout Button one", driver);
		}
	}
}
