$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("verifyMobileList.feature");
formatter.feature({
  "line": 1,
  "name": "Verify item in Mobile List",
  "description": "",
  "id": "verify-item-in-mobile-list",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Page can be sorted by \u0027Name\u0027",
  "description": "",
  "id": "verify-item-in-mobile-list;page-can-be-sorted-by-\u0027name\u0027",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I am on live.guru",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click \u0027Mobile\u0027 menu",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Title of the page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I click sortby",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I chose \u0027Name\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "The product should be sorted by Name",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "close Browser1",
  "keyword": "Then "
});
formatter.match({
  "location": "TC_2_VerifyMobileListPage.i_am_on_live_guru()"
});
formatter.result({
  "duration": 38420416634,
  "status": "passed"
});
formatter.match({
  "location": "TC_2_VerifyMobileListPage.i_click_Mobile_menu()"
});
formatter.result({
  "duration": 1932225241,
  "status": "passed"
});
formatter.match({
  "location": "TC_2_VerifyMobileListPage.title_of_the_page()"
});
formatter.result({
  "duration": 26457578,
  "status": "passed"
});
formatter.match({
  "location": "TC_2_VerifyMobileListPage.i_click_sortby()"
});
formatter.result({
  "duration": 1775781960,
  "status": "passed"
});
formatter.match({
  "location": "TC_2_VerifyMobileListPage.i_chose_Name()"
});
formatter.result({
  "duration": 33022,
  "status": "passed"
});
formatter.match({
  "location": "TC_2_VerifyMobileListPage.the_product_should_be_sorted_by_Name()"
});
formatter.result({
  "duration": 190975266,
  "status": "passed"
});
formatter.match({
  "location": "TC_2_VerifyMobileListPage.close_Browser()"
});
formatter.result({
  "duration": 169990022,
  "status": "passed"
});
formatter.uri("addingItemToCart.feature");
formatter.feature({
  "line": 1,
  "name": "Adding Item To Cart",
  "description": "",
  "id": "adding-item-to-cart",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify that you cannot add more product in the cart than the product in store",
  "description": "",
  "id": "adding-item-to-cart;verify-that-you-cannot-add-more-product-in-the-cart-than-the-product-in-store",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I am on Guru Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click Mobile Menu",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "In the list I click \u0027Add to cart\u0027 for sony xperia",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I change quantity value to \u0027Hundred\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I verify the error message",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I click on Empty Cart",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I click verify cart is empty",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Close the browser3",
  "keyword": "Then "
});
formatter.match({
  "location": "TC_3_AddingProductInCart.i_am_on_Guru_Page()"
});
formatter.result({
  "duration": 6521472992,
  "status": "passed"
});
formatter.match({
  "location": "TC_3_AddingProductInCart.i_click_Mobile_Menu()"
});
formatter.result({
  "duration": 1432636235,
  "status": "passed"
});
formatter.match({
  "location": "TC_3_AddingProductInCart.in_the_list_I_click_Add_to_cart_for_sony_xperia()"
});
formatter.result({
  "duration": 12286091,
  "status": "passed"
});
formatter.match({
  "location": "TC_3_AddingProductInCart.i_change_quantity_value_to_Hundred()"
});
formatter.result({
  "duration": 2687992100,
  "status": "passed"
});
formatter.match({
  "location": "TC_3_AddingProductInCart.i_verify_the_error_message()"
});
formatter.result({
  "duration": 92453595,
  "status": "passed"
});
formatter.match({
  "location": "TC_3_AddingProductInCart.i_click_on_Empty_Cart()"
});
formatter.result({
  "duration": 650388146,
  "status": "passed"
});
formatter.match({
  "location": "TC_3_AddingProductInCart.i_click_verify_cart_is_empty()"
});
formatter.result({
  "duration": 98220900,
  "status": "passed"
});
formatter.match({
  "location": "TC_3_AddingProductInCart.close_the_browser()"
});
formatter.result({
  "duration": 776354496,
  "status": "passed"
});
formatter.uri("compareTwoProducts.feature");
formatter.feature({
  "line": 1,
  "name": "Compare Two Products",
  "description": "",
  "id": "compare-two-products",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Verify that you are able to compare two products",
  "description": "",
  "id": "compare-two-products;verify-that-you-are-able-to-compare-two-products",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I am on guru homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "i click mobile menu",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I click \u0027Add to compare\u0027 on mobile product list",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "i click compare button to compare",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I verify the pop-up window and check the product are reflected",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Close the pop up windows",
  "keyword": "Then "
});
formatter.match({
  "location": "TC_04_CompareTwoProducts.i_am_on_guru_homepage()"
});
formatter.result({
  "duration": 6262606497,
  "status": "passed"
});
formatter.match({
  "location": "TC_04_CompareTwoProducts.i_click_mobile_menu()"
});
formatter.result({
  "duration": 1338597569,
  "status": "passed"
});
formatter.match({
  "location": "TC_04_CompareTwoProducts.i_click_Add_to_compare_on_mobile_product_list()"
});
formatter.result({
  "duration": 3147448267,
  "status": "passed"
});
formatter.match({
  "location": "TC_04_CompareTwoProducts.i_click_compare_button()"
});
formatter.result({
  "duration": 317812244,
  "status": "passed"
});
formatter.match({
  "location": "TC_04_CompareTwoProducts.i_verify_the_pop_up_window_and_check_the_product_are_reflected()"
});
formatter.result({
  "duration": 26229992,
  "status": "passed"
});
formatter.match({
  "location": "TC_04_CompareTwoProducts.close_the_pop_up_windows()"
});
formatter.result({
  "duration": 3483053298,
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
  "line": 3,
  "name": "Verify the cost of product in the list page and details page are the same",
  "description": "",
  "id": "verify-the-cost-of-the-product;verify-the-cost-of-product-in-the-list-page-and-details-page-are-the-same",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I am on live Guru Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click Mobile Menu verify cost",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I read the list of all mobile and read the cost of Sony Xperia Mobile",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I click on Sony Xperia Mobile",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I read the Sony Xperia Mobile from detail Page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I compare the value of both Page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "close Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "TC_1_VerifyTheCost.i_am_on_live_Guru_Page()"
});
formatter.result({
  "duration": 4724378690,
  "status": "passed"
});
formatter.match({
  "location": "TC_1_VerifyTheCost.i_click_Mobile_Menu()"
});
formatter.result({
  "duration": 1077545353,
  "status": "passed"
});
formatter.match({
  "location": "TC_1_VerifyTheCost.i_read_the_list_of_all_mobile_and_read_the_cost_of_Sony_Xperia_Mobile()"
});
formatter.result({
  "duration": 115670523,
  "status": "passed"
});
formatter.match({
  "location": "TC_1_VerifyTheCost.i_click_on_Sony_Xperia_Mobile()"
});
formatter.result({
  "duration": 1403177194,
  "status": "passed"
});
formatter.match({
  "location": "TC_1_VerifyTheCost.i_read_the_Sony_Xperia_Mobile_from_detail_Page()"
});
formatter.result({
  "duration": 97775098,
  "status": "passed"
});
formatter.match({
  "location": "TC_1_VerifyTheCost.i_compare_the_value_of_both_Page()"
});
formatter.result({
  "duration": 75416,
  "status": "passed"
});
formatter.match({
  "location": "TC_1_VerifyTheCost.close_Browser()"
});
formatter.result({
  "duration": 263106741,
  "status": "passed"
});
});