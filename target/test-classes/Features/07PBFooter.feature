#Ajith
#14-08-2024
#Smoke Test Script for Pokerbet
Feature: Pokerbet Smoke Test - Footer validation

  Scenario Outline: Footer Validation - BB
   Given Open Site - footer
    #And close cookies - footer
    #And close banners - footer
    And Click on login button - footer
    And Enter username for login - footer <new user username>
    And Enter login password - footer <new user password>
    And Click on login submit - footer
    #Given Pause execution
    #Then Verify if login is successful - footer
    #And close promo pop up - footer
    And Open Payment Methods page - footer
    And Verify Payment Methods page - footer
    And Open About Us page - footer
    And Verify About Us page - footer
    And Open Sportsbook Rules page - footer
    And Verify Sportsbook Rules page - footer
    And Open Terms and Conditions page - footer
    And Verify Terms and Conditions page - footer
    And Open FAQs page - footer
    And Verify FAQs page - footer
    And Open Privacy Policy page - footer
    And Verify Privacy Policy page - footer
    And Open Responsible Gambling page - footer
    And Verify Responsible Gambling page - footer
    And Click on Hamburger menu - footer
    And Click on logout button one - footer
    And Click on logout button two - footer
    #Then Verify if logout is successful - footer    
    

    Examples: 
      | new user username  | new user password |
      | pbctest1           | Test@123          |
