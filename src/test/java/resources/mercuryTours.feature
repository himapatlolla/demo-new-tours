Feature: Booking a flight
  Scenario:  User should be able to Register successfully
    Given user is on homepage
    When selects Register
    And enters all the required registration information
    And selects submit
    Then user should successfully register