Feature: discover the login page

  Scenario: go to github login page
  Given user visit the website
    When search create-react-app
    And user clicks on search button
    Then user can see the search result

