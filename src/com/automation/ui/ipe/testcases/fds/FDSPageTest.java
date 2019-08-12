package com.automation.ui.ipe.testcases.fds;

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
import com.automation.ui.ipe.pageobjectsfactory.pageobject.fds.dataprovider.FDSDataProvider;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.fds.pages.FDSPage;
import com.automation.ui.ipe.testcases.base.IPEBaseTest;
import org.apache.log4j.Logger;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.automation.ui.ipe.common.dataprovider.*;
import com.automation.ui.base.common.core.assertion.Assertion;
import com.automation.ui.base.common.prpreaders.AssertDataReader;
public class FDSPageTest extends IPEBaseTest {

    private static Logger logger = Logger.getLogger(FDSPageTest.class);

    public FDSPageTest() {
        super();
        logger.debug("FDSPageTest");
        fdsPage = new FDSPage();
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


    @Test(enabled = true, dataProvider = "fdsSearchStarter", dataProviderClass = FDSDataProvider.class, groups = {"StarterRun"}, description = "StarterRun")

    public void searchFDSFile_Starter_Test(String search) throws Throwable {
        logger.debug("Initiating the testcase- searchFDSFile_Starter_Test");
        Reporter.log("Initiating the testcase- searchFDSFile_Starter_Test");

        fdsPage.fdsSearch(search);

        Thread.sleep(2000);
        //    Assertion.assertEquals(project_definition.getProjectIDAlertMsg(), AssertDataReader.assertreader.getValue("IPEASSERTMSG_METHOD_FAILURE"));
        logger.debug("Executed the testcase-searchFDSFile_Starter_Test");
        Reporter.log("Executed the testcase-searchFDSFile_Starter_Test");

    }


    @Test(enabled = true, dataProvider = "fdsSearch", dataProviderClass = FDSDataProvider.class, groups = {"FDSPageTest"}, description = "FDSPageTest")

    public void searchFDSFile_Test(String search) throws Throwable {
        logger.debug("Initiating the testcase- searchFDSFile_Test");
        Reporter.log("Initiating the testcase- searchFDSFile_Test");

        fdsPage.fdsSearch(search);

        Thread.sleep(2000);
        //    Assertion.assertEquals(project_definition.getProjectIDAlertMsg(), AssertDataReader.assertreader.getValue("IPEASSERTMSG_METHOD_FAILURE"));
        logger.debug("Executed the testcase-searchFDSFile_Test");
        Reporter.log("Executed the testcase-searchFDSFile_Test");

    }


    @Test(enabled = true, groups = {"FDSPageTest"}, description = "FDSPageTest")

    public void clickFDSInfo_Test() throws Throwable {
        logger.debug("Initiating the testcase- clickFDSInfo_Test");
        Reporter.log("Initiating the testcase- clickFDSInfo_Test");

        fdsPage.clickFDSInfo();
        Thread.sleep(5000);
        //    Assertion.assertEquals(project_definition.getProjectIDAlertMsg(), AssertDataReader.assertreader.getValue("IPEASSERTMSG_METHOD_FAILURE"));
        logger.debug("Executed the testcase-clickFDSInfo_Test");
        Reporter.log("Executed the testcase-clickFDSInfo_Test");

    }

    @Test(enabled = true, groups = {"FDSPageTest"}, description = "FDSPageTest")

    public void fdsGenerate_Test() throws Throwable {
        logger.debug("Initiating the testcase- fdsGenerate_Test");
        Reporter.log("Initiating the testcase- fdsGenerate_Test");

        fdsPage.fdsGenerate();
        Thread.sleep(5000);
        //    Assertion.assertEquals(project_definition.getProjectIDAlertMsg(), AssertDataReader.assertreader.getValue("IPEASSERTMSG_METHOD_FAILURE"));
        logger.debug("Executed the testcase-fdsGenerate_Test");
        Reporter.log("Executed the testcase-fdsGenerate_Test");

    }


}
