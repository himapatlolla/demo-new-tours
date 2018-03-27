Feature: Booking a flight

  Scenario:  User should be able to Register successfully
    Given user is on homepage
    When selects Register
    And enters all the required registration information
    And selects submit
    Then user should successfully register

  Scenario Outline: : User can login successfully
    Given user is on homepage
    When selects sign-in button
    And fills "<Username>" and "<Password>" fields
    And selects submit button
    Then user should successfully login
    Examples:
      | username     | password |
      | himapatlolla | user1234 |

