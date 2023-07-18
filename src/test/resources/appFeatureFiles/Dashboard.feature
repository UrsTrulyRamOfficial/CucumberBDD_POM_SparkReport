@Dashboard
Feature: Dashboard feature

  Scenario: Verify Dashboard features
    Given user is on login page
    When user enters username "Admin"
    And user enters password "admin123"
    And user clicks on Login button
    Then user gets the title of the page
    And page title should be "OrangeHRM"
    And user click on dashboard
    Then first widget should be "Time at Work"
    And second widget should be "My Actions"
    And third widget should be "Quick Launch"
    And fourth widget should be "Buzz Latest Posts"
    And fifth widget should be "Employees on Leave Today"
    And sixth widget should be "Employee Distribution by Sub Unit"
    And seventh widget should be "Employee Distribution by Location"
