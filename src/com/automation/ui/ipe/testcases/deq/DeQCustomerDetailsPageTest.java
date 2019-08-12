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
import com.automation.ui.ipe.pageobjectsfactory.pageobject.base.CountryCode;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.dataprovider.*;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.pages.DeQCustomerDetailsPage;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.vo.DeqCustomerInfoVO;
import com.automation.ui.ipe.testcases.base.IPEBaseTest;
import org.apache.log4j.Logger;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.automation.ui.base.common.core.assertion.Assertion;
import com.automation.ui.base.common.prpreaders.AssertDataReader;
import com.automation.ui.base.common.utils.ExcelUtil;
import com.automation.ui.ipe.common.constants.ExcelCONSTANTS;
import com.automation.ui.ipe.common.dataprovider.*;
import com.automation.ui.ipe.common.dataprovider.*;

public class DeQCustomerDetailsPageTest extends IPEBaseTest {

    private static Logger logger = Logger.getLogger(DeQCustomerDetailsPageTest.class);

    public DeQCustomerDetailsPageTest() {
        super();
        logger.debug("DeQCustomerDetailsPageTest");
        deq_custdetailpage = new DeQCustomerDetailsPage();
    }
    protected void getDataReaders() {
        try {
            eu = new ExcelUtil();
            eu.setExcelFile(ExcelCONSTANTS.LOGINXLSDATAPATH,
                    ExcelCONSTANTS.DEQCUSTOMERINFOXLSDATASHEETNAMELOGIN);
        } catch (Exception e) {
            e.printStackTrace();
            ;
        }
    }


    @Test(priority = 1, dataProvider = "inputValidData", dataProviderClass = IPEDataProvider.class,enabled = true, groups = {"DeQCustomerDetailsPageTest"}, description = "DeQCustomerDetailsPageTest")
    public void verify_CustNameValidInput_Test(String custName) throws Throwable {
        deq_custdetailpage.clickDEQhome();
        deq_custdetailpage.verify_CustNameInput(custName);
        Assertion.assertTrue(true);
      }

    @Test(priority = 2, dataProvider = "inputInValidData", dataProviderClass = IPEDataProvider.class,enabled = true, groups = {"DeQCustomerDetailsPageTest"}, description = "DeQCustomerDetailsPageTest")
    public void verify_CustNameInValidInput_Test(String custName) throws Throwable {
         deq_custdetailpage.clickDEQhome();
        deq_custdetailpage.verify_CustNameInput(custName);
        Assertion.assertEquals(deq_custdetailpage.getProjectNameAlertMsg(), AssertDataReader.assertreader.getValue("IPEASSERTMSG_DEQ_ALERT_ALPHANUM"));
     }

    @Test(priority = 3, dataProvider = "inputValidData", dataProviderClass = IPEDataProvider.class,enabled = true, groups = {"DeQCustomerDetailsPageTest"}, description = "DeQCustomerDetailsPageTest")
    public void verify_ProjectNameValidInput_Test(String custName) throws Throwable {
         deq_custdetailpage.clickDEQhome();
        deq_custdetailpage.verify_ProjNameInput(custName);
        Assertion.assertTrue(true);
     }

    @Test(priority = 4, dataProvider = "inputInValidData", dataProviderClass = IPEDataProvider.class,enabled = true, groups = {"DeQCustomerDetailsPageTest"}, description = "DeQCustomerDetailsPageTest")
    public void verify_ProjectNameInValidInput_Test(String custName) throws Throwable {
         deq_custdetailpage.clickDEQhome();
        deq_custdetailpage.verify_ProjNameInput(custName);
        Assertion.assertEquals(deq_custdetailpage.getProjectNameAlertMsg(), AssertDataReader.assertreader.getValue("IPEASSERTMSG_DEQ_ALERT_ALPHANUM"));
     }


    /**
     * IPE DEQ- Click on section- Customer Information
     */

    @Test(priority = 18, enabled = true, groups = {"DeQCustomerDetailsPageTest"}, description = "IPEDataProvider")
    public void clickDEQCustomerInfo_Test() throws Throwable {
        logger.debug("Initiating the testcase- clickDEQCustomerInfo_Test");
        Reporter.log("Initiating the testcase- clickDEQCustomerInfo_Test");
        deq_custdetailpage.clickDEQhome();
        logger.debug(" Executed the testcase- clickDEQCustomerInfo_Test");
        Reporter.log("Executed the testcase- clickDEQCustomerInfo_Test");
    }

    /**
     * IPE DEQ Customer Information - Scroll and select the input fields with values passed in Excel sheet
     */

    @Test(priority = 19, enabled = true, groups = {"StarterRun"}, description = "StarterRun")

    public void scrollAndAddInputs_DEQCustomerInfo_Starter_WithValues_Test() throws Throwable {
        logger.debug("Initiating the testcase-scrollAndAddInputs_DEQCustomerInfo_Starter_WithValues_Test");
        Reporter.log("Initiating the testcase-scrollAndAddInputs_DEQCustomerInfo_Starter_WithValues_Test");
        /**
         * Reading from excel
         */
        String deqCustName = eu.getCellData(0, 0);
        String deqProjectName = eu.getCellData(1, 0);
        String deqExpDeliDate = eu.getCellData(2, 0);
        String deqCommContactName = eu.getCellData(3, 0);
        String deqCommContactEmail = eu.getCellData(4, 0);
        String deqCommContactPhNo = eu.getCellData(5, 0);
        String deqTechContactName = eu.getCellData(6, 0);
        String deqTechContactEmail = eu.getCellData(7, 0);
        String deqTechContactPhNo = eu.getCellData(8, 0);
        String deqPONo = eu.getCellData(9, 0);
        String deqDocNo = eu.getCellData(10, 0);
        String deqDocCntlIndNo = eu.getCellData(11, 0);
        String deqEndUserName = eu.getCellData(12, 0);
        String deqOperatorName = eu.getCellData(13, 0);

        logger.debug("Initiating scrollAndAddInputs_DEQCustomerInfo_Starter_WithValues_Test check 11");

        /**
         * Setting values in an object called DeqCustomerInfoVO
         */
        DeqCustomerInfoVO deqsec1vo = new DeqCustomerInfoVO();
        deqsec1vo.setDeqCustomerName(deqCustName);
        deqsec1vo.setDeqProjectName(deqProjectName);
        deqsec1vo.setDeqExpDelDate(deqExpDeliDate);
        deqsec1vo.setDeqCommContactName(deqCommContactName);
        deqsec1vo.setDeqCommContactEmail(deqCommContactEmail);
        deqsec1vo.setDeqCntryCodeComm(CountryCode.COUNTRY_CODE_USA);
        deqsec1vo.setDeqCommContactPhNo(deqCommContactPhNo);
        deqsec1vo.setDeqTechContactName(deqTechContactName);
        deqsec1vo.setDeqTechContactEmail(deqTechContactEmail);
        deqsec1vo.setDeqCntryCodeTech(CountryCode.COUNTRY_CODE_Australia);
        deqsec1vo.setDeqTechContactPhNo(deqTechContactPhNo);
        deqsec1vo.setDeqPONo(deqPONo);
        deqsec1vo.setDeqDocNo(deqDocNo);
        deqsec1vo.setDeqDocControlIndNo(deqDocCntlIndNo);
        deqsec1vo.setDeqEnduserName(deqEndUserName);
        deqsec1vo.setDeqOperatorName(deqOperatorName);
        logger.debug("Initiating scrollAndAddInputs_DEQCustomerInfo_Starter_WithValues_Test check 12");


        /**
         * Setting the values in to  pageobject
         */
        deq_custdetailpage.setDeqcustinfovo(deqsec1vo);
        logger.debug("Initiating enterInputs_DEQCustomerInfo check 1");
        deq_custdetailpage.enterInputs_DEQCustomerInfo();
        logger.debug("Initiating enterInputs_DEQCustomerInfo check 2");
        deq_custdetailpage.clickDEQSaveAndContinue();

        //    Assertion.assertEquals(project_definition.getProjectIDAlertMsg(), AssertDataReader.assertreader.getValue("IPEASSERTMSG_METHOD_FAILURE"));
        logger.debug("Executed the testcase-scrollAndAddInputs_DEQCustomerInfo_Starter_WithValues_Test");
        Reporter.log("Executed the testcase-scrollAndAddInputs_DEQCustomerInfo_Starter_WithValues_Test");

    }

    /**
     * IPE DEQ Customer Information - Scroll and select the input fields with values passed in Excel sheet
     */

    @Test(priority = 19, enabled = true, groups = {"DeQCustomerDetailsPageTest"}, description = "DeQCustomerDetailsPageTest")

    public void scrollAndAddInputs_DEQCustomerInfo_WithValues_Test() throws Throwable {
        logger.debug("Initiating the testcase-scrollAndAddInputs_DEQCustomerInfo_WithValues");
        Reporter.log("Initiating the testcase-scrollAndAddInputs_DEQCustomerInfo_WithValues");
        /**
         * Reading from excel
         */
        String deqCustName = eu.getCellData(0, 0);
        String deqProjectName = eu.getCellData(1, 0);
        String deqExpDeliDate = eu.getCellData(2, 0);
        String deqCommContactName = eu.getCellData(3, 0);
        String deqCommContactEmail = eu.getCellData(4, 0);
        String deqCommContactPhNo = eu.getCellData(5, 0);
        String deqTechContactName = eu.getCellData(6, 0);
        String deqTechContactEmail = eu.getCellData(7, 0);
        String deqTechContactPhNo = eu.getCellData(8, 0);
        String deqPONo = eu.getCellData(9, 0);
        String deqDocNo = eu.getCellData(10, 0);
        String deqDocCntlIndNo = eu.getCellData(11, 0);
        String deqEndUserName = eu.getCellData(12, 0);
        String deqOperatorName = eu.getCellData(13, 0);


        /**
         * Setting values in an object called DeqCustomerInfoVO
         */
        DeqCustomerInfoVO deqsec1vo = new DeqCustomerInfoVO();
        deqsec1vo.setDeqCustomerName(deqCustName);
        deqsec1vo.setDeqProjectName(deqProjectName);
        deqsec1vo.setDeqExpDelDate(deqExpDeliDate);
        deqsec1vo.setDeqCommContactName(deqCommContactName);
        deqsec1vo.setDeqCommContactEmail(deqCommContactEmail);
        deqsec1vo.setDeqCntryCodeComm(CountryCode.COUNTRY_CODE_USA);
        deqsec1vo.setDeqCommContactPhNo(deqCommContactPhNo);
        deqsec1vo.setDeqTechContactName(deqTechContactName);
        deqsec1vo.setDeqTechContactEmail(deqTechContactEmail);
        deqsec1vo.setDeqCntryCodeTech(CountryCode.COUNTRY_CODE_USA);
        deqsec1vo.setDeqTechContactPhNo(deqTechContactPhNo);
        deqsec1vo.setDeqPONo(deqPONo);
        deqsec1vo.setDeqDocNo(deqDocNo);
        deqsec1vo.setDeqDocControlIndNo(deqDocCntlIndNo);
        deqsec1vo.setDeqEnduserName(deqEndUserName);
        deqsec1vo.setDeqOperatorName(deqOperatorName);
        /**
         * Setting the values in to  pageobject
         */
        deq_custdetailpage.setDeqcustinfovo(deqsec1vo);
        //Thread.sleep(4000);
        deq_custdetailpage.enterInputs_DEQCustomerInfo();
        deq_custdetailpage.clickDEQSaveAndContinue();
        //    Assertion.assertEquals(project_definition.getProjectIDAlertMsg(), AssertDataReader.assertreader.getValue("IPEASSERTMSG_METHOD_FAILURE"));
        logger.debug("Executed the testcase-scrollAndAddInputs_DEQCustomerInfo_WithValues");
        Reporter.log("Executed the testcase-scrollAndAddInputs_DEQCustomerInfo_WithValues");
    }


    /**
     * IPE DEQ Customer Information - Scroll and select the input fields with partial values passed in Excel sheet
     */

    @Test(priority = 20, enabled = true, groups = {"DeQCustomerDetailsPageTest"}, description = "DeQCustomerDetailsPageTest")

    public void scrollAndAddInputs_DEQCustomerInfo_WithPartialValues_Test() throws Throwable {
        logger.debug("Initiating the testcase-scrollAndAddInputs_DEQCustomerInfo_PartialValues");
        Reporter.log("Initiating the testcase-scrollAndAddInputs_DEQCustomerInfo_PartialValues");
        /**
         * Reading from excel
         */
        String deqCustName = eu.getCellData(0, 1);
        String deqProjectName = eu.getCellData(1, 1);
        String deqExpDeliDate = eu.getCellData(2, 1);
        String deqCommContactName = eu.getCellData(3, 1);
        String deqCommContactEmail = eu.getCellData(4, 1);
        String deqCommContactPhNo = eu.getCellData(5, 1);
        String deqTechContactName = eu.getCellData(6, 1);
        String deqTechContactEmail = eu.getCellData(7, 1);
        String deqTechContactPhNo = eu.getCellData(8, 1);
        String deqPONo = eu.getCellData(9, 1);
        String deqDocNo = eu.getCellData(10, 1);
        String deqDocCntlIndNo = eu.getCellData(11, 1);
        String deqEndUserName = eu.getCellData(12, 1);
        String deqOperatorName = eu.getCellData(13, 1);
        /**
         * Setting values in an object called DeqCustomerInfoVO
         */
        DeqCustomerInfoVO deqsec1vo = new DeqCustomerInfoVO();
        deqsec1vo.setDeqCustomerName(deqCustName);
        deqsec1vo.setDeqProjectName(deqProjectName);
        deqsec1vo.setDeqExpDelDate(deqExpDeliDate);
        deqsec1vo.setDeqCommContactName(deqCommContactName);
        deqsec1vo.setDeqCommContactEmail(deqCommContactEmail);
        deqsec1vo.setDeqCntryCodeComm(CountryCode.COUNTRY_CODE_USA);
        deqsec1vo.setDeqCommContactPhNo(deqCommContactPhNo);
        deqsec1vo.setDeqTechContactName(deqTechContactName);
        deqsec1vo.setDeqTechContactEmail(deqTechContactEmail);
        deqsec1vo.setDeqCntryCodeTech(CountryCode.COUNTRY_CODE_USA);
        deqsec1vo.setDeqTechContactPhNo(deqTechContactPhNo);
        deqsec1vo.setDeqPONo(deqPONo);
        deqsec1vo.setDeqDocNo(deqDocNo);
        deqsec1vo.setDeqDocControlIndNo(deqDocCntlIndNo);
        deqsec1vo.setDeqEnduserName(deqEndUserName);
        deqsec1vo.setDeqOperatorName(deqOperatorName);

        /**
         * Setting the values in to  pageobject
         */
        deq_custdetailpage.setDeqcustinfovo(deqsec1vo);
        //Thread.sleep(4000);
        deq_custdetailpage.enterInputs_DEQCustomerInfo();
        deq_custdetailpage.clickDEQSaveAndContinue();

        //    Assertion.assertEquals(project_definition.getProjectIDAlertMsg(), AssertDataReader.assertreader.getValue("IPEASSERTMSG_METHOD_FAILURE"));
        logger.debug("Executed the testcase-scrollAndAddInputs_DEQCustomerInfo_PartialValues");
        Reporter.log("Executed the testcase-scrollAndAddInputs_DEQCustomerInfo_PartialValues");

    }


}
