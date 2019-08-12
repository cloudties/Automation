package com.automation.ui.ipe.testcases.project;

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
import com.automation.ui.ipe.pageobjectsfactory.pageobject.project.pages.ProjectDefinitionPage;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.project.vo.ProjectVO;
import com.automation.ui.ipe.testcases.base.IPEBaseTest;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.automation.ui.ipe.common.dataprovider.*;
import com.automation.ui.base.common.core.assertion.Assertion;
import com.automation.ui.base.common.prpreaders.AssertDataReader;
public class ProjectDefinitionPageTest extends IPEBaseTest {

    private static Logger logger = Logger.getLogger(ProjectDefinitionPageTest.class);

    public ProjectDefinitionPageTest() {

        super();
        logger.debug("ProjectDefinitionPageTest");
        project_definition = new ProjectDefinitionPage();
    }

    protected void getDataReaders() {

        try {
            eu = new ExcelUtil();

            eu.setExcelFile(".\\resources\\data\\dataselenium.xls",
                    ExcelCONSTANTS.PROJECTDEFINITIONXLSDATASHEETNAMELOGIN);
        } catch (Exception e) {
            e.printStackTrace();
            ;
        }

    }


    /**
     * IPE New Project Creation- Click on dropdown at homepage
     */

    @Test(priority = 13, enabled = true, groups = {"ProjectDef"}, description = "ProjectDefinitionPage")

    public void clickonCreatenewprojectdropdownarrow_Test() throws Throwable {
        logger.debug("Initiating the testcase- clickonCreatenewprojectdropdownarrow");
        Reporter.log("Initiating the testcase- clickonCreatenewprojectdropdownarrow");
        project_definition.projectselectiondropdown();
        Thread.sleep(10000);
        logger.debug(" Executed the testcase- clickonCreatenewprojectdropdownarrow");
        Reporter.log("Executed the testcase- clickonCreatenewprojectdropdownarrow");


    }


    /**
     * IPE New Project Creation- Scroll and click on the option- Create New Project
     */

    @Test(priority = 14, enabled = true, groups = {"ProjectDef"}, description = "ProjectDefinitionPage")

    public void scrollAndClickCreateNewProject_Test() throws Throwable {
        logger.debug("Initiating the testcase-scrollAndClickCreateNewProject");
        Reporter.log("Initiating the testcase-scrollAndClickCreateNewProject");
        Thread.sleep(5000);
        //project_definition.clickProjCreateButton();
        project_definition.scrollToClickCreateNewProject();
        logger.debug("Executed the testcase-scrollAndClickCreateNewProject");
        Reporter.log("Executed the testcase-scrollAndClickCreateNewProject");
    }

    @Test(priority = 15, enabled = true, groups = {"StarterRun"}, description = "StarterRun")
    public void scrollAndClickCreateNewProject_Starter_WithValues_Test() throws Throwable {
        logger.debug("Initiating the testcase-scrollAndClickCreateNewProject_WithValues");
        Reporter.log("Initiating the testcase-scrollAndClickCreateNewProject_WithValues");
/**
 * Reading from excel
 */
        String projectID = eu.getCellData(0, 0);
        String projectName = eu.getCellData(1, 0);
        String projectDescription = eu.getCellData(2, 0);
        String customerName = eu.getCellData(3, 0);
        String poNumber = eu.getCellData(4, 0);
        String projectNumber = eu.getCellData(5, 0);
/**
 * Setting values in an object called pvo
 */
        ProjectVO pvo = new ProjectVO();

        pvo.setProjectID(projectID);
        pvo.setProjectName(projectName);
        pvo.setProjectDescription(projectDescription);
        pvo.setCustomerName(customerName);
        pvo.setPoNumber(poNumber);
        pvo.setProjectNumber(projectNumber);
/**
 * Passing the values to pageobject
 */
        project_definition.setPvo(pvo);
        project_definition.scrollToClickCreateNewProject_passvalues();

        //    Assertion.assertEquals(project_definition.getProjectIDAlertMsg(), AssertDataReader.assertreader.getValue("IPEASSERTMSG_METHOD_FAILURE"));
        logger.debug("Executed the testcase-scrollAndClickCreateNewProject_WithValues");
        Reporter.log("Executed the testcase-scrollAndClickCreateNewProject_WithValues");

    }

    /**
     * IPE New Project Creation- Scroll and click on the option- Create New Project with values passed in Excel sheet
     */

    @Test(priority = 15, enabled = true, groups = {"ProjectDef"}, description = "ProjectDefinitionPage")
    public void scrollAndClickCreateNewProject_WithValues_Test() throws Throwable {
        logger.debug("Initiating the testcase-scrollAndClickCreateNewProject_WithValues");
        Reporter.log("Initiating the testcase-scrollAndClickCreateNewProject_WithValues");
/**
 * Reading from excel
 */
        String projectID = eu.getCellData(0, 0);
        String projectName = eu.getCellData(1, 0);
        String projectDescription = eu.getCellData(2, 0);
        String customerName = eu.getCellData(3, 0);
        String poNumber = eu.getCellData(4, 0);
        String projectNumber = eu.getCellData(5, 0);
/**
 * Setting values in an object called pvo
 */
        ProjectVO pvo = new ProjectVO();

        pvo.setProjectID(projectID);
        pvo.setProjectName(projectName);
        pvo.setProjectDescription(projectDescription);
        pvo.setCustomerName(customerName);
        pvo.setPoNumber(poNumber);
        pvo.setProjectNumber(projectNumber);
/**
 * Passing the values to pageobject
 */
        project_definition.setPvo(pvo);
        project_definition.scrollToClickCreateNewProject_passvalues();

        //    Assertion.assertEquals(project_definition.getProjectIDAlertMsg(), AssertDataReader.assertreader.getValue("IPEASSERTMSG_METHOD_FAILURE"));
        logger.debug("Executed the testcase-scrollAndClickCreateNewProject_WithValues");
        Reporter.log("Executed the testcase-scrollAndClickCreateNewProject_WithValues");

    }

    /**
     * IPE New Project Creation- Scroll and click on the option- Create New Project without values passed
     */

    @Test(enabled = true, priority = 16, groups = {"ProjectDef"}, description = "ProjectDefinitionPage")

    public void scrollAndClickCreateNewProject_EmptyValues_Test() throws Throwable {
        logger.debug("Initiating the testcase-scrollAndClickCreateNewProject_EmptyValues");
        Reporter.log("Initiating the testcase-scrollAndClickCreateNewProject_EmptyValues");
/**
 * Reading from excel
 */
        String projectID = "";
        String projectName = "";
        String projectDescription = "";
        String customerName = "";
        String poNumber = "";
        String projectNumber = "";
/**
 * Setting values in an object called pvo
 */
        ProjectVO pvo = new ProjectVO();

        pvo.setProjectID(projectID);
        pvo.setProjectName(projectName);
        pvo.setProjectDescription(projectDescription);
        pvo.setCustomerName(customerName);
        pvo.setPoNumber(poNumber);
        pvo.setProjectNumber(projectNumber);
/**
 * Passing the values to pageobject
 */
        project_definition.setPvo(pvo);
        project_definition.scrollToClickCreateNewProject_passvalues();

        logger.debug("ProjID alertMsg from test case run" + project_definition.getProjectIDAlertMsg());
        Assertion.assertTrue(false);
        //Assertion.assertEquals(project_definition.getProjectIDAlertMsg(),
        //      AssertDataReader.assertreader.getValue("IPEASSERTMSG_PROJECT_ID"));
        logger.debug("Executed the testcase-scrollAndClickCreateNewProject_EmptyValues");
        Reporter.log("Executed the testcase-scrollAndClickCreateNewProject_EmptyValues");

    }

    /**
     * IPE New Project Creation- Scroll and click on the option- Create New Project without values passed for Customer Name,P.O.Number and ProjectNumber
     */

    @Test(enabled = true, priority = 17, groups = {"ProjectDef"}, description = "ProjectDefinitionPage")

    public void scrollAndClickCreateNewProject_LongProjectName_Test() throws Throwable {
        logger.debug("Initiating the testcase-scrollAndClickCreateNewProject_LongProjectName");
        Reporter.log("Initiating the testcase-scrollAndClickCreateNewProject_LongProjectName");
/**
 * Reading from excel
 */
        String projectID = eu.getCellData(0, 1);
        String projectName = eu.getCellData(1, 1);
        String projectDescription = eu.getCellData(2, 1);
        String customerName = eu.getCellData(3, 1);
        String poNumber = eu.getCellData(4, 1);
        String projectNumber = "";
/**
 * Setting values in an object called pvo
 */
        ProjectVO pvo = new ProjectVO();

        pvo.setProjectID(projectID);
        pvo.setProjectName(projectName);
        pvo.setProjectDescription(projectDescription);
        pvo.setCustomerName(customerName);
        pvo.setPoNumber(poNumber);
        pvo.setProjectNumber(projectNumber);
/**
 * Passing the values to pageobjects
 */
        project_definition.setPvo(pvo);
        project_definition.scrollToClickCreateNewProject_passvalues();

        logger.debug("Project Number alertMsg from test case run" + project_definition.getProjectNumberAlertMsg());
        //logger.debug("Project Number alertMsg from test case run"+project_definition.getCustomerNameAlertMsg());

        Assertion.assertEquals(project_definition.getProjectNumberAlertMsg(),
                AssertDataReader.assertreader.getValue("IPEASSERTMSG_PROJECT_NUMBER"));
        logger.debug("Executed the testcase-scrollAndClickCreateNewProject_LongProjectName");
        Reporter.log("Executed the testcase-scrollAndClickCreateNewProject_LongProjectName");

    }
}
