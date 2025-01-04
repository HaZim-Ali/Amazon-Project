Feature: Ensure the products added to cart

  Scenario: Verify the cart have a one product
    #    Given navigate to website and go to home page
    When go to search bar and write air pods name
    And click on search button
    And select on Audio
    And click add to basket
    And navigate to home page
    And click on cart button