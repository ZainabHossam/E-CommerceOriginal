@smoke
  Feature: User Should be able to Search
    Scenario Outline: User search on items using Product name
      Given Search tab
      When User able to type "<Item_Name>"
      Then User Click Search
      Examples:
        |Item_Name|
        |book|
        |Laptop|
        |Nike|

      Scenario Outline: User Search on item Using SKU
        Given Search tab
        When User able to type "<Item_SKU>"
        Then User Click Search
        Examples:
        |Item_SKU|
        |SCI_FAITH|
        |APPLE_CAM|
        |SF_PRO_11|

