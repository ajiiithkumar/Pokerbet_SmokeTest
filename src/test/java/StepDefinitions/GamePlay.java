package StepDefinitions;

import org.openqa.selenium.WebDriver;

import helperclass.HelperClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.Registerpages;
import utils.ExtentTestManager;
import utils.UserPropertiesReader;

public class GamePlay {
	
	private WebDriver driver;
    private Registerpages register;

	
	@Given("Open Site - game")
	public void open_site_game()  throws Throwable {{
		
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
	}

	@And("close accept cookies - game")
	public void close_accept_cookies_game() throws Throwable {
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

	@And("Click on login button - game")
	public void click_on_login_button_game() throws Throwable{
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

	@And("Enter username for login - game (.*)$")
	public void enter_username(String username) throws Throwable{
		 try {
				
				
			    register.enter_username_login(username);
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

	@And("Enter login password - game (.*)$")
	public void enter_password_login(String password) throws Throwable{
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

	@And("Click on login submit - game")
	public void click_on_login_submit_game() throws Throwable{
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

	
	@And("Open casino page - game")
	public void open_casino_page_game() throws Throwable{
		 try {
		     	register = new Registerpages(driver);
		     	register.clickOnCasinoPage();

		         System.out.println("casino page is clicked!");
		         Thread.sleep(1000);
		         ExtentTestManager.logPass("Click casino page", driver);
		     } catch (Exception e3) {
		     	e3.getMessage();
		         e3.printStackTrace();
		         System.out.println("Unable to casino page!");
		         Thread.sleep(1000);
		         ExtentTestManager.logFail("Click casino page", driver);
		     }
	}
	
	@And("Search game - game")
	public void search_game_game() throws Throwable{
		 try {
		     	register = new Registerpages(driver);
		     	register.enter_casino_search();

		         System.out.println("Search game is clicked!");
		         Thread.sleep(1000);
		         ExtentTestManager.logInfo("Click Search game");
		     } catch (Exception e3) {
		     	e3.getMessage();
		         e3.printStackTrace();
		         System.out.println("Unable to click Search game!");
		         Thread.sleep(1000);
		         ExtentTestManager.logFail("Click Search game", driver);
		     }
	}
	@And("Click game -game")
	public void click_game_game()throws Throwable {
		try {
	     	register = new Registerpages(driver);
	     	register.click_gamename();

	         System.out.println("game play now is clicked!");
	         Thread.sleep(1000);
	         ExtentTestManager.logPass("Click game play now", driver);
	     } catch (Exception e3) {
	     	e3.getMessage();
	         e3.printStackTrace();
	         System.out.println("Unable to click game play now");
	         Thread.sleep(1000); 
	         ExtentTestManager.logFail("Click game play now", driver);
	     }
	}

	
	
	@And("Click on sound off slot - game")
	public void click_game_sounoff() throws Throwable{
		 try {
		     	register = new Registerpages(driver);
		     	register.click_game_soundoff();

		         System.out.println("sound off button is clicked!");
		         Thread.sleep(1000);
		         ExtentTestManager.logInfo("Click sound off Button");
		     } catch (Exception e3) {
		     	e3.getMessage();
		         e3.printStackTrace();
		         System.out.println("Unable to click sound off button!");
		         Thread.sleep(1000);
		         ExtentTestManager.logFail("Click sound off Button", driver);
		     }
	}

	@And("Click on continue slot - game")
	public void click_game_continue() throws Throwable{
		 try {
		     	register = new Registerpages(driver);
		     	register.click_game_continue();

		         System.out.println("continue button is clicked!");
		         Thread.sleep(1000);
		         ExtentTestManager.logPass("Click continue Button", driver);
		     } catch (Exception e3) {
		     	e3.getMessage();
		         e3.printStackTrace();
		         System.out.println("Unable to click continue button!");
		         Thread.sleep(1000);
		         ExtentTestManager.logFail("Click continue Button", driver);
		     }
	}
	
	@And("Click on spin button slot - game")
	public void click_on_spin_button_slot_game() throws Throwable{
		 try {
		     	register = new Registerpages(driver);
		     	register.click_game_spin();

		         System.out.println("Spin button is clicked!");
		         Thread.sleep(1000);
		         ExtentTestManager.logPass("Click Spin Button", driver);
		     } catch (Exception e3) {
		     	e3.getMessage();
		         e3.printStackTrace();
		         System.out.println("Unable to click Spin button!");
		         Thread.sleep(1000);
		         ExtentTestManager.logFail("Click Spin Button", driver);
		     }
	}

	@And("Click the close button for slot - game")
	public void click_the_close_button_for_slot_game() throws Throwable{
		 try {
		     	register = new Registerpages(driver);
		     	register.click_gameclose();

		         System.out.println("close button is clicked!");
		         Thread.sleep(1000);
		         ExtentTestManager.logInfo("Click close Button");
		     } catch (Exception e3) {
		     	e3.getMessage();
		         e3.printStackTrace();
		         System.out.println("Unable to click close button!");
		         Thread.sleep(1000);
		         ExtentTestManager.logFail("Click close Button", driver);
		     }
	}

	@And("Click on Hamburger menu - game")
	public void click_on_hamburger_menu_game() throws Throwable{
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

	@And("Click on logout button one - game")
	public void click_on_logout_button_one_game() throws Throwable{
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

	@And("Click on logout button two - game")
	public void click_on_logout_button_two_game() throws Throwable{
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
