Feature: LogIn

  Scenario: Log In To The System
    Given Go to HRMS page
    When User enter login information
    And Click log in button
    Then They can see Timesheet page