Feature: Zomato live location

  Scenario: User detect the live location
    Given User is on Zomato home page to navigate the location
    When User go to pune restaurants
    When User detect live location
    Then User go back and close browser