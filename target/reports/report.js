$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/CheckIphone.feature");
formatter.feature({
  "line": 2,
  "name": "Login In",
  "description": "",
  "id": "login-in",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "User should enter the system with correct information (Positive Test)",
  "description": "",
  "id": "login-in;user-should-enter-the-system-with-correct-information-(positive-test)",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Me as user should open the site Facebook.com",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User should enter his the email address where its required",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User should enter his password in the line Password",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User will enter the bottom Log In",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User should successfully enter by the system",
  "keyword": "Then "
});
formatter.match({
  "location": "CheckIphoneSteps.me_as_user_should_open_the_site_Facebook_com()"
});
formatter.result({
  "duration": 195899200,
  "status": "passed"
});
formatter.match({
  "location": "CheckIphoneSteps.user_should_enter_his_the_email_address_where_its_required()"
});
formatter.result({
  "duration": 105400,
  "status": "passed"
});
formatter.match({
  "location": "CheckIphoneSteps.user_should_enter_his_password_in_the_line_Password()"
});
formatter.result({
  "duration": 88200,
  "status": "passed"
});
formatter.match({
  "location": "CheckIphoneSteps.user_will_enter_the_bottom_Log_In()"
});
formatter.result({
  "duration": 28500,
  "status": "passed"
});
formatter.match({
  "location": "CheckIphoneSteps.user_should_successfully_enter_by_the_system()"
});
formatter.result({
  "duration": 87000,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "User should enter the system with incorrect information (Negative Test)",
  "description": "",
  "id": "login-in;user-should-enter-the-system-with-incorrect-information-(negative-test)",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "Me as user should open the site Facebook.com",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User should enter his the email address where its required",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User should enter incorrect password in the line Password",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User will enter the bottom Log In",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User will be an able to enter the system as answer from the system",
  "keyword": "Then "
});
formatter.match({
  "location": "CheckIphoneSteps.me_as_user_should_open_the_site_Facebook_com()"
});
formatter.result({
  "duration": 111700,
  "status": "passed"
});
formatter.match({
  "location": "CheckIphoneSteps.user_should_enter_his_the_email_address_where_its_required()"
});
formatter.result({
  "duration": 119700,
  "status": "passed"
});
formatter.match({
  "location": "CheckIphoneSteps.user_should_enter_incorrect_password_in_the_line_Password()"
});
formatter.result({
  "duration": 39500,
  "status": "passed"
});
formatter.match({
  "location": "CheckIphoneSteps.user_will_enter_the_bottom_Log_In()"
});
formatter.result({
  "duration": 28900,
  "status": "passed"
});
formatter.match({
  "location": "CheckIphoneSteps.user_will_be_an_able_to_enter_the_system_as_answer_from_the_system()"
});
formatter.result({
  "duration": 40900,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "проверка вычитания",
  "description": "",
  "id": "login-in;проверка-вычитания",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "Я должен зайти на сайт svetofor kg",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "Я должен найти наушники для Iphone",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "У меня на карте 100 usd",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Наушники стоят 30 usd",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Я нажимаю на кнопку купить",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "Сайт должен снять со счета 30 usd",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "У меня на карте должен остаться 70 usd",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "CheckIphoneSteps.яДолженНайтиНаушникиДляIphone()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 16
    }
  ],
  "location": "CheckIphoneSteps.уМеняНаКартеUsd(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "30",
      "offset": 15
    }
  ],
  "location": "CheckIphoneSteps.наушникиСтоятUsd(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CheckIphoneSteps.яНажимаюНаКнопкуКупить()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "arguments": [
    {
      "val": "70",
      "offset": 32
    }
  ],
  "location": "CheckIphoneSteps.уМеняНаКартеДолженОстатьсяUsd(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 29,
  "name": "Receive August salary",
  "description": "",
  "id": "login-in;receive-august-salary",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 30,
  "name": "I need to receive my month salary",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "I need to check online my bank account by ibank.com",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "In my account previously i had 100usd",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I will receive 3000usd as august salary",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "Total in my bank account supposed to be 3100usd",
  "keyword": "Then "
});
formatter.match({
  "location": "CheckIphoneSteps.i_need_to_receive_my_month_salary()"
});
formatter.result({
  "duration": 101700,
  "status": "passed"
});
formatter.match({
  "location": "CheckIphoneSteps.i_need_to_check_online_my_bank_account_by_ibank_com()"
});
formatter.result({
  "duration": 56600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 31
    }
  ],
  "location": "CheckIphoneSteps.in_my_account_previously_i_had_usd(int)"
});
formatter.result({
  "duration": 3525600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3000",
      "offset": 15
    }
  ],
  "location": "CheckIphoneSteps.i_will_receive_usd_as_august_salary(int)"
});
formatter.result({
  "duration": 266400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3100",
      "offset": 40
    }
  ],
  "location": "CheckIphoneSteps.total_in_my_bank_account_supposed_to_be_usd(int)"
});
formatter.result({
  "duration": 236500,
  "status": "passed"
});
});