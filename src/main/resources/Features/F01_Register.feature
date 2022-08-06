@smoke
Feature: F01_Register | users could register with new accounts

  Scenario: guest user could register with valid data
    Given user go to register page
    And User select Gender type
    And User enter "Zainab" and "Hossam"
    And User enter date of Birth
    And User enter email "yacevid3@galotv.com"
    And User Enter "Zainab94" and "Zainab94"

    Then Press Register
    And Success Message displayed
    And Logout to Login


