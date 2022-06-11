$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/TechFiosLoginUseDataFromDatabase.feature");
formatter.feature({
  "line": 2,
  "name": "TechFios Billing Login Functionality Validation",
  "description": "",
  "id": "techfios-billing-login-functionality-validation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@DBLoginFeature"
    },
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "duration": 12917095500,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "1 User should be able to login valid credentials",
  "description": "",
  "id": "techfios-billing-login-functionality-validation;1-user-should-be-able-to-login-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@DbScenario1"
    },
    {
      "line": 4,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is on Techfios login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters \"username\" fromTechfios database",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enters \"password\" fromTechfios database",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User click signin button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User should land on dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefination.user_is_on_techfios_login_page()"
});
formatter.result({
  "duration": 2210799400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 13
    }
  ],
  "location": "LoginStepDefination.user_enters_fromTechfios_database(String)"
});
formatter.result({
  "duration": 6150449400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 13
    }
  ],
  "location": "LoginStepDefination.user_enters_fromTechfios_database(String)"
});
formatter.result({
  "duration": 2377312800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_click_signin_button()"
});
formatter.result({
  "duration": 6343822400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_should_land_on_dashboard_page()"
});
formatter.result({
  "duration": 2949629900,
  "status": "passed"
});
formatter.after({
  "duration": 3237851900,
  "status": "passed"
});
});