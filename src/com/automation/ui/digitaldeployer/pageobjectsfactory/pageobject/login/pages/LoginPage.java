
package com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.login.pages;
/**
 * @author Manjusha Saju
 */

import com.automation.ui.base.common.core.configuration.Configuration;
import com.automation.ui.base.common.core.configuration.EnvType;
import com.automation.ui.base.common.prpreaders.AssertDataReader;
import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.base.ProjectBasePageObject;
import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.index.pages.*;
import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.home.pages.*;

import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.login.xpathconstants.LoginCONSTANTS;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;
import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.login.vo.*;

public class LoginPage extends ProjectBasePageObject {


    private static Logger logger = Logger.getLogger(com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.login.pages.LoginPage.class);

     private LoginVO pvo;

    public LoginVO getLoginvo() {
        return pvo;
    }

    public void setLoginvo(LoginVO pvo) {
        this.pvo = pvo;
    }

    @FindBy(xpath = LoginCONSTANTS.USERID)
    @CacheLookup
    private WebElement username;

    @FindBy(xpath = LoginCONSTANTS.PASSWORD)
    @CacheLookup
    private WebElement password;

    @FindBy(xpath = LoginCONSTANTS.SUBMIT)
    @CacheLookup
    private WebElement login_button;

    @FindBy(xpath = LoginCONSTANTS.AUTHORISE)
    @CacheLookup
    private WebElement login_authorise;

    @FindBy(xpath = LoginCONSTANTS.CONTAUTHORISE)
    @CacheLookup
    private WebElement login_contauthorise;
    @FindBy(xpath = LoginCONSTANTS.CONTINUE)
    @CacheLookup
    private WebElement login_continue;




    public LoginPage() {
        super();
        logger.info("default constructor called");
        Reporter.log("default constructor called");
    }

    public LoginPage open() {

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


    public LoginPage enterUser(String userName) {
        try {
            logger.info("Entering enterUser  login: ");
            Reporter.log("Entering  enterUser login:");
            fillInputAfterClear(username, userName);

            logger.info("Exiting enterUser login");
            Reporter.log("Exiting  enterUser login");

        } catch (Exception e) {
            e.printStackTrace();
            logger.info("Exiting enterUser login" + AssertDataReader.assertreader.getValue("DDASSERTMSG_ASSERT_ERROR"));
            Assert.fail(AssertDataReader.assertreader.getValue("DDASSERTMSG_ASSERT_ERROR"));
            Reporter.log("Login failed");

        }
        return this;

    }

    public  LoginPage enterPassword(String upassword) {
        try {
            logger.info("Entering  enterPassword: ");
            Reporter.log("Entering  enterPassword:");

            fillInputAfterClear(password, upassword);
            logger.info("Exiting  enterPassword");
            Reporter.log("Exiting  enterPassword");

        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail(AssertDataReader.assertreader.getValue("OPCUA_PASSWORD"));
            Reporter.log("password failed");

        }
        return this;

    }


    public IndexPage login() {
        try {
            logger.info("Entering  login: ");
            Reporter.log("Entering  login:");


            waitAndClick(login_button);

            logger.info("Exiting  login");
            Reporter.log("Exiting  login");
            // wait.forElementVisible(savepasswordbutton);

        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail(AssertDataReader.assertreader.getValue("DDASSERTMSG_ASSERT_ERROR"));
            Reporter.log("Login failed");

        }
        return new IndexPage();

    }

    public WebElement getPassword() {
        return password;
    }

    public void setPassword(WebElement password) {
        this.password = password;
    }

    public WebElement getLogin_button() {
        return login_button;
    }

    public void setLogin_button(WebElement login_button) {
        this.login_button = login_button;
    }

    public WebElement getUsername() {
        return username;
    }

    public void setUsername(WebElement username) {
        this.username = username;

    }


    public HomePage continueauth() {
        try {
            logger.info("Entering  continueauth: ");
            Reporter.log("Entering  continueauth:");


            waitAndClick(login_contauthorise);

            logger.info("Exiting  continueauth");
            Reporter.log("Exiting  continueauth");
            // wait.forElementVisible(savepasswordbutton);

        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail(AssertDataReader.assertreader.getValue("DDASSERTMSG_ASSERT_ERROR"));
            Reporter.log("continueauth failed");

        }
        return new HomePage();

    }


    public HomePage continuetogitlogin() {
        try {
            logger.info("Entering  continuetogitlogin: ");
            Reporter.log("Entering  continuetogitlogin:");


            waitAndClick(login_continue);

            logger.info("Exiting  continuetogitlogin");
            Reporter.log("Exiting  continuetogitlogin");
            // wait.forElementVisible(savepasswordbutton);

        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail(AssertDataReader.assertreader.getValue("DDASSERTMSG_ASSERT_ERROR"));
            Reporter.log("continue failed");

        }
        return new HomePage();

    }


    public IndexPage authorise() {
        try {
            logger.info("Entering  authorise: ");
            Reporter.log("Entering  authorise:");


            waitAndClick(login_authorise);

            logger.info("Exiting  authorise");
            Reporter.log("Exiting  authorise");
            // wait.forElementVisible(savepasswordbutton);

        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail(AssertDataReader.assertreader.getValue("DDASSERTMSG_ASSERT_ERROR"));
            Reporter.log("authorise failed");

        }
        return new IndexPage();

    }

}