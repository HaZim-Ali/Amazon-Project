Feature: Ensure to add products to the cart successfully
#  @Monkey
  Scenario: Verify to select one product

#    Given navigate to website and go to home page
    When go to search bar and write air pods name
    And click on search button
    And select on Audio
    And click add to basket
    And navigate to home page

