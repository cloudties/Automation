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
import com.automation.ui.ipe.common.constants.ExcelCONSTANTS;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.dataprovider.DEQDocumentInfoDataProvider;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.pages.DeQDocumentDetailsPage;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.vo.DeqDocumentInfoVO;
import com.automation.ui.ipe.testcases.base.IPEBaseTest;
import org.apache.log4j.Logger;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.automation.ui.ipe.common.dataprovider.*;
import com.automation.ui.base.common.core.assertion.Assertion;
import com.automation.ui.base.common.prpreaders.AssertDataReader;
public class DeQDocumentDetailsPageTest extends IPEBaseTest {

    private static Logger logger = Logger.getLogger(DeQDocumentDetailsPageTest.class);

    public DeQDocumentDetailsPageTest() {
        super();
        logger.debug("DeQDocumentDetailsPageTest");
        deq_docdetailpage = new DeQDocumentDetailsPage();
    }


    protected void getDataReaders() {

        try {
            eu = new ExcelUtil();

            eu.setExcelFile(ExcelCONSTANTS.LOGINXLSDATAPATH,
                    ExcelCONSTANTS.DEQDOCUMENTINFOXLSDATASHEETNAMELOGIN);

        } catch (Exception e) {
            e.printStackTrace();
            ;
        }

    }


    /**
     * IPE DEQ- Click on section- Customer Information
     */

    @Test(priority = 21, enabled = true, groups = {"DeQDocumentDetailsPageTest"}, description = "DeQDocumentDetailsPageTest")

    public void clickDEQDocInfo_Test() throws Throwable {
        logger.debug("Initiating the testcase- clickDEQDocInfo");
        Reporter.log("Initiating the testcase- clickDEQDocInfo");
        deq_docdetailpage.clickDEQDocumenthome();
        deq_docdetailpage.clickDEQDocumentInfo();
        Thread.sleep(2000);

        logger.debug(" Executed the testcase- clickDEQCustInfo");
        Reporter.log("Executed the testcase- clickDEQCustInfo");
    }

    /**
     * IPE DEQ Customer Information - Scroll and select the input fields with values passed in Excel sheet
     */

    @Test(priority = 22, dataProvider = "deqDocInfoVo", dataProviderClass = DEQDocumentInfoDataProvider.class, enabled = true, groups = {"DeQDocumentDetailsPageTest"}, description = "DeQDocumentDetailsPageTest")

    public void scrollAndAddInputs_DEQDocumentInfo_WithValues_Test(DeqDocumentInfoVO deqDocInfoVo) throws Throwable {
        logger.debug("Initiating the testcase-scrollAndAddInputs_DEQDocumentInfo_WithValues");
        Reporter.log("Initiating the testcase-scrollAndAddInputs_DEQDocumentInfo_WithValues");

        /**
         * Setting the values in to  pageobject
         */
        deq_docdetailpage.setDeqDocInfovo(deqDocInfoVo);
        Thread.sleep(4000);
        deq_docdetailpage.enterInputs_DEQDocumentInfo();

        //    Assertion.assertEquals(project_definition.getProjectIDAlertMsg(), AssertDataReader.assertreader.getValue("IPEASSERTMSG_METHOD_FAILURE"));
        logger.debug("Executed the testcase-scrollAndAddInputs_DEQDocumentInfo_WithValues");
        Reporter.log("Executed the testcase-scrollAndAddInputs_DEQDocumentInfo_WithValues");

    }


    /**
     * IPE DEQ Customer Information - Scroll and select the input fields with values passed in Excel sheet
     */

    @Test(priority = 22, dataProvider = "deqDocInfoStarterVo", dataProviderClass = DEQDocumentInfoDataProvider.class, enabled = true, groups = {"StarterRun"}, description = "StarterRun")

    public void scrollAndAddInputs_DEQDocumentInfo_Starter_WithValues_Test(DeqDocumentInfoVO deqDocInfoVo) throws Throwable {
        logger.debug("Initiating the testcase-scrollAndAddInputs_DEQDocumentInfo_WithValues");
        Reporter.log("Initiating the testcase-scrollAndAddInputs_DEQDocumentInfo_WithValues");

        /**
         * Setting the values in to  pageobject
         */
        deq_docdetailpage.setDeqDocInfovo(deqDocInfoVo);

        deq_docdetailpage.enterInputs_DEQDocumentInfo();

        //    Assertion.assertEquals(project_definition.getProjectIDAlertMsg(), AssertDataReader.assertreader.getValue("IPEASSERTMSG_METHOD_FAILURE"));
        logger.debug("Executed the testcase-scrollAndAddInputs_DEQDocumentInfo_WithValues");
        Reporter.log("Executed the testcase-scrollAndAddInputs_DEQDocumentInfo_WithValues");

    }

    /**
     * IPE DEQ Customer Information - Scroll and select the input fields with partial values passed in Excel sheet
     */

    @Test(priority = 23, enabled = false, groups = {"DeQDocumentDetailsPageTest"}, description = "DeQDocumentDetailsPageTest")

    public void scrollAndAddInputs_DEQCustomerInfo_WithPartialValues_Test() throws Throwable {
        logger.debug("Initiating the testcase-scrollAndAddInputs_DEQCustomerInfo_PartialValues");
        Reporter.log("Initiating the testcase-scrollAndAddInputs_DEQCustomerInfo_PartialValues");
        /**
         * Reading from excel
         */
        String deqPlantAddress = eu.getCellData(0, 0);
        String deqPlantLoc = eu.getCellData(1, 0);
        String deqSISLEName = eu.getCellData(2, 0);
        String deqSISLEPos = eu.getCellData(3, 0);
        String deqAuthorDate = eu.getCellData(4, 0);
        String deqSISEngName = eu.getCellData(5, 0);
        String deqSISEngPos = eu.getCellData(6, 0);
        String deqSISEngReviewDate = eu.getCellData(7, 0);
        String deqDocApproverName = eu.getCellData(8, 0);
        String deqDocApproverPos = eu.getCellData(9, 0);
        String deqDocApprvdDate = eu.getCellData(10, 0);
        String deqDocRevNumber = eu.getCellData(11, 0);
        String deqDocStatus = eu.getCellData(12, 0);
        String deqDocCreationDate = eu.getCellData(13, 0);
        String deqSASRef = eu.getCellData(14, 0);
        String deqSPEPRef = eu.getCellData(15, 0);
        String deqSDDSRef = eu.getCellData(16, 0);

        /**
         * Setting values in an object called DeqCustomerInfoVO
         */
        DeqDocumentInfoVO deqDocInfovo = new DeqDocumentInfoVO();
        deqDocInfovo.setDeqDocInfoPlantAddress(deqPlantAddress);
        deqDocInfovo.setDeqDocInfoPlantLocation(deqPlantLoc);
        deqDocInfovo.setDeqDocInfoSISLEName(deqSISLEName);
        deqDocInfovo.setDeqDocInfoSISLEPosition(deqSISLEPos);
        deqDocInfovo.setDeqDocInfoAuthorDate(deqAuthorDate);
        deqDocInfovo.setDeqDocInfoSISEngName(deqSISEngName);
        deqDocInfovo.setDeqDocInfoSISEngPosition(deqSISEngPos);
        deqDocInfovo.setDeqDocInfoReviewDate(deqSISEngReviewDate);
        deqDocInfovo.setDeqDocInfoDocApproverName(deqDocApproverName);
        deqDocInfovo.setDeqDocInfoDocApproverPos(deqDocApproverPos);
        deqDocInfovo.setDeqDocInfoApprvdDate(deqDocApprvdDate);
        deqDocInfovo.setDeqDocInfoDocRevision(deqDocRevNumber);
        deqDocInfovo.setDeqDocInfoStatus(deqDocStatus);
        deqDocInfovo.setDeqDocInfoDocCreateDate(deqDocCreationDate);
        deqDocInfovo.setDeqDocInfoSASRef(deqSASRef);
        deqDocInfovo.setDeqDocInfoSPEPRef(deqSPEPRef);
        deqDocInfovo.setDeqDocInfoSDDSRef(deqSDDSRef);

        /**
         * Setting the values in to  pageobject
         */
        deq_docdetailpage.setDeqDocInfovo(deqDocInfovo);
        Thread.sleep(4000);
        deq_docdetailpage.enterInputs_DEQDocumentInfo();

        //    Assertion.assertEquals(project_definition.getProjectIDAlertMsg(), AssertDataReader.assertreader.getValue("IPEASSERTMSG_METHOD_FAILURE"));
        logger.debug("Executed the testcase-scrollAndAddInputs_DEQCustomerInfo_WithPartialValues");
        Reporter.log("Executed the testcase-scrollAndAddInputs_DEQCustomerInfo_WithPartialValues");

    }


}
