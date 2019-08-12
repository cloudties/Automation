package com.automation.ui.ipe.testcases.hwd;

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
import com.automation.ui.ipe.pageobjectsfactory.pageobject.hwd.dataprovider.HWDrawingDataProvider;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.hwd.pages.HWDrawingPage;
import com.automation.ui.ipe.testcases.base.IPEBaseTest;
import org.apache.log4j.Logger;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.automation.ui.ipe.common.dataprovider.*;
import com.automation.ui.base.common.core.assertion.Assertion;
import com.automation.ui.base.common.prpreaders.AssertDataReader;
public class HWDPageTest extends IPEBaseTest {

    private static Logger logger = Logger.getLogger(HWDPageTest.class);

    public HWDPageTest() {
        super();
        logger.debug("HWDPageTest");
        hwdPage = new HWDrawingPage();
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


    @Test(enabled = true, dataProvider = "hwSearchStarter", dataProviderClass = HWDrawingDataProvider.class, groups = {"StarterRun"}, description = "StarterRun")

    public void searchHWDFile_Starter_Test(String search) throws Throwable {
        logger.debug("Initiating the testcase- searchHWDFile_Starter_Test");
        Reporter.log("Initiating the testcase- searchHWDFile_Starter_Test");

        hwdPage.hwdSearch(search);

        Thread.sleep(2000);
        //    Assertion.assertEquals(project_definition.getProjectIDAlertMsg(), AssertDataReader.assertreader.getValue("IPEASSERTMSG_METHOD_FAILURE"));
        logger.debug("Executed the testcase-searchHWDFile_Starter_Test");
        Reporter.log("Executed the testcase-searchHWDFile_Starter_Test");

    }


    @Test(enabled = true, dataProvider = "hwSearch", dataProviderClass = HWDrawingDataProvider.class, groups = {"HWDPageTest"}, description = "HWDPageTest")

    public void searchHWDFile_Test(String search) throws Throwable {
        logger.debug("Initiating the testcase- searchHWDFile_Test");
        Reporter.log("Initiating the testcase- searchHWDFile_Test");

        hwdPage.hwdSearch(search);

        Thread.sleep(2000);
        //    Assertion.assertEquals(project_definition.getProjectIDAlertMsg(), AssertDataReader.assertreader.getValue("IPEASSERTMSG_METHOD_FAILURE"));
        logger.debug("Executed the testcase-searchHWDFile_Test");
        Reporter.log("Executed the testcase-searchHWDFile_Test");

    }


    @Test(enabled = true, groups = {"HWDPageTest"}, description = "HWDPageTest")

    public void clickHWDInfo_Test() throws Throwable {
        logger.debug("Initiating the testcase- clickHWDInfo_Test");
        Reporter.log("Initiating the testcase- clickHWDInfo_Test");

        hwdPage.clickHWDInfo();
        Thread.sleep(5000);
        //    Assertion.assertEquals(project_definition.getProjectIDAlertMsg(), AssertDataReader.assertreader.getValue("IPEASSERTMSG_METHOD_FAILURE"));
        logger.debug("Executed the testcase-clickHWDInfo_Test");
        Reporter.log("Executed the testcase-clickHWDInfo_Test");

    }

    @Test(enabled = true, groups = {"HWDPageTest"}, description = "HWDPageTest")

    public void hwdGenerate_Test() throws Throwable {
        logger.debug("Initiating the testcase- hwdGenerate_Test");
        Reporter.log("Initiating the testcase- hwdGenerate_Test");


        Thread.sleep(5000);
        //    Assertion.assertEquals(project_definition.getProjectIDAlertMsg(), AssertDataReader.assertreader.getValue("IPEASSERTMSG_METHOD_FAILURE"));
        logger.debug("Executed the testcase-hwdGenerate_Test");
        Reporter.log("Executed the testcase-hwdGenerate_Test");

    }


}
