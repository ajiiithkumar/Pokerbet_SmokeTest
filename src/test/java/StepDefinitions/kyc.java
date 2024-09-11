package StepDefinitions;

import org.openqa.selenium.WebDriver;

import helperclass.HelperClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.Registerpages;
import utils.ExtentTestManager;
import utils.UserPropertiesReader;

public class kyc {
	private WebDriver driver;
    private Registerpages register;
    
    @Given("Open Site kyc")
    public void open_site_kyc() throws Throwable{
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

    @And("close cookies kyc")
    public void close_cookies_kyc()throws Throwable {
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

    @And("Click on login button kyc")
    public void click_on_login_button_kyc()throws Throwable {
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

    @And("Enter username for login kyc {string}")
    public void enter_username_for_login_kyc(String string) throws Throwable{
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

    @And("Enter login password kyc (.*)$")
    public void enter_login_password_kyc_test(String password) throws Throwable{
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

    @And("Click on login submit kyc")
    public void click_on_login_submit_kyc() throws Throwable{
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

    @And("Click on Hamburger menu kyc")
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

    @Given("Click on my account dropdown kyc")
    public void click_on_my_account_dropdown_kyc() throws Throwable{
    	 try {
    		 register = new Registerpages(driver);
    	 register.click_myaccount();

         System.out.println("my account is clicked!");
         Thread.sleep(1000);
         ExtentTestManager.logInfo("Click my account");
     } catch (Exception e3) {
     	e3.getMessage();
         e3.printStackTrace();
         System.out.println("Unable to click homebutton!");
         Thread.sleep(1000);
         ExtentTestManager.logFail("Click homebutton", driver);
     }
    }

    @Given("Click on kyc in dropdown kyc")
    public void click_on_kyc_in_dropdown_kyc()throws Throwable {
    	 try {
    		 register = new Registerpages(driver);
    	 register.click_kyc();

         System.out.println("kyc menu is clicked!");
         Thread.sleep(1000);
         ExtentTestManager.logInfo("Click kyc menu");
     } catch (Exception e3) {
     	e3.getMessage();
         e3.printStackTrace();
         System.out.println("Unable to click kyc menu!");
         Thread.sleep(1000);
         ExtentTestManager.logFail("Click kyc menu", driver);
     }
    }

    @Given("select proof from dropdown kyc")
    public void select_proof_from_dropdown_kyc()throws Throwable {
    	 try {
    		 register = new Registerpages(driver);
    	 register.select_proof_of_identity();

         System.out.println("Proof of identity is selected!");
         Thread.sleep(1000);
         ExtentTestManager.logInfo("select proof of identity");
     } catch (Exception e3) {
     	e3.getMessage();
         e3.printStackTrace();
         System.out.println("Unable to select proof of identity!");
         Thread.sleep(1000);
         ExtentTestManager.logFail("Click select proof of identity", driver);
     }
    }

    @Given("Enter Document number kyc {string}")
    public void enter_document_number_kyc(String string)throws Throwable {
    	 try {
    		 
    		 register = new Registerpages(driver);
    		 String actualdocumentno = UserPropertiesReader.getdocumentno();
    	 register.enter_kyc_document_number(actualdocumentno);

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

    @Given("Enter address kyc (.*)$")
    public void enter_address_kyc_test(String address) throws Throwable{
    	 try {
    		 register = new Registerpages(driver);
    	 register.enter_kyc_address(address);

         System.out.println("Address is entered!");
         Thread.sleep(1000);
         ExtentTestManager.logInfo("Address is entered");
     } catch (Exception e3) {
     	e3.getMessage();
         e3.printStackTrace();
         System.out.println("Unable to enter address!");
         Thread.sleep(1000);
         ExtentTestManager.logFail("Enter address is failed", driver);
     }
    }

    @Given("Enter city kyc (.*)$")
    public void enter_city_kyc(String city) throws Throwable{
    	try {
   		 register = new Registerpages(driver);
   	 register.enter_kyc_city(city);

        System.out.println("city is entered!");
        Thread.sleep(1000);
        ExtentTestManager.logInfo("city is entered");
    } catch (Exception e3) {
    	e3.getMessage();
        e3.printStackTrace();
        System.out.println("Unable to enter city!");
        Thread.sleep(1000);
        ExtentTestManager.logFail("Enter city is failed", driver);
    }
    }

    @Given("upload front image kyc")
    public void upload_front_image_kyc() throws Throwable{
    	try {
   		 register = new Registerpages(driver);
   	 register.upload_front_img_kyc();

        System.out.println("Front image is uploaded!");
        Thread.sleep(1000);
        ExtentTestManager.logInfo("Front image is uploaded!");
    } catch (Exception e3) {
    	e3.getMessage();
        e3.printStackTrace();
        System.out.println("Unable to upload front image!");
        Thread.sleep(1000);
        ExtentTestManager.logFail("Front image upload", driver);
    }
    }

    @Given("upload back image kyc")
    public void upload_back_image_kyc() throws Throwable{
    	try {
      		 register = new Registerpages(driver);
      	 register.upload_back_img_kyc();

           System.out.println("Back image is uploaded!");
           Thread.sleep(1000);
           ExtentTestManager.logInfo("Back image is uploaded!");
       } catch (Exception e3) {
       	e3.getMessage();
           e3.printStackTrace();
           System.out.println("Unable to upload back image!");
           Thread.sleep(1000);
           ExtentTestManager.logFail("Back image upload", driver);
       }
    }

    @Given("Click submit button for kyc")
    public void click_submit_button_for_kyc()throws Throwable {
    	try {
     		 register = new Registerpages(driver);
     	 register.click_kyc_submitID();

          System.out.println("Click submit in KYC!");
          Thread.sleep(1000);
          ExtentTestManager.logPass("Click submit in KYC !.", driver);
      } catch (Exception e3) {
      	e3.getMessage();
          e3.printStackTrace();
          System.out.println("Unable to click submit ID in KYC!");
          Thread.sleep(1000);
          ExtentTestManager.logFail("Click submit ID in KYC is failed", driver);
      } 
    }

    @And("Verify if kyc is submitted successfully")
    public void verify_if_kyc_is_submitted_successfully() throws Throwable{
    	try {
    		 register = new Registerpages(driver);
    	 register.verify_kyc_success();

         System.out.println("verify kyc success!");
         Thread.sleep(1000);
         ExtentTestManager.logPass("verify KYC success!.", driver);
     } catch (Exception e3) {
     	e3.getMessage();
         e3.printStackTrace();
         System.out.println("Unable to verify KYC success!");
         Thread.sleep(1000);
         ExtentTestManager.logFail("verify KYC success is failed", driver);
     } 
    }

    @And("Select bank name")
    public void select_bank_name() throws Throwable{
    	try {
   		 register = new Registerpages(driver);
   	 register.select_bank_name();

        System.out.println("Enter bank name!");
        Thread.sleep(1000);
        ExtentTestManager.logPass("Bank name is entered!.", driver);
    } catch (Exception e3) {
    	e3.getMessage();
        e3.printStackTrace();
        System.out.println("Unable to enter bank name!");
        Thread.sleep(1000);
        ExtentTestManager.logFail("Enter bank name is failed", driver);
    } 
    }
    
    @And("Enter account number {string}")
    public void click_account_number(String string) throws Throwable{
    	try {
    		String actualaccountno = UserPropertiesReader.getaccountno();
       	 register.enter_account_no(actualaccountno);
        System.out.println("Enter bank account number!");
        Thread.sleep(1000);
        ExtentTestManager.logPass("Bank account number is entered!.", driver);
    } catch (Exception e3) {
    	e3.getMessage();
        e3.printStackTrace();
        System.out.println("Unable to enter bank account number!");
        Thread.sleep(1000);
        ExtentTestManager.logFail("Enter bank account number is failed", driver);
    } 
    }
    
    

    @And("Enter account holder name (.*)$")
    public void enter_account_holder_name_test(String holdername) throws Throwable{
    	try {
      		 register = new Registerpages(driver);
      	 register.enter_account_holder_name(holdername);

           System.out.println("Enter bank account holder name!");
           Thread.sleep(1000);
           ExtentTestManager.logInfo("Bank account holder name is entered");
       } catch (Exception e3) {
       	e3.getMessage();
           e3.printStackTrace();
           System.out.println("Unable to enter bank account holder name!");
           Thread.sleep(1000);
           ExtentTestManager.logFail("Enter Bank account holder is failed", driver);
       }
    }

    @And("Enter branch name (.*)$")
    public void enter_branch_name_test(String branchname)throws Throwable {
    	try {
     		 register = new Registerpages(driver);
     	 register.enter_branch_name(branchname);

          System.out.println("Enter branch name!");
          Thread.sleep(1000);
          ExtentTestManager.logInfo("Branch name is entered");
      } catch (Exception e3) {
      	e3.getMessage();
          e3.printStackTrace();
          System.out.println("Unable to enter barnch name!");
          Thread.sleep(1000);
          ExtentTestManager.logFail("Enter branch name is failed", driver);
      }
    }
    
    @And("Click add bank kyc")
    public void click_on_add_bank_kyc()throws Throwable {
    	try {
   		 register = new Registerpages(driver);
   	 register.click_add_bank_button();

        System.out.println("Click add bank button!");
        Thread.sleep(1000);
        ExtentTestManager.logPass("Add bank button is clicked!.", driver);
    } catch (Exception e3) {
    	e3.getMessage();
        e3.printStackTrace();
        System.out.println("Unable to click add bank button!");
        Thread.sleep(1000);
        ExtentTestManager.logFail("Click add bank button is failed", driver);
    } 
    }
    

    @And("Click on logout button one - kyc")
    public void click_on_logout_button_one_kyc()throws Throwable {
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

    @And("Click on logout button two - kyc")
    public void click_on_logout_button_two_kyc()throws Throwable {
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
