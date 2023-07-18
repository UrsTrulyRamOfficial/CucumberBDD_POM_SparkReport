@Recruitment
Feature: HR Recruitment feature

  Scenario: Verify HR recruitment add candidate details
    Given user is on login page
    When user enters username "Admin"
    And user enters password "admin123"
    And user clicks on Login button
    Then user gets the title of the page
    And page title should be "OrangeHRM"
    Then user select recruitment tab
    And user enters first name "Test"
    And user enter middle name "QA"
    And user enters last name "Automation"
    And user select vacancy dropdown "Senior QA Lead"
    And user enters email address "testautomation@gmail.com"
    And user enter contact number "9876543210"
    And user click on browse and select resume "word document.docx"
    And user enter keywords "QA,Automation,Selenium,Java"
    And user enter notes "Test QA Notes"
    When user select concent checkbox
    Then user click on save button
