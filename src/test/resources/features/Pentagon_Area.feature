Feature: Calculate the area of a specific pentagon
  The purpose of this feature is to verify the pentagon area calculation.

  Scenario: Calculate the area of a specific pentagon
    Given a pentagon with side lengths of 5.0
    When I calculate the area
    Then the pentagon area should be 43.01193309536832