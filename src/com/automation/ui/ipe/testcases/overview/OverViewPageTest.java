package com.automation.ui.ipe.testcases.overview;

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

import com.automation.ui.base.common.utils.ExcelUtil;
import com.automation.ui.ipe.common.constants.ExcelCONSTANTS;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.hwd.dataprovider.*;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.hwd.pages.HWDrawingPage;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.hwd.xpathconstants.*;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.home.xpathconstants.*;
import com.automation.ui.ipe.testcases.base.IPEBaseTest;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.home.xpathconstants.*;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.overview.pages.*;

public class OverViewPageTest extends IPEBaseTest {

    private static Logger logger = Logger.getLogger(OverViewPageTest.class);

    public OverViewPageTest() {
        super();
        logger.debug("OverViewPageTest");
        overView = new OverViewPage();
    }

    protected void getDataReaders() {
        try {
            eu = new ExcelUtil();
            eu.setExcelFile(".\\resources\\data\\dataselenium.xls",
                    ExcelCONSTANTS.DEQCABINETINFOXLSDATASHEETNAMETPC);
        } catch (Exception e) {
            e.printStackTrace();
            ;
        }
    }
    @Test(enabled = true)
    public void testOverview() throws Throwable {
        logger.debug("Initiating the testcase- testOverview");
        Reporter.log("Initiating the testcase- testOverview");

        overView.testCheck();
         Thread.sleep(2000);
          logger.debug("Executed the testcase-testOverview");
        Reporter.log("Executed the testcase-testOverview");

    }





}
