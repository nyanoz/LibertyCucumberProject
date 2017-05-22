Feature: Test home page
  Scenario: Test kmc home page
    Given I am on a browser
    When I enter a valid kmc url on the browser
    Then I should be redirected to the kmc home page

