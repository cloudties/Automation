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
import com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.dataprovider.DEQProjectSpecificInfoDataProvider;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.pages.DeQProjectSpecificInfoDetailsPage;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.vo.DeqProjectSpecificInfoVO;
import com.automation.ui.ipe.testcases.base.IPEBaseTest;
import org.apache.log4j.Logger;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.automation.ui.ipe.common.dataprovider.*;
import com.automation.ui.base.common.core.assertion.Assertion;
import com.automation.ui.base.common.prpreaders.AssertDataReader;
public class DeQProjectSpecificInfoTest extends IPEBaseTest {

    private static Logger logger = Logger.getLogger(DeQProjectSpecificInfoTest.class);

    public DeQProjectSpecificInfoTest() {
        super();
        logger.debug("DeQProjectSpecificInfoTest");
        deqprojectSpecificInfo_page = new DeQProjectSpecificInfoDetailsPage();
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

    @Test(priority = 26, dataProvider = "deqProjSpecStarterVo", dataProviderClass = DEQProjectSpecificInfoDataProvider.class, enabled = false, groups = {"DeQPowerTest"}, description = "DeQPowerTest")

    public void clickDandD_Test(DeqProjectSpecificInfoVO deqProjSpecInfoVO) throws Throwable {
        logger.debug("Initiating the testcase- clickDandD_Test");
        Reporter.log("Initiating the testc ase- clickDandD_Test");

        deqprojectSpecificInfo_page.clickDEQProjectSpecDragandDrop();


        logger.debug(" Executed the testcase- clickDandD_Test");
        Reporter.log("Executed the testcase- clickDandD_Test");
    }

    @Test(priority = 27, dataProvider = "deqProjSpecStarterVo", dataProviderClass = DEQProjectSpecificInfoDataProvider.class, enabled = true, groups = {"DeQProjSpecifTest"}, description = "DeQProjSpecifTest")

    public void validateDeqProjSpecInfo_Starter_Test(DeqProjectSpecificInfoVO deqProjSpecInfoVO) throws Throwable {
        logger.debug("Initiating the testcase- validateDeqProjSpecInfo_Starter_Test");
        Reporter.log("Initiating the test validateDeqProjSpecInfo_Starter_Test");

        deqprojectSpecificInfo_page.setDeqProjSpecificInfoVO(deqProjSpecInfoVO);
        deqprojectSpecificInfo_page.enterInputs_DEQProjSpecificInfo();


        logger.debug(" Executed the testcase- validateDeqProjSpecInfo_Starter_Test");
        Reporter.log("Executed the testcase- validateDeqProjSpecInfo_Starter_Test");
    }

    @Test(priority = 28, dataProvider = "deqProjSpecificInfoVo", dataProviderClass = DEQProjectSpecificInfoDataProvider.class, enabled = true, groups = {"DeQProjSpecifTest"}, description = "DeQProjSpecifTest")

    public void validateDeqProjSpecInfo_Test(DeqProjectSpecificInfoVO deqProjSpecInfoVO) throws Throwable {
        logger.debug("Initiating the testcase- validateDeqProjSpecInfo_Starter_Test");
        Reporter.log("Initiating the test validateDeqProjSpecInfo_Starter_Test");

        deqprojectSpecificInfo_page.enterInputs_DEQProjSpecificInfo();


        logger.debug(" Executed the testcase- validateDeqProjSpecInfo_Starter_Test");
        Reporter.log("Executed the testcase- validateDeqProjSpecInfo_Starter_Test");
    }


}
