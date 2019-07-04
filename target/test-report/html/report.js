$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/login.feature");
formatter.feature({
  "name": "Log in",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Sign-up Individual provider",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to \"https://ui-int.fndev.net/login\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "login.iNavigateToLoginPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the username as \"buyer.admin\" and password as \"buyer.admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "login.iEnterTheUsernameAsAndPasswordAs(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on login button",
  "keyword": "When "
});
formatter.match({
  "location": "login.iClickOnLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I will see the \"Flightboard\" page",
  "keyword": "Then "
});
formatter.match({
  "location": "login.iWillSeeThePage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});