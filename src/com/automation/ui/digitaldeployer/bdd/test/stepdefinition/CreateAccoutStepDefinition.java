package com.automation.ui.digitaldeployer.bdd.test.stepdefinition;

import com.automation.ui.digitaldeployer.bdd.test.model.CreateAccount;
import com.automation.ui.digitaldeployer.bdd.test.steps.CreateAccountSteps;
import com.automation.ui.digitaldeployer.bdd.test.steps.LoginSteps;
import com.automation.ui.digitaldeployer.bdd.test.steps.MyAccountSteps;
import com.automation.ui.digitaldeployer.bdd.test.steps.MyStoreHomeSteps;
import com.automation.ui.digitaldeployer.bdd.test.utilities.JsonReader;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CreateAccoutStepDefinition {
	@Steps
	MyStoreHomeSteps homeSteps;
	@Steps
	LoginSteps loginSteps;
	@Steps
	CreateAccountSteps createAccountSteps;
	@Steps
	MyAccountSteps myAccountSteps;

	@When("^I navigate to Login Page by clicking on Sign In button$")
	public void i_navigate_to_Login_Page_by_clicking_on_Sign_In_button() {
		homeSteps.navigateToLoginPage();
	}

	@When("^I enter valid email id and click on create account button$")
	public void i_enter_valid_email_id_and_click_on_create_account_button() {
		long randNumb = System.currentTimeMillis();
		String email = String.format("test%s@gmail.com", randNumb);
	    loginSteps.enterEmailToCreateAccount(email);
	}

	@When("^I enter valid (.*) and register the user$")
	public void i_enter_valid_first_and_register_the_user(String dataKey) {
	   JsonReader json = new JsonReader();
	   CreateAccount createAccount = json.getpageByFirstName(dataKey);
	   createAccountSteps.createAccount(createAccount);
	}

	@Then("^I should be navigated to (.*) screen$")
	public void i_should_be_navigated_to_screen(String pageTitle) {
		myAccountSteps.validateMyAccountPage(pageTitle);
	}
}
