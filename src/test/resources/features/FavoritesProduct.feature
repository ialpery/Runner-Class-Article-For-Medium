Feature: Add a product to favorites

  Scenario: TC04_User favorites the most expensive product from Moda ve Güzellik tab

    Given Navigated to url
    And Wait 2 seconds
    And Switch to Moda ve Güzellik tab
    And Click to image of the tab
    And Click to Sıralama dropdown
    And Select to En yüksek fiyat selection
    And Click to heart icon of the first product
    Then Verify that navigated to login page





