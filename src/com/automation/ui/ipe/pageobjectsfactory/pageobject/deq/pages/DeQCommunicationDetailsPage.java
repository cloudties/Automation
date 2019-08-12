package com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.pages;
/**
 * @author Manjusha Saju
 */

import com.automation.ui.ipe.pageobjectsfactory.pageobject.base.IPEBasePageObject;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.vo.DeqCommunicationInfoVO;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.xpathconstants.DeqCommonDetailsCONSTANTS;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.xpathconstants.DeqCommunicationDetailsCONSTANTS;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import com.automation.ui.base.common.core.assertion.Assertion;
import com.automation.ui.base.common.prpreaders.AssertDataReader;
public class DeQCommunicationDetailsPage extends IPEBasePageObject {
    private static Logger logger = Logger.getLogger(DeQCommunicationDetailsPage.class);


    @FindBy(xpath = DeqCommonDetailsCONSTANTS.DEQINFO)
    private WebElement deqMenuButton;

    @FindBy(xpath = DeqCommonDetailsCONSTANTS.DEQCOMMUNICATIONSECTIONNAME)
    private WebElement deqCommPage;


    @FindBy(xpath = DeqCommonDetailsCONSTANTS.DEQSAVEANDCONTINUE)
    private WebElement deqSaveAndContinue;
    @FindBy(xpath = DeqCommunicationDetailsCONSTANTS.DEQCABCOMMUNICATIONCDA_NO)
    private WebElement deqCommCDANo;

    @FindBy(xpath = DeqCommunicationDetailsCONSTANTS.DEQCABCOMMUNICATIONCDA_YES)
    private WebElement deqCommCDAYes;

    @FindBy(xpath = DeqCommunicationDetailsCONSTANTS.DEQCABCOMMUNICATIONFDM_NO)
    private WebElement deqCommFDMNo;

    @FindBy(xpath = DeqCommunicationDetailsCONSTANTS.DEQCABCOMMUNICATIONFDM_YES)
    private WebElement deqCommFDMYes;

    @FindBy(xpath = DeqCommunicationDetailsCONSTANTS.DEQCABCOMMUNICATIONTIMEPROTOCOL_PTP)
    private WebElement deqCommProtoPtp;

    @FindBy(xpath = DeqCommunicationDetailsCONSTANTS.DEQCABCOMMUNICATIONTIMEPROTOCOL_NTP)
    private WebElement deqCommProtoNtp;

    @FindBy(xpath = DeqCommunicationDetailsCONSTANTS.DEQCABCOMMUNICATIONFIBEROPTICS_NO)
    private WebElement deqCommFibOptNo;

    @FindBy(xpath = DeqCommunicationDetailsCONSTANTS.DEQCABCOMMUNICATIONFIBEROPTICS_YES)
    private WebElement deqCommFibOptYes;

    @FindBy(xpath = DeqCommunicationDetailsCONSTANTS.DEQCABCOMMUNICATIONFIBERMODUS_MULTI)
    private WebElement deqCommFibModusMulti;

    @FindBy(xpath = DeqCommunicationDetailsCONSTANTS.DEQCABCOMMUNICATIONFIBERMODUS_SINGLE)
    private WebElement deqCommFibModusSingle;

    @FindBy(xpath = DeqCommunicationDetailsCONSTANTS.DEQCABCOMMUNICATIONINGRESPROTECTION_43)
    private WebElement deqCommIng43;

    @FindBy(xpath = DeqCommunicationDetailsCONSTANTS.DEQCABCOMMUNICATIONINGRESPROTECTION_55)
    private WebElement deqCommIng55;
    private DeqCommunicationInfoVO deqCommVo;

    public DeqCommunicationInfoVO getDeqCommVo() {
        return deqCommVo;
    }

    public void setDeqCommVo(DeqCommunicationInfoVO deqCommVo) {
        this.deqCommVo = deqCommVo;
    }

    public DeQCommunicationDetailsPage open() {
        return new DeQCommunicationDetailsPage();
    }


    public void clickDEQhome() {
        try {

            //  new HomePage().clickDEQ_homepage();


            logger.debug("Click on DEQ at homepage");
            // waitForElementNotVisibleByElement(deqMenuButton);

            waitAndClick(deqMenuButton);
            logger.debug("Clicked on DEQ at homepage");

        } catch (Exception e) {
            Assertion.fail(AssertDataReader.assertreader.getValue("IPEASSERTMSG_ASSERT_ERROR"));
            Reporter.log("clickDEQDocumenthome ");
            e.printStackTrace();
        }
    }

    public void clickDEQCommunicationInfo() {
        try {
            logger.debug("View questions in the section-Cabinet Delivery Information");
            waitAndClick(deqCommPage);
            logger.debug("Displayed questions in the section-Cabinet Delivery Information");
        } catch (Exception e) {
            Assertion.fail(AssertDataReader.assertreader.getValue("IPEASSERTMSG_ASSERT_ERROR"));
            Reporter.log("clickDEQCabDeliveryInfo");
            e.printStackTrace();
        }
    }


    public void enterInputs_DEQCommunication() {
        try {
            logger.debug("Navigate to Comm Information");
            clickDEQhome();
            clickDEQCommunicationInfo();
            switch (deqCommVo.getCommunicationViaCDA()) {
                case 0:
                    deqCommCDANo.click();
                    break;
                case 1:
                    deqCommCDAYes.click();
                    break;

            }
            switch (deqCommVo.getFibreOpticLink()) {
                case 0:
                    deqCommFibOptNo.click();
                    break;
                case 1:
                    deqCommFibOptYes.click();
                    break;

            }
            switch (deqCommVo.getRequireFDM()) {
                case 0:
                    deqCommFDMNo.click();
                    break;
                case 1:
                    deqCommFDMYes.click();
                    break;

            }
            switch (deqCommVo.getTimeSyncProtocol()) {
                case 0:
                    deqCommProtoNtp.click();
                    break;
                case 1:
                    deqCommProtoPtp.click();
                    break;

            }
            switch (deqCommVo.getModuswithFibrebe()) {
                case 0:
                    deqCommFibModusMulti.click();
                    break;
                case 1:
                    deqCommFibModusSingle.click();
                    break;

            }

            switch (deqCommVo.getIngressProtection()) {
                case 0:
                    deqCommIng43.click();
                    break;
                case 1:
                    deqCommIng55.click();
                    break;

            }
            logger.debug("Added Comm");
            clickDEQSaveAndContinue();
        } catch (Exception e) {
            Assertion.fail(AssertDataReader.assertreader.getValue("IPEASSERTMSG_ASSERT_ERROR"));
            e.printStackTrace();
        }
    }

    public void clickDEQSaveAndContinue() {
        try {
            logger.debug("Click- DEQ: Save And Continue button");
            Thread.sleep(5000);
            waitAndClick(deqSaveAndContinue);
            logger.debug("Click- DEQ: Save And Continue button ");
        } catch (Exception e) {
            Assertion.fail(AssertDataReader.assertreader.getValue("IPEASSERTMSG_ASSERT_ERROR"));
            Reporter.log("Click- DEQ: Save And Continue button");
            e.printStackTrace();
        }
    }


}
