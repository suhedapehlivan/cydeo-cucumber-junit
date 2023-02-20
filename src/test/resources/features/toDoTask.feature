@Todo
Feature: Adding Todo List
  User story:
  As a user, I should able to add 2 todo item and re-edit these items

  Background: For the scenarios in the feature file, user is expected to be on website page
    Given user is on the Todo home page

  @Action
  Scenario: Adding two todo items and editing one of them

    When user click Javascript tab
    And user select Polymer link
    And user add first todo item and second item
    Then user should re-edit second item