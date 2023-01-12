
package com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.home.pages;
/**
 * @author Manjusha Saju
 */

import com.automation.ui.base.common.core.configuration.Configuration;
import com.automation.ui.base.common.core.configuration.EnvType;
import com.automation.ui.base.common.prpreaders.AssertDataReader;
import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.base.ProjectBasePageObject;
import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.home.xpathconstants.HomeConstants;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class HomePage extends ProjectBasePageObject {


    private static Logger logger = Logger.getLogger(HomePage.class);

    @FindBy(xpath = HomeConstants.ADDNEWWS)
    @CacheLookup
    private WebElement addnewworkspace;

    @FindBy(xpath = HomeConstants.ADDNEWAPPS)
    @CacheLookup
    private WebElement addnewapps;

    @FindBy(xpath = HomeConstants.WSNAME)
    @CacheLookup
    private WebElement wsname;


    @FindBy(xpath = HomeConstants.WORKSPACEDROPDOWN)
    @CacheLookup
    private WebElement wsdropdown;

    @FindBy(xpath = HomeConstants.SEARCHTEXT)
    @CacheLookup
    private WebElement wssearchtext;

    @FindBy(xpath = HomeConstants.LANGSELECT)
    @CacheLookup
    private WebElement langselect;

    @FindBy(xpath = HomeConstants.OVERVIEW)
    @CacheLookup
    private WebElement overview;
    @FindBy(xpath = HomeConstants.API)
    @CacheLookup
    private WebElement api;

    @FindBy(xpath = HomeConstants.CLEARALL)
    @CacheLookup
    private WebElement clearall;

    @FindBy(xpath = HomeConstants.DOCUMNETATION)
    @CacheLookup
    private WebElement documentation;

    @FindBy(xpath = HomeConstants.CANCELWS)
    @CacheLookup
    private WebElement cancelws;

    @FindBy(xpath = HomeConstants.HELP)
    @CacheLookup
    private WebElement help;
    @FindBy(xpath = HomeConstants.HEALTH)
    @CacheLookup
    private WebElement health;
    @FindBy(xpath = HomeConstants.NOTIFICATION)
    @CacheLookup
    private WebElement notification;


    public HomePage() {
        super();
        logger.info("default constructor called");
        Reporter.log("default constructor called");
    }

    public HomePage open() {

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




    public HomePage addws() {
        try {
            logger.info("Entering  addws: ");
            Reporter.log("Entering  addws:");

            Thread.sleep(3000);

            waitAndClick(addnewworkspace);



            logger.info("Exiting  addws");
            Reporter.log("Exiting  addws");
            // wait.forElementVisible(savepasswordbutton);

        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail(AssertDataReader.assertreader.getValue("DDASSERTMSG_ASSERT_ERROR"));
            Reporter.log("continueauth failed");

        }
        return new HomePage();

    }

    public HomePage addwsname() {
        try {
            logger.info("Entering  wsname: ");
            Reporter.log("Entering  wsname:");

            Thread.sleep(3000);
            fillInputAfterClear(wsname, "testwscreation");
            logger.info("Exiting  addws");
            Reporter.log("Exiting  addws");
            // wait.forElementVisible(savepasswordbutton);

        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail(AssertDataReader.assertreader.getValue("DDASSERTMSG_ASSERT_ERROR"));
            Reporter.log("continueauth failed");

        }
        return new HomePage();

    }

    public HomePage wsdropdown() {
        try {
             waitAndClick(wsdropdown);
            Thread.sleep(3000);
         } catch (Exception e) {
            e.printStackTrace();
            Assert.fail(AssertDataReader.assertreader.getValue("DDASSERTMSG_ASSERT_ERROR"));
            Reporter.log("continueauth failed");
        }
        return new HomePage();
    }
    public HomePage langselect() {
        try {
             waitAndClick(langselect);
            Thread.sleep(3000);

         } catch (Exception e) {
            e.printStackTrace();
            Assert.fail(AssertDataReader.assertreader.getValue("DDASSERTMSG_ASSERT_ERROR"));
            Reporter.log("continueauth failed");
        }
        return new HomePage();
    }
    public HomePage overview() {
        try {
             waitAndClick(overview);
            Thread.sleep(3000);

         } catch (Exception e) {
            e.printStackTrace();
            Assert.fail(AssertDataReader.assertreader.getValue("DDASSERTMSG_ASSERT_ERROR"));
            Reporter.log("continueauth failed");
        }
        return new HomePage();
    }
    public HomePage api() {
        try {
             waitAndClick(api);
             Thread.sleep(3000);
         } catch (Exception e) {
            e.printStackTrace();
            Assert.fail(AssertDataReader.assertreader.getValue("DDASSERTMSG_ASSERT_ERROR"));
            Reporter.log("continueauth failed");
        }
        return new HomePage();
    }

    public HomePage searchtext() {
        try {
            fillInputAfterClear(wssearchtext, "trial");
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail(AssertDataReader.assertreader.getValue("DDASSERTMSG_ASSERT_ERROR"));
            Reporter.log("continueauth failed");

        }
        return new HomePage();

    }

    public HomePage clearall() {
        try {
            fillInputAfterClear(clearall, "trial");
            Thread.sleep(3000);
            waitAndClick(clearall);

        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail(AssertDataReader.assertreader.getValue("DDASSERTMSG_ASSERT_ERROR"));
            Reporter.log("continueauth failed");

        }
        return new HomePage();

    }

    public HomePage documentation() {
        try {
            waitAndClick(documentation);
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail(AssertDataReader.assertreader.getValue("DDASSERTMSG_ASSERT_ERROR"));
            Reporter.log("continueauth failed");
        }
        return new HomePage();
    }

    public HomePage cancelws() {
        try {
            waitAndClick(cancelws);
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail(AssertDataReader.assertreader.getValue("DDASSERTMSG_ASSERT_ERROR"));
            Reporter.log("continueauth failed");
        }
        return new HomePage();
    }

    public HomePage health() {
        try {
            waitAndClick(health);
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail(AssertDataReader.assertreader.getValue("DDASSERTMSG_ASSERT_ERROR"));
            Reporter.log("continueauth failed");
        }
        return new HomePage();
    }

    public HomePage notification() {
        try {
            waitAndClick(notification);
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail(AssertDataReader.assertreader.getValue("DDASSERTMSG_ASSERT_ERROR"));
            Reporter.log("continueauth failed");
        }
        return new HomePage();
    }

    public HomePage help() {
        try {
            waitAndClick(help);
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail(AssertDataReader.assertreader.getValue("DDASSERTMSG_ASSERT_ERROR"));
            Reporter.log("continueauth failed");
        }
        return new HomePage();
    }




}