Feature: Emergency Contacts

  @emergencyContacts
  Scenario: Add employee's Emergency Contacts
    When enter valid credentials
    When click on login button
    Then click on PIM button
    Then click on Employee List button
    Then click on any user from the table
    And click on Emergency Contacts Button
    Then click on Add Emergency Contacts button
    And verify all add emergency contact input fields are displayed
      | Name | Relationship | Home Telephone | Mobile | Work Telephone |
    And verify all emergency contact fields are editable
      | Alexis | Wife | 202020202 | 788778788 | 606060600 |