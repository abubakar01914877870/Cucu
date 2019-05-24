Feature:  login
  Scenario: login wit user name and password
    Given I navigate to login page
    And I enter the username as "admin" and password as "admin password"
    When I click on login button
    Then I will see the list page