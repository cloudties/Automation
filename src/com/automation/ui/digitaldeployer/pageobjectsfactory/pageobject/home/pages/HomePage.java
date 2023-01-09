
package com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.home.pages;
/**
 * @author Manjusha Saju
 */

import com.automation.ui.base.common.core.configuration.Configuration;
import com.automation.ui.base.common.core.configuration.EnvType;
import com.automation.ui.base.common.prpreaders.AssertDataReader;
import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.base.DigitalDeployerBasePageObject;
import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.home.pages.HomePage;
import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.home.xpathconstants.HomeCONSTANTS;

import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.login.pages.LoginPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class HomePage extends DigitalDeployerBasePageObject {


    private static Logger logger = Logger.getLogger(HomePage.class);

    @FindBy(xpath = HomeCONSTANTS.ADDNEWWS)
    @CacheLookup
    private WebElement addnewworkspace;

    @FindBy(xpath = HomeCONSTANTS.ADDNEWAPPS)
    @CacheLookup
    private WebElement addnewapps;



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
            LoginPage lp=new LoginPage();
            lp.continuetogitlogin();

            Thread.sleep(3000);

            waitAndClick(addnewworkspace);

            logger.info("Exiting  addws");
            Reporter.log("Exiting  addws");
            // wait.forElementVisible(savepasswordbutton);

        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail(AssertDataReader.assertreader.getValue("OPCUA_LOGIN_LOGINMSG"));
            Reporter.log("continueauth failed");

        }
        return new HomePage();

    }



}