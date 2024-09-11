#Author: Ajith Kumar
#10-08-2024

Feature: Pokerbet Smoke Test - Gameplay

  Scenario Outline: Gameplay Validation - Casino - Pokerbet
    Given Open Site - game
    #And close accept cookies - game
    #And close banners - game
    And Click on login button - game
    And Enter username for login - game <ex user username>
    And Enter login password - game <ex user password>
    And Click on login submit - game
    #Given Pause execution
    And Open casino page - game
    And Search game - game
    And Click game -game
   
    #Era of God Game
    #And Click on sound off slot - game
    #And Click on continue slot - game
#    And Click on stake button slot - game
#    And Click on stake minus button slot - game
    And Click on spin button slot - game
    And Click the close button for slot - game
    And Click on Hamburger menu - game
    And Click on logout button one - game
    And Click on logout button two - game
    #And Click on logout button two - game
    #Then Verify if logout is successful - game
   
    
    
    Examples: 
      | ex user username | ex user password |
      | pbctest1         | Test@123         |
