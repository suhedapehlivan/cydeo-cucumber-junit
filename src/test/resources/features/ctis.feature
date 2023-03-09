Feature: Login functionality
  As a user, I should be login; so that I can land on homepage

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user is on the ctis login page


  Scenario: Login with valid username and valid password
    When user types valid email
    And user types valid password
    And user click to login button
    Then user should see title is Portal

  Scenario: Login with valid username and valid password
    When user types username "helpdesk1@cybertekschool.com"
    And user types password "UserUser"
    And user click to login button
    Then user should see title is Portal


  Scenario: Login with valid username and valid password
    When user types valid email and valid password
    |hr17@cybertekschool.com|
    |       UserUser        |
    And user click to login button
    Then user should see title is Portal


  @ctis
  Scenario Outline: Login with valid username and valid password
    When user types username "<username>" as user
    And user types password "<password>" as user
    And user click to login button
    Then user should see title is Portal

    Examples:
      | username                       | password |
      | helpdesk18@cybertekschool.com  | UserUser |
      | marketing16@cybertekschool.com | UserUser |
      | hr65@cybertekschool.com        | UserUser |




