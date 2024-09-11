#Ajith
#10-08-2023
#Smoke Test Script for Pokerbet
Feature: Pokerbet Smoke Test - Profile

  Scenario Outline: Profile update and Verification - Pokerbet
    Given Open Site profile
    #And close cookies profile
    #And close banners profile
    And Click on login button profile
    And Enter username profile "<newuserusername1>"
    And Enter password profile <new user password>
    And Click on login submit profile
    #Given Pause execution
    #Then Verify if login is successful profile
    #And close promo pop up profile
    And Click on Hamburger menu profile
    And Click on my account dropdown profile
    And Click on my profile in dropdown profile
    #And Enter First name
    #And Enter Last name
    #And select gender from dropdown
    #And Enter dob
    #And Enter Email ID "<email1>"
    And Enter address profile  <address>
    #And Enter country
    And Enter city profile <city>
    And Click Send OTP for Email
    And Click verify OTP for Email
    #And Verify Email verifcation success msg
    #And Click Send OTP for Mobile
    #And Click verify OTP for Mobile
    #And Verify Mobile verifcation success msg
    And Click submit button for profile
    #Then Verify if profile is submitted successfully
    And Click on Hamburger menu profile
    And Click on logout button one - profile
    And Click on logout button two - profile
    #Then Verify if logout is successful - profile
    
    
    Examples: 
      | newuserusername1    | new user password |   email1   | address | city | 
      | <newuserusername1>  | Test@123          |  <email1>  | test    | test |
