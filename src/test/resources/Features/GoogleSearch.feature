Feature: feature to search Google search functionality

  Scenario: Validate that Google search is working

    Given browser is open
    And user is on google page
    When user enters text in search box
    And this enter
    Then user is navigated to search results


