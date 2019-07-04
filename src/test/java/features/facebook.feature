Feature: Facebook log in

  @facebook
  Scenario: Facebook login with UI
    Given I navigate to "https://www.facebook.com" page
    And I login with facebook id "01914877870" and password "01914877870f"
    When I store cookie