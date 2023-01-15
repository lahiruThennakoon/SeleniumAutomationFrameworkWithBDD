Feature:To test the google search
  Scenario Outline: Check google search is successful with multiple search

    Given page is loaded
    When user clicks on search box
    And  user type the <key>
    And user add the <key2> and search
    And clicks on search button
    Then user should navigate to the results sheet

    Examples:
      |key|key2|
      |"lahiru"|" thennakoon"|
      |"menaka"|" Maduwanthi"|