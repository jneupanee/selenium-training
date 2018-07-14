Feature: Adding Item To Cart
@regression
Scenario: Verify that you cannot add more product in the cart than the product in store 
    Given  I am on Guru Page
    When I click Mobile Menu
    Then In the list I click 'Add to cart' for sony xperia
    Then I change quantity value to 'Hundred'
    Then I verify the error message
    Then I click on Empty Cart
    Then I click verify cart is empty 
    Then Close the browser3