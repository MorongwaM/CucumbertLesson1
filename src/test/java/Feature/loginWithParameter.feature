Feature: feature to test login in Mercury new tourss

  Scenario Outline: validate login to Mercury tours is workings

    Given browser is openeds
    And user is on home pages
    When user click login links
    And the user enter <usernames> and <passwords>
    And user click submit buttons
    Then user is navigated to the Mercury home pages


    Examples:
      | usernames | passwords |
      | Test     | Test     |
      | Test1     | Test1    |