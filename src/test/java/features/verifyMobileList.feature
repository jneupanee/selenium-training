Feature: Verify item in Mobile List 
@regression
Scenario: Page can be sorted by 'Name'
	    Given I am on live.guru
	    When I click 'Mobile' menu
	    Then Title of the page
	    Then I click sortby
	    Then I chose 'Name'
	    Then The product should be sorted by Name 
	    Then close Browser1