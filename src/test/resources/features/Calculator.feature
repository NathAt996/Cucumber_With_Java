Feature: Calculator Addition
  As a user, I want to add two numbers together
  So that I can view the correct sum

  Scenario: Add two positive integers
    Given the calculator is open
    When I add 2 and 4
    Then the result should be 6