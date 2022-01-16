Feature: Lg product purchasing

  @wip
  Scenario Outline: Lg Search functionality
    Given User is on LG home page
    When User types "<searchValue>" in the lg search box
    And User clicks lg search button
    Then User sees "<expectedMainHeaders>" is in the main header
    Then User sees "<expectedTitle>" is in the lg title

    Examples: Search terms we are going to use in this template is as below
      | searchValue      | expectedMainHeaders | expectedTitle    |
      |AUDIO             |AUDIO               |AUDIO             |
      |TV / VIDEO        |TV / VIDEO          |TV / VIDEO        |
      |KITCHEN           |KITCHEN             |KITCHEN           |
      |LAUNDRY           |LAUNDRY             |LAUNDRY           |
      |OTHER APPLIANCES  |OTHER APPLIANCES    |OTHER APPLIANCES  |
#      | Ibrahim Tatlises | Ibrahim Tatlises   | Ibrahim Tatlises |
