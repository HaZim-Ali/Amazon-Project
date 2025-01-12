Feature: To login functionality
#@Monkey
  Scenario: Verify login successfully
    When go to search bar and write air pods name
    And click on search button
    And select on Audio
    And click add to basket
    And navigate to home page
    And click on cart button
    And click on electronics button
    And click on laptop category
    And click on gaming laptop
    And select laptop from electronics
    And Add laptop to the cart
    And confirmed add to cart
    Then click on proceed to buy
    And fill valid email
    And click on continue
#@Monkey
    Scenario Outline: Verify user login with invalid data
      When go to search bar and write air pods name
      And click on search button
      And select on Audio
      And click add to basket
      And navigate to home page
      And click on cart button
      And click on electronics button
      And click on laptop category
      And click on gaming laptop
      And select laptop from electronics
      And Add laptop to the cart
      And confirmed add to cart
      Then click on proceed to buy
      And fill invalid "<email>"
      And click on continue

      Examples:
      | email |
      |e94sd@freesourcecodes.com|
      |fbxj5@freesourcecodes.com|
      |43s7l@freesourcecodes.com|