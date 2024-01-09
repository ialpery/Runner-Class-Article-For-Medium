Feature: Search "iPhone" and add to cart a product

  Scenario: TC01_User will search "iPhone"

    Given Navigated to url
    And Wait 2 seconds
    When Verify that home page is visible successfully
    And Click the search bar
    And Type "iPhone"
    And Click to search button
    And Check if the result text include "iPhone"
    And Click to first product
    And Wait 2 seconds
    And Click to add to cart button
    And Check if the successful message comes
    Then Click to close button


Feature: Register Scenarios

  Scenario: TC02_User will receive the verify mail

    Given Navigated to url
    And Wait 2 seconds
    When Verify that home page is visible successfully
    And Click to register button
    And Type an email to email box
    And Click to continue button
    And Check if the "verify mail sent to email" message


Feature: Trying to login with wrong email

  Scenario: TC_03_User can not login with wrong email

    Given Navigated to url
    And Wait 2 seconds
    When Verify that home page is visible successfully
    And Click to login button
    And Type an email to email box
    And Click to login button
    Then Check if the "Email address is missing or incorrect" message comes






