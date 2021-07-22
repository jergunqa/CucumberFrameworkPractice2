@featureTag
Feature: Employee's Contact Details

  Background:
    When enter valid credentials
    And click on login button
    Then click on PIM button
    And click on Employee List button
    Then click on any user from the table
    And click on Contact Details

  @addEmployee's_Contact_Details
  Scenario: Adding Employee's contact details as an Admin
    And Click on edit button
    Then verify all input fields are displayed and editable on Contact Details Page
    And fill out the form and click on save button and verify information is added