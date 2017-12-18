Feature: to delete employee
  As a registered user
  I want to be able to delete employee
  So that employee list will be deleted

  Scenario : to delete the employee from database
    Given user is on employee registered user page
    When user deletes employee
    Then user should be able to delete employee 