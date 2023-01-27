package com.automation.ui.digitaldeployer.testcases.home;

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
import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.home.dataprovider.*;
import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.home.pages.*;
import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.home.vo.*;
import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.login.pages.LoginPage;
import com.automation.ui.digitaldeployer.testcases.base.ProjectBaseTest;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;


public class HomePageTest extends ProjectBaseTest {

    private static Logger logger = Logger.getLogger(HomePageTest.class);

    public HomePageTest() {
        super();
        logger.debug("HomePageTest");
        homePage = new HomePage();
        headerPage = new HeaderPage();
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



    @Test(priority = 1 ,enabled = true, dataProvider = "inputInValidData",
            dataProviderClass = WorkSpaceDataProvider.class, groups = {"StarterRun"}, description = "StarterRun")

    public void launchAddNewWorkspacename_cancel_Test(String wsNAme) throws Throwable {


        login_page=new LoginPage();
        login_page.continuetogitlogin();
        Thread.sleep(3000);
        logger.info("GIT LOGIN IN WS  ");
        login_page.continueauth();
        logger.info("CONTINUE LOGIN IN WS  ");
        Thread.sleep(2000);


        homePage.addws();
        Thread.sleep(2000);
        homePage.cancelws();



    }

    @Test(priority = 1 ,enabled = true, dataProvider = "inputInValidData",
            dataProviderClass = WorkSpaceDataProvider.class, groups = {"StarterRun"},
            description = "StarterRun")

    public void launchAddNewWorkspacename_create_Test(String wsNAme) throws Throwable {


       // homePage = new HomePage();
        //homePage.open();
        login_page=new LoginPage();
        login_page.continuetogitlogin();
        Thread.sleep(3000);
        logger.info("GIT LOGIN IN WS  ");
        login_page.continueauth();
        logger.info("CONTINUE LOGIN IN WS  ");
        Thread.sleep(2000);
        logger.info("ADD WS  LOGIN IN WS ");
        homePage.addws();
        Thread.sleep(1000);
        homePage. addwsname(  wsNAme);
        Thread.sleep(2000);
        homePage.createws();
        Thread.sleep(2000);
    }
    @Test(priority = 3 ,enabled = true, dataProvider = "initSearchStarter", dataProviderClass = HomeDataProvider.class, groups = {"StarterRun"}, description = "StarterRun")
    public void launchSearchText_Test(InitialVO search) throws Throwable {
          homePage.searchtext();
        Thread.sleep(3000);
    }

    @Test(priority = 4 ,enabled = true, dataProvider = "initSearchStarter", dataProviderClass = HomeDataProvider.class, groups = {"StarterRun"}, description = "StarterRun")
    public void launchClearall_Test(InitialVO search) throws Throwable {
        homePage.clearall();
        Thread.sleep(3000);
    }

    @Test(priority = 5 ,enabled = true, dataProvider = "initSearchStarter", dataProviderClass = HomeDataProvider.class, groups = {"StarterRun"}, description = "StarterRun")
    public void launchwsdropdown_Test(InitialVO search) throws Throwable {
        homePage.wsdropdown();
        Thread.sleep(3000);
    }
    @Test(priority = 8 ,enabled = true, dataProvider = "initSearchStarter", dataProviderClass = HomeDataProvider.class, groups = {"StarterRun"}, description = "StarterRun")
    public void launchApi_Test(InitialVO search) throws Throwable {
        homePage.api();
        Thread.sleep(3000);
    }


    @Test(priority = 6 ,enabled = true, dataProvider = "initSearchStarter", dataProviderClass = HomeDataProvider.class, groups = {"StarterRun"}, description = "StarterRun")
    public void launchOverview_Test(InitialVO search) throws Throwable {
        homePage.overview();
        Thread.sleep(3000);
    }




    @Test(priority = 10 ,enabled = true, dataProvider = "initSearchStarter", dataProviderClass = HomeDataProvider.class, groups = {"StarterRun"}, description = "StarterRun")
    public void launchhealth_Test(InitialVO search) throws Throwable {
        headerPage.health();
        Thread.sleep(2000);
    }

    @Test(priority = 11 ,enabled = true, dataProvider = "initSearchStarter", dataProviderClass = HomeDataProvider.class, groups = {"StarterRun"}, description = "StarterRun")
    public void launchhelp_Test(InitialVO search) throws Throwable {
        headerPage.help();
        Thread.sleep(2000);
    }

    @Test(priority = 12 ,enabled = true, dataProvider = "initSearchStarter", dataProviderClass = HomeDataProvider.class, groups = {"StarterRun"}, description = "StarterRun")
    public void launchnotification_Test(InitialVO search) throws Throwable {
        headerPage.notification();
        Thread.sleep(2000);
    }
}
