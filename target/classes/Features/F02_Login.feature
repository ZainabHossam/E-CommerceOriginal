@smoke
Feature: F02_Login | users could use login functionality to use their accounts

  Scenario: user Login with invalid email and password
    Given user go to login page
    And User enter "Zainab@gmail.com"and"Passord"
    Then Press Login Button
    And User not Login to system

  Scenario: user Login with valid email and password
    Given user go to login page
    And User enter "yacevid376@galotv.com"and"Zainab94"
    Then Press Login Button
    And Login success successfully

