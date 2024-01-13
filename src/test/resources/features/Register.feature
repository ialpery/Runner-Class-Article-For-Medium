Feature: Try to Register and get the Verify Email

  Scenario: TC02_User will receive the verify mail

    Given Navigated to url
    And Wait 2 seconds
    When Verify that home page is visible successfully
    And Click to register button from dropdown
    And Type an email to email box
    And Click to continue button
    And Check if the email sent successfully message comes as "Doğrulama maili gönderildi"











