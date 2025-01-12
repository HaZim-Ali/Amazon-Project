Feature: select other category
#@Monkey
  Scenario: Ensure to select new category and go to category page

      #    Given navigate to website and go to home page
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


