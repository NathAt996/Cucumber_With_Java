Feature: Calculate the hypotenuse of a triangle
  In order to verify the calculations
  As a mathematics student
  I want to calculate the hypotenuse of a triangle

  Scenario: Calculate hypotenuse of a triangle with Pythagoras Theorem
    Given a triangle with side length of 4 and another side length of 3
    When I calculate 4 and 3
    Then the hypotenuse should be 5