Feature: User Authentication
  As a user, I want to be able to log in to my account
  So that I can view my content

  Scenario: Successful login with valid credentials
    Given I am on the login page
    When I enter a valid username and password
    Then I should be navigated to the home page