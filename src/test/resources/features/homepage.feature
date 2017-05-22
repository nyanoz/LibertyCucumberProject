Feature: Test home page
  Scenario: Test Peak Performance Toolkit with valid credentials
    Given I am on a browser
    When I enter a valid kmc url on the browser
    Then I should be redirected to the kmc home page

