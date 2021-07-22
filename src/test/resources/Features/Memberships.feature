@addMembership
Feature: Adding Memberships to any Employee as an Admin

  Scenario Outline: Adding Memberships to any Employee as an Admin
    When enter valid credentials
    And click on login button
    Then click on PIM button
    And click on Employee List button
    Then click on any user from the table
    And click on Qualification button
    Then click on  Memberships button
    And click on Add Membership button
    Then enter "<Membership>", "<Subscription Paid By>", "<Subscription Amount>", "<Currency>", "<Subscription Commence Date>", "<Subscription Renewal Date>"
    And click Save Membership button
    Then verify "<Membership>", "<Subscription Paid By>", "<Subscription Amount>", "<Currency>", "<Subscription Commence Date>", "<Subscription Renewal Date>" were added successfully
    Examples:
      | Membership | Subscription Paid By | Subscription Amount | Currency             | Subscription Commence Date | Subscription Renewal Date |
      | Fishing club      | Company              | 1000.00             | United States Dollar | 2019-06-06                 | 2022-06-06                |