Feature: User can login and register for website

  Background: Given I am on the Signup/login page

    Scenario: Verify the homepage is visible
      Given I launch the browser
      When I open the login page
      Then I should see the homepage