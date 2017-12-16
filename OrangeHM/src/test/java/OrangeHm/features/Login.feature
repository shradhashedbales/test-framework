Feature:Orange HRM overall Functionality
  As a end user
  I want to use the website for the information of employees
  So that i can login and use th eemployee information


  @smoke3
  Scenario:login page with valid credentials
    Given I am in login page
    When I select "Admin" as username
    And I select as  "HZzzHOIO" as password
    Then I can login successfully

  @smoke2
  Scenario:login page with valid credentials
    Given I am in login page
    When I select "Admin" as username
    And I select as  "HZzzHOIO" as password
    Then I can login successfully

  Scenario: Home page navigation
    Given user is on login page
    When user navigates to pim page
    Then user can see all the options on pim page successfully


  Scenario: To add employee information
    Given  user navigates to add employee page
    When   user enters details of employee
    Then   user navigates to personal details



  @login @smoke2
  Scenario Outline: login page with invalid credentials
    Given I am in login page
    When I select "<username>" as username
    And I select as  "<password>" as password
    And I click login button
    Then I should see the login error message as "<message>"
    And I should be on the "<pageName>" page
    Examples:
      | username | password | message                  | pageName         |
     # |          | shi98w34 | Username cannot be empty | login            |
     # | admine   |          | Password cannot be empty | login            |
       | sdfsd    | dsfdfd   | Retry Login              | Retry Login page |
       | Admin    | HZzzHOIO |                          |                  |
#      | sdfsdf   | HZzzHOIO | Retry Login              | Retry Login page |

