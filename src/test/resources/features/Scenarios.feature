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
    And Wait 10 seconds
    And Check if the successful message comes
    Then Click to close button


  Scenario: TC02_User will receive the verify mail

    Given Navigated to url
    And Wait 2 seconds
    When Verify that home page is visible successfully
    And Click to register button from dropdown
    And Type an email to email box
    And Click to continue button
    And Check if the email sent successfully message comes as "Doğrulama maili gönderildi"


  Scenario: TC_03_User can not login with wrong email

    Given Navigated to url
    And Wait 2 seconds
    When Verify that home page is visible successfully
    And Click to login button from dropdown
    And Type an email to email box
    And Click to login button
    Then Check if the error message comes as "E-posta adresi eksik veya hatalı."







