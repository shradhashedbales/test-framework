Feature: admin user adding employee
  As a admin user
  I want to be able to add employee
  So that employee list remains updated

  Scenario: admin user adding employee
    Given User is on orangehm  homepage
    When user "Add Employee"
    Then user lands on "New Employee" Page
    And user can see fields like
    |first name|last name|date of birth|