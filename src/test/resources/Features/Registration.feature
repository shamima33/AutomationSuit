Feature: Verify Registration Functionality
  Scenario: New customer registration
    Given I am on the registration page
    When I enter a valid Username "JonD662e12"
    And I enter a valid Email address "john56e@example.com"
    And I enter a valid Password "joh56e@example.com"
    And I submit the registration form
    Then I should be automatically redirected to the customer login page