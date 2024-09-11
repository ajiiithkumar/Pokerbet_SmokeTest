#Author: Ajith Kumar
#10-08-2024
Feature: Signup feature

  Scenario Outline: Signup - pokerbet
    Given Open site 
    And Click accept cookies
    And Click signup button
    And Enter firstname "<firstname>"
    And Enter surname "<surname>"
    And Enter newuserusername1 "<newuserusername1>"
    And Enter email "<email>"
    And Click next button
    And Enter passport "<passport>"
    And Select source of income
    And Select country
    And Enter mobnum "<mobnum>"
    And Enter password - register <password>
    And Enter confirm password <password>
    And Click age confirmation
    And Click register button
    #And Verify registration sucess
    And Click promo popup
    And Click homepage button
    And Click on logout button one signup
		And Click on logout button two signup

  Examples:
    | firstname   | surname   | newuserusername1     | password | mobnum   | email       | passport   |
    | <firstname> | <surname> |   <newuserusername1> | Test@123 | <mobnum> | <email1>    |<passport>  |
