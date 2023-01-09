package com.automation.ui.digitaldeployer.testcases.context;

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
import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.base.Goals;
import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.base.Industry;
import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.context.dataprovider.ContextDataProvider;
import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.home.dataprovider.*;
import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.home.pages.*;
import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.context.pages.*;

import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.context.vo.*;
import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.home.vo.InitialSearchVO;
import com.automation.ui.digitaldeployer.testcases.base.DigitalDeployerBaseTest;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class ContextPageTest extends DigitalDeployerBaseTest {

    private static Logger logger = Logger.getLogger(ContextPageTest.class);

    public ContextPageTest() {
        super();
        logger.debug("ContextPageTest");
        contextPage = new ContextPage();
    }

    protected void getDataReaders() {
        try {
            eu = new ExcelUtil();
            eu.setExcelFile(".\\resources\\data\\dataselenium.xls",
                    ExcelCONSTANTS.LOGINXLSDATASHEETNAMECONTEXT);
        } catch (Exception e) {
            e.printStackTrace();
            ;
        }
    }


    @Test(priority = 1 ,enabled = true, dataProvider = "initContextStarter", dataProviderClass = ContextDataProvider.class, groups = {"StarterRun"}, description = "StarterRun")


    public void clickEmail_Test(ContextVO ctxVO) throws Throwable {

        HomePage hp=new HomePage();
        InitialSearchVO initSearchVo1= new InitialSearchVO();
        initSearchVo1.setSelectIndustry(Industry.INDUSTRY_COMPUTER_SOFTWARE);

        initSearchVo1.setSelectMarketNeeded("lead");

        initSearchVo1.setSelectBusinessGoal(Goals.GOAL_INCREASE_REVENUE);
        hp.search(initSearchVo1);
        logger.info("clickEmail");
        contextPage.clickEmail(ctxVO);
        Thread.sleep(1000);

        contextPage.clickLeadEngagement(ctxVO);

        Thread.sleep(2000);

        contextPage.chooseSoftware(ctxVO);

        contextPage.aubmitOptimizeAndCompare(ctxVO);

        Thread.sleep(15000);

    }




}
