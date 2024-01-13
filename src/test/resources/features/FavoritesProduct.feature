Feature: Hepsiburada Test Scenarios


  Scenario: TC_03_User can not login with wrong email

    Given Navigated to url
    And Wait 2 seconds
    When Verify that home page is visible successfully
    And Click to login button from dropdown
    And Type an email to email box
    And Click to login button
    Then Check if the error message comes as "E-posta adresi eksik veya hatalı."


  Scenario: TC04_User favorites the most expensive product from Moda ve Güzellik tab

    Given Navigated to url
    And Wait 2 seconds
    And Switch to Moda ve Güzellik tab
    And Click to image of the tab
    And Click to Sıralama dropdown
    And Select to En yüksek fiyat selection
    And Click to heart icon of the first product
    Then Verify that navigated to login page





