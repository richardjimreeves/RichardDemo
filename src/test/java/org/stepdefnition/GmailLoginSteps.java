package org.stepdefnition;

import java.io.IOException;

import org.Utility.UtilityClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pageobjects.GmailLoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GmailLoginSteps extends UtilityClass {
	static GmailLoginPage loginPage;
	
	@Given("The user should be in the gmail login page")
	public void the_user_should_be_in_the_gmail_login_page() throws IOException {
		UrlLaunch(getPropertyValue("gmailurl"));
	   
	}

	@When("The user has to enter the username and click the next button")
	public void the_user_has_to_enter_the_username_and_click_the_next_button() throws IOException, InterruptedException {
		 loginPage=new GmailLoginPage();
		loginPage.enterUserName();
		Thread.sleep(5000);
	    
	}

	@When("The user has to enter the password and click the next button")
	public void the_user_has_to_enter_the_password_and_click_the_next_button() throws IOException, InterruptedException {
		loginPage.enterPassword();
	}

	@Then("To validate the user profile for the valid login")
	public void to_validate_the_user_profile_for_the_valid_login() throws IOException {
		loginPage.clickProfileIcon();
		loginPage.verifyUserLogin();
	  
	}
	
	
	
	
//	Invalid Login
	@When("The user has to enter the invalid password and click the next button")
	public void the_user_has_to_enter_the_invalid_password_and_click_the_next_button() throws InterruptedException, IOException {
		loginPage.enterInvalidPassword();
	}

	@Then("To validate the user profile for the Invalid valid login")
	public void to_validate_the_user_profile_for_the_Invalid_valid_login() throws IOException {
		
		loginPage.verifyUserInvalidLogin();
	}
}
