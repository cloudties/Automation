package com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.pages;
/**
 * @author Manjusha Saju
 */

import com.automation.ui.ipe.pageobjectsfactory.pageobject.base.IPEBasePageObject;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.vo.DeqDocumentInfoVO;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.xpathconstants.DeqCommonDetailsCONSTANTS;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.xpathconstants.DeqDocumentDetailsCONSTANTS;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.home.pages.HomePage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import com.automation.ui.base.common.core.assertion.Assertion;
import com.automation.ui.base.common.prpreaders.AssertDataReader;
public class DeQDocumentDetailsPage extends IPEBasePageObject {
    private static Logger logger = Logger.getLogger(DeQDocumentDetailsPage.class);

    /**
     * IPE DEQ- Documentation Information Section WebElements
     */

    @FindBy(xpath = DeqCommonDetailsCONSTANTS.DEQINFO)
    private WebElement deqMenuButton;

    @FindBy(xpath = DeqCommonDetailsCONSTANTS.DEQDOCINFO_PAGE)
    private WebElement deqDocInfoName_page;

    @FindBy(xpath = DeqCommonDetailsCONSTANTS.DEQDOCINFOSECTIONNAME)
    private WebElement deqDocInfoName;

    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFOHEADER)
    private WebElement deqDocInfoHeader;

    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCSAVERESULT)
    private WebElement deqDocSaveNext;

    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFOPLANTADDRESS)
    private WebElement deqDocInfoPlantAddress;

    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFOPLANTLOCATION)
    private WebElement deqDocInfoPlantLocation;

    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFOSISLENAME)
    private WebElement deqDocInfoSISLEName;
    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFOSISLEDIGSIGNBROWSE)
    private WebElement deqDocInfoSISLEDigSignBrowse;

    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFOSISLEPOS)
    private WebElement deqDocInfoSISLEPosition;

    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFOAUTHORDATE)
    private WebElement deqDocInfoAuthorDate;
    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFOSISENGNAME)
    private WebElement deqDocInfoSISEngName;

    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFOSISENGSIGNBROWSE)
    private WebElement deqDocInfoSISEngSignBrowse;

    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFOSISENGPOS)
    private WebElement deqDocInfoSISEngPosition;
    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFOREVIEWDATE)
    private WebElement deqDocInfoReviewDate;
    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFODOCAPPROVERNAME)
    private WebElement deqDocInfoDocApproverName;

    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFODOCAPPRVBROWSE)
    private WebElement deqDocInfoDocApproverBrowse;

    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFODOCAPPROVERPOS)
    private WebElement deqDocInfoDocApproverPos;

    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFODOCAPPRVDDATE)
    private WebElement deqDocInfoApprvdDate;

    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFODOCREV)
    private WebElement deqDocInfoDocRevision;
    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFODOCSTATUS)
    private WebElement deqDocInfoStatus;
    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFODOCCREATEDATE)
    private WebElement deqDocInfoDocCreateDate;

    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFOREFDOCDELETEA)
    private WebElement deqDocInfoRefDocDelA;

    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFOREFDOCDELETEB)
    private WebElement deqDocInfoRefDocDelB;
    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFOREFDOCDELETEC)
    private WebElement deqDocInfoRefDocDelC;

    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFOREFDOCDELETED)
    private WebElement deqDocInfoRefDocDelD;

    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFOREFDOCDELETEE)
    private WebElement deqDocInfoRefDocDelE;

    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFOREFDOCDELETEF)
    private WebElement deqDocInfoRefDocDelF;

    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFOREFDOCADDROW)
    private WebElement deqDocInfoRefDocAddRow;

    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFOSYSARCHSPCREF)
    private WebElement deqDocInfoSASRef;

    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFOSPEPREF)
    private WebElement deqDocInfoSPEPRef;

    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFOSDDSREF)
    private WebElement deqDocInfoSDDSRef;

    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFOSISLEAUTHORSIGNDEL)
    private WebElement deqDocInfoSISLEAuthorSignDel;

    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFOSISENGREVIEWSIGNDEL)
    private WebElement deqDocInfoSISEngReviewSignDel;

    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFODOCAPPRVSIGNDEL)
    private WebElement deqDocInfoDocApprvSignDel;

    /**
     * IPE DEQ- Documentation Information Section WebElements- For Table : Add REV History
     */

    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFOREVHISTADDROW)
    private WebElement deqDocInfoRevHistoryAddRow;

    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFOREVHISTORYPLUSSIGN)
    private WebElement deqDocInfoRevHistoryPlussign;

    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFOREVHISTORYEDITROW1)
    private WebElement deqDocInfoRevHistoryEditRow1;

    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFOREVHISTORYEDITROW2)
    private WebElement deqDocInfoRevHistoryEditRow2;

    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFOREVHISTORYSAVEBUTTON_ROW1)
    private WebElement deqDocInfoRevHistorySaveRowOne;

    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFOREVHISTORYSAVEBUTTON_ROW2)
    private WebElement deqDocInfoRevHistorySaveRowTwo;

    //Rev History table row values starts for first row


    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFOREVHISTORYREVINPUTROW1)
    private WebElement deqDocInfoRevHistoryRevInputRow1;

    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFOREVHISTORYDATEROW1)
    private WebElement deqDocInfoRevHistoryDateRow1;

    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFOREVHISTORYDESCROW1)
    private WebElement deqDocInfoRevHistoryDescRow1;

    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFOREVHISTORYORINITATEDBYROW1)
    private WebElement deqDocInfoRevHistoryOriginatedbyRow1;


    //Rev History table row values starts for second row


    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFOREVHISTORYREVINPUTROW2)
    private WebElement deqDocInfoRevHistoryRevInputRow2;

    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFOREVHISTORYDATEROW2)
    private WebElement deqDocInfoRevHistoryDateRow2;

    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFOREVHISTORYDESCROW2)
    private WebElement deqDocInfoRevHistoryDescRow2;

    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFOREVHISTORYORINITATEDBYROW2)
    private WebElement deqDocInfoRevHistoryOriginatedbyRow2;

    /**
     * IPE DEQ- Documentation Information Section WebElements- For Table: Add Reference Documents
     */

    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFODOCREFADDROWPLUSSIGN)
    private WebElement deqDocInfoDocRefAddRowPlussign;

    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFODOCREFADDROW)
    private WebElement deqDocInfoDocRefAddRow;

    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFODOCREFSAVEBUTTON_ROW1)
    private WebElement deqDocInfoDocRefSaveRowOne;

    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFODOCREFSAVEBUTTON_ROW2)
    private WebElement deqDocInfoDocRefSaveRowTwo;


    //Add Reference Document table row values starts below:

    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFODOCREFREFINPUTROW1)
    private WebElement deqDocInfoDocRefRefInputRow1;

    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFODOCREFIDROW1)
    private WebElement deqDocInfoDocRefIDRow1;

    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFODOCREFTITLEROW1)
    private WebElement deqDocInfoDocRefTitleRow1;


    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFODOCREFREMARKROW1)
    private WebElement deqDocInfoDocRefRemarkRow1;

    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFODOCREFREFINPUTROW2)
    private WebElement deqDocInfoDocRefRefInputRow2;

    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFODOCREFIDROW2)
    private WebElement deqDocInfoDocRefIDRow2;

    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFODOCREFTITLEROW2)
    private WebElement deqDocInfoDocRefTitleRow2;


    @FindBy(xpath = DeqDocumentDetailsCONSTANTS.DEQDOCINFODOCREFREMARKROW2)
    private WebElement deqDocInfoDocRefRemarkRow2;


    private DeqDocumentInfoVO deqDocInfovo;

    public DeqDocumentInfoVO getdeqDocInfovo() {
        return deqDocInfovo;
    }

    public void setDeqDocInfovo(DeqDocumentInfoVO deqDocInfovo) {
        this.deqDocInfovo = deqDocInfovo;
    }

    public DeQDocumentDetailsPage open() {


        return new DeQDocumentDetailsPage();
    }


    public void clickDEQDocumenthome() {
        try {
            new HomePage().clickDEQ_homepage();
            logger.debug("Click on DEQ at homepage");
            // waitForElementNotVisibleByElement(deqMenuButton);
            Thread.sleep(2000);
            waitAndClick(deqMenuButton);
            logger.debug("Clicked on DEQ at homepage");

        } catch (Exception e) {
            Assertion.fail(AssertDataReader.assertreader.getValue("IPEASSERTMSG_ASSERT_ERROR"));
            Reporter.log("clickDEQDocumenthome ");
            e.printStackTrace();
        }
    }

    public void clickDEQDocumentInfo() {
        try {
            logger.debug("View questions in the section-Document Information");
            Thread.sleep(3000);
            waitAndClick(deqDocInfoName_page);
            logger.debug("Displayed questions in the section-Document Information ");
        } catch (Exception e) {
            Assertion.fail(AssertDataReader.assertreader.getValue("IPEASSERTMSG_ASSERT_ERROR"));
            Reporter.log("clickDEQDocumentInfo");
            e.printStackTrace();
        }
    }


//https://stackoverflow.com/questions/8851051/selenium-webdriver-and-browsers-select-file-dialog
    //https://sqa.stackexchange.com/questions/12851/how-can-i-work-with-file-uploads-during-a-webdriver-test

    private void deqDocInfoDigSignupload(String filepath, WebElement deqDocInfoSignBrowse) {
        try {
            logger.debug("Browse to Digital Sign upload");
            deqDocInfoSignBrowse.click();
            StringSelection filePathSelection = new StringSelection(filepath);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePathSelection, null);
            //native key strokes for CTRL, V and ENTER keys
            Robot robot = new Robot();
            Thread.sleep(2000);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyPress(KeyEvent.VK_ENTER);
            logger.debug("Uploaded Sign from filepath");
        } catch (Exception e) {
            Assertion.fail(AssertDataReader.assertreader.getValue("IPEASSERTMSG_ASSERT_ERROR"));
            Reporter.log("deqDocInfoDigSignupload() is done");
            e.printStackTrace();
        }
    }


    public void enterInputs_DEQDocumentInfo() {
        try {
            logger.debug("Navigate to section-DocumentInformation check 3");
            clickDEQDocumenthome();

            logger.debug("Navigated to DEQ-Customer Info details check 4");

            clickDEQDocumentInfo();
            logger.debug("Navigated to DEQ-Customer Info details check 5");


            fillInputAfterClear(deqDocInfoPlantAddress, deqDocInfovo.getDeqDocInfoPlantAddress());
            fillInputAfterClear(deqDocInfoPlantLocation, deqDocInfovo.getDeqDocInfoPlantLocation());
            fillInputAfterClear(deqDocInfoSISLEName, deqDocInfovo.getDeqDocInfoSISLEName());
            logger.debug("deqDocInfoDigSignupload calling");
            deqDocInfoDigSignupload(System.getProperty("user.dir") + File.separator + "resources\\ImagesForUploadTests\\DigSign-SISLE_Author.jpg", deqDocInfoSISLEDigSignBrowse);

            logger.debug("deqDocInfoDigSignupload called");
            logger.debug("%%%%%%%" + deqDocInfovo.getDeqDocInfoRevhistoryvo().get(0).getDeqDocInfoDescStatusandChanges());

            fillInputAfterClear(deqDocInfoSISLEPosition, deqDocInfovo.getDeqDocInfoSISLEPosition());
            fillInput(deqDocInfoAuthorDate, deqDocInfovo.getDeqDocInfoAuthorDate());
            fillInputAfterClear(deqDocInfoSISEngName, deqDocInfovo.getDeqDocInfoSISEngName());
            deqDocInfoDigSignupload(System.getProperty("user.dir") + File.separator + "resources\\ImagesForUploadTests\\DigSign-SISEng_Review.jpg", deqDocInfoSISEngSignBrowse);

            Thread.sleep(3000);
            fillInputAfterClear(deqDocInfoSISEngPosition, deqDocInfovo.getDeqDocInfoSISEngPosition());
            fillInput(deqDocInfoReviewDate, deqDocInfovo.getDeqDocInfoReviewDate());
            fillInputAfterClear(deqDocInfoDocApproverName, deqDocInfovo.getDeqDocInfoDocApproverName());
            deqDocInfoDigSignupload(System.getProperty("user.dir") + File.separator + "resources\\ImagesForUploadTests\\DigSign_DocApprover.jpg", deqDocInfoDocApproverBrowse);

            fillInputAfterClear(deqDocInfoDocApproverPos, deqDocInfovo.getDeqDocInfoDocApproverPos());
            fillInput(deqDocInfoApprvdDate, deqDocInfovo.getDeqDocInfoApprvdDate());
            fillInputAfterClear(deqDocInfoDocRevision, deqDocInfovo.getDeqDocInfoDocRevision());
            fillInputAfterClear(deqDocInfoStatus, deqDocInfovo.getDeqDocInfoStatus());
            fillInput(deqDocInfoDocCreateDate, deqDocInfovo.getDeqDocInfoDocCreateDate());
            Thread.sleep(4000);

            //add first row of DEQ Table Revision History
            //------------------------------------------
            clickTableRevHistoryAddRow();
            fillInputAfterClear(deqDocInfoRevHistoryRevInputRow1, deqDocInfovo.getDeqDocInfoRevhistoryvo().get(0).getDeqDocInfoRev());
            fillInput(deqDocInfoRevHistoryDateRow1, deqDocInfovo.getDeqDocInfoRevhistoryvo().get(0).getDeqDocInfoDate());
            fillInputAfterClear(deqDocInfoRevHistoryDescRow1, deqDocInfovo.getDeqDocInfoRevhistoryvo().get(0).getDeqDocInfoDescStatusandChanges());
            fillInputAfterClear(deqDocInfoRevHistoryOriginatedbyRow1, deqDocInfovo.getDeqDocInfoRevhistoryvo().get(0).getDeqDocInfoOriginBy());
            Thread.sleep(4000);
            clickTableItemsSaveRow(deqDocInfoRevHistorySaveRowOne);
            logger.debug("Added first row");
            Thread.sleep(4000);

            /*

            //add second row of DEQ Table Revision History
            //-----------------------------------------------
            clickTableRevHistoryAddRow();
            fillInputAfterClear(deqDocInfoRevHistoryRevInputRow2, deqDocInfovo.getDeqDocInfoRevhistoryvo().get(1).getDeqDocInfoRev());
            fillInput(deqDocInfoRevHistoryDateRow2, deqDocInfovo.getDeqDocInfoRevhistoryvo().get(1).getDeqDocInfoDate());
            fillInputAfterClear(deqDocInfoRevHistoryDescRow2, deqDocInfovo.getDeqDocInfoRevhistoryvo().get(1).getDeqDocInfoDescStatusandChanges());
            fillInputAfterClear(deqDocInfoRevHistoryOriginatedbyRow2, deqDocInfovo.getDeqDocInfoRevhistoryvo().get(1).getDeqDocInfoOriginBy());
            Thread.sleep(4000);
            clickTableItemsSaveRow(deqDocInfoRevHistorySaveRowTwo);
            logger.debug("Added second row");
            */


            /*
            //add first row of DEQ Table Ref Document
            //------------------------------------------
            clickTableRefDocumentsAddRow();
            fillInputAfterClear(deqDocInfoDocRefRefInputRow1, deqDocInfovo.getDeqDocInfoAddRefdocvo().get(0).getDeqDocInfoRef());
            fillInput(deqDocInfoDocRefIDRow1, deqDocInfovo.getDeqDocInfoAddRefdocvo().get(0).getDeqDocInfoID());
            fillInputAfterClear(deqDocInfoDocRefTitleRow1, deqDocInfovo.getDeqDocInfoAddRefdocvo().get(0).getDeqDocInfoTitle());
            fillInputAfterClear(deqDocInfoDocRefRemarkRow1, deqDocInfovo.getDeqDocInfoAddRefdocvo().get(0).getDeqDocInfoRemark());
            Thread.sleep(3000);
            clickTableItemsSaveRow(deqDocInfoDocRefSaveRowOne);
            logger.debug("Added first row");
            Thread.sleep(3000);

            //add second row of DEQ Table Ref Document
            //-----------------------------------------------
            clickTableRefDocumentsAddRow();
            fillInputAfterClear(deqDocInfoRevHistoryRevInputRow2, deqDocInfovo.getDeqDocInfoRevhistoryvo().get(1).getDeqDocInfoRev());
            fillInput(deqDocInfoRevHistoryDateRow2, deqDocInfovo.getDeqDocInfoRevhistoryvo().get(1).getDeqDocInfoDate());
            fillInputAfterClear(deqDocInfoRevHistoryDescRow2, deqDocInfovo.getDeqDocInfoRevhistoryvo().get(1).getDeqDocInfoDescStatusandChanges());
            fillInputAfterClear(deqDocInfoRevHistoryOriginatedbyRow2, deqDocInfovo.getDeqDocInfoRevhistoryvo().get(1).getDeqDocInfoOriginBy());
            Thread.sleep(3000);
            clickTableItemsSaveRow(deqDocInfoRevHistorySaveRowTwo);
            logger.debug("Added second row");

            */

            fillInputAfterClear(deqDocInfoSASRef, deqDocInfovo.getDeqDocInfoSASRef());
            fillInputAfterClear(deqDocInfoSPEPRef, deqDocInfovo.getDeqDocInfoSPEPRef());
            fillInputAfterClear(deqDocInfoSDDSRef, deqDocInfovo.getDeqDocInfoSDDSRef());
            clickDEQSaveNext();

            logger.debug("Added DEQ-Document details in Excel");
        } catch (Exception e) {
            Assertion.fail(AssertDataReader.assertreader.getValue("IPEASSERTMSG_ASSERT_ERROR"));
            e.printStackTrace();
        }
    }


    public void clickDEQSaveNext() {
        try {
            logger.debug("Click- DEQ: Save And Continue button");

            scrollTo(deqDocSaveNext);
            waitAndClick(deqDocSaveNext);
            logger.debug("Click- DEQ: Save And Continue button ");
        } catch (Exception e) {
            Assertion.fail(AssertDataReader.assertreader.getValue("IPEASSERTMSG_ASSERT_ERROR"));
            Reporter.log("Click- DEQ: Save And Continue button");
            e.printStackTrace();
        }
    }

    public void clickTableRevHistoryAddRow() {
        try {
            logger.debug("Click- Document information: Enter RevHistory-Add row");
            Thread.sleep(5000);
            waitAndClick(deqDocInfoRevHistoryPlussign);

            logger.debug("Click- Document information: Entered RevHistory-Add row ");
        } catch (Exception e) {
            Assertion.fail(AssertDataReader.assertreader.getValue("IPEASSERTMSG_ASSERT_ERROR"));
            Reporter.log("Click- Document information: Enter RevHistory-Add row");
            e.printStackTrace();
        }
    }


    public void clickTableItemsSaveRow(WebElement ele) {
        try {
            logger.debug("Click- Document information: Enter RevHistory-Save row");

            waitAndClick(ele);

            logger.debug("Clicked- Document information: Entered RevHistory-Save row ");
        } catch (Exception e) {
            Assertion.fail(AssertDataReader.assertreader.getValue("IPEASSERTMSG_ASSERT_ERROR"));
            Reporter.log("Click- Document information: Enter RevHistory-Save row");
            e.printStackTrace();
        }
    }


    public void clickTableRefDocumentsAddRow() {
        try {
            logger.debug("Click- Document information: Add Reference Documentation-Add row");
            Thread.sleep(5000);
            waitAndClick(deqDocInfoDocRefAddRowPlussign);

            logger.debug("Clicked- Document information: Add Reference Documentation-Add row ");
        } catch (Exception e) {
            Assertion.fail(AssertDataReader.assertreader.getValue("IPEASSERTMSG_ASSERT_ERROR"));
            Reporter.log("Clicked- Document information: Add Reference Documentation-Add row");
            e.printStackTrace();
        }
    }


}
