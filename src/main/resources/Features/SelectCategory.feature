Feature: select other category
@Monkey
  Scenario: Ensure to select new category and go to category page

      #    Given navigate to website and go to home page
    When go to search bar and write air pods name
    And click on search button
    And select on Audio
    And click add to basket
    And navigate to home page
    And click on cart button
    And click on category button
    And select TVs and Electronics
    And select televisions

