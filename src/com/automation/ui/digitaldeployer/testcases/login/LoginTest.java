package com.automation.ui.digitaldeployer.testcases.login;

/**
 * @author Manjusha Saju
 */

import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.login.pages.*;
import com.automation.ui.digitaldeployer.testcases.base.ProjectBaseTest;
import org.apache.log4j.Logger;
import org.testng.Reporter;
import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.login.vo.*;
import  com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.login.dataprovider.*;
import org.testng.annotations.Test;
import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.home.pages.*;
//import com.uiautomation.ui.listener.LoginListener;
//@Listeners(com.uiautomation.ui.listener.LoginListener.class)


/**
 * Test Suite ID – The ID of the test suite to which this test case belongs.
 * Test Case ID – The ID of the test case.
 * Test Case Summary – The summary / objective of the test case.
 * Related Requirement – The ID of the requirement this test case relates/traces to.
 * Prerequisites – Any prerequisites or preconditions that must be fulfilled prior to executing the test.
 * Test Procedure – Step-by-step procedure to execute the test.
 * Test Data – The test data, or links to the test data, that are to be used while conducting the test.
 * Expected Result – The expected result of the test.
 * Actual Result – The actual result of the test; to be filled after executing the test.
 * Status – Pass or Fail. Other statuses can be ‘Not Executed’ if testing is not performed and ‘Blocked’ if testing is blocked.
 * Remarks – Any comments on the test case or test execution.
 * Created By – The name of the author of the test case.
 * Date of Creation – The date of creation of the test case.
 * Executed By – The name of the person who executed the test.
 * Date of Execution – The date of execution of the test.
 * Test Environment – The environment (Hardware/Software/Network) in which the test was executed.
 */


public class LoginTest extends ProjectBaseTest {
    private static Logger logger = Logger
           .getLogger(LoginTest.class);
    public LoginTest() {
        super();
    }

    @Test(priority = 1,  enabled = false, groups =
            {"Home"}, invocationCount = 1, description = " list info")
    public void verifyContinueBeforeLogin() throws Throwable {

        logger.info("Entering verifyContinueBeforeLogin");
        Reporter.log("Entering verifyContinueBeforeLogin");
        homePage = new HomePage();
        homePage.open();
        String methodname = new Object() {
        }.getClass().getEnclosingMethod().getName();
        // Call the method
        login_page=new LoginPage();
        login_page.continuetogitlogin();

        Thread.sleep(3000);

        String userName = eu.getCellData(1, 1);
        String password = eu.getCellData(1, 2);

        logger.info("Exiting verifyValidLogin and going to login userName:" + userName + "password : *****");
        login_page.enterUser(userName);
        login_page.enterPassword(password);
        login_page.login();
        //  driver.navigate().back();
    }


    @Test(priority = 2, dataProvider = "loginAdmin",
            dataProviderClass = LoginDataProvider.class, enabled = true, groups =
            {"Home","base"}, invocationCount = 1, description = "home  list info")
    public void verifyValidLogin(LoginVO loginVo) throws Throwable {

        logger.info("Entering verifyValidLogin");
        Reporter.log("Entering verifyValidLogin");
        homePage = new HomePage();
        homePage.open();

        login_page=new LoginPage();
        login_page.continuetogitlogin();

        String methodname = new Object() {
        }.getClass().getEnclosingMethod().getName();
        // Call the method


        login_page.setLoginvo(loginVo);

        String userName = eu.getCellData(1, 1);
        String password = eu.getCellData(1, 2);

        logger.info("Exiting verifyValidLogin and going to login userName:" + userName  );
        login_page.enterUser( loginVo.getUserName());
        login_page.enterPassword( loginVo.getPassword());
        login_page.login();

        Thread.sleep(10000);
        //  driver.navigate().back();
    }


    @Test(priority = 2, enabled = false,groups = {"base", "invalidcase"})
    public void verifyInValidUserNullPassword() throws Throwable {

        logger.info("Entering verifyInValidUserNullPassword");
        Reporter.log("Entering verifyInValidUserNullPassword");
          homePage = new HomePage();
        homePage.open();
        // Call the method
        String methodname = new Object() {
        }.getClass().getEnclosingMethod().getName();

        String userName = eu.getCellData(2, 1);
        String password = eu.getCellData(2, 2);

        logger.info("Exiting verifyInValidUserNullPassword userName:" + userName + "password : *****");
        login_page.enterUser(userName);
        login_page.enterPassword(password);
        login_page.login();

    }


    @Test(priority = 3, enabled = false,groups = {"base", "invalidcase"})
    public void verifyValidUserNullPassword() throws Throwable {

        logger.info("Entering verifyValidUserNullPassword");
        Reporter.log("Entering verifyValidUserNullPassword");
        login_page = new LoginPage();
        login_page.open();
        // Call the method
        String methodname = new Object() {
        }.getClass().getEnclosingMethod().getName();

        String userName = eu.getCellData(3, 1);
        String password = eu.getCellData(3, 2);

        logger.info("Exiting verifyValidUserNullPassword userName:" + userName + "password : *****");
        login_page.enterUser(userName);
        login_page.enterPassword(password);
        login_page.login();

    }

    //added
    @Test(priority = 4, enabled = false,groups = {"base", "invalidcase"}, description = "invalid login")
    public void verifyInValidUserInvalidPassword() throws Throwable {

        logger.info("Entering verifyInValidLogin");
        Reporter.log("Entering verifyInValidLogin");
        homePage  = new HomePage();
        homePage.open();
        String methodname = new Object() {
        }.getClass().getEnclosingMethod().getName();

        String userName = eu.getCellData(4, 1);
        String password = eu.getCellData(4, 2);

        logger.info("Exiting verifyInValidLoginNullPassword and going to login userName:" + userName + "password : *****");
        login_page.enterUser(userName);
        login_page.enterPassword(password);
        login_page.login();
        //  driver.navigate().for();
    }
}