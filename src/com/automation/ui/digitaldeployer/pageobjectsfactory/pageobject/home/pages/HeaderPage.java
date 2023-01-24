
package com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.home.pages;
/**
 * @author Manjusha Saju
 */

import com.automation.ui.base.common.core.assertion.Assertion;
import com.automation.ui.base.common.core.configuration.Configuration;
import com.automation.ui.base.common.core.configuration.EnvType;
import com.automation.ui.base.common.core.element.dropdown.DropDownHelper;
import com.automation.ui.base.common.prpreaders.AssertDataReader;
import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.base.ProjectBasePageObject;
import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.home.xpathconstants.*;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class HeaderPage extends ProjectBasePageObject {


    private static Logger logger = Logger.getLogger(HeaderPage.class);

    @FindBy(xpath = HomeConstants.CLEARALL)
    @CacheLookup
    private WebElement clearall;

    @FindBy(xpath = HeaderConstants.HELP)
    @CacheLookup
    private WebElement help;
    @FindBy(xpath = HeaderConstants.HEALTH)
    @CacheLookup
    private WebElement health;
    @FindBy(xpath = HeaderConstants.NOTIFICATION)
    @CacheLookup
    private WebElement notification;


    public HeaderPage() {
        super();
        logger.info("default constructor called");
        Reporter.log("default constructor called");
    }

    public HeaderPage open() {

        logger.info("getCurrentUrl()" + getCurrentUrl());
        logger.info("getSiteUrl()" + getSiteUrl());
        logger.info("getUrl()" + getUrl());
        logger.info("getSiteUrlWithPath()" + getSiteUrlWithPath());


        if (Configuration.getEnvType().equals(EnvType.DEV)) {
            logger.info(getCurrentUrl());
            // getUrl("http://www.site.com");
            // getUrl(getCurrentUrl() + "?action=history");
            getUrl(getCurrentUrl());
        } else {
            logger.info(getSiteUrlWithPath());
            //  getUrl(getCurrentUrl() + "?action=something");
            //   getUrl(new Page(getSiteUrl(),"/login"));
            getUrl(getCurrentUrl() + "login");
            //for context added url like github.com/login
            //  getUrl(getSiteUrlWithPath());

        }
        return this;
    }




    private void chooseSettingMenu()
    {
        try {

            DropDownHelper dh=new DropDownHelper(  driver, this);
           // dh.selectDropDown(searchIndustry, "New Workspace");
            Thread.sleep(3000);

         //   waitAndClick(addnewworkspace);
        } catch (Exception e) {
            Assertion.fail(AssertDataReader.assertreader.getValue("DDASSERTMSG_ASSERT_ERROR"));
            e.printStackTrace();
        }
    }




    public HeaderPage health() {
        try {
            waitAndClick(health);
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail(AssertDataReader.assertreader.getValue("DDASSERTMSG_ASSERT_ERROR"));
            Reporter.log("continueauth failed");
        }
        return new HeaderPage();
    }

    public HeaderPage notification() {
        try {
            waitAndClick(notification);
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail(AssertDataReader.assertreader.getValue("DDASSERTMSG_ASSERT_ERROR"));
            Reporter.log("continueauth failed");
        }
        return new HeaderPage();
    }

    public HeaderPage help() {
        try {
            waitAndClick(help);
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail(AssertDataReader.assertreader.getValue("DDASSERTMSG_ASSERT_ERROR"));
            Reporter.log("continueauth failed");
        }
        return new HeaderPage();
    }




}