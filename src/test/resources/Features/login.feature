#Author - Nora
# Data - 01/01/2023
# Description - test project

@SmokeScenario
Feature: feature to test login functionality

  @SmokeTest
  Scenario: Check login is successful with valid credentials

    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user navigated to the home page


