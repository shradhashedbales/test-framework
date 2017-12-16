Feature: Employee information
  As a end user
  i want to navigate to PIM Option
  and use the employee information


  @smoke1
  Scenario: Admin can add an employee with
    Given I am in login page
    And I select "Admin" as username
    And I select as  "HZzzHOIO" as password
    And I can login successfully
    When user navigates to pim page
    Then user navigates to add employee page
    And user enters details of employee


