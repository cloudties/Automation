package com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.pages;
/**
 * @author Manjusha Saju
 */

import com.automation.ui.base.common.core.element.dropdown.DropDownHelper;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.base.IPEBasePageObject;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.vo.DeqCustomerInfoVO;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.xpathconstants.DeqCommonDetailsCONSTANTS;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.xpathconstants.DeqCustomerDetailsCONSTANTS;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.*;
import org.testng.Reporter;
import com.automation.ui.base.common.core.assertion.Assertion;
import com.automation.ui.base.common.prpreaders.AssertDataReader;
public class DeQCustomerDetailsPage extends IPEBasePageObject {
    private static Logger logger = Logger.getLogger(DeQCustomerDetailsPage.class);

    /**
     * IPE DEQ- Customer Information Section WebElements
     */

    @FindBy(xpath = DeqCommonDetailsCONSTANTS.DEQINFO)
    private WebElement deqMenuButton;

    @FindBy(xpath = DeqCommonDetailsCONSTANTS.DEQCUSTINFO)
    private WebElement deqCustInfo;




    @FindBy(xpath = DeqCommonDetailsCONSTANTS.DEQSAVEANDCONTINUE)
    private WebElement deqSaveAndContinue;

    @FindBy(xpath = DeqCustomerDetailsCONSTANTS.DEQCUSTOMERINFOHEADER)
    private WebElement deqCustInfoHeader;

    @FindBy(xpath = DeqCustomerDetailsCONSTANTS.DEQCUSTOMERNAMEINPUT)
    private WebElement deqCustNameInput;

    @FindBy(xpath = DeqCustomerDetailsCONSTANTS.DEQCUSTOMERNAMEINPUT_ALERT)
    private WebElement deqCustNameInputAlert;



    @FindBy(xpath = DeqCustomerDetailsCONSTANTS.DEQPROJECTNAMEINPUT)
    private WebElement deqProjNameInput;

    @FindBy(xpath = DeqCustomerDetailsCONSTANTS.DEQEXPDELDATE)
    private WebElement deqExpDelDate;
    @FindBy(xpath = DeqCustomerDetailsCONSTANTS.DEQCOMMCONTACTNAME)
    private WebElement deqCommContactName;

    @FindBy(xpath = DeqCustomerDetailsCONSTANTS.DEQCOMMCONTACTEMAIL)
    private WebElement deqCommContactEmail;

    @FindBy(xpath = DeqCustomerDetailsCONSTANTS.DEQCOMMCONTACTPHNO)
    private WebElement deqCommContactPhNo;
    @FindBy(xpath = DeqCustomerDetailsCONSTANTS.DEQTECHCONTACTNAME)
    private WebElement deqTechContactName;

    @FindBy(xpath = DeqCustomerDetailsCONSTANTS.DEQTECHCONTACTEMAIL)
    private WebElement deqTechContactEmail;

    @FindBy(xpath = DeqCustomerDetailsCONSTANTS.DEQTECHCONTACTPHNO)
    private WebElement deqTechContactPhNo;
    @FindBy(xpath = DeqCustomerDetailsCONSTANTS.DEQPONUMBER)
    private WebElement deqPONo;
    @FindBy(xpath = DeqCustomerDetailsCONSTANTS.DEQDOCNUMBER)
    private WebElement deqDocNo;
    @FindBy(xpath = DeqCustomerDetailsCONSTANTS.DEQSPEPRESPMATRIXYES)
    private WebElement deqSPEPRespMatrixYes;

    @FindBy(xpath = DeqCustomerDetailsCONSTANTS.DEQSPEPRESPMATRIXNO)
    private WebElement deqSPEPRespMatrixNo;
    @FindBy(xpath = DeqCustomerDetailsCONSTANTS.DEQDOCCNTLINDNO)
    private WebElement deqDocControlIndNo;
    @FindBy(xpath = DeqCustomerDetailsCONSTANTS.DEQENDUSERNAME)
    private WebElement deqEndUserName;
    @FindBy(xpath = DeqCustomerDetailsCONSTANTS.DEQOPERATORNAME)
    private WebElement deqOperatorName;

    @FindBy(xpath = DeqCustomerDetailsCONSTANTS.DEQCUSTINFOTECHCOUNTRYCODE)
    private WebElement deqTechCntryCode;

    @FindBy(xpath = DeqCustomerDetailsCONSTANTS.DEQCUSTINFOCOMMCOUNTRYCODE)
    private WebElement deqCommCntryCode;


    private DeqCustomerInfoVO deqCustInfovo;

    public DeqCustomerInfoVO getDeqcustinfovo()
    {
        return deqCustInfovo;
    }

    public void setDeqcustinfovo(DeqCustomerInfoVO deqsec1vo) {
        this.deqCustInfovo = deqsec1vo;
    }

    public String getProjectNameAlertMsg( ) {
        return deqCustNameInputAlert.getText();
    }




    public DeQCustomerDetailsPage open() {


        return new DeQCustomerDetailsPage();
    }


    public void clickDEQhome() {
        try {
            logger.debug("Click on DEQ at homepage check 1");
            //   HomePage hp = new HomePage();
            logger.debug("Click on DEQ at homepage check 2");
            //   hp.clickDEQ_homepage();


            // clickHomeZoomCheck_ToNormal();
            // hp.clickHomeZoomCheck_ToNormal();

            logger.debug("Click on DEQ at homepage check 4");
            // waitForElementNotVisibleByElement(deqMenuButton);

            waitAndClick(deqMenuButton);
            logger.debug("Clicked on DEQ at homepage");

        } catch (Exception e) {
             Assertion.fail(AssertDataReader.assertreader.getValue("IPEASSERTMSG_DEQ_CI"));
            Reporter.log("clickDEQDocumenthome ");
            e.printStackTrace();
        }
    }



    public void clickDEQCustInfo() {
        try {
            logger.debug("View questions in the section-Customer Information");
            waitAndClick(deqCustInfo);
            logger.debug("Displayed questions in the section-Customer Information ");
        } catch (Exception e) {
            Assertion.fail(AssertDataReader.assertreader.getValue("IPEASSERTMSG_DEQ_CI"));
            Reporter.log("clickDEQCustInfo");
            e.printStackTrace();
        }
    }




     public void verify_CustNameInput(String custName) {
        try {
            logger.debug("Navigate to section-Customer Information");
            clickDEQhome();
            // clickDEQCustInfo();
            fillInputAfterClear(deqCustNameInput, custName);
        } catch (Exception e) {
            Assertion.fail(AssertDataReader.assertreader.getValue("IPEASSERTMSG_METHOD_FAILURE"));
            e.printStackTrace();
        }
    }

    public void verify_ProjNameInput(String custName) {
        try {
            logger.debug("Navigate to verify_ProjNameInput");
            clickDEQhome();

            logger.debug("-------------------------style--------------------------");
            logger.info(deqProgressBar.getAttribute("style"));
            logger.debug("-------------------------style--------------------------");

            fillInputAfterClear(deqProjNameInput, custName);
        } catch (Exception e) {
            Assertion.fail(AssertDataReader.assertreader.getValue("IPEASSERTMSG_METHOD_FAILURE"));
            e.printStackTrace();
        }
    }

    public void enterInputs_DEQCustomerInfo() {
        try {
            logger.debug("Navigate to section-Customer Information");
            clickDEQhome();
            clickDEQCustInfo();
            Thread.sleep(2000);
            DropDownHelper dropDownHelper = new DropDownHelper(driver, this);
            logger.debug("Navigated to DEQ-Customer Info details 500 : " + deqCustNameInput + " deqCustInfovo :" + deqCustInfovo);
            // fillInputAfterClearNoMoveElement(deqCustNameInput, deqCustInfovo.getDeqCustomerName());


            fillInputAfterClear(deqCustNameInput, deqCustInfovo.getDeqCustomerName());
            fillInputAfterClear(deqProjNameInput, deqCustInfovo.getDeqProjectName());
            fillInput(deqExpDelDate, deqCustInfovo.getDeqExpDelDate());
            fillInputAfterClear(deqCommContactName, deqCustInfovo.getDeqCommContactName());

            fillInputAfterClear(deqCommContactEmail, deqCustInfovo.getDeqCommContactEmail());
            dropDownHelper.selectDropDown(deqCommCntryCode, deqCustInfovo.getDeqCntryCodeComm().getCountryCode());
            fillInputAfterClear(deqCommContactPhNo, deqCustInfovo.getDeqCommContactPhNo());
            fillInputAfterClear(deqTechContactName, deqCustInfovo.getDeqTechContactName());

            fillInputAfterClear(deqTechContactEmail, deqCustInfovo.getDeqTechContactEmail());
            dropDownHelper.selectDropDown(deqTechCntryCode, deqCustInfovo.getDeqCntryCodeTech().getCountryCode());

            fillInputAfterClear(deqTechContactPhNo, deqCustInfovo.getDeqTechContactPhNo());
            fillInputAfterClear(deqPONo, deqCustInfovo.getDeqPONo());

            fillInputAfterClear(deqDocNo, deqCustInfovo.getDeqDocNo());

            fillInputAfterClear(deqDocControlIndNo, deqCustInfovo.getDeqDocControlIndNo());

            fillInputAfterClear(deqEndUserName, deqCustInfovo.getDeqEnduserName());

            fillInputAfterClear(deqOperatorName, deqCustInfovo.getDeqOperatorName());
            clickDEQSaveAndContinue();

            //------------------- reading percentage value of css style="width: 100%"----------------------------------
            String styleValue=deqProgressBar.getAttribute("style");
            //width: 100%
           //read the value 100 from the above result format, using substring and get the percentage of the data filled
            //get the percentage figure trim and save in variable
            String percentage=styleValue.substring(styleValue.indexOf(":")+1,styleValue.indexOf("%")).trim();
            //print the percentage value
            logger.info("percentage"+percentage);
            //-------------------------------------------------------------------------------

        } catch (Exception e) {
             Assertion.fail(AssertDataReader.assertreader.getValue("IPEASSERTMSG_METHOD_FAILURE"));
            e.printStackTrace();
        }
    }

    public void clickDEQSaveAndContinue() {
        try {
            logger.debug("Click- DEQ: Save And Continue button");
            Thread.sleep(2000);
            new Actions(driver).moveToElement(deqSaveAndContinue).perform();
            waitAndClick(deqSaveAndContinue);
            logger.debug("Click- DEQ: Saved And Continue button ");
        } catch (Exception e) {
            Assertion.fail(AssertDataReader.assertreader.getValue("IPEASSERTMSG_DEQ_CI"));
            Reporter.log("Click- DEQ: Save failed  ");
            e.printStackTrace();
        }
    }


}
