package com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.pages;
/**
 * @author Manjusha Saju
 */

import com.automation.ui.ipe.pageobjectsfactory.pageobject.base.IPEBasePageObject;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.vo.DeqProjectSpecificInfoVO;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.xpathconstants.DeqCommonDetailsCONSTANTS;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.xpathconstants.DeqProjectSpecificDetailsCONSTANTS;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.home.pages.HomePage;
import org.apache.log4j.Logger;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import com.automation.ui.base.common.core.assertion.Assertion;
import com.automation.ui.base.common.prpreaders.AssertDataReader;
import java.io.File;
import java.util.List;

public class DeQProjectSpecificInfoDetailsPage extends IPEBasePageObject {
    private static Logger logger = Logger.getLogger(DeQProjectSpecificInfoDetailsPage.class);


    @FindBy(xpath = DeqCommonDetailsCONSTANTS.DEQINFO)
    private WebElement deqMenuButton;

    @FindBy(xpath = DeqCommonDetailsCONSTANTS.DEQPROJECTSPECINFOSECTIONNAME)
    private WebElement deqProjSpecInfoSecName;

    @FindBy(xpath = DeqCommonDetailsCONSTANTS.DEQGENSAVEANDCONTINUE)
    private WebElement deqSaveAndContinue;

    @FindBy(xpath = DeqProjectSpecificDetailsCONSTANTS.DEQPROJSPECINFOTEXTBOX)
    private WebElement deqProjSpecInfoTextBox;

    @FindBy(xpath = DeqProjectSpecificDetailsCONSTANTS.DEQPROJSPECINFOEARTHLEAKAGEDETECTOR_YES)
    private WebElement deqProjSpecInfoEarth_Leakage_Yes;

    @FindBy(xpath = DeqProjectSpecificDetailsCONSTANTS.DEQPROJSPECINFOEARTHLEAKAGEDETECTOR_NO)
    private WebElement deqProjSpecInfoEarth_Leakage_No;

    @FindBy(xpath = DeqProjectSpecificDetailsCONSTANTS.DEQPROJSPECINFOHIGHTEMPALARM)
    private WebElement deqProjSpecInfoHighTempAlarm;

    @FindBy(xpath = DeqProjectSpecificDetailsCONSTANTS.DEQPROJSPECINFO2OO3AI_YES)
    private WebElement deqProjSpecInfo2OO3AI_Yes;

    @FindBy(xpath = DeqProjectSpecificDetailsCONSTANTS.DEQPROJSPECINFO2OO3AI_NO)
    private WebElement deqProjSpecInfo2OO3AI_No;

    @FindBy(xpath = DeqProjectSpecificDetailsCONSTANTS.DEQPROJSPECINFO2OO2DI_YES)
    private WebElement deqProjSpecInfo2OO2DI_Yes;

    @FindBy(xpath = DeqProjectSpecificDetailsCONSTANTS.DEQPROJSPECINFO2OO2DI_NO)
    private WebElement deqProjSpecInfo2OO2DI_No;

    @FindBy(xpath = DeqProjectSpecificDetailsCONSTANTS.DEQPROJSPECINFOSUBPROJNAME)
    private WebElement deqProjSpecInfoSubProjName;

    @FindBy(xpath = DeqProjectSpecificDetailsCONSTANTS.DEQPROJSPECINFOSSAOD_BROWSE)
    private WebElement deqProjSpecInfoSSAOD_Browse;

    @FindBy(xpath = DeqProjectSpecificDetailsCONSTANTS.DEQPROJSPECINFOSSAOD_DELETE)
    private WebElement deqProjSpecInfoSSAOD_Delete;

    @FindBy(xpath = DeqProjectSpecificDetailsCONSTANTS.DEQPROJSPECINFOHWDESIGNRESPONS_CHECK1)
    private WebElement deqProjSpecInfoHWDesignResp_CHK1;

    @FindBy(xpath = DeqProjectSpecificDetailsCONSTANTS.DEQPROJSPECINFOHWDESIGNRESPONS_CHECK2)
    private WebElement deqProjSpecInfoHWDesignResp_CHK2;

    @FindBy(xpath = DeqProjectSpecificDetailsCONSTANTS.DEQPROJSPECINFOHWDESIGNRESPONS_CHECK3)
    private WebElement deqProjSpecInfoHWDesignResp_CHK3;


    @FindBy(xpath = DeqProjectSpecificDetailsCONSTANTS.DEQPROJSPECINFOHWDESIGNRESPONS_CHECK4)
    private WebElement deqProjSpecInfoHWDesignResp_CHK4;

    @FindBy(xpath = DeqProjectSpecificDetailsCONSTANTS.DEQPROJSPECINFOHWDESIGNRESPONS_CHECK5)
    private WebElement deqProjSpecInfoHWDesignResp_CHK5;


    @FindBy(xpath = DeqProjectSpecificDetailsCONSTANTS.DEQPROJSPECINFOOWNERDESIGNRESPONS_CHECK1)
    private WebElement deqProjSpecInfoOwnerDesignResp_CHK1;

    @FindBy(xpath = DeqProjectSpecificDetailsCONSTANTS.DEQPROJSPECINFOOWNERDESIGNRESPONS_CHECK2)
    private WebElement deqProjSpecInfoOwnerDesignResp_CHK2;

    @FindBy(xpath = DeqProjectSpecificDetailsCONSTANTS.DEQPROJSPECINFOOWNERDESIGNRESPONS_CHECK3)
    private WebElement deqProjSpecInfoOwnerDesignResp_CHK3;


    @FindBy(xpath = DeqProjectSpecificDetailsCONSTANTS.DEQPROJSPECINFOOWNERDESIGNRESPONS_CHECK4)
    private WebElement deqProjSpecInfoOwnerDesignResp_CHK4;

    @FindBy(xpath = DeqProjectSpecificDetailsCONSTANTS.DEQPROJSPECINFOHWSCOPEOFSUPPLY_CHECK1)
    private WebElement deqProjSpecInfoHWScopeofSupply_CHK1;

    @FindBy(xpath = DeqProjectSpecificDetailsCONSTANTS.DEQPROJSPECINFOHWSCOPEOFSUPPLY_CHECK2)
    private WebElement deqProjSpecInfoHWScopeofSupply_CHK2;

    // give list of items to drag and drop
    @FindBy(xpath = DeqProjectSpecificDetailsCONSTANTS.DEQPROJSPECINFODRAGANDDROP_LIST)
    private List<WebElement> component;
    private DeqProjectSpecificInfoVO deqProjSpecificInfoVO;

    public DeqProjectSpecificInfoVO getDeqProjSpecificInfoVO() {
        return deqProjSpecificInfoVO;
    }

    public void setDeqProjSpecificInfoVO(DeqProjectSpecificInfoVO deqProjSpecificInfoVO) {
        this.deqProjSpecificInfoVO = deqProjSpecificInfoVO;
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


    public void clickDEQProjectSpecificInfo() {
        try {
            logger.debug("View questions in the section Project Specific Information");
            waitAndClick(deqProjSpecInfoSecName);
            logger.debug("Displayed questions in Project Specific Information");
        } catch (Exception e) {
            Assertion.fail(AssertDataReader.assertreader.getValue("IPEASSERTMSG_ASSERT_ERROR"));
            Reporter.log("clickDEQProjectSpecificInfo");
            e.printStackTrace();
        }
    }


    public WebElement getPrecidenceComponent(int index) {


        logger.debug("Displayed  component.size" + component.size());
        return component.get(index);
    }

    public WebElement dragAndDropToTheTop(WebElement draggedElement) {

        logger.debug("dragAndDropToTheTop");


        Point location = draggedElement.getLocation();
        Integer targetY = draggedElement.getLocation().getY() - location.getY() + 50;

        //pick and item to drag and hold it
        new Actions(driver).clickAndHold(draggedElement).perform();
        for (int i = 0; i < 20; i++) {
            // move the item to a right location
            new Actions(driver).moveByOffset(0, -targetY / 20).perform();
        }

        try {
            Thread.sleep(5000);
        } catch (Exception e) {

        }


        logger.debug("dragAndDropToTheTop");
        //release an drop it to the desired location
        new Actions(driver).release().perform();

        wait.forValueToBeNotPresentInElementsAttribute(draggedElement, "class", "is-dragging");
        wait.forValueToBeNotPresentInElementsAttribute(draggedElement, "class", "is-dropping");

        return component.get(0);
    }

    public void clickDEQProjectSpecDragandDrop() {
        try {
            clickDEQhome();
            clickDEQProjectSpecificInfo();
            logger.debug("clickDEQProjectSpecDragandDrop  1 :");
            WebElement element = getPrecidenceComponent(1);

            WebElement topElement = dragAndDropToTheTop(element);
            //Assertion.assertEquals(element.getText(), topElement.getText());

            logger.debug("clickDEQProjectSpecDragandDrop ");
        } catch (Exception e) {
            Assertion.fail(AssertDataReader.assertreader.getValue("IPEASSERTMSG_ASSERT_ERROR"));
            Reporter.log("clickDEQProjectSpecDragandDrop");
            e.printStackTrace();
        }
    }


    public void enterInputs_DEQProjSpecificInfo() {
        try {
            logger.debug("Navigate to section- Project Specific Information");
            clickDEQhome();
            Thread.sleep(3000);
            clickDEQProjectSpecificInfo();

            logger.debug("Navigated to DEQ -Project Specific Info details");


            fillInputAfterClear(deqProjSpecInfoTextBox, deqProjSpecificInfoVO.getDeqProjSpecInfotextbox());
            switch (deqProjSpecificInfoVO.getDeqProjSpecInfoEarthLeakageDetector()) {
                case 0:
                    deqProjSpecInfoEarth_Leakage_Yes.click();
                    break;
                case 1:
                    deqProjSpecInfoEarth_Leakage_No.click();
                    break;
            }
            fillInputAfterClear(deqProjSpecInfoHighTempAlarm, deqProjSpecificInfoVO.getDeqProjSpecInfoHighTempAlarm());


            switch (deqProjSpecificInfoVO.getDeqProjSpecInfo2oo3AI()) {
                case 0:
                    deqProjSpecInfo2OO3AI_Yes.click();
                    break;
                case 1:
                    deqProjSpecInfo2OO3AI_No.click();
                    break;
            }

            switch (deqProjSpecificInfoVO.getDeqProjSpecInfo2oo2DI()) {
                case 0:
                    deqProjSpecInfo2OO2DI_Yes.click();
                    break;
                case 1:
                    deqProjSpecInfo2OO2DI_No.click();
                    break;
            }
            fillInputAfterClear(deqProjSpecInfoSubProjName, deqProjSpecificInfoVO.getDeqProjSpecInfoSubProjectName());
            Thread.sleep(5000);

            fileupload(System.getProperty("user.dir") + File.separator + "resources\\ImagesForUploadTests\\jvmversion.bmp", deqProjSpecInfoSSAOD_Browse);

            //Honeywell Design Responsibilities 5
            for (int i = 0; i < deqProjSpecificInfoVO.getDeqProjSpecInfoHWDesignResponsibilities().length; i++) {

                logger.debug(" [i]: " + deqProjSpecificInfoVO.getDeqProjSpecInfoHWDesignResponsibilities()[i]);
                switch (i) {
                    case 0:
                        if (deqProjSpecificInfoVO.getDeqProjSpecInfoHWDesignResponsibilities()[i] == 1) //select
                        {

                            deqProjSpecInfoHWDesignResp_CHK1.click();

                        } else  //deselect
                        {
                            if (deqProjSpecInfoHWDesignResp_CHK1.isSelected()) {
                                logger.debug("isSelected case 0");
                                deqProjSpecInfoHWDesignResp_CHK1.click();
                            }

                        }
                        break;
                    case 1:
                        if (deqProjSpecificInfoVO.getDeqProjSpecInfoHWDesignResponsibilities()[i] == 1) //select
                        {

                            deqProjSpecInfoHWDesignResp_CHK2.click();

                        } else  //deselect
                        {
                            if (deqProjSpecInfoHWDesignResp_CHK2.isSelected()) {
                                logger.debug("isSelected case 1");
                                deqProjSpecInfoHWDesignResp_CHK2.click();
                            }

                        }
                        break;

                    case 2:
                        if (deqProjSpecificInfoVO.getDeqProjSpecInfoHWDesignResponsibilities()[i] == 1) //select
                        {

                            deqProjSpecInfoHWDesignResp_CHK3.click();

                        } else  //deselect
                        {
                            if (deqProjSpecInfoHWDesignResp_CHK3.isSelected()) {
                                logger.debug("isSelected case 2");
                                deqProjSpecInfoHWDesignResp_CHK3.click();
                            }

                        }
                        break;

                    case 3:
                        if (deqProjSpecificInfoVO.getDeqProjSpecInfoHWDesignResponsibilities()[i] == 1) //select
                        {

                            deqProjSpecInfoHWDesignResp_CHK4.click();

                        } else  //deselect
                        {
                            if (deqProjSpecInfoHWDesignResp_CHK4.isSelected()) {
                                logger.debug("isSelected case 3");
                                deqProjSpecInfoHWDesignResp_CHK4.click();
                            }

                        }
                        break;
                    case 4:
                        if (deqProjSpecificInfoVO.getDeqProjSpecInfoHWDesignResponsibilities()[i] == 1) //select
                        {

                            deqProjSpecInfoHWDesignResp_CHK5.click();

                        } else  //deselect
                        {
                            if (deqProjSpecInfoHWDesignResp_CHK5.isSelected()) {
                                logger.debug("isSelected case 4");
                                deqProjSpecInfoHWDesignResp_CHK5.click();
                            }

                        }
                        break;
                }
            }

            Thread.sleep(1000);

            //Owner Design Responsibilities 4
            for (int i = 0; i < deqProjSpecificInfoVO.getDeqProjSpecInfoOwnerDesignResponsibilities().length; i++) {

                logger.debug(" [i]: " + deqProjSpecificInfoVO.getDeqProjSpecInfoOwnerDesignResponsibilities()[i]);
                switch (i) {
                    case 0:
                        if (deqProjSpecificInfoVO.getDeqProjSpecInfoOwnerDesignResponsibilities()[i] == 1) //select
                        {

                            deqProjSpecInfoOwnerDesignResp_CHK1.click();

                        }
                      /*  else  //deselect
                        {
                            logger.debug("ELSE Navigated to DEQ-ProjectSpecificInfo  details isselected" +deqProjSpecInfoOwnerDesignResp_CHK1.isSelected() + " isenabled"+deqProjSpecInfoOwnerDesignResp_CHK1.isEnabled());
                            if (deqProjSpecInfoOwnerDesignResp_CHK1.isSelected())
                                deqProjSpecInfoOwnerDesignResp_CHK1.click();

                        }*/
                        break;

                    case 1:
                        if (deqProjSpecificInfoVO.getDeqProjSpecInfoOwnerDesignResponsibilities()[i] == 1) //select
                        {

                            deqProjSpecInfoOwnerDesignResp_CHK2.click();

                        }
                      /*  else  //deselect
                        {
                            logger.debug("ELSE Navigated to DEQ-ProjectSpecificInfo  details isselected" +deqProjSpecInfoOwnerDesignResp_CHK2.isSelected() + " isenabled"+deqProjSpecInfoOwnerDesignResp_CHK2.isEnabled());
                            if (deqProjSpecInfoOwnerDesignResp_CHK2.isSelected())
                                deqProjSpecInfoOwnerDesignResp_CHK2.click();

                        }*/
                        break;

                    case 2:
                        if (deqProjSpecificInfoVO.getDeqProjSpecInfoOwnerDesignResponsibilities()[i] == 1) //select
                        {

                            deqProjSpecInfoOwnerDesignResp_CHK3.click();

                        }
                      /*  else  //deselect
                        {
                            logger.debug("ELSE Navigated to DEQ-ProjectSpecificInfo  details isselected" +deqProjSpecInfoOwnerDesignResp_CHK3.isSelected() + " isenabled"+deqProjSpecInfoOwnerDesignResp_CHK3.isEnabled());
                            if (deqProjSpecInfoOwnerDesignResp_CHK3.isSelected())
                                deqProjSpecInfoOwnerDesignResp_CHK3.click();

                        }*/
                        break;

                    case 3:
                        if (deqProjSpecificInfoVO.getDeqProjSpecInfoOwnerDesignResponsibilities()[i] == 1) //select
                        {

                            deqProjSpecInfoOwnerDesignResp_CHK4.click();

                        }
                      /*  else  //deselect
                        {
                            logger.debug("ELSE Navigated to DEQ-ProjectSpecificInfo  details isselected" +deqProjSpecInfoOwnerDesignResp_CHK4.isSelected() + " isenabled"+deqProjSpecInfoOwnerDesignResp_CHK4.isEnabled());
                            if (deqProjSpecInfoOwnerDesignResp_CHK4.isSelected())
                                deqProjSpecInfoOwnerDesignResp_CHK4.click();

                        }*/
                        break;

                }
            }
            Thread.sleep(1000);

            WebElement element = getPrecidenceComponent(1);

            //the text details are stored in the list and can be used for assertion
            List<String> listOfValues = getStringFromWebElements(component);
            WebElement topElement = dragAndDropToTheTop(element);


            Thread.sleep(2000);

            //Honeywell Scope of Supply 2
            for (int i = 0; i < deqProjSpecificInfoVO.getDeqProjSpecInfoHWScopeofSupplyList().length; i++) {

                logger.debug(" [i]: " + deqProjSpecificInfoVO.getDeqProjSpecInfoHWScopeofSupplyList()[i]);
                switch (i) {
                    case 0:
                        if (deqProjSpecificInfoVO.getDeqProjSpecInfoHWScopeofSupplyList()[i] == 1) //select
                        {

                            deqProjSpecInfoHWScopeofSupply_CHK1.click();

                        }
                      /*  else  //deselect
                        {
                            logger.debug("ELSE Navigated to DEQ-ProjectSpecificInfo  details isselected" +deqProjSpecInfoHWScopeofSupply_CHK1.isSelected() + " isenabled"+deqProjSpecInfoOwnerDesignResp_CHK1.isEnabled());
                            if (deqProjSpecInfoOwnerDesignResp_CHK1.isSelected())
                                deqProjSpecInfoOwnerDesignResp_CHK1.click();

                        }*/
                        break;

                    case 1:
                        if (deqProjSpecificInfoVO.getDeqProjSpecInfoHWScopeofSupplyList()[i] == 1) //select
                        {

                            deqProjSpecInfoHWScopeofSupply_CHK2.click();

                        }
                      /*  else  //deselect
                        {
                            logger.debug("ELSE Navigated to DEQ-ProjectSpecificInfo  details isselected" +deqProjSpecInfoOwnerDesignResp_CHK2.isSelected() + " isenabled"+deqProjSpecInfoOwnerDesignResp_CHK2.isEnabled());
                            if (deqProjSpecInfoOwnerDesignResp_CHK2.isSelected())
                                deqProjSpecInfoOwnerDesignResp_CHK2.click();

                        }*/
                        break;
                }

            }

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
