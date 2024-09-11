#Ajith
#19-08-2024
#Smoke Test Script for Pokerbet
Feature: Pokerbet Smoke Test - History Validation

  Scenario Outline: History Validation - Pokerbet
    Given Open Site - hist
    #And close cookies - hist
    #And close banners - hist
    And Click on login button - hist
    And Enter username for login - hist <ex user username>
    And Enter login password - hist <ex user password>
    And Click on login submit - hist
    #Then Verify if login is successful - hist
    #Given Pause execution
    #And close promo pop up - hist
    And Click on Hamburger menu - hist 
    And Click on Transactions dropdown - hist
    And Click on All Transactions - hist 
    And Verify records in All Transaction page - hist
    And Click on Game History - hist 
    And Verify records in Game History page - hist
    And Click on Hamburger menu - hist
    And Click on logout button one - hist
    And Click on logout button two - hist
   # Then Verify if logout is successful - hist
    
    
    Examples: 
      | ex user username | ex user password |
      | pbctest1         | Test@123         |
