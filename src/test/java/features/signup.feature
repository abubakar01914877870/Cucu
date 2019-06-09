Feature: Provider, buyer, service company sign up test 
  
  Scenario: Individual provider sign up
    Given I navigate to 'https://marketing.fndev.net/signup' page
    Given I  filled up individual provider sign up form one
    When I filled up sign up form One
            |Abu Bakar |
            |Siddique |
            |18005035263         |
            |email               |
            |1234qa              |
            |I am looking for work|

    When I filled up sign up form Two
      |Just me              |
      |General IT          |
      |55112               |
      |United States of America|
    Then I expect page with text "Check your inbox for a verification email"

