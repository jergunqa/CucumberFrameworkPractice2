Feature: Add licenses and languages functionality

  Background:
    Given Admin user is logged in
    When admin navigates to Qualifications

  @addLicenses
  Scenario Outline: Adding any licenses in the Licenses window
    And selects licenses
    Then admin user can add any licenses"<Licenses>"
    Examples:
      | Licenses |
      | Java     |
      | Piton    |
      | Git      |

  @addLanguages
  Scenario Outline: Adding any Languages in the Language window
    And selects Language
    Then admin user can add any Language "<Language>"
    Examples:
      | Language |
      | Russian   |
      | Turkish   |
      | Kurdish   |