$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("verifyMobileList.feature");
formatter.feature({
  "line": 1,
  "name": "Verify item in Mobile List",
  "description": "",
  "id": "verify-item-in-mobile-list",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Page can be sorted by \u0027Name\u0027",
  "description": "",
  "id": "verify-item-in-mobile-list;page-can-be-sorted-by-\u0027name\u0027",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I am on live.guru",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I click \u0027Mobile\u0027 menu",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Title of the page",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "I click sortby",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I chose \u0027Name\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "The product should be sorted by Name",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "close Browser1",
  "keyword": "Then "
});
formatter.match({
  "location": "VerifyMobileListPage.i_am_on_live_guru()"
});
formatter.result({
  "duration": 6408210786,
  "status": "passed"
});
formatter.match({
  "location": "VerifyMobileListPage.i_click_Mobile_menu()"
});
formatter.result({
  "duration": 845052850,
  "status": "passed"
});
formatter.match({
  "location": "VerifyMobileListPage.title_of_the_page()"
});
formatter.result({
  "duration": 19801812,
  "status": "passed"
});
formatter.match({
  "location": "VerifyMobileListPage.i_click_sortby()"
});
formatter.result({
  "duration": 695428546,
  "status": "passed"
});
formatter.match({
  "location": "VerifyMobileListPage.i_chose_Name()"
});
formatter.result({
  "duration": 64706,
  "status": "passed"
});
formatter.match({
  "location": "VerifyMobileListPage.the_product_should_be_sorted_by_Name()"
});
formatter.result({
  "duration": 270882849,
  "status": "passed"
});
formatter.match({
  "location": "VerifyMobileListPage.close_Browser()"
});
formatter.result({
  "duration": 337196206,
  "status": "passed"
});
formatter.uri("verifyTheCost.feature");
formatter.feature({
  "line": 1,
  "name": "Verify the Cost of the Product",
  "description": "",
  "id": "verify-the-cost-of-the-product",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Verify the cost of product in the list page and details page are the same",
  "description": "",
  "id": "verify-the-cost-of-the-product;verify-the-cost-of-product-in-the-list-page-and-details-page-are-the-same",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I am on live Guru Page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I click Mobile Menu",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I read the list of all mobile and read the cost of Sony Xperia Mobile",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "I click on Sony Xperia Mobile",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I read the Sony Xperia Mobile from detail Page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I compare the value of both Page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "close Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "VerifyTheCost.i_am_on_live_Guru_Page()"
});
formatter.result({
  "duration": 4522963926,
  "status": "passed"
});
formatter.match({
  "location": "VerifyTheCost.i_click_Mobile_Menu()"
});
formatter.result({
  "duration": 652490555,
  "status": "passed"
});
formatter.match({
  "location": "VerifyTheCost.i_read_the_list_of_all_mobile_and_read_the_cost_of_Sony_Xperia_Mobile()"
});
formatter.result({
  "duration": 67410235,
  "status": "passed"
});
formatter.match({
  "location": "VerifyTheCost.i_click_on_Sony_Xperia_Mobile()"
});
formatter.result({
  "duration": 882578743,
  "status": "passed"
});
formatter.match({
  "location": "VerifyTheCost.i_read_the_Sony_Xperia_Mobile_from_detail_Page()"
});
formatter.result({
  "duration": 55746649,
  "status": "passed"
});
formatter.match({
  "location": "VerifyTheCost.i_compare_the_value_of_both_Page()"
});
formatter.result({
  "duration": 47302,
  "status": "passed"
});
formatter.match({
  "location": "VerifyTheCost.close_Browser()"
});
formatter.result({
  "duration": 175244745,
  "status": "passed"
});
});