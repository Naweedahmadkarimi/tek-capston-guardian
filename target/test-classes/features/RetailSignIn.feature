@TestOne
Feature: Sign in TekRetail Application

  Background: 
    Given User is on retail website

  Scenario: Verify user can sign in into Retail Application
    Given User click on Sign in option
    And User enter email "naweed.kpu@gmail.com" and password "Nh@123@123"
    And User click on login button
    Then User should be logged in into Account

  Scenario: Verify user can create an account into Retail Website
    Given User click on Sign in option
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name | email                     | password  | confirmPassword |
      | Amir | Amirkaimi123@tekschool.us | Tek@12345 | Tek@12345       |
    And User click on SignUp button
    Then User should be logged into account page
