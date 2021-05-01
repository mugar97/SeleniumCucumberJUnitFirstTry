Feature: Google2

   Google search

   Scenario: Finding cheese2
      Given I am on the Google search page
      When I search for "Magic!"
      Then the page title should start with "magic"

   Scenario Outline: Finding some things
      Given I am on the Google search page
      When I search for "<keyword>"
      Then the page title should start with "<title>"

      Examples:
         | keyword    | title     |
         | Mark!   | mark   |
         | Great!  | great  |
         | Avengers! | avengers |