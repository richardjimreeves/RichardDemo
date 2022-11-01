package org.stepdefnition;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.Utility.UtilityClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pageobjects.EbayProductPage;

import io.cucumber.java.en.*;

public class EbayProduct extends UtilityClass {
	EbayProductPage productPage;
	String name;

	@Given("The user should be in the ebay homepage")
	public void the_user_should_be_in_the_ebay_homepage() throws IOException {
		UrlLaunch(getPropertyValue("ebayurl"));
	}

	@When("The user has to enter the productname {string} in serach box")
	public void the_user_has_to_enter_the_productname_in_serach_box(String product) throws InterruptedException {
		productPage = new EbayProductPage();
		productPage.searchProduct(product);
	}

	@When("The user has click the search button")
	public void the_user_has_click_the_search_button() {
		WebElement productName = productPage.selectProduct();
		 name = productName.getText();
	}

	@Then("To print first product result in console")
	public void to_print_first_product_result_in_console() {
		String price = productPage.getPrice();
		System.out.println( name+ "==" + price);
	}

}
