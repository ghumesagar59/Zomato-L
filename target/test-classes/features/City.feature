Feature: Verify all cities links on Zomato India page

  Scenario: User should be able to click and verify all cities
    Given user is on Zomato India homepage
    When user click to all cities
    Then user navigate all cities and close the browser
