Feature: Feature to test login functionality
  Scenario: Check login is successful with valid credentials

    Given user is on login page
    When User enters username and password
    And user clicks on submit button
    Then user is navigated to the home page

