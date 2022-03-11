Feature: registration functionality

  Scenario: Register a new user

    Given user is in home page
    When admin enters users details on the registration form
    And admin click register button
    Then new user is added to the database
