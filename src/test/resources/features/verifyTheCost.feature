Feature: Verify the Cost of the Product
Scenario: Verify the cost of product in the list page and details page are the same
    Given I am on live Guru Page
    When I click Mobile Menu
    Then I read the list of all mobile and read the cost of Sony Xperia Mobile
    Then I click on Sony Xperia Mobile
    Then I read the Sony Xperia Mobile from detail Page
    Then I compare the value of both Page
    Then close Browser