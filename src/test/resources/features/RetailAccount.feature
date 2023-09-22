 @test
Feature: Retail Account Page

  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'Naweed' and Phone '06662222'
    And User click on Update button
    Then user profile information should be updated

  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 3333444455556666 | HajiAmir   |              12 |           2028 |          530 |
    And User click on Add your card button
    Then a message should be displayed ‘Payment Method added successfully’

  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber      | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 999988887777555 | Karimi     |              11 |           2030 |          340 |
    And user click on Update Your Card button
    Then a message should be displayed ‘Payment Method updated Successfully’

  Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
    And User click on remove option of card section
    Then payment details should be removed

  Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add address option
    And user fill new address form with below information
      | country       | fullName     | phoneNumber | streetAddress  | apt  | city | state      | zipCode |
      | United States | Naweed Ahmad |  2076622102 | 25611 30th AVE | F303 | Kent | Washington |   98032 |
    And User click Add Your Address button
    Then a message should be displayed ‘Address Added Successfully’

  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And user fill new address form with below information
      | country     | fullName          | phoneNumber | streetAddress  | apt | city | state    | zipCode |
      | Afghanistan | NaweedAhmadKarimi |  0729300060 | 23820 30Th AVE | A3  | kent | Virginia |   98111 |
    And User click update Your Address button
    Then a message should be displayed ‘Address Updated Successfully’

 
  Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed
