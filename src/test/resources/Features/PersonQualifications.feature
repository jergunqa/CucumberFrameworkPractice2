
@featureTag @employeeQualifications
Feature: Employee's Qualifications

  Background:
    When enter valid credentials
    And click on login button
    Then click on PIM button
    And click on Employee List button
    Then click on any user from the table
    And click on Qualification button


  @Employee's_License
  Scenario: Adding Employee's qualifications/License as an Admin
    Then navigate to Add License button and click
    And verify all license input fields are displayed
      | License Type *| License Number | Issued Date | Expiry Date |
    And verify all license input fields are editable
      | Git | A6365689 | 2019-09-23 | 2022-09-23 |


  @Employee's_Skill
  Scenario: Adding Employee's qualifications/Skill as an Admin
    Then navigate to Add Skill button and click
    And verify all skill input fields are displayed
      | Skill * | Years of Experience | Comments |
    And verify all skill input fields are editable
      | Communication | 10 | Great analytical skills |

  @employee's_languages
  Scenario: Verifying Employee's qualifications/Languages as an Admin
    Then navigate to Add Languages button and click
    And verify all languages input fields are displayed
      | Language *| Fluency *| Competency *| Comments |
    And verify all languages input fields are editable
      | Kurdish | Writing | Good |