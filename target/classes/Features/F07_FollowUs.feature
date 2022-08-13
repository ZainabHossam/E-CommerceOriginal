@smoke
Feature: F07|Follow Us Feature is Working
  Scenario: User Opens Facebook Link
    Given User Opens Facebook
    Then "https://www.facebook.com/nopCommerce" is Opened in NewTab

  Scenario: User Opens Twitter Link
    Given User Opens Twitter
    Then "https://twitter.com/nopCommerce" is Opened in NewTab


  Scenario: User Opens RSS Link
    Given User Opens RSS
    Then "https://demo.nopcommerce.com/new-online-store-is-open" is Opened in NewTab


  Scenario: User Opens Youtube Link
    Given User Opens Youtube
    Then "https://www.youtube.com/user/nopCommerce" is Opened in NewTab


