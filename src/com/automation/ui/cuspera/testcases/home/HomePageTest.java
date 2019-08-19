package com.automation.ui.cuspera.testcases.home;

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
import com.automation.ui.cuspera.common.constants.ExcelCONSTANTS;
import com.automation.ui.cuspera.pageobjectsfactory.pageobject.home.dataprovider.*;
import com.automation.ui.cuspera.pageobjectsfactory.pageobject.home.pages.*;
import com.automation.ui.cuspera.pageobjectsfactory.pageobject.home.vo.*;
import com.automation.ui.cuspera.testcases.base.CusperaBaseTest;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class HomePageTest extends CusperaBaseTest {

    private static Logger logger = Logger.getLogger(HomePageTest.class);

    public HomePageTest() {
        super();
        logger.debug("HomePageTest");
        homePage = new HomePage();
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


    @Test(priority = 1 ,enabled = true, dataProvider = "initSearchStarter", dataProviderClass = HomeDataProvider.class, groups = {"StarterRun"}, description = "StarterRun")

    public void continue_Test(InitialSearchVO search) throws Throwable {

        homePage.continueButton();

        Thread.sleep(1000);

    }



    @Test(priority = 1 ,enabled = true, dataProvider = "initSearchStarter", dataProviderClass = HomeDataProvider.class, groups = {"StarterRun"}, description = "StarterRun")

    public void launchHomePage_Test(InitialSearchVO search) throws Throwable {

        homePage.open();

        Thread.sleep(1000);

    }


    @Test(priority = 2 ,enabled = true, dataProvider = "initSearchStarter", dataProviderClass = HomeDataProvider.class, groups = {"StarterRun"}, description = "StarterRun")

    public void searchIndustry_Test(InitialSearchVO search) throws Throwable {

        homePage.searchIndustry(search);

        Thread.sleep(10000);

    }


    @Test(priority = 3 ,enabled = true, dataProvider = "initSearchStarter", dataProviderClass = HomeDataProvider.class, groups = {"StarterRun"}, description = "StarterRun")

    public void searchMarketing_Test(InitialSearchVO search) throws Throwable {

        homePage.searchMarketing(search);

        Thread.sleep(10000);

    }

    @Test(priority = 3 ,enabled = true, dataProvider = "initSearchStarter", dataProviderClass = HomeDataProvider.class, groups = {"StarterRun"}, description = "StarterRun")

    public void searchGoal_Test(InitialSearchVO search) throws Throwable {

        homePage.searchGoal(search);

        Thread.sleep(10000);

    }

    @Test(priority = 3 ,enabled = true, dataProvider = "initSearchStarter", dataProviderClass = HomeDataProvider.class, groups = {"StarterRun"}, description = "StarterRun")

    public void search_Test(InitialSearchVO search) throws Throwable {

        homePage.search(search);

        Thread.sleep(10000);

    }


}
