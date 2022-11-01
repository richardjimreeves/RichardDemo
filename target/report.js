$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/ebay.feature");
formatter.feature({
  "name": "To validate the product price in ebay Application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@ebay"
    }
  ]
});
formatter.scenario({
  "name": "To  validate product price in ebay Application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ebay"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user should be in the ebay homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "EbayProduct.the_user_should_be_in_the_ebay_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user has to enter the productname \"Electric Guitar\" in serach box",
  "keyword": "When "
});
formatter.match({
  "location": "EbayProduct.the_user_has_to_enter_the_productname_in_serach_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user has click the search button",
  "keyword": "When "
});
formatter.match({
  "location": "EbayProduct.the_user_has_click_the_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To print first product result in console",
  "keyword": "Then "
});
formatter.match({
  "location": "EbayProduct.to_print_first_product_result_in_console()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/login.feature");
formatter.feature({
  "name": "To validate the login functionaly of gmail application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@gmail"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user should be in the gmail login page",
  "keyword": "Given "
});
formatter.match({
  "location": "GmailLoginSteps.the_user_should_be_in_the_gmail_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To  validate gmail login with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@gmail"
    },
    {
      "name": "@validlogin"
    }
  ]
});
formatter.step({
  "name": "The user has to enter the username and click the next button",
  "keyword": "When "
});
formatter.match({
  "location": "GmailLoginSteps.the_user_has_to_enter_the_username_and_click_the_next_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user has to enter the password and click the next button",
  "keyword": "When "
});
formatter.match({
  "location": "GmailLoginSteps.the_user_has_to_enter_the_password_and_click_the_next_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To validate the user profile for the valid login",
  "keyword": "Then "
});
formatter.match({
  "location": "GmailLoginSteps.to_validate_the_user_profile_for_the_valid_login()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user should be in the gmail login page",
  "keyword": "Given "
});
formatter.match({
  "location": "GmailLoginSteps.the_user_should_be_in_the_gmail_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To  validate gmail login with Invalid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@gmail"
    },
    {
      "name": "@invalidlogin"
    }
  ]
});
formatter.step({
  "name": "The user has to enter the username and click the next button",
  "keyword": "When "
});
formatter.match({
  "location": "GmailLoginSteps.the_user_has_to_enter_the_username_and_click_the_next_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user has to enter the invalid password and click the next button",
  "keyword": "When "
});
formatter.match({
  "location": "GmailLoginSteps.the_user_has_to_enter_the_invalid_password_and_click_the_next_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To validate the user profile for the Invalid valid login",
  "keyword": "Then "
});
formatter.match({
  "location": "GmailLoginSteps.to_validate_the_user_profile_for_the_Invalid_valid_login()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});