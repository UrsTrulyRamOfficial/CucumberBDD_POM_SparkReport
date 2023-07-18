@Login
Feature: Login page feature

  Scenario: Login with correct credentials
    Given user is on login page
    When user gets the title of the page
    Then forgot your password link should be displayed
    When user enters username "Admin"
    And user enters password "admin123"
    And user clicks on Login button
    And page title should be "OrangeHRM"
