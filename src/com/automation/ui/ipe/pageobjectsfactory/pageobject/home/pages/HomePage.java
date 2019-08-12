package com.automation.ui.ipe.pageobjectsfactory.pageobject.home.pages;
/**
 * @author Manjusha Saju
 */

import com.automation.ui.base.common.core.assertion.Assertion;
import com.automation.ui.base.common.core.configuration.Configuration;
import com.automation.ui.base.common.core.configuration.EnvType;
import com.automation.ui.base.common.prpreaders.AssertDataReader;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.base.IPEBasePageObject;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.xpathconstants.DeqCommonDetailsCONSTANTS;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.home.xpathconstants.HomeConstants;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.List;
import com.automation.ui.base.common.core.assertion.Assertion;
import com.automation.ui.base.common.prpreaders.AssertDataReader;
public class HomePage extends IPEBasePageObject {

    private static Logger logger = Logger.getLogger(HomePage.class);


    @FindBy(xpath = DeqCommonDetailsCONSTANTS.DEQINFO)
    private WebElement deqMenuButton;
    @FindBy(xpath = HomeConstants.DASHBOARD_TITLE)
    private WebElement deqMenuTitle;


    @FindBy(xpath = HomeConstants.LANDING_HOMEPAGE_IMG)
    private WebElement landingHomepage;

    @FindBy(xpath = HomeConstants.DASHBOARD_HOMEPAGE)
    private WebElement dashboardMenuButtonHomepage;

    @FindBy(xpath = HomeConstants.DEQMENUBUTTON_HOMEPAGE)
    private WebElement dashboardMenuButtonHomepageText;


    @FindBy(xpath = HomeConstants.DEQMENUBUTTON_HOMEPAGE_IMG)
    private WebElement deqMenuButtonHomepage;

    @FindBy(xpath = HomeConstants.TPCMENUBUTTON_HOMEPAGE_IMG)
    private WebElement tpcMenuButtonHomepage;

    @FindBy(xpath = HomeConstants.FDSMENUBUTTON_HOMEPAGE_IMG)
    private WebElement fdsMenuButtonHomepage;

    @FindBy(xpath = HomeConstants.HWDMENUBUTTON_HOMEPAGE)
    private WebElement hwdrawingMenuButtonHomepage;

    @FindBy(xpath = HomeConstants.PERFCMENUBUTTON_HOMEPAGE)
    private WebElement perfcalcMenuButtonHomepage;

    @FindBy(xpath = HomeConstants.OVERVIEWMENUBUTTON_HOMEPAGE_IMG)
    private WebElement overviewMenuButtonHomepage;

    @FindBy(xpath = HomeConstants.HWDRAWINGALERTMSG_HOMEPAGE)
    private WebElement hwdrawingAlertMsgHomepage;

    public HomePage() {
        super();
    }


    public HomePage open() {

        logger.debug("open the URL" + getCurrentUrl());
        if (Configuration.getEnvType().equals(EnvType.DEV)) {

            logger.debug(getCurrentUrl());
            //  getUrl("http://localhost:4200");
            //  getUrl("http://localhost:4200");
            getUrl(getCurrentUrl());
        } else {
            logger.debug(getCurrentUrl());
            // getUrl("http://localhost:9000");
            // getUrl(getCurrentUrl() + " ");
            getUrl(getCurrentUrl());
        }
        //waitForPageLoad();


        return this;
    }

    public void click_homepage() {
        try {
            logger.debug("Click on click_homepagepage");

            waitAndClick(landingHomepage);
            Assertion.assertStringContains(landingHomepage.getText(), AssertDataReader.assertreader.getValue("IPEASSERTMSG_HOMEPAGE_DASHBOARD"));
            logger.debug("clicked on click_homepage landing page");
        } catch (Exception e) {
            Assertion.fail(AssertDataReader.assertreader.getValue("IPEASSERTMSG_ASSERT_ERROR"));
            e.printStackTrace();
        }

    }

    public void clickDashboard_homepage() {
        try {
            logger.debug("Click on Dashboard @homepage");
            waitAndClick(dashboardMenuButtonHomepage);
            Assertion.assertEquals(deqMenuTitle.getText(), AssertDataReader.assertreader.getValue("IPEASSERTMSG_HOMEPAGE_DASHBOARD"));
            logger.debug("clicked on Dashboard");
        } catch (Exception e) {
            Assertion.fail(AssertDataReader.assertreader.getValue("IPEASSERTMSG_ASSERT_ERROR"));
            e.printStackTrace();
        }

    }

    public void clickDEQ_homepage() {
        try {
            logger.debug("Click on DEQ @homepage");
            waitAndClick(dashboardMenuButtonHomepageText);
            logger.debug("clicked on DEQMENU : getText" + dashboardMenuButtonHomepageText.getText());
            Assertion.assertEquals(dashboardMenuButtonHomepageText.getText(), "DEQ");

        } catch (Exception e) {
            Assertion.fail(AssertDataReader.assertreader.getValue("IPEASSERTMSG_ASSERT_ERROR"));
            e.printStackTrace();
        }

    }

    public void clickTPC_homepage() {
        try {
            logger.debug("Click on TPC @homepage");
            waitAndClick(tpcMenuButtonHomepage);
            Assertion.assertEquals(tpcMenuButtonHomepage.getText(), AssertDataReader.assertreader.getValue("IPEASSERTMSG_HOMEPAGE_TPC"));
            logger.debug("clicked on TPC @homepage");
        } catch (Exception e) {
            Assertion.fail(AssertDataReader.assertreader.getValue("IPEASSERTMSG_ASSERT_ERROR"));
            e.printStackTrace();
        }
    }

    public void clickFDS_homepage() {
        try {
            logger.debug("Click on FDS @homepage");
            waitAndClick(fdsMenuButtonHomepage);
            Assertion.assertEquals(fdsMenuButtonHomepage.getText(), AssertDataReader.assertreader.getValue("IPEASSERTMSG_HOMEPAGE_FDS"));
            logger.debug("clicked on FDS @homepage");
        } catch (Exception e) {
            Assertion.fail(AssertDataReader.assertreader.getValue("IPEASSERTMSG_ASSERT_ERROR"));
            e.printStackTrace();
        }
    }

    public void clickHWDrawing_homepage() {
        try {
            logger.debug("Click on HWDrawing @homepage");
            waitAndClick(hwdrawingMenuButtonHomepage);

            //FOR ASSERION
            List<String> currentList = new ArrayList<String>();
            currentList.add(AssertDataReader.assertreader.getValue("IPEASSERTMSG_HOMEPAGE_HWD"));
            currentList.add(AssertDataReader.assertreader.getValue("IPEASSERTMSG_HOMEPAGE_HWD_SHORT"));
            Assertion.assertTrue(currentList.contains(hwdrawingMenuButtonHomepage.getText()));

            logger.debug("clicked on HWDrawing @homepage");
        } catch (Exception e) {
            Assertion.fail(AssertDataReader.assertreader.getValue("IPEASSERTMSG_ASSERT_ERROR"));
            Reporter.log("HWDrawing popup message could not be located");
            e.printStackTrace();
        }
    }


    public void clickPerfCalc_homepage() {
        try {
            logger.debug("Click on Perf Calc @homepage");
            waitAndClick(perfcalcMenuButtonHomepage);
            Assertion.assertEquals(perfcalcMenuButtonHomepage.getText(), AssertDataReader.assertreader.getValue("IPEASSERTMSG_HOMEPAGE_PC"));
            logger.debug("clicked on Perf Calc @homepage");
        } catch (Exception e) {
            Assertion.fail(AssertDataReader.assertreader.getValue("IPEASSERTMSG_ASSERT_ERROR"));
            e.printStackTrace();
        }
    }

    public void clickOverview_homepage() {
        try {
            logger.debug("Click on Overview @homepage");
            waitAndClick(overviewMenuButtonHomepage);
            Assertion.assertEquals(overviewMenuButtonHomepage.getText(), AssertDataReader.assertreader.getValue("IPEASSERTMSG_HOMEPAGE_CO"));
            logger.debug("clicked on Overview @homepage");
        } catch (Exception e) {
            Assertion.fail(AssertDataReader.assertreader.getValue("IPEASSERTMSG_ASSERT_ERROR"));
            e.printStackTrace();
        }
    }

    public String getHWDrawingAlertHomePage() {
        logger.debug("clickOverview_homepage");
        return hwdrawingAlertMsgHomepage.getText();


    }

    public void clickHomeZoomCheck_100percentage() {
        try {
            new HomePage().clickDEQ_homepage();
            logger.debug("Click on DEQ at homepage");
            // waitForElementNotVisibleByElement(deqMenuButton);
            waitAndClick(deqMenuButton);
            logger.debug("Clicked on DEQ at homepage");
            jsActions.executeScript("document.body.style.zoom = '1'");

        } catch (Exception e) {
            Assertion.fail(AssertDataReader.assertreader.getValue("IPEASSERTMSG_ASSERT_ERROR"));
            Reporter.log("clickHomeZoomCheck_100percentage ");
            e.printStackTrace();
        }
    }

    public void clickHomeZoomCheck_75percentage() {
        try {
            new HomePage().clickDEQ_homepage();
            logger.debug("Click on DEQ at homepage");
            // waitForElementNotVisibleByElement(deqMenuButton);
            waitAndClick(deqMenuButton);
            logger.debug("Clicked on DEQ at homepage");
            jsActions.executeScript("document.body.style.zoom = '.75'");
        } catch (Exception e) {
            Assertion.fail(AssertDataReader.assertreader.getValue("IPEASSERTMSG_ASSERT_ERROR"));
            Reporter.log("clickHomeZoomCheck_75percentage ");
            e.printStackTrace();
        }
    }

    public void clickHomeZoomCheck_125percentage() {
        try {
            new HomePage().clickDEQ_homepage();
            logger.debug("Click on DEQ at homepage");
            // waitForElementNotVisibleByElement(deqMenuButton);
            waitAndClick(deqMenuButton);
            logger.debug("Clicked on DEQ at homepage");
            jsActions.executeScript("document.body.style.zoom = '1.25'");
        } catch (Exception e) {
            Assertion.fail(AssertDataReader.assertreader.getValue("IPEASSERTMSG_ASSERT_ERROR"));
            Reporter.log("clickHomeZoomCheck_125percentage ");
            e.printStackTrace();
        }
    }

    public void clickHomeZoomCheck_150percentage() {
        try {
            new HomePage().clickDEQ_homepage();
            logger.debug("Click on DEQ at homepage");
            // waitForElementNotVisibleByElement(deqMenuButton);
            waitAndClick(deqMenuButton);
            logger.debug("Clicked on DEQ at homepage");
            jsActions.executeScript("document.body.style.zoom = '1.5'");
        } catch (Exception e) {
            Assertion.fail(AssertDataReader.assertreader.getValue("IPEASSERTMSG_ASSERT_ERROR"));
            Reporter.log("clickHomeZoomCheck_150percentage ");
            e.printStackTrace();
        }
    }


}