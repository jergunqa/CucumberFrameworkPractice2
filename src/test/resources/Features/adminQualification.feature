@adminQualifications
Feature: Admin Qualification feature

  Background:
    Given Admin user is logged in
    When admin navigates to Qualifications

  @regression @addSkills
  Scenario Outline: As an admin user should be able to add different skills in qualifications
    When selects skills
    Then admin user can add any skills "<Name>" "<Description>"

    Examples:
      | Name            | Description                                      |
      | Multitasking    | ability to handle multiple task at the same time |
      | Problem Solving | ability to solve problems                        |
      | Communication   | ability to communicate with team                 |

  @regression @addMembership
  Scenario Outline: As an admin user should be able to add different memberships under qualifications
    When selects Memberships
    Then admin user can add any Memberships "<Name>"

    Examples:
      | Name         |
      | Golf club    |
      | Sysco        |
      | Fishing club |