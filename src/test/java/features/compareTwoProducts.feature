Feature: Compare Two Products
Scenario: Verify that you are able to compare two products
    Given I am on guru homepage
    When i click mobile menu
    Then I click 'Add to compare' on mobile product list
    Then i click compare button to compare
    Then I verify the pop-up window and check the product are reflected
    Then Close the pop up windows