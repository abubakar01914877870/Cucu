$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/signup_pinterest.feature");
formatter.feature({
  "name": "Sign up user in https://www.pinterest.com/",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Sign up user account",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to pinterest \"https://www.pinterest.com/\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepSignupPinterest.iNavigateToPinterestPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I input email password and click Continue button",
  "keyword": "When "
});
formatter.match({
  "location": "StepSignupPinterest.iInputEmailPasswordAndClickContinueButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I complete user sign up next step",
  "keyword": "When "
});
formatter.match({
  "location": "StepSignupPinterest.iCompleteUserSignUpNextStep()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Sign up user account",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to pinterest \"https://www.pinterest.com/\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepSignupPinterest.iNavigateToPinterestPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I input email password and click Continue button",
  "keyword": "When "
});
formatter.match({
  "location": "StepSignupPinterest.iInputEmailPasswordAndClickContinueButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I complete user sign up next step",
  "keyword": "When "
});
formatter.match({
  "location": "StepSignupPinterest.iCompleteUserSignUpNextStep()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});