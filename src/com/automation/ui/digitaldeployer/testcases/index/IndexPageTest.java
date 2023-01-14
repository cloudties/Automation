package com.automation.ui.digitaldeployer.testcases.index;

/**
 * @author
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


import com.automation.ui.base.common.utils.ExcelUtil;
import com.automation.ui.digitaldeployer.common.constants.ExcelCONSTANTS;
import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.index.dataprovider.*;
import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.index.pages.*;
import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.index.vo.*;
import com.automation.ui.digitaldeployer.testcases.base.ProjectBaseTest;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class IndexPageTest extends ProjectBaseTest {

    private static Logger logger = Logger.getLogger(com.automation.ui.digitaldeployer.testcases.index.IndexPageTest.class);

    public IndexPageTest() {
        super();
        logger.debug("IndexPageTest");
        indexPage = new IndexPage();
    }

    protected void getDataReaders() {
        try {
            eu = new ExcelUtil();
            eu.setExcelFile(".\\resources\\data\\dataselenium.xls",
                    ExcelCONSTANTS.LOGINXLSDATASHEETNAMELOGIN);
        } catch (Exception e) {
            e.printStackTrace();
            ;
        }
    }



    @Test(priority = 1 ,enabled = true, dataProvider = "initSearchStarter", dataProviderClass = IndexDataProvider.class, groups = {"StarterRun"}, description = "StarterRun")

    public void launchHomePage_Test(InitialSearchVO search) throws Throwable {

        indexPage.open();


    }




}
