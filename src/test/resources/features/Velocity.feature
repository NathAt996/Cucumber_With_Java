Feature: Calculate velocity
  In order to verify the physics calculations
  As a physics student
  I want to calculate the final velocity of an object

  Scenario: Calculate final velocity with constant acceleration
    Given an object with an initial velocity of 10 and an acceleration of 2
    When the time elapsed is 5 seconds
    Then the final velocity should be 20