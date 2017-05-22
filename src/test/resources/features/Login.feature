Feature: Test Facebook
  Scenario: Test Peak Performance Toolkit with valid credentials
    Given Open Firefox and start application
    When I provide valid username and password
    Then user should be able to login

