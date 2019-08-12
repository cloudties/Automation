package com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.pages;
/**
 * @author Manjusha Saju
 */

import com.automation.ui.ipe.pageobjectsfactory.pageobject.base.IPEBasePageObject;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.vo.DeqPowerInfoVO;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.xpathconstants.DeqCommonDetailsCONSTANTS;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.xpathconstants.DeqPowerDetailsCONSTANTS;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.home.pages.HomePage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import com.automation.ui.base.common.core.assertion.Assertion;
import com.automation.ui.base.common.prpreaders.AssertDataReader;
public class DeQPowerDetailsPage extends IPEBasePageObject {
    private static Logger logger = Logger.getLogger(DeQPowerDetailsPage.class);


    @FindBy(xpath = DeqCommonDetailsCONSTANTS.DEQINFO)
    private WebElement deqMenuButton;

    @FindBy(xpath = DeqCommonDetailsCONSTANTS.DEQGENERLINFOSECTIONNAME)
    private WebElement deqPowerInfo;

    @FindBy(xpath = DeqCommonDetailsCONSTANTS.DEQPOWERSECTIONNAME)
    private WebElement deqPowerInfoMenu;

    @FindBy(xpath = DeqPowerDetailsCONSTANTS.DEQPOWERUPS240VAC)
    private WebElement deqPowerUPS240VAC;

    @FindBy(xpath = DeqPowerDetailsCONSTANTS.DEQPOWERUPS120VAC)
    private WebElement deqPowerUPS120VAC;

    @FindBy(xpath = DeqPowerDetailsCONSTANTS.DEQPOWERUPSVOLLEVEL120VAC)
    private WebElement deqPowerVoltage120VAC;

    @FindBy(xpath = DeqPowerDetailsCONSTANTS.DEQPOWERUPSVOLLEVEL230VAC)
    private WebElement deqPowerVoltage240VAC;

    @FindBy(xpath = DeqPowerDetailsCONSTANTS.DEQPOWERUPSFTANO)
    private WebElement deqPowerFTANo;

    @FindBy(xpath = DeqPowerDetailsCONSTANTS.DEQPOWERUPSFTAYES)
    private WebElement deqPowerFTAYes;


    @FindBy(xpath = DeqPowerDetailsCONSTANTS.DEQPOWERADD)
    private WebElement deqPowerAdd;

    @FindBy(xpath = DeqPowerDetailsCONSTANTS.DEQPOWERADDROW)
    private WebElement deqPowerAddRow;

    @FindBy(xpath = DeqPowerDetailsCONSTANTS.DEQPOWERDELETE)
    private WebElement deqPowerDel;

    @FindBy(xpath = DeqPowerDetailsCONSTANTS.DEQPOWEREDIT)
    private WebElement deqPowerEdit;

    @FindBy(xpath = DeqPowerDetailsCONSTANTS.DEQOUTPUTLOADDESC)
    private WebElement deqPowerOutPutLoadDesc;
    @FindBy(xpath = DeqPowerDetailsCONSTANTS.DEQOUTPUTLOADCONSU)
    private WebElement deqPowerOutPutLoadConsu;
    @FindBy(xpath = DeqPowerDetailsCONSTANTS.DEQOUTPUTLOADPOWER)
    private WebElement deqPowerOutPutLoadPower;
    @FindBy(xpath = DeqPowerDetailsCONSTANTS.DEQOUTPUTLOADSAVE)
    private WebElement deqPowerOutPutLoadSave;
    @FindBy(xpath = DeqPowerDetailsCONSTANTS.DEQOUTPUTLOADDELETE)
    private WebElement deqPowerOutPutLoadDelete;

    @FindBy(xpath = DeqPowerDetailsCONSTANTS.DEQPOWERSAVEROW)
    private WebElement deqPowerSaveRow;


    @FindBy(xpath = DeqPowerDetailsCONSTANTS.DEQPOWERSAVE)
    private WebElement deqPowerSaveAndContinue;
    private DeqPowerInfoVO deqPowerInfoVO;

    public DeqPowerInfoVO getDeqPowerInfoVO() {
        return deqPowerInfoVO;
    }

    public void setDeqPowerInfoVO(DeqPowerInfoVO deqPowerInfoVO) {
        this.deqPowerInfoVO = deqPowerInfoVO;
    }

    public DeQPowerDetailsPage open() {


        return new DeQPowerDetailsPage();
    }


    public void clickDEQhome() {
        try {

            new HomePage().clickDEQ_homepage();

            logger.debug("Click on DEQ at homepage");
            waitAndClick(deqMenuButton);
            logger.debug("Clicked on DEQ at homepage");

        } catch (Exception e) {
            Assertion.fail(AssertDataReader.assertreader.getValue("IPEASSERTMSG_ASSERT_ERROR"));
            Reporter.log("clickDEQDocumenthome ");
            e.printStackTrace();
        }
    }

    public void clickDEQPowerInfo() {
        try {
            logger.debug("View questions in the section   Information");
            waitAndClick(deqPowerInfoMenu);
            logger.debug("Displayed questions in the   Information");
        } catch (Exception e) {
            Assertion.fail(AssertDataReader.assertreader.getValue("IPEASSERTMSG_ASSERT_ERROR"));
            Reporter.log("clickDEQPowerInfo");
            e.printStackTrace();
        }
    }

    public void enterInputs_DEQPowerInfo() {
        try {
            logger.debug("Navigate to section- Power   Information");

            clickDEQhome();
            clickDEQPowerInfo();


            logger.debug("Navigated to DEQ Power   Info details");
            switch (deqPowerInfoVO.getDeqPowerUPSFeeder()) {
                case 0:
                    deqPowerUPS120VAC.click();
                    break;
                case 1:
                    deqPowerUPS240VAC.click();
                    break;
            }

            switch (deqPowerInfoVO.getDeqPowerVolatageLevel()) {
                case 0:
                    deqPowerUPS120VAC.click();
                    break;
                case 1:
                    deqPowerUPS240VAC.click();
                    break;
            }

            switch (deqPowerInfoVO.getDeqPowerFTA()) {
                case 0:
                    deqPowerFTANo.click();
                    break;
                case 1:
                    deqPowerFTAYes.click();
                    break;
            }
            clickTableOutputLoadAddRow();
            Thread.sleep(5000);

            fillInputAfterClear(deqPowerOutPutLoadDesc, deqPowerInfoVO.getDeqOutPutLoadvo().get(0).getDeqOutLoadDesc());
            fillInputAfterClear(deqPowerOutPutLoadConsu, deqPowerInfoVO.getDeqOutPutLoadvo().get(0).getDeqOutLoadConsum());
            fillInputAfterClear(deqPowerOutPutLoadPower, deqPowerInfoVO.getDeqOutPutLoadvo().get(0).getDeqOutLoadPower());

            clickDEQPowerOutpurRowSave();
            clickDEQPowerSaveAndContinue();

        } catch (Exception e) {
            Assertion.fail(AssertDataReader.assertreader.getValue("IPEASSERTMSG_ASSERT_ERROR"));
            e.printStackTrace();
        }
    }

    public void clickDEQPowerOutpurRowSave() {
        try {
            logger.debug("Click- clickDEQPowerOutpurRowSave Add row");
            Thread.sleep(3000);
            waitAndClick(deqPowerSaveRow);
            logger.debug("Click- clickDEQPowerOutpurRowSave Add row");
        } catch (Exception e) {
            Assertion.fail(AssertDataReader.assertreader.getValue("IPEASSERTMSG_ASSERT_ERROR"));
            Reporter.log("Click-    : Enter Outputload-Add row");
            e.printStackTrace();
        }
    }


    public void clickTableOutputLoadAddRow() {
        try {
            logger.debug("Click- Document information: Enter Outputload-Add row");
            Thread.sleep(5000);
            waitAndClick(deqPowerAddRow);

            logger.debug("Click-    : Entered Outputload-Add row ");
        } catch (Exception e) {
            Assertion.fail(AssertDataReader.assertreader.getValue("IPEASSERTMSG_ASSERT_ERROR"));
            Reporter.log("Click-    : Enter Outputload-Add row");
            e.printStackTrace();
        }
    }

    public void clickDEQPowerSaveAndContinue() {
        try {
            logger.debug("Click- DEQ:  Save And Continue button");
            // new Actions(driver).moveToElement(deqSaveAndContinue).perform();
            // deqSaveAndContinue.click();
            waitAndClick(deqPowerSaveAndContinue);
            logger.debug("Click- DEQ:  Save And Continue button ");
        } catch (Exception e) {
            Assertion.fail(AssertDataReader.assertreader.getValue("IPEASSERTMSG_ASSERT_ERROR"));
            Reporter.log("Click- DEQ: Save And Continue button");
            e.printStackTrace();
        }
    }


}
