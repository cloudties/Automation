package com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.home.pages;/** * @author */import com.automation.ui.base.common.core.element.dropdown.DropDownHelper;import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.base.DigitalDeployerBasePageObject;import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.home.vo.InitialSearchVO;import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.home.xpathconstants.HomeConstants;import org.apache.log4j.Logger;import org.openqa.selenium.WebElement;import org.openqa.selenium.support.FindBy;import org.testng.Reporter;import com.automation.ui.base.common.core.assertion.Assertion;import com.automation.ui.base.common.prpreaders.AssertDataReader;public class HomePage extends DigitalDeployerBasePageObject {    private static Logger logger = Logger.getLogger(HomePage.class);    @FindBy(xpath = HomeConstants.SEARCHINDUSTRY)    private WebElement searchIndustry;    @FindBy(xpath = HomeConstants.SEARCHMARKETNEED)    private WebElement searchMarketNeed;    @FindBy(xpath = HomeConstants.SEARCHBUSINESSGOAL)    private WebElement searchBusiGoal;    @FindBy(xpath = HomeConstants.SEARCHLEADMANAGEMENT)    private WebElement searchPick;    @FindBy(xpath = HomeConstants.CONTINUE)    private WebElement continueButton;    @FindBy(xpath = HomeConstants.CCLINK)    private WebElement ccLink;    @FindBy(xpath = HomeConstants.CCDISMISS)    private WebElement ccDisMiss;    @FindBy(xpath = HomeConstants.ACCPRODUCT)    private WebElement accProduct;    @FindBy(xpath = HomeConstants.BLOGLINK)    private WebElement blogLink;    @FindBy(xpath = HomeConstants.SECABOUT)    private WebElement secAbout;    @FindBy(xpath = HomeConstants.SIGNUP)    private WebElement signUp;    @FindBy(xpath = HomeConstants.PRODUCT)    private WebElement product;    @FindBy(xpath = HomeConstants.ABOUT)    private WebElement about;    @FindBy(xpath = HomeConstants.CONTACT)    private WebElement contact;    @FindBy(xpath = HomeConstants.PRIVACY)    private WebElement privacy;    @FindBy(xpath = HomeConstants.TERMS)    private WebElement terms;    @FindBy(xpath = HomeConstants.CUSPERALINKEDIN)    private WebElement cuspLinkedin;    @FindBy(xpath = HomeConstants.CUSPERATWITTER)    private WebElement cuspTwitter;    @FindBy(xpath = HomeConstants.MAILTO)    private WebElement mailTo;    @FindBy(xpath = HomeConstants.LINKEDINBUTTON)    private WebElement linkedInButton;    @FindBy(xpath = HomeConstants.CONTASGUEST)    private WebElement contAsGuest;    @FindBy(xpath = HomeConstants.REGISTER)    private WebElement register;    @FindBy(xpath = HomeConstants.CLOSEMODEL)    private WebElement closeModel;    @FindBy(xpath = HomeConstants.CLOSE)    private WebElement close;    public HomePage open() {        logger.debug("open the URL" + getCurrentUrl());        getUrl(getCurrentUrl());        return this;    }    public void continueButton() {        try {         waitAndClick(continueButton);        } catch (Exception e) {            Assertion.fail(AssertDataReader.assertreader.getValue("CUSPERAASSERTMSG_ASSERT_ERROR"));            e.printStackTrace();        }    }    public void searchIndustry(InitialSearchVO search) {        try {            DropDownHelper dh=new DropDownHelper(  driver, this);            dh.selectDropDown(searchIndustry, search.getSelectIndustry().getIndustry());        } catch (Exception e) {            Assertion.fail(AssertDataReader.assertreader.getValue("CUSPERAASSERTMSG_ASSERT_ERROR"));             e.printStackTrace();        }    }    public void searchMarketing(InitialSearchVO search) {        try {            fillInputAfterClear(searchMarketNeed,"lead");            DropDownHelper dh=new DropDownHelper(  driver, this);            dh.selectDropDown(searchPick, "lead management");        } catch (Exception e) {            Assertion.fail(AssertDataReader.assertreader.getValue("CUSPERAASSERTMSG_ASSERT_ERROR"));            e.printStackTrace();        }    }    public void searchGoal(InitialSearchVO search) {        try {            DropDownHelper dh=new DropDownHelper(  driver, this);            dh.selectDropDown(searchIndustry, search.getSelectBusinessGoal().getGoal());            waitAndClick(searchBusiGoal);        } catch (Exception e) {            Assertion.fail(AssertDataReader.assertreader.getValue("CUSPERAASSERTMSG_ASSERT_ERROR"));            e.printStackTrace();        }    }    public void search(InitialSearchVO search) {        try {            DropDownHelper dh=new DropDownHelper(  driver, this);            dh.selectDropDown(searchIndustry, search.getSelectIndustry().getIndustry());            fillInputAfterClear(searchMarketNeed,"lead");            dh=new DropDownHelper(  driver, this);            dh.selectDropDown(searchPick, "lead management");            Thread.sleep(2000);            dh=new DropDownHelper(  driver, this);            dh.selectDropDown(searchBusiGoal, search.getSelectBusinessGoal().getGoal());        } catch (Exception e) {            Assertion.fail(AssertDataReader.assertreader.getValue("CUSPERAASSERTMSG_ASSERT_ERROR"));            e.printStackTrace();        }    }    public void ccLink() {        try {            waitAndClick(ccLink);        } catch (Exception e) {            Assertion.fail(AssertDataReader.assertreader.getValue("CUSPERAASSERTMSG_ASSERT_ERROR"));            e.printStackTrace();        }    }    public void ccDisMiss() {        try {            waitAndClick(ccDisMiss);        } catch (Exception e) {            Assertion.fail(AssertDataReader.assertreader.getValue("CUSPERAASSERTMSG_ASSERT_ERROR"));            e.printStackTrace();        }    }    public void accProduct() {        try {            waitAndClick(accProduct);        } catch (Exception e) {            Assertion.fail(AssertDataReader.assertreader.getValue("CUSPERAASSERTMSG_ASSERT_ERROR"));            e.printStackTrace();        }    }    public void blogLinks() {        try {            waitAndClick(blogLink);        } catch (Exception e) {            Assertion.fail(AssertDataReader.assertreader.getValue("CUSPERAASSERTMSG_ASSERT_ERROR"));            e.printStackTrace();        }    }    public void secAbout() {        try {            waitAndClick(secAbout);        } catch (Exception e) {            Assertion.fail(AssertDataReader.assertreader.getValue("CUSPERAASSERTMSG_ASSERT_ERROR"));            e.printStackTrace();        }    }    public void signUp() {        try {            waitAndClick(signUp);        } catch (Exception e) {            Assertion.fail(AssertDataReader.assertreader.getValue("CUSPERAASSERTMSG_ASSERT_ERROR"));            e.printStackTrace();        }    }}