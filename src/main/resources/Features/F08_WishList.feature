@smoke
Feature: Add Product to Wishlist
  Scenario: Add Product to Wishlist
    Given Wishlist icon for the Product
    Then Add Product to wishlist

  Scenario: Confirm the Wishlist page count increased
    Given Wishlist icon for the Product
    Then Add Product to wishlist
    And Check The count of Wishlist icon increased