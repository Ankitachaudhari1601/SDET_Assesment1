$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginSendMessage.feature");
formatter.feature({
  "line": 2,
  "name": "New User registration.",
  "description": "",
  "id": "new-user-registration.",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@featuretag"
    }
  ]
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Navigate to ELEARNING UPSKILL URL and Login and Sent message",
  "description": "",
  "id": "new-user-registration.;navigate-to-elearning-upskill-url-and-login-and-sent-message",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "Completed the registration process",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "enter any value \"\u003cUsername\u003e\" in Username field",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "enter any value \"\u003cPass\u003e\" in Pass field",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "click on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Click on  Compose hyperlink icon",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "enter any value \"\u003csent to\u003e\" in Sent to field",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "enter any value \"\u003cSubject\u003e\" in Sent to field",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "enter any value \"\u003cMessage\u003e\" in Sent to field",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "enter any value \"\u003cDescription\u003e\" in Sent to field",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "click on \"\u003cSent Message\u003e\" icon",
  "keyword": "Then "
});
formatter.examples({
  "line": 23,
  "name": "",
  "description": "",
  "id": "new-user-registration.;navigate-to-elearning-upskill-url-and-login-and-sent-message;",
  "rows": [
    {
      "cells": [
        "Username",
        "Pass",
        "sent to",
        "Subject",
        "Message",
        "Descriptiopn"
      ],
      "line": 24,
      "id": "new-user-registration.;navigate-to-elearning-upskill-url-and-login-and-sent-message;;1"
    },
    {
      "cells": [
        "Ankitachaudhari5454Ankitachaudhari5454",
        "Password@5454",
        "Ankita",
        "Sending email",
        "Sending message",
        "DSending an message to validae functionality"
      ],
      "line": 25,
      "id": "new-user-registration.;navigate-to-elearning-upskill-url-and-login-and-sent-message;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3157994100,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "Navigate to ELEARNING UPSKILL URL and SENT Message",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 25,
  "name": "Navigate to ELEARNING UPSKILL URL and Login and Sent message",
  "description": "",
  "id": "new-user-registration.;navigate-to-elearning-upskill-url-and-login-and-sent-message;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@featuretag"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "Completed the registration process",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "enter any value \"Ankitachaudhari5454Ankitachaudhari5454\" in Username field",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "enter any value \"Password@5454\" in Pass field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "click on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Click on  Compose hyperlink icon",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "enter any value \"Ankita\" in Sent to field",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "enter any value \"Sending email\" in Sent to field",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "enter any value \"Sending message\" in Sent to field",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "enter any value \"\u003cDescription\u003e\" in Sent to field",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "click on \"\u003cSent Message\u003e\" icon",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.completed_the_registration_process()"
});
formatter.result({
  "duration": 8299060300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ankitachaudhari5454Ankitachaudhari5454",
      "offset": 17
    }
  ],
  "location": "StepDefination.enter_any_value_in_Username_field(String)"
});
formatter.result({
  "duration": 181132900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Password@5454",
      "offset": 17
    }
  ],
  "location": "StepDefination.enter_any_value_in_Pass_field(String)"
});
formatter.result({
  "duration": 183622700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.click_on_Login_Button()"
});
formatter.result({
  "duration": 6530889200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.click_on_Compose_hyperlink_icon()"
});
formatter.result({
  "duration": 2629164700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ankita",
      "offset": 17
    }
  ],
  "location": "StepDefination.enter_any_value_in_Sent_to_field(String)"
});
formatter.result({
  "duration": 16449834500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sending email",
      "offset": 17
    }
  ],
  "location": "StepDefination.enter_any_value_in_Sent_to_field(String)"
});
formatter.result({
  "duration": 16334800000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sending message",
      "offset": 17
    }
  ],
  "location": "StepDefination.enter_any_value_in_Sent_to_field(String)"
});
formatter.result({
  "duration": 16078741400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cDescription\u003e",
      "offset": 17
    }
  ],
  "location": "StepDefination.enter_any_value_in_Sent_to_field(String)"
});
formatter.result({
  "duration": 16150091600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cSent Message\u003e",
      "offset": 10
    }
  ],
  "location": "StepDefination.click_on_icon(String)"
});
formatter.result({
  "duration": 5531492800,
  "status": "passed"
});
formatter.after({
  "duration": 139176300,
  "status": "passed"
});
formatter.uri("test.feature");
formatter.feature({
  "line": 2,
  "name": "New User registration.",
  "description": "",
  "id": "new-user-registration.",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@featuretag"
    }
  ]
});
formatter.before({
  "duration": 1599921100,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "Navigate to ELEARNING UPSKILL URL and complete the registraction process",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 6,
  "name": "Navigate to ELEARNING UPSKILL URL",
  "description": "",
  "id": "new-user-registration.;navigate-to-elearning-upskill-url",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "User should be navigated to the ELEARNING UPSKILL URL",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Click on Sign Up Button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Enter all mandatory field",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Click on Register Button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "registration should be successful",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.user_should_be_navigated_to_the_ELEARNING_UPSKILL_URL()"
});
formatter.result({
  "duration": 8188190700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.click_on_Sign_Up_Button()"
});
formatter.result({
  "duration": 3981655200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.enter_all_mandatory_field()"
});
formatter.result({
  "duration": 2426630200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.click_on_Register_Button()"
});
formatter.result({
  "duration": 942811200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.registration_should_be_successful()"
});
formatter.result({
  "duration": 105700,
  "status": "passed"
});
formatter.after({
  "duration": 251654400,
  "status": "passed"
});
});