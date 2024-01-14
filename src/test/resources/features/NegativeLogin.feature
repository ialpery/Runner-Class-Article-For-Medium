Feature: Negative Login

  @login @smoke @regression
  Scenario: TC_03_User can not login with wrong email

    Given Navigated to url
    And Wait 2 seconds
    When Verify that home page is visible successfully
    And Click to login button from dropdown
    And Type an email to email box
    And Click to login button
    Then Check if the error message comes as "E-posta adresi eksik veya hatalı."

