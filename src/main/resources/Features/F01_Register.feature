@smoke
Feature: F01_Register | users could register with new accounts

  Scenario: guest user could register with valid data
    Given user go to register page
    And User select Gender type
    And User enter "Zainab" and "Hossam"
    And User enter date of Birth
    And User enter email "Zainabhossam5@gmail.com"
    And User Enter "Password" and "Password"
    Then Press Register
    And Success Message displayed


  Scenario: User register with valid data

