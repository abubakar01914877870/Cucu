Feature:  Sign-up Individual provider in https://marketing.fndev.net/signup
  Scenario: Sign-up Individual provider
    Given I navigate to "https://ui-int.fndev.net/login" page
    And I enter the username as "buyer.admin" and password as "buyer.admin"
    When I click on login button
    Then I will see the list page