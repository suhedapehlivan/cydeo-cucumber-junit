
Feature: Register user

  @aetask1
  Scenario: User login, register succesfully and delete account
    Given user is on 'automationexercise.com'
    When Click on Signup Login button
    And Enter name and email address
    And Click Signup button
    And Fill details: Title, Name, Email, Password, Date of birth
    And Select checkbox Sign up for our newsletter!
    And Select checkbox Receive special offers from our partners!
    And Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    And Click Create Account button
    When Click Continue button
    And Click Delete Account button
    Then Verify that ACCOUNT DELETED! is visible and click Continue button