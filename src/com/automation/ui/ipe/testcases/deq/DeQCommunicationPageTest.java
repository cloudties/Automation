package com.automation.ui.ipe.testcases.deq;

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
import com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.dataprovider.DEQCommunicationDataProvider;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.pages.DeQCommunicationDetailsPage;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.vo.DeqCommunicationInfoVO;
import com.automation.ui.ipe.testcases.base.IPEBaseTest;
import org.apache.log4j.Logger;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.automation.ui.ipe.common.dataprovider.*;
import com.automation.ui.base.common.core.assertion.Assertion;
import com.automation.ui.base.common.prpreaders.AssertDataReader;
public class DeQCommunicationPageTest extends IPEBaseTest {

    private static Logger logger = Logger.getLogger(DeQCommunicationPageTest.class);

    public DeQCommunicationPageTest() {
        super();
        logger.debug("DeQCommunicationPageTest");
        deq_communicationspage = new DeQCommunicationDetailsPage();
    }

    protected void getDataReaders() {
        try {
            eu = new ExcelUtil();
            // eu.setExcelFile(ExcelCONSTANTS.LOGINXLSDATAPATH,
            //       ExcelCONSTANTS.DEQCABCOMMS);
        } catch (Exception e) {
            e.printStackTrace();
            ;
        }
    }

    /**
     * IPE DEQ- Click on section- communciaiton
     */

    @Test(priority = 28, enabled = true, groups = {"DeQCommPageTest"}, description = "DeQCommPageTest")
    public void clickDEQCommunicationInfo_Test() throws Throwable {
        logger.debug("Initiating the testcase- clickDEQCommunicationInfo_Test");
        Reporter.log("Initiating the testcase- clickDEQCommunicationInfo_Test");
        deq_communicationspage.clickDEQhome();
        deq_communicationspage.clickDEQCommunicationInfo();

        logger.debug(" Executed the testcase- clickDEQCommunicationInfo_Test");
        Reporter.log("Executed the testcase- clickDEQCommunicationInfo_Test");
    }

    @Test(priority = 29, dataProvider = "deqCommunicationStarterVo", dataProviderClass = DEQCommunicationDataProvider.class, enabled = true, groups = {"StarterRun"}, description = "StarterRun")
    public void scrollAndAddInputs_DEQCommunications_Starter_WithValues_Test(DeqCommunicationInfoVO deqCommVO) throws Throwable {
        logger.debug("Initiating the scrollAndAddInputs_DEQCommunications_Starter_WithValues_Test");
        Reporter.log("Initiating the scrollAndAddInputs_DEQCommunications_Starter_WithValues_Test");

        deq_communicationspage.setDeqCommVo(deqCommVO);
        //Thread.sleep(4000);
        deq_communicationspage.enterInputs_DEQCommunication();
        deq_communicationspage.clickDEQSaveAndContinue();

        //    Assertion.assertEquals(project_definition.getProjectIDAlertMsg(), AssertDataReader.assertreader.getValue("IPEASSERTMSG_METHOD_FAILURE"));
        logger.debug("Executed the scrollAndAddInputs_DEQCommunications_Starter_WithValues_Test");
        Reporter.log("Executed the scrollAndAddInputs_DEQCommunications_Starter_WithValues_Test");

    }

    @Test(priority = 30, dataProvider = "deqCommunicationVo", dataProviderClass = DEQCommunicationDataProvider.class, enabled = true, groups = {"DeQCommPageTest"}, description = "DeQCommPageTest")

    public void scrollAndAddInputs_DEQCommunications_WithValues_Test(DeqCommunicationInfoVO deqCommVO) throws Throwable {
        logger.debug("Initiating the testcase-DeQCommPageTest");
        Reporter.log("Initiating the testcase-DeQCommPageTest");

        deq_communicationspage.setDeqCommVo(deqCommVO);
        //Thread.sleep(4000);
        deq_communicationspage.enterInputs_DEQCommunication();
        deq_communicationspage.clickDEQSaveAndContinue();

        //    Assertion.assertEquals(project_definition.getProjectIDAlertMsg(), AssertDataReader.assertreader.getValue("IPEASSERTMSG_METHOD_FAILURE"));
        logger.debug("Executed the testcase-DeQCommPageTest");
        Reporter.log("Executed the testcase-DeQCommPageTest");

    }

}
