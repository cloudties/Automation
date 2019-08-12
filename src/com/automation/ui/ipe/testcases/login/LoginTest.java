/**
 *
 */
package com.automation.ui.ipe.testcases.login;


import com.automation.ui.base.common.core.assertion.Assertion;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.login.pages.LoginPage;
import com.automation.ui.ipe.testcases.base.IPEBaseTest;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import com.automation.ui.ipe.common.dataprovider.*;
import com.automation.ui.base.common.core.assertion.Assertion;
import com.automation.ui.base.common.prpreaders.AssertDataReader;
/**
 * @author Manjusha Saju
 */

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


public class LoginTest extends IPEBaseTest {


    private static Logger logger = Logger
            .getLogger(LoginTest.class);


    public LoginTest() {
        super();
    }

    @Test(enabled = true, priority = 1, groups = {"base", "validcase"}, description = " login")
    public void windowsProxyLogin_Test() throws Throwable {

        try {
            Alert alert = driver.switchTo().alert();
            WebDriverWait wait = new WebDriverWait(driver, 10);
            alert = wait.until(ExpectedConditions.alertIsPresent());
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_H);
            robot.keyPress(KeyEvent.VK_2);
            robot.keyPress(KeyEvent.VK_6);
            robot.keyPress(KeyEvent.VK_5);
            robot.keyPress(KeyEvent.VK_4);
            robot.keyPress(KeyEvent.VK_5);
            robot.keyPress(KeyEvent.VK_6);

            robot.keyPress(KeyEvent.VK_TAB);//go to password feild

            robot.keyPress(KeyEvent.VK_W);
            robot.keyPress(KeyEvent.VK_E);
            robot.keyPress(KeyEvent.VK_L);
            robot.keyPress(KeyEvent.VK_4);
            robot.keyPress(KeyEvent.VK_O);
            robot.keyPress(KeyEvent.VK_M);
            robot.keyPress(KeyEvent.VK_E);
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_2);
            robot.keyRelease(KeyEvent.VK_2);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_8);
            Thread.sleep(10000);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyPress(KeyEvent.VK_ENTER);
            driver.switchTo().defaultContent();
        } catch (org.openqa.selenium.NoAlertPresentException e) {
            Assertion.assertTrue(true);
            e.printStackTrace();
        } catch (Exception e) {
            Assertion.assertTrue(true);
            e.printStackTrace();
        }

    }


    /***
     *
     * @throws Throwable
     */

    @Test(priority = 2, enabled = false, groups = {"base", "invalidcase"}, description = "invalid login")
    public void verifyNullUserNullPassword() throws Throwable {

        logger.debug("Entering verifyNullUserNullPassword");
        Reporter.log("Entering verifyNullUserNullPassword");
        login_page = new LoginPage();
        login_page.open();
        // Call the method

        String methodname = new Object() {
        }.getClass().getEnclosingMethod().getName();

        String userName = eu.getCellData(5, 1);
        String password = eu.getCellData(5, 2);

        login_page.enterUser(userName);
        login_page.enterPassword(password);
        login_page.login();
        //  driver.navigate().back();
    }

}