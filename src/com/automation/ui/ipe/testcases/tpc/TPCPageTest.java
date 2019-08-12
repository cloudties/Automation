package com.automation.ui.ipe.testcases.tpc;

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
import com.automation.ui.ipe.pageobjectsfactory.pageobject.tpc.dataprovider.TPCDataProvider;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.tpc.pages.TPCPage;
import com.automation.ui.ipe.testcases.base.IPEBaseTest;
import org.apache.log4j.Logger;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.automation.ui.ipe.common.dataprovider.*;
import com.automation.ui.base.common.core.assertion.Assertion;
import com.automation.ui.base.common.prpreaders.AssertDataReader;
public class TPCPageTest extends IPEBaseTest {

    private static Logger logger = Logger.getLogger(TPCPageTest.class);

    public TPCPageTest() {
        super();
        logger.debug("TPCPageTest");
        tpcPage = new TPCPage();
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


    @Test(enabled = true, dataProvider = "tpcSearchStarter", dataProviderClass = TPCDataProvider.class, groups = {"StarterRun"}, description = "StarterRun")

    public void searchTPCFile_Starter_Test(String search) throws Throwable {
        logger.debug("Initiating the testcase- searchTPCFile_Starter_Test");
        Reporter.log("Initiating the testcase- searchTPCFile_Starter_Test");

        tpcPage.tpcSearch(search);

        Thread.sleep(2000);
        //    Assertion.assertEquals(project_definition.getProjectIDAlertMsg(), AssertDataReader.assertreader.getValue("IPEASSERTMSG_METHOD_FAILURE"));
        logger.debug("Executed the testcase-searchTPCFile_Starter_Test");
        Reporter.log("Executed the testcase-searchTPCFile_Starter_Test");

    }


    @Test(enabled = true, dataProvider = "tpcSearch", dataProviderClass = TPCDataProvider.class, groups = {"TPCPageTest"}, description = "TPCPageTest")

    public void searchTPCFile_Test(String search) throws Throwable {
        logger.debug("Initiating the testcase- searchTPCFile_Test");
        Reporter.log("Initiating the testcase- searchTPCFile_Test");

        tpcPage.tpcSearch(search);

        Thread.sleep(2000);
        //    Assertion.assertEquals(project_definition.getProjectIDAlertMsg(), AssertDataReader.assertreader.getValue("IPEASSERTMSG_METHOD_FAILURE"));
        logger.debug("Executed the testcase-searchTPCFile_Test");
        Reporter.log("Executed the testcase-searchTPCFile_Test");

    }


    @Test(enabled = true, groups = {"TPCPageTest"}, description = "TPCPageTest")

    public void clickTPCInfo_Test() throws Throwable {
        logger.debug("Initiating the testcase- clickTPCInfo_Test");
        Reporter.log("Initiating the testcase- clickTPCInfo_Test");

        tpcPage.clickTPCInfo();
        Thread.sleep(5000);
        //    Assertion.assertEquals(project_definition.getProjectIDAlertMsg(), AssertDataReader.assertreader.getValue("IPEASSERTMSG_METHOD_FAILURE"));
        logger.debug("Executed the testcase-clickTPCInfo_Test");
        Reporter.log("Executed the testcase-clickTPCInfo_Test");

    }

    @Test(enabled = true, groups = {"TPCPageTest"}, description = "TPCPageTest")

    public void tpcUpload_Test() throws Throwable {
        logger.debug("Initiating the testcase- clickTPCInfo_Test");
        Reporter.log("Initiating the testcase- clickTPCInfo_Test");

        tpcPage.tpcUpload();
        Thread.sleep(2000);
        //    Assertion.assertEquals(project_definition.getProjectIDAlertMsg(), AssertDataReader.assertreader.getValue("IPEASSERTMSG_METHOD_FAILURE"));
        logger.debug("Executed the testcase-clickTPCInfo_Test");
        Reporter.log("Executed the testcase-clickTPCInfo_Test");

    }

    @Test(enabled = true, groups = {"TPCPageTest"}, description = "TPCPageTest")

    public void tpcGenerateDrawings_Test() throws Throwable {
        logger.debug("Initiating the testcase- tpcGenerateDrawings_Test");
        Reporter.log("Initiating the testcase- tpcGenerateDrawings_Test");

        tpcPage.tpcGenerate();
        Thread.sleep(2000);
        //    Assertion.assertEquals(project_definition.getProjectIDAlertMsg(), AssertDataReader.assertreader.getValue("IPEASSERTMSG_METHOD_FAILURE"));
        logger.debug("Executed the testcase-tpcGenerateDrawings_Test");
        Reporter.log("Executed the testcase-tpcGenerateDrawings_Test");

    }
}
