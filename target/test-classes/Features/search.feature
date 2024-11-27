Feature: Search and place order

  Scenario: Search experience fot the product
    Given user is on the greencart page
    When user search with short name
    Then searched product should display
    
 Scenario: logout function
    Given user home page
    When user click on logout
    Then login should display