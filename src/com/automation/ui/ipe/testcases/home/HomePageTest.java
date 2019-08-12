package com.automation.ui.ipe.testcases.home;

/**
 * @author Manjusha Saju
 * <p>
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

import com.automation.ui.ipe.pageobjectsfactory.pageobject.home.pages.HomePage;
import com.automation.ui.ipe.testcases.base.IPEBaseTest;
import org.apache.log4j.Logger;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.automation.ui.ipe.common.dataprovider.*;
import com.automation.ui.base.common.core.assertion.Assertion;
import com.automation.ui.base.common.prpreaders.AssertDataReader;

public class HomePageTest extends IPEBaseTest {

    private static Logger logger = Logger
            .getLogger(HomePageTest.class);


    public HomePageTest() {

        super();
        logger.debug("HomePageTest");
        home_page = new HomePage();
    }


    /***
     *
     * @throws Throwable
     */

    @Test(enabled = true, groups = {"Home"}, description = "home page ")
    public void launchHomePage_Test() throws Throwable {

        home_page.open();
        // Thread.sleep(20000);


    }

    /***
     *
     * Click DEQ at homepage
     */
    @Test(enabled = true, priority = 1, groups = {"Home"}, description = "home page ")
    public void clickDEQlink_Test() throws Throwable {

        home_page.clickDEQ_homepage();
        Thread.sleep(2000);

    }

    /***
     *
     * Click TPC at homepage
     */

    @Test(enabled = true, priority = 2, groups = {"Home"}, description = "home page ")
    public void clickTPClink_Test() throws Throwable {

        home_page.clickTPC_homepage();
        Thread.sleep(3000);


    }


    /***
     *
     * Click FDS at homepage
     */

    @Test(enabled = true, priority = 3, groups = {"Home"}, description = "home page ")
    public void clickFDSlink_Test() throws Throwable {

        home_page.clickFDS_homepage();
        Thread.sleep(3000);


    }

    /***
     *
     * Click HWDrawing at homepage
     */

    @Test(enabled = true, priority = 4, groups = {"Home"}, description = "home page ")
    public void clickHWDrawinglink_Test() throws Throwable {

        home_page.clickHWDrawing_homepage();
        Thread.sleep(3000);


        logger.debug("Executed the testcase-clickHWDrawing_homepage");
        Reporter.log("Executed the testcase-clickHWDrawing_homepage");

    }

    /***
     *
     * Click Perf Calculations at homepage
     */

    @Test(enabled = true, priority = 5, groups = {"Home"}, description = "home page ")
    public void clickPerfCalclink_Test() throws Throwable {

        home_page.clickPerfCalc_homepage();
        Thread.sleep(3000);


    }

    /***
     *
     * Click Testing-> Overview at homepage
     */

    @Test(enabled = true, priority = 6, groups = {"Home"}, description = "home page ")
    public void clickOverviewlink_Test() throws Throwable {

        home_page.clickOverview_homepage();
        Thread.sleep(5000);


    }

    /***
     *
     * Click Dashboard at homepage
     */
    @Test(enabled = true, priority = 7, groups = {"Home"}, description = "home page ")
    public void clickDashboard_Test() throws Throwable {

        home_page.clickDashboard_homepage();
        Thread.sleep(3000);

    }

    /***
     *
     * Click Honeywell at IPE landing page
     */
    @Test(enabled = true, priority = 8, groups = {"Home"}, description = "home page ")
    public void clickHomePage_Test() throws Throwable {

        home_page.click_homepage();
        Thread.sleep(3000);

        logger.debug("Executed the testcase-clickHomePage");
        Reporter.log("Executed the testcase-clickHomePage");


    }

    @Test(priority = 9, enabled = true, groups = {"HomePageTest"}, description = "HomePageTest")

    public void clickHomeZoomCheck_75percentage_Test() throws Throwable {
        home_page.clickHomeZoomCheck_75percentage();
    }

    @Test(priority = 12, enabled = true, groups = {"HomePageTest"}, description = "HomePageTest")

    public void clickHomeZoomCheck_100percentage_Test() throws Throwable {
        home_page.clickHomeZoomCheck_100percentage();
    }

    @Test(priority = 10, enabled = true, groups = {"HomePageTest"}, description = "HomePageTest")

    public void clickHomeZoomCheck_125percentage_Test() throws Throwable {
        home_page.clickHomeZoomCheck_125percentage();
    }

    @Test(priority = 11, enabled = true, groups = {"HomePageTest"}, description = "HomePageTest")

    public void clickHomeZoomCheck_150percentage_Test() throws Throwable {
        home_page.clickHomeZoomCheck_150percentage();
       // Assertion.assertTrue(false);
    }


}
