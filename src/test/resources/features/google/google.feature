Feature: Google

   Google search

   Scenario: Finding cheese
      Given I am on the Google search page
      When I search for "Cheese!"
      Then the page title should start with "cheese"

   Scenario Outline: Finding some things
      Given I am on the Google search page
      When I search for "<keyword>"
      Then the page title should start with "<title>"

      Examples:
         | keyword   | title    |
         | Cheese!   | cheese   |
         | Awesome!  | awesome  |
         | Colombia! | colombia |