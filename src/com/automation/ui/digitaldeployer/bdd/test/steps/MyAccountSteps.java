package com.automation.ui.digitaldeployer.bdd.test.steps;

import org.junit.Assert;

import com.automation.ui.digitaldeployer.bdd.test.pages.MyAccountPage;

public class MyAccountSteps {
	private MyAccountPage user;

	public void validateMyAccountPage(String pageTitle) {
		Assert.assertTrue("Page Title is Not correct", user.getDriver().getTitle().contains(pageTitle));
		Assert.assertEquals("Page heading is Not correct", pageTitle.toUpperCase(), user.validatesUserIsInMyAccountsPage());
	}
}
