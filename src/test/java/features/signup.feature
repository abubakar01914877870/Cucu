#Feature: Provider, buyer, service company sign up test
#
#  Scenario: Individual provider sign up
#    Given I navigate to 'https://marketing.fndev.net/signup' page
#    When I filled up sign up form One
#            |provider |
#            |Individual |
#            |18005035263         |
#            |email               |
#            |1234qa              |
#            |I am looking for work|
#
#    When I filled up sign up form Two
#      |Just me              |
#      |General IT          |
#      |55112               |
#      |United States of America|
#    Then I expect page with text "Check your inbox for a verification email"
#
#  Scenario: Individual Canadian provider sign up
#    Given I navigate to 'https://marketing.fndev.net/signup' page
#    When I filled up sign up form One
#      |provider |
#      |Individualcanada |
#      |18005035263         |
#      |email               |
#      |1234qa              |
#      |I am looking for work|
#
#    When I filled up sign up form Two
#      |Just me              |
#      |General IT          |
#      |K1N 6N5              |
#      |Canada|
#    Then I expect page with text "Check your inbox for a verification email"
#
#  Scenario: Buyer Sign up
#    Given I navigate to 'https://marketing.fndev.net/signup' page
#    When I filled up sign up form One
#            |Buyer|
#            |Company|
#            |18005203698|
#            |email      |
#            |1234qa     |
#            |I need workers|
#    When I filled up sign up form Two buyer
#    Then I expect page with text "One job or many, near or far, find expert contractors wherever your work takes you."
#
#
#  Scenario: Service Company  sign up
#    Given I navigate to 'https://marketing.fndev.net/signup' page
#    When I filled up sign up form One
#      |service |
#      |company |
#      |18005035264         |
#      |email               |
#      |1234qa              |
#      |I am looking for work|
#    When I filled up sign up form Two for service company
#      |Up to ten service providers             |
#      |733 Marquette Avenue S      |
#      |Minneapolis                 |
#      |MN                          |
#      |55113               |
#    Then I expect page with text "Check your inbox for a verification email"