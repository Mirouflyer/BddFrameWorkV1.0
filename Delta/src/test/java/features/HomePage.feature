Feature: SearchBox Functionality check

  @SmokeTest @Regression
  Scenario: Delta searchBox functionality check
    Given user is on the Delta Home Page
    When  user clicks on search button
    And   user enter "Cancel Flight" in the search box
    Then  user should see search results "Search Results:" window displayed