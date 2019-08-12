package com.automation.ui.ipe.pageobjectsfactory.pageobject.globalnav.pages;


import com.automation.ui.base.common.logging.Log;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.base.IPEBasePageObject;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.globalnav.xpathconstants.NAVIGATIONConstants;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.automation.ui.base.common.core.assertion.Assertion;
import com.automation.ui.base.common.prpreaders.AssertDataReader;
public class GlobalNavigationPage extends IPEBasePageObject {

    private static Logger logger = Logger.getLogger(GlobalNavigationPage.class);


    @FindBy(xpath = NAVIGATIONConstants.CLOUDAVATAR)
    private WebElement userAvatar;


    @FindBy(xpath = NAVIGATIONConstants.CLOUDDATABUTTON)
    private WebElement cloudButtonu;

    @FindBy(xpath = NAVIGATIONConstants.LOGOUTBUTTON)
    private WebElement signOutButton;

    public String getTitle() {
        String title = driver.getTitle();

        return driver.getTitle();
    }


    public void goBack() {
        driver.navigate().back();

    }

    public void goForward() {
        driver.navigate().forward();

    }

    public void refresh() {
        driver.navigate().refresh();

    }


    public GlobalNavigationPage clickUserLogo() {
        wait.forElementClickable(userAvatar).click();
        Log.info("clicked on user logo in global nav bar");

        return this;
    }

    public void cloudDataButton() {
        waitAndClick(cloudButtonu);
    }

    public void clickSignOut() {
        waitAndClick(signOutButton);
    }


    public boolean isUserLoggedOut() {
        return driver.findElements(By.cssSelector(".wds-global-navigation__account-menu")).size() > 0;
    }


    public boolean isUserAvatarVisible() {
        return isElementDisplayed(userAvatar, 3);
    }


}
