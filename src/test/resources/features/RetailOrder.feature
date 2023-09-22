 @addToCart
Feature: Retail OderPage

  Background: 
    Given User is on retTrail website homepage
    When User Click on Login link
    And User enter email 'naweed.kpu@gmail.com' and password 'Nh@123@123'
    And User click on Login button
    Then Verify user is logged in

  @addToCart
  Scenario: Verify User can add an item to cart
    And User change the category to 'Smart Home'
    And User search for an item ' kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity ‘2’
    And User click add to Cart button
    Then the Cart icon guantity should change to '2'
