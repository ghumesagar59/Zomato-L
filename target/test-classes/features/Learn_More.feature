Feature: Zomato learn more

  Scenario: User navigate the learn more 
    Given User go to Zomato home page
    When User click Privacy navigate and back
    When User click Security navigate and back
    When User click Tearms navigate and back
  	Then User close the browser for learn more