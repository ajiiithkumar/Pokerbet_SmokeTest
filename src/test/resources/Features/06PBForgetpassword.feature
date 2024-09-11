#Ajith
#14-08-2024
#Smoke Test Script for Pokerbet
Feature: Pokerbet Smoke Test - Forgot Password

  Scenario Outline: Forgot Password Functionality - Pokerbet
    Given Open Site Desktop - frgt
    And close cookies - frgt
    #And close banners - frgt
    And Click on login button - frgt
    And Click on forgot password - frgt
    And Enter email ID - frgt "<email>"
    And Click on submit to send mail - frgt
    And Verify success msg for mail sent - frgt
    And Open Gmail - frgt
    And Enter email ID in Gmail - frgt "<email>"
    And Enter password in Gmail <password>
    And Open mail in Gmail - frgt
    And Open forgot password link in Gmail - frgt
    #Given Pause execution
    And Enter New password - frgt
    And Enter Confirm password - frgt
    And Click Submit - frgt
    Then Verify if Forgot password change is successful
    
    
    
    Examples: 
      |  email  |  password   |
      | <email> |  Virat@18  |
