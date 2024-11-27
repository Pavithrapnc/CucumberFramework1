Feature: Search and place order

  Scenario: Search experience fot the product
    Given user is on the greencart page
    When user search with short name
    Then searched product should display
