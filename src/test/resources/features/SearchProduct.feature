Feature: Hepsiburada Test Scenarios

  Scenario: TC01_User will search "iPhone"

    Given Navigated to url
    And Wait 2 seconds
    When Verify that home page is visible successfully
    And Click the search icon
    And Type "macbook"
    And Click to search button
    And Check if the result text include "macbook"
    And Click to first product
    And Wait 1 seconds
    And Click to add to cart button
    And Wait 1 seconds
    And Check if the successful message comes
    Then Click to close button








