package com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.context.pages;/** * @author */import com.automation.ui.base.common.core.assertion.Assertion;import com.automation.ui.base.common.core.element.dropdown.DropDownHelper;import com.automation.ui.base.common.prpreaders.AssertDataReader;import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.base.DigitalDeployerBasePageObject;import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.context.vo.ContextVO;import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.context.xpathconstants.ContextConstants;import org.apache.log4j.Logger;import org.openqa.selenium.WebElement;import org.openqa.selenium.support.FindBy;public class ContextPage extends DigitalDeployerBasePageObject {    private static Logger logger = Logger.getLogger(ContextPage.class);    @FindBy(xpath = ContextConstants.CHANNEL_EMAIL)    private WebElement email;    @FindBy(xpath = ContextConstants.PROCESSES_LEADENGAGEMENT)    private WebElement leadEngagement;    @FindBy(xpath = ContextConstants.PROCESSES_COMPAREANDOPTOMIZE)    private WebElement compateAndOptimize;    @FindBy(xpath = ContextConstants.PROCESSES_PRODUCTCODE_288)    private WebElement product288;    @FindBy(xpath = ContextConstants.PROCESSES_PRODUCTCODE_655)    private WebElement product655;    @FindBy(xpath = ContextConstants.PROCESSES_PRODUCTCODE_1520)    private WebElement product1520;    @FindBy(xpath = ContextConstants.PROCESSES_PRODUCTCODE_88)    private WebElement product88;    @FindBy(xpath = ContextConstants.PROCESSES_REPORTGEN_LOADER)    private WebElement reportGen;    public ContextPage open() {        logger.debug("open the URL" + getCurrentUrl());        getUrl(getCurrentUrl());        return this;    }    public void clickEmail(ContextVO search) {        try {                waitAndClick(email);        } catch (Exception e) {            Assertion.fail(AssertDataReader.assertreader.getValue("CUSPERAASSERTMSG_ASSERT_ERROR"));             e.printStackTrace();        }    }    public void clickLeadEngagement(ContextVO search) {        try {            waitAndClick(leadEngagement);        } catch (Exception e) {            Assertion.fail(AssertDataReader.assertreader.getValue("CUSPERAASSERTMSG_ASSERT_ERROR"));            e.printStackTrace();        }    }    public void chooseSoftware(ContextVO search) {        try {            waitAndClick(product288);            //waitAndClick(product655);            waitAndClick(product1520);            scrollAndClick(product88);            //waitAndClick(product88);        } catch (Exception e) {            Assertion.fail(AssertDataReader.assertreader.getValue("CUSPERAASSERTMSG_ASSERT_ERROR"));            e.printStackTrace();        }    }    public void aubmitOptimizeAndCompare(ContextVO search) {        try {            waitAndClick(compateAndOptimize);            Thread.sleep(2000);            boolean isGen=isElementOnPage(reportGen);            Assertion.assertTrue(isGen,"Report Page Launched");        } catch (Exception e) {            Assertion.fail(AssertDataReader.assertreader.getValue("CUSPERAASSERTMSG_ASSERT_ERROR"));            e.printStackTrace();        }    }}