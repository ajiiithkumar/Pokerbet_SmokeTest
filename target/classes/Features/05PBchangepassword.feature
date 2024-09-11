#Ajith
#14-08-2024
#Smoke Test Script for BB Prod
Feature: Pokerbet Smoke Test - Change Password

  Scenario Outline: Change Password Functionality - Pokerbet
    Given Open Site password
    #And close cookies password
    
    And Click on login button password
    And Enter username for login password "<newuserusername1>"
    And Enter login password password <new user password>
    And Click on login submit password
    #And close banners password
    #Given Pause execution
    #Then Verify if login is successful password
  
    And Click on Hamburger menu password
    And Click on my account dropdown password
    And Click on settings in dropdown password
    And Click on change password submenu
    And Enter current password
    And Enter new password
    And Enter confirm password
    And Click submit change password
    And verify change password success
    And Click on Hamburger menu password
    And Click on logout button one - password
    And Click on logout button two - password
   # Then Verify if logout is successful - password
    
    Examples:
      | newuserusername1   | new user password |
      | <newuserusername1> | Test@123          |
