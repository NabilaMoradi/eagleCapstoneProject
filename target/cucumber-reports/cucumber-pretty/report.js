$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/login.feature");
formatter.feature({
  "line": 2,
  "name": "Login to Retail website",
  "description": "",
  "id": "login-to-retail-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Test"
    }
  ]
});
formatter.before({
  "duration": 3388850301,
  "status": "passed"
});
formatter.background({
  "comments": [
    {
      "line": 3,
      "value": "# In feature will be use a comment"
    },
    {
      "line": 4,
      "value": "#Every Feature file starts with Feature: \u003cName of Feature\u003e"
    }
  ],
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "User is on Retail Website",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginTestStepDef.user_is_on_Retail_Website()"
});
formatter.result({
  "duration": 2397267200,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Login to MyAccount",
  "description": "",
  "id": "login-to-retail-website;login-to-myaccount",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@login"
    },
    {
      "line": 8,
      "name": "@Regression"
    },
    {
      "line": 8,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User click on MyAccount",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User click on Login",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User enter userName \u0027eagles@tekschool.us\u0027 and password \u0027eagles\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User should be logged in to myAccount Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTestStepDef.user_click_on_MyAccount()"
});
formatter.result({
  "duration": 69265000,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestStepDef.user_click_on_Login()"
});
formatter.result({
  "duration": 1417251200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "eagles@tekschool.us",
      "offset": 21
    },
    {
      "val": "eagles",
      "offset": 56
    }
  ],
  "location": "LoginTestStepDef.user_enter_userName_and_password(String,String)"
});
formatter.result({
  "duration": 433394900,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestStepDef.user_click_on_Login_button()"
});
formatter.result({
  "duration": 511772000,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestStepDef.user_should_be_logged_in_to_myAccount_Dashboard()"
});
formatter.result({
  "duration": 5176292900,
  "status": "passed"
});
formatter.after({
  "duration": 712107000,
  "status": "passed"
});
});