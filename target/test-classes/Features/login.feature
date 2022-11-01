@gmail
Feature: To validate the login functionaly of gmail application

  Background: 
    Given The user should be in the gmail login page

  @validlogin
  Scenario: To  validate gmail login with valid credentials
    When The user has to enter the username and click the next button
    When The user has to enter the password and click the next button
    Then To validate the user profile for the valid login

  @invalidlogin
  Scenario: To  validate gmail login with Invalid credentials
    When The user has to enter the username and click the next button
    When The user has to enter the invalid password and click the next button
    Then To validate the user profile for the Invalid valid login
