Feature: User can login and register for website

  Background: Given I am on the Signup/login page

    Scenario: Verify user clicks login/signup button
      Given I am on the home page
      When Signup/login is clicked
      Then Signup/Login page is displayed