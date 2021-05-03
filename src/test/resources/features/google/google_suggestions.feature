Feature: Google Stats from suggestions

   Google search with suggestions

   Scenario Outline: Reading stats from new tab
      Given I am on the Google search page
      When I write the "<keyword>" on the search bar
      And I click on the suggestion <suggestionIndex>
      And I go to the "Noticias" tab
      Then the page stats should start with "Cerca de"

      Examples:
         | keyword  | suggestionIndex |
         | Selenium | 3               |
         | docker   | 2               |
