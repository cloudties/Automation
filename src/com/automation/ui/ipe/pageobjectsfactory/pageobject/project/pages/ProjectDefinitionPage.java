package com.automation.ui.ipe.pageobjectsfactory.pageobject.project.pages;/** * @author Manjusha Saju */import com.automation.ui.base.common.prpreaders.AssertDataReader;import com.automation.ui.ipe.pageobjectsfactory.pageobject.base.IPEBasePageObject;import com.automation.ui.ipe.pageobjectsfactory.pageobject.project.vo.ProjectVO;import com.automation.ui.ipe.pageobjectsfactory.pageobject.project.xpathconstants.ProjectDefinitionConstants;import org.apache.log4j.Logger;import org.openqa.selenium.WebElement;import org.openqa.selenium.support.FindBy;import org.testng.Assert;import org.testng.Reporter;import com.automation.ui.base.common.core.assertion.Assertion;import com.automation.ui.base.common.prpreaders.AssertDataReader;public class ProjectDefinitionPage extends IPEBasePageObject {    private static Logger logger = Logger.getLogger(ProjectDefinitionPage.class);    @FindBy(xpath = ProjectDefinitionConstants.CREATEPROJECTDROPDOWNARROW)    private WebElement createProjectdropdownarrow;    @FindBy(xpath = ProjectDefinitionConstants.CREATENEWPROEJCT)    private WebElement createNewproject;    @FindBy(xpath = ProjectDefinitionConstants.PROJECTID)    private WebElement projectId;    @FindBy(xpath = ProjectDefinitionConstants.PROJECTNAME)    private WebElement projName;    @FindBy(xpath = ProjectDefinitionConstants.PROJECTDESCRIPTION)    private WebElement projDescription;    @FindBy(xpath = ProjectDefinitionConstants.CUSTOMERNAME)    private WebElement customerName;    @FindBy(xpath = ProjectDefinitionConstants.PONUMBER)    private WebElement poNumber;    @FindBy(xpath = ProjectDefinitionConstants.PROJECTNUMBER)    private WebElement projNumber;    @FindBy(xpath = ProjectDefinitionConstants.CREATEPROJECTBUTTON)    private WebElement createProjButton;    @FindBy(xpath = ProjectDefinitionConstants.CANCELPROJECTBUTTON)    private WebElement cancelProjButton;    @FindBy(xpath = ProjectDefinitionConstants.PROJECTIDALERTMSG)    private WebElement projIDAlertMsg;    @FindBy(xpath = ProjectDefinitionConstants.PROJECTNAMEALERTMSG)    private WebElement projNameAlertMsg;    @FindBy(xpath = ProjectDefinitionConstants.PROJECTDESCALERTMSG)    private WebElement projDescAlertMsg;    @FindBy(xpath = ProjectDefinitionConstants.CUSTOMERNAMEALERTMSG)    private WebElement customerNameAlertMsg;    @FindBy(xpath = ProjectDefinitionConstants.PONUMBERALERTMSG)    private WebElement poNumberAlertMsg;    @FindBy(xpath = ProjectDefinitionConstants.PROJECTNUMBERALERTMSG)    private WebElement projNumberAlertMsg;    private ProjectVO pvo;    public ProjectVO getPvo() {        return pvo;    }    public void setPvo(ProjectVO pvo) {        this.pvo = pvo;    }    public ProjectDefinitionPage open() {        logger.debug("open the URL" + getCurrentUrl());        getUrl(getCurrentUrl());        return this;    }    public void projectselectiondropdown() {        try {            logger.debug("Navigating to Create New Project dropdown arrow from home page");            waitAndClick(createProjectdropdownarrow);            logger.debug("Selected and clicked on Create New Project dropdown arrow");        } catch (Exception e) {            e.printStackTrace();        }    }    public void scrollToClickCreateNewProject() {        try {            logger.debug("Scroll to the selection - Create New Project at home page");            projectselectiondropdown();            scrollAndClick(createNewproject);        } catch (Exception e) {            e.printStackTrace();        }    }    public void scrollToClickCreateNewProject_passvalues() {        try {            logger.debug("Scroll to the selection - Create New Project at home page");            scrollToClickCreateNewProject();            logger.debug("Scrolled to the selection - Create New Project at home page");            fillInputAfterClear(projectId, pvo.getProjectID());            fillInputAfterClear(projName, pvo.getProjectName());            Thread.sleep(2000);            fillInputAfterClear(projDescription, pvo.getProjectDescription());            fillInputAfterClear(customerName, pvo.getCustomerName());            Thread.sleep(2000);            fillInputAfterClear(poNumber, pvo.getPoNumber());            fillInputAfterClear(projNumber, pvo.getProjectNumber());            Thread.sleep(2000);            createProjButton.click();        } catch (Exception e) {            Assertion.fail(AssertDataReader.assertreader.getValue("IPEASSERTMSG_ASSERT_ERROR"));            e.printStackTrace();        }    }    private void clickProjCreateButton() {        try {            logger.debug("Scroll to the bottom of form and click on 'Create'");            createProjButton.click();            logger.debug("Scroll to the bottom of form and click on 'Create' clicked ");            Thread.sleep(2000);        } catch (Exception e) {            Reporter.log("Create button could not be clicked");            e.printStackTrace();        }    }    private void clickProjCancelButton() {        try {            logger.debug("Scroll to the bottom of form and click on 'Cancel'");            cancelProjButton.click();            logger.debug("Scroll to the bottom of form and click on 'Cancel' clicked ");            Thread.sleep(2000);        } catch (Exception e) {            Assertion.fail(AssertDataReader.assertreader.getValue("IPEASSERTMSG_ASSERT_ERROR"));            Reporter.log("Cancel button could not be clicked");            e.printStackTrace();        }    }    public String getProjectIDAlertMsg() {        logger.debug("Display of projectID alert message");        return projIDAlertMsg.getText();    }    public String getProjectNameAlertMsg() {        logger.debug("Display of ProjectName alert message");        return projNameAlertMsg.getText();    }    public String getProjectDescAlertMsg() {        logger.debug("Display of Project Description alert message");        return projDescAlertMsg.getText();    }    public String getCustomerNameAlertMsg() {        logger.debug("Display of Customer Name alert message");        return customerNameAlertMsg.getText();    }    public String getPONumberAlertMsg() {        logger.debug("Display of P O Number alert message");        return customerNameAlertMsg.getText();    }    public String getProjectNumberAlertMsg() {        logger.debug("Display of ProjectNumber alert message");        return projNumberAlertMsg.getText();    }}