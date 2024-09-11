#Ajith
#13-08-2024
#Smoke Test Script for Pokerbet
Feature: Pokerbet Smoke Test - KYC

  Scenario Outline: KYC update and Verification - Pokerbet
    Given Open Site kyc
    #And close cookies kyc
    #And close banners kyc
    And Click on login button kyc
    And Enter username for login kyc "<newuserusername1>"
    And Enter login password kyc <new user password>
    And Click on login submit kyc
    #Given Pause execution
    #Then Verify if login is successful kyc
    #And close promo pop up kyc
    And Click on Hamburger menu kyc
    And Click on my account dropdown kyc
    And Click on kyc in dropdown kyc
    And select proof from dropdown kyc
    And Enter Document number kyc "<documnetno>"
    And Enter address kyc <address>
    And Enter city kyc <city>
    And upload front image kyc
    And upload back image kyc
    And Click submit button for kyc
    Then Verify if kyc is submitted successfully
    And Enter account number "<accountno>"
    And Select bank name
    And Enter account holder name <holdername>
    And Enter branch name <branchname>
    And Click add bank kyc
    When Click on Hamburger menu kyc
    And Click on logout button one - kyc
    And Click on logout button two - kyc
    #Then Verify if logout is successful - kyc
    
    Examples: 
      | newuserusername1    | new user password | documentno |  address | accountno | holdername | branchname | city |
      | <newuserusername1>  | Test@123          | <documentno> | testtest |  <accountno> | testtest  |   testtest | testtest |
