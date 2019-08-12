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
import com.automation.ui.base.common.core.assertion.Assertion;
import com.automation.ui.base.common.prpreaders.AssertDataReader;
import com.automation.ui.base.common.utils.ExcelUtil;
import com.automation.ui.ipe.common.constants.ExcelCONSTANTS;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.dataprovider.DEQCabinetDeliveryInfoDataProvider;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.pages.DeQCabinetDeliveryDetailsPage;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.vo.DeqCabinetDeliveryInfoVO;
import com.automation.ui.ipe.testcases.base.IPEBaseTest;
import org.apache.log4j.Logger;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.automation.ui.ipe.common.dataprovider.*;

public class DeQCabinetDeliveryDetailsPageTest extends IPEBaseTest {

    private static Logger logger = Logger.getLogger(DeQCabinetDeliveryDetailsPageTest.class);

    public DeQCabinetDeliveryDetailsPageTest() {
        super();
        logger.debug("DeQCabinetDeliveryDetailsPageTest");
        deq_cabinetdeliverydetailpage = new DeQCabinetDeliveryDetailsPage();
    }


    protected void getDataReaders() {

        try {
            eu = new ExcelUtil();

            eu.setExcelFile(ExcelCONSTANTS.LOGINXLSDATAPATH,
                    ExcelCONSTANTS.DEQCABINETINFOXLSDATASHEETNAMELOGIN);

        } catch (Exception e) {
            e.printStackTrace();
            ;
        }

    }


    /**
     * IPE DEQ- Click on section- Customer Information
     */

    @Test(priority = 24, enabled = true, groups = {"DeQCabinetDeliveryDetailsPageTest"}, description = "DeQCabinetDeliveryDetailsPageTest")

    public void clickDEQCabinetDeliveryInfo_Test() throws Throwable {
        logger.debug("Initiating the testcase- clickDEQCabinetDeliveryInfo_Test");
        Reporter.log("Initiating the testcase- clickDEQCabinetDeliveryInfo_Test");
        deq_cabinetdeliverydetailpage.clickDEQhome();
        deq_cabinetdeliverydetailpage.clickDEQCabDeliveryInfo();

        logger.debug(" Executed the testcase- clickDEQCabinetDeliveryInfo_Test");
        Reporter.log("Executed the testcase- clickDEQCabinetDeliveryInfo_Test");
    }

    /**
     * IPE DEQ Cabinets Information - Scroll and select the input fields with values passed in Excel sheet
     */
    @Test(priority = 25, dataProvider = "deqCabDeliveryStarterInfo", dataProviderClass = DEQCabinetDeliveryInfoDataProvider.class, enabled = true, groups = {"StarterRun"}, description = "StarterRun")
    public void scrollAndAddInputs_DEQCabDeliveryInfo_Starter_WithValues_Test(DeqCabinetDeliveryInfoVO deqCabinetDeliveryInfoVO) throws Throwable {
        logger.debug("Initiating the testcase-scrollAndAddInputs_DEQCabDeliveryInfo_WithValues_Test");
        Reporter.log("Initiating the testcase-scrollAndAddInputs_DEQCabDeliveryInfo_WithValues_Test");

        /**
         * Setting the values in to  pageobject
         */
        deq_cabinetdeliverydetailpage.setDeqCabinetDeliveryInfoVO(deqCabinetDeliveryInfoVO);
        //Thread.sleep(4000);
        deq_cabinetdeliverydetailpage.enterInputs_DEQCabinetDeliveryInfo();
        deq_cabinetdeliverydetailpage.clickDEQSaveAndContinue();

        //    Assertion.assertEquals(project_definition.getProjectIDAlertMsg(), AssertDataReader.assertreader.getValue("IPEASSERTMSG_METHOD_FAILURE"));
        logger.debug("Executed the testcase-scrollAndAddInputs_DEQCabDeliveryInfo_WithValues_Test");
        Reporter.log("Executed the testcase-scrollAndAddInputs_DEQCabDeliveryInfo_WithValues_Test");

    }

    @Test(priority = 25, dataProvider = "deqCabDeliveryInfo", dataProviderClass = DEQCabinetDeliveryInfoDataProvider.class, enabled = true, groups = {"DeQCabinetDeliveryDetailsPageTest"}, description = "DeQCabinetDeliveryDetailsPageTest")

    public void scrollAndAddInputs_DEQCabDeliveryInfo_WithValues_Test(DeqCabinetDeliveryInfoVO deqCabinetDeliveryInfoVO) throws Throwable {
        logger.debug("Initiating the testcase-scrollAndAddInputs_DEQCabDeliveryInfo_WithValues_Test");
        Reporter.log("Initiating the testcase-scrollAndAddInputs_DEQCabDeliveryInfo_WithValues_Test");


        /**
         * Setting the values in to  pageobject
         */
        deq_cabinetdeliverydetailpage.setDeqCabinetDeliveryInfoVO(deqCabinetDeliveryInfoVO);
        //Thread.sleep(4000);
        deq_cabinetdeliverydetailpage.enterInputs_DEQCabinetDeliveryInfo();
        deq_cabinetdeliverydetailpage.clickDEQSaveAndContinue();

        //    Assertion.assertEquals(project_definition.getProjectIDAlertMsg(), AssertDataReader.assertreader.getValue("IPEASSERTMSG_METHOD_FAILURE"));
        logger.debug("Executed the testcase-scrollAndAddInputs_DEQCabDeliveryInfo_WithValues_Test");
        Reporter.log("Executed the testcase-scrollAndAddInputs_DEQCabDeliveryInfo_WithValues_Test");

    }

}
