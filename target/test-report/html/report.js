$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/signup.feature");
formatter.feature({
  "name": "Provider, buyer, service company sign up test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Individual provider sign up",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to \u0027https://marketing.fndev.net/signup\u0027 page",
  "keyword": "Given "
});
formatter.match({
  "location": "login.iNavigateToLoginPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I filled up sign up form One",
  "rows": [
    {
      "cells": [
        "provider"
      ]
    },
    {
      "cells": [
        "Individual"
      ]
    },
    {
      "cells": [
        "18005035263"
      ]
    },
    {
      "cells": [
        "email"
      ]
    },
    {
      "cells": [
        "1234qa"
      ]
    },
    {
      "cells": [
        "I am looking for work"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepsSignUp.iFilledUpSignUpFormOne(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I filled up sign up form Two",
  "rows": [
    {
      "cells": [
        "Just me"
      ]
    },
    {
      "cells": [
        "General IT"
      ]
    },
    {
      "cells": [
        "55112"
      ]
    },
    {
      "cells": [
        "United States of America"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepsSignUp.iFilledUpSignUpFormTwo(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect page with text \"Check your inbox for a verification email\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsSignUp.iExpectPageWithText(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Buyer Sign up",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to \u0027https://marketing.fndev.net/signup\u0027 page",
  "keyword": "Given "
});
formatter.match({
  "location": "login.iNavigateToLoginPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I filled up sign up form One",
  "rows": [
    {
      "cells": [
        "Buyer"
      ]
    },
    {
      "cells": [
        "Company"
      ]
    },
    {
      "cells": [
        "18005203698"
      ]
    },
    {
      "cells": [
        "email"
      ]
    },
    {
      "cells": [
        "1234qa"
      ]
    },
    {
      "cells": [
        "I need workers"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepsSignUp.iFilledUpSignUpFormOne(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I filled up sign up form Two buyer",
  "keyword": "When "
});
formatter.match({
  "location": "StepsSignUp.iFilledUpSignUpFormTwoBuyer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect page with text \"One job or many, near or far, find expert contractors wherever your work takes you.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsSignUp.iExpectPageWithText(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});