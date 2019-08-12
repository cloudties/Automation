package com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.pages;
/**
 * @author Manjusha Saju
 */

import com.automation.ui.base.common.core.element.dropdown.DropDownHelper;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.base.IPEBasePageObject;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.vo.DeqCabinetDeliveryInfoVO;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.xpathconstants.DeqCabinetDeliveryDetailsCONSTANTS;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.xpathconstants.DeqCommonDetailsCONSTANTS;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.home.pages.HomePage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import com.automation.ui.base.common.core.assertion.Assertion;
import com.automation.ui.base.common.prpreaders.AssertDataReader;
public class DeQCabinetDeliveryDetailsPage extends IPEBasePageObject {
    private static Logger logger = Logger.getLogger(DeQCabinetDeliveryDetailsPage.class);

    /**
     * IPE DEQ- Cabinet Delivery Info section WebElements
     */

    @FindBy(xpath = DeqCommonDetailsCONSTANTS.DEQINFO)
    private WebElement deqMenuButton;

    @FindBy(xpath = DeqCommonDetailsCONSTANTS.DEQCABINETDELINFOSECTIONNAME)
    private WebElement deqCabDeliveryInfo;

    @FindBy(xpath = DeqCommonDetailsCONSTANTS.DEQCABDELINFO_PAGE)
    private WebElement deqCabDeliveryMenu;

    @FindBy(xpath = DeqCommonDetailsCONSTANTS.DEQSAVEANDCONTINUE)
    private WebElement deqSaveAndContinue;

    @FindBy(xpath = DeqCabinetDeliveryDetailsCONSTANTS.DEQCABDELINFOSECTIONHEADER)
    private WebElement deqCabDeliveryInfoHeader;

    @FindBy(xpath = DeqCabinetDeliveryDetailsCONSTANTS.DEQCABDELINFODELIVERYCOMPANY)
    private WebElement deqCabDeliveryInfoCompany;

    @FindBy(xpath = DeqCabinetDeliveryDetailsCONSTANTS.DEQCABDELINFODELIVERYADDRESS)
    private WebElement deqCabDeliveryInfoAddress;

    @FindBy(xpath = DeqCabinetDeliveryDetailsCONSTANTS.DEQCABDELINFODELIVERYCNTRY)
    private WebElement deqCabDeliveryInfoCntry;

    @FindBy(xpath = DeqCabinetDeliveryDetailsCONSTANTS.DEQCABDELINFOCITYNAME)
    private WebElement deqCabDeliveryInfoCityName;

    @FindBy(xpath = DeqCabinetDeliveryDetailsCONSTANTS.DEQCABDELINFOZIPCODE)
    private WebElement deqCabDeliveryInfoZipCode;

    @FindBy(xpath = DeqCabinetDeliveryDetailsCONSTANTS.DEQCABDELINFOADDRESSEE)
    private WebElement deqCabDeliveryInfoAddressee;
    @FindBy(xpath = DeqCabinetDeliveryDetailsCONSTANTS.DEQCUSTINFOTECHCOUNTRYCODE)
    private WebElement deqCabDeliveryInfoCntryCode;

    @FindBy(xpath = DeqCabinetDeliveryDetailsCONSTANTS.DEQCABDELINFORECEIVERPHNO)
    private WebElement deqCabDeliveryInfoReceiverPhNo;

    @FindBy(xpath = DeqCabinetDeliveryDetailsCONSTANTS.DEQCABDELINFORECEIVINGPARTYEMAIL)
    private WebElement deqCabDeliveryInfoReceiverEmail;

    @FindBy(xpath = DeqCabinetDeliveryDetailsCONSTANTS.DEQCABDELINFOPACKINGMATLWOODEN)
    private WebElement deqCabDeliveryInfoPackMatlWooden;

    @FindBy(xpath = DeqCabinetDeliveryDetailsCONSTANTS.DEQCABDELINFOPACKINGMATLCARDBOARD)
    private WebElement deqCabDeliveryInfoPackMatlCardboard;

    @FindBy(xpath = DeqCabinetDeliveryDetailsCONSTANTS.DEQCABDELINFOSHIPPINGMETHODAIR)
    private WebElement deqCabDeliveryInfoShipMethodAir;

    @FindBy(xpath = DeqCabinetDeliveryDetailsCONSTANTS.DEQCABDELINFOSHIPPINGMETHODSEA)
    private WebElement deqCabDeliveryInfoShipMethodSea;

    @FindBy(xpath = DeqCabinetDeliveryDetailsCONSTANTS.DEQCABDELINFOSHIPPINGMETHODGROUND)
    private WebElement deqCabDeliveryInfoShipMethodGround;
    private DeqCabinetDeliveryInfoVO deqCabinetDeliveryInfovo;

    public DeqCabinetDeliveryInfoVO getDeqCabinetDeliveryInfoVO() {
        return deqCabinetDeliveryInfovo;
    }

    public void setDeqCabinetDeliveryInfoVO(DeqCabinetDeliveryInfoVO deqCabinetDeliveryInfoVO) {
        this.deqCabinetDeliveryInfovo = deqCabinetDeliveryInfoVO;
    }

    public DeQCabinetDeliveryDetailsPage open() {


        return new DeQCabinetDeliveryDetailsPage();
    }


    public void clickDEQhome() {
        try {

            new HomePage().clickDEQ_homepage();

            //clickHomeZoomCheck_ToNormal();
            // hp.clickHomeZoomCheck_ToNormal();


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

    public void clickDEQCabDeliveryInfo() {
        try {
            logger.debug("View questions in the section-Cabinet Delivery Information");
            waitAndClick(deqCabDeliveryInfo);
            logger.debug("Displayed questions in the section-Cabinet Delivery Information");
        } catch (Exception e) {
            Assertion.fail(AssertDataReader.assertreader.getValue("IPEASSERTMSG_ASSERT_ERROR"));
            Reporter.log("clickDEQCabDeliveryInfo");
            e.printStackTrace();
        }
    }


    public void enterInputs_DEQCabinetDeliveryInfo() {
        try {
            logger.debug("Navigate to section-Cabinet Delivery Information");
            clickDEQhome();
            Thread.sleep(2000);
            clickDEQCabDeliveryInfo();
            Thread.sleep(3000);

            DropDownHelper dropDownHelper = new DropDownHelper(driver, this);

            logger.debug("Navigated to DEQ-Cabinet Delivery Info details");
            fillInputAfterClear(deqCabDeliveryInfoCompany, deqCabinetDeliveryInfovo.getDeqCabDelInfoDeliveryCompany());
            fillInputAfterClear(deqCabDeliveryInfoAddress, deqCabinetDeliveryInfovo.getDeqCabDelInfoDeliveryAddress());
            fillInputAfterClear(deqCabDeliveryInfoCntry, deqCabinetDeliveryInfovo.getDeqCabDelInfoDeliveryCountry());
            fillInputAfterClear(deqCabDeliveryInfoCityName, deqCabinetDeliveryInfovo.getDeqCabDelInfoCityName());
            fillInputAfterClear(deqCabDeliveryInfoZipCode, deqCabinetDeliveryInfovo.getDeqCabDelInfoZipCode());
            fillInputAfterClear(deqCabDeliveryInfoAddressee, deqCabinetDeliveryInfovo.getDeqCabDelInfoAddressee());

            dropDownHelper.selectDropDown(deqCabDeliveryInfoCntryCode, deqCabinetDeliveryInfovo.getDeqCntryCodeReceivingParty().getCountryCode());
            Thread.sleep(2000);
            fillInputAfterClear(deqCabDeliveryInfoReceiverPhNo, deqCabinetDeliveryInfovo.getDeqCabDelInfoReveiverPhNo());
            fillInputAfterClear(deqCabDeliveryInfoReceiverEmail, deqCabinetDeliveryInfovo.getDeqCabDelInfoReceivingPartyEmail());
            switch (deqCabinetDeliveryInfovo.getDeqCabDelInfoPackingMatlType()) {
                case 0:
                    deqCabDeliveryInfoPackMatlWooden.click();
                    break;
                case 1:
                    deqCabDeliveryInfoPackMatlCardboard.click();
                    break;

            }
            switch (deqCabinetDeliveryInfovo.getDeqCabDelInfoShippingMethod()) {
                case 0:
                    deqCabDeliveryInfoShipMethodAir.click();
                    break;
                case 1:
                    deqCabDeliveryInfoShipMethodSea.click();
                    break;
                case 2:
                    deqCabDeliveryInfoShipMethodGround
                            .click();
                    break;

            }

            logger.debug("Added DEQ-Customer Info details in Excel");
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
