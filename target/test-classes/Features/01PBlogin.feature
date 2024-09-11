#Author: Ajith Kumar
#10-08-2024

Feature: Login feature

  Scenario Outline: Login - Pokerbet
    Given Open site login
   	#And Click accept cookies login
    And Click login button login
    And Enter username login "<newuserusername1>"
    And Enter login password login <new user password>
    And Click on login submit login
    
    #Given Pause execution
    
    #And Click promo popup login
    And Click on Hamburger menu login
    And Click on logout button one login
    And Click on logout button two login
    #Then Verify if logout is successful - new user login
    And Open site login
    #And Click accept cookies login	
    And Click login button login
    And Enter ex username for login login <ex user username>
    And Enter login password login <ex user password>
    And Click on login submit login
    #Given Pause execution
    And Click homepage button login 
    And Click on logout button one login
    And Click on logout button two login
  Examples: 
      | newuserusername1   | new user password | ex user username | ex user password |
      | <newuserusername1> | Test@123          | Testuser01       | Test@123         |
