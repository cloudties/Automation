package com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.pages;
/**
 * @author Manjusha Saju
 */

import com.automation.ui.base.common.core.element.dropdown.DropDownHelper;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.base.IPEBasePageObject;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.vo.DeqGeneralInfoVO;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.xpathconstants.DeqCommonDetailsCONSTANTS;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.xpathconstants.DeqGeneralDetailsCONSTANTS;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.home.pages.HomePage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import com.automation.ui.base.common.core.assertion.Assertion;
import com.automation.ui.base.common.prpreaders.AssertDataReader;
public class DeQGeneralInfoDetailsPage extends IPEBasePageObject {
    private static Logger logger = Logger.getLogger(DeQGeneralInfoDetailsPage.class);


    @FindBy(xpath = DeqCommonDetailsCONSTANTS.DEQINFO)
    private WebElement deqMenuButton;

    @FindBy(xpath = DeqCommonDetailsCONSTANTS.DEQGENERLINFOSECTIONNAME)
    private WebElement deqGeneralInfo;

    @FindBy(xpath = DeqCommonDetailsCONSTANTS.DEQGENERALINFO_PAGE)
    private WebElement deqGeneralInfoMenu;

    @FindBy(xpath = DeqCommonDetailsCONSTANTS.DEQGENSAVEANDCONTINUE)
    private WebElement deqSaveAndContinue;

    @FindBy(xpath = DeqGeneralDetailsCONSTANTS.DEQGENERALINFOHEADER)
    private WebElement deqGeneralInfoHeader;

    @FindBy(xpath = DeqGeneralDetailsCONSTANTS.DEQGENERALINFOSAFENET_YES)
    private WebElement deqGeneralInfoSafenet_Yes;

    @FindBy(xpath = DeqGeneralDetailsCONSTANTS.DEQGENERALINFOSAFENET_NO)
    private WebElement deqGeneralInfoSafenet_No;

    @FindBy(xpath = DeqGeneralDetailsCONSTANTS.DEQGENERALINFOSPECENVCONDITION_YES)
    private WebElement deqGeneralInfoEnv_Condn_Yes;

    @FindBy(xpath = DeqGeneralDetailsCONSTANTS.DEQGENERALINFOSPECENVCONDITION_NO)
    private WebElement deqGeneralInfoEnv_Condn_No;

    @FindBy(xpath = DeqGeneralDetailsCONSTANTS.DEQGENERALINFOSPECENVCONDITION_DESC)
    private WebElement deqGeneralInfoEnv_Condn_Comment;

    @FindBy(xpath = DeqGeneralDetailsCONSTANTS.DEQGENERALINFOSPECOPERCONDITION_YES)
    private WebElement deqGeneralInfoOper_Condn_Yes;

    @FindBy(xpath = DeqGeneralDetailsCONSTANTS.DEQGENERALINFOSPECOPERCONDITION_NO)
    private WebElement deqGeneralInfoOper_Condn_No;

    @FindBy(xpath = DeqGeneralDetailsCONSTANTS.DEQGENERALINFOSPECOPERCONDITION_DESC)
    private WebElement deqGeneralInfoOper_Condn_Comment;

    @FindBy(xpath = DeqGeneralDetailsCONSTANTS.DEQGENERALINFOCABREQSTANDERD_CE)
    private WebElement deqGeneralInfoCabReqStandard_CE;

    @FindBy(xpath = DeqGeneralDetailsCONSTANTS.DEQGENERALINFOCABREQSTANDERD_CSA)
    private WebElement deqGeneralInfoCabReqStandard_CSA;

    @FindBy(xpath = DeqGeneralDetailsCONSTANTS.DEQGENERALINFOCABREQSTANDERD_UL)
    private WebElement deqGeneralInfoCabReqStandard_UL;

    @FindBy(xpath = DeqGeneralDetailsCONSTANTS.DEQGENERALINFOSUPPLIERNAME_ABUDHABI)
    private WebElement deqGeneralInfoSupplier_Abudabhi;

    @FindBy(xpath = DeqGeneralDetailsCONSTANTS.DEQGENERALINFOSUPPLIERNAME_NETHERLANDS)
    private WebElement deqGeneralInfoSupplier_Netherlands;

    @FindBy(xpath = DeqGeneralDetailsCONSTANTS.DEQGENERALINFOSUPPLIERNAME_HAIL)
    private WebElement deqGeneralInfoSupplier_HAIL;

    @FindBy(xpath = DeqGeneralDetailsCONSTANTS.DEQGENERALINFOSUPPLIERNAME_HOUSTON)
    private WebElement deqGeneralInfoSupplier_Houston;

    @FindBy(xpath = DeqGeneralDetailsCONSTANTS.DEQGENERALINFO_SYSTEM_EPKS)
    private WebElement deqGeneralInfoSystem_EPKS;

    @FindBy(xpath = DeqGeneralDetailsCONSTANTS.DEQGENERALINFO_SYSTEM_DCS)
    private WebElement deqGeneralInfoSystem_DCS;

    @FindBy(xpath = DeqGeneralDetailsCONSTANTS.DEQGENERALINFO_NOTPARTOFHW_DCSSCOPE)
    private WebElement deqGeneralInfo_NotpartofHW_DCSScope;

    @FindBy(xpath = DeqGeneralDetailsCONSTANTS.DEQGENERALINFO_NOTPARTOFHW_DCS_SMM)
    private WebElement deqGeneralInfo_NotpartofHW_DCS_SMM;

    @FindBy(xpath = DeqGeneralDetailsCONSTANTS.DEQGENERALINFO_NOTPARTOFHW_DCS_FIBREOPTICS)
    private WebElement deqGeneralInfo_NotpartofHW_FibreOptics;

    @FindBy(xpath = DeqGeneralDetailsCONSTANTS.DEQGENERALINFO_NOTPARTOFHW_DCS_GRAPHDES)
    private WebElement deqGeneralInfo_NotpartofHW_GraphDes;

    @FindBy(xpath = DeqGeneralDetailsCONSTANTS.DEQGENERALINFO_SB_RELEASENO)
    private WebElement deqGeneralInfo_SB_ReleaseNo;

    @FindBy(xpath = DeqGeneralDetailsCONSTANTS.DEQGENERALINFO_LOCATION)
    private WebElement deqGeneralInfo_Location;
    private DeqGeneralInfoVO deqGeneralInfoVO;

    public DeqGeneralInfoVO getDeqGeneralInfoVO() {
        return deqGeneralInfoVO;
    }

    public void setDeqGeneralInfoVO(DeqGeneralInfoVO deqGeneralInfoVO) {
        this.deqGeneralInfoVO = deqGeneralInfoVO;
    }

    public DeQGeneralInfoDetailsPage open() {


        return new DeQGeneralInfoDetailsPage();
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

    public void clickDEQGeneralInfo() {
        try {
            logger.debug("View questions in the section General Information");
            waitAndClick(deqGeneralInfo);
            logger.debug("Displayed questions in the General Information");
        } catch (Exception e) {
            Assertion.fail(AssertDataReader.assertreader.getValue("IPEASSERTMSG_ASSERT_ERROR"));
            Reporter.log("clickDEQGeneralInfo");
            e.printStackTrace();
        }
    }


    public void enterInputs_DEQGeneralInfo() {
        try {
            logger.debug("Navigate to section- GeneralInfo   Information");
            clickDEQhome();
            Thread.sleep(3000);
            clickDEQGeneralInfo();
            Thread.sleep(3000);
            logger.debug("Navigated to DEQ -QGeneralInfo   Info details");
            Thread.sleep(5000);
            switch (deqGeneralInfoVO.getCntrolCommunicateViaSafeNet()) {
                case 0:
                    deqGeneralInfoSafenet_No.click();
                    break;
                case 1:
                    deqGeneralInfoSafenet_Yes.click();
                    break;
            }

            switch (deqGeneralInfoVO.getActionForEnvirCondition()) {
                case 0:
                    deqGeneralInfoSafenet_No.click();
                    break;
                case 1:
                    deqGeneralInfoSafenet_Yes.click();
                    break;
            }

            fillInputAfterClear(deqGeneralInfoEnv_Condn_Comment, "test");
            // deqGeneralInfoVO.getActionForEnvirConditionComment());
            Thread.sleep(4000);
            switch (deqGeneralInfoVO.getActionForOperCondition()) {
                case 0:
                    deqGeneralInfoOper_Condn_No.click();
                    break;
                case 1:
                    deqGeneralInfoOper_Condn_Yes.click();
                    break;
            }
            fillInputAfterClear(deqGeneralInfoOper_Condn_Comment, "test2");

            Thread.sleep(4000);

            //deqGeneralInfoVO.getActionForOperConditionComment());
            switch (deqGeneralInfoVO.getCabinetRequireStandard()) {
                case 0:
                    deqGeneralInfoCabReqStandard_CE.click();
                    break;
                case 1:
                    deqGeneralInfoCabReqStandard_CSA.click();
                    break;

                case 2:
                    deqGeneralInfoCabReqStandard_UL.click();
                    break;
            }


            switch (deqGeneralInfoVO.getSuppName()) {
                case 0:
                    deqGeneralInfoSupplier_Abudabhi.click();
                    break;
                case 1:
                    deqGeneralInfoSupplier_Netherlands.click();
                    break;

                case 2:
                    deqGeneralInfoSupplier_HAIL.click();
                    break;

                case 3:
                    deqGeneralInfoSupplier_Houston.click();
                    break;
            }

            switch (deqGeneralInfoVO.getSystem_dcs_or_epks()) {
                case 0:
                    deqGeneralInfoSystem_EPKS.click();
                    break;
                case 1:
                    deqGeneralInfoSystem_DCS.click();
                    break;

            }
            //NoPartofSupplysize 4
            for (int i = 0; i < deqGeneralInfoVO.getNoPartofSupply().length; i++) {

                logger.debug("getNoPartofSupply [i]: " + deqGeneralInfoVO.getNoPartofSupply()[i]);
                switch (i) {
                    case 0:
                        if (deqGeneralInfoVO.getNoPartofSupply()[i] == 1) //select
                        {
                            logger.debug("IF Navigated to DEQ-GeneralInfo   Info details isselected" + deqGeneralInfo_NotpartofHW_DCSScope.isSelected() + " isenabled" + deqGeneralInfo_NotpartofHW_DCSScope.isEnabled());

                            deqGeneralInfo_NotpartofHW_DCSScope.click();

                        }
                      /*  else  //deselect
                        {

                            logger.debug("ELSE Navigated to DEQ-GeneralInfo   Info details isselected" +deqGeneralInfo_NotpartofHW_DCSScope.isSelected() + " isenabled"+deqGeneralInfo_NotpartofHW_DCSScope.isEnabled());
                            if (deqGeneralInfo_NotpartofHW_DCSScope.isSelected())
                                deqGeneralInfo_NotpartofHW_DCSScope.click();

                        }*/
                        break;
                    case 1:
                        if (deqGeneralInfoVO.getNoPartofSupply()[i] == 1)
                            deqGeneralInfo_NotpartofHW_FibreOptics.click();
                      /*  else {
                            if (deqGeneralInfo_NotpartofHW_FibreOptics.isSelected())
                                deqGeneralInfo_NotpartofHW_FibreOptics.click();
                            logger.debug("Navigated to DEQ -GeneralInfo   Info details");
                        }*/
                        break;

                    case 2:
                        if (deqGeneralInfoVO.getNoPartofSupply()[i] == 1)
                            deqGeneralInfo_NotpartofHW_GraphDes.click();
                       /* else {

                            if (deqGeneralInfo_NotpartofHW_GraphDes.isSelected())
                                deqGeneralInfo_NotpartofHW_GraphDes.click();

                        }*/

                        break;
                    case 3:
                        if (deqGeneralInfoVO.getNoPartofSupply()[i] == 1)
                            deqGeneralInfo_NotpartofHW_DCS_SMM.click();
                        /*else {

                            if (deqGeneralInfo_NotpartofHW_DCS_SMM.isSelected())
                                deqGeneralInfo_NotpartofHW_DCS_SMM.click();
                        }*/
                        break;
                }
            }

            fillInputAfterClear(deqGeneralInfo_SB_ReleaseNo, deqGeneralInfoVO.getSafetyBuildReleaseNo());
            // fillInputAfterClear(deqGeneralInfo_Location,deqGeneralInfoVO.getLocation());
            DropDownHelper dropDownHelper = new DropDownHelper(driver, this);
            dropDownHelper.selectDropDown(deqGeneralInfo_Location, deqGeneralInfoVO.getInfoLocation().getLocation());
            Thread.sleep(1000);
            clickDEQSaveAndContinue();
            Thread.sleep(1000);
        } catch (Exception e) {
            Assertion.fail(AssertDataReader.assertreader.getValue("IPEASSERTMSG_ASSERT_ERROR"));
            e.printStackTrace();
        }
    }

    public void clickDEQSaveAndContinue() {
        try {
            logger.debug("Click- DEQ: General Save And Continue button");
            // new Actions(driver).moveToElement(deqSaveAndContinue).perform();
            // deqSaveAndContinue.click();
            waitAndClick(deqSaveAndContinue);
            logger.debug("Click- DEQ: General Save And Continue button ");
        } catch (Exception e) {
            Assertion.fail(AssertDataReader.assertreader.getValue("IPEASSERTMSG_ASSERT_ERROR"));
            Reporter.log("Click- DEQ: Save And Continue button");
            e.printStackTrace();
        }
    }


}
