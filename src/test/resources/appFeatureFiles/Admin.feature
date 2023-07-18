@Admin_createUser
Feature: Admin feature

  Scenario: Create user in user management tab
    Given user is on login page
    When user enters username "Admin"
    And user enters password "admin123"
    And user clicks on Login button
    Then user gets the title of the page
    And page title should be "OrangeHRM"
    And user click on admin tab
    And user click on add button
    Then user adding a user role "Admin"
    And user enter employee name
    And user select status dropdown "Enabled"
    And user entering user name
    And user enter password and confirm password "Orange@123","Orange@123"
    And user clicks on save button
