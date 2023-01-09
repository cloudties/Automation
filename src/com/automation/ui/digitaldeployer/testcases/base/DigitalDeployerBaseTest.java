/**
 *
 */
package com.automation.ui.digitaldeployer.testcases.base;

/**
 * @author
 */

import com.automation.ui.base.common.contentpatterns.URLsContent;
import com.automation.ui.base.common.core.assertion.Assertion;
import com.automation.ui.base.common.utils.ExcelUtil;
import com.automation.ui.digitaldeployer.common.constants.ExcelCONSTANTS;
 import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.home.pages.*;
import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.context.pages.*;
import com.automation.ui.digitaldeployer.testcases.base.templates.DigitalDeployerTestTemplate;
import org.apache.log4j.Logger;

import java.util.List;

public class DigitalDeployerBaseTest extends DigitalDeployerTestTemplate {

    private static Logger logger = Logger.getLogger(DigitalDeployerBaseTest.class);
    protected ExcelUtil eu = null;
      protected HomePage homePage = null;

     protected ContextPage contextPage =null;



    public DigitalDeployerBaseTest() {
        super();

        getDataReaders();

    }


    protected void getDataReaders() {

        try {
            eu = new ExcelUtil();
            eu.setExcelFile(ExcelCONSTANTS.LOGINXLSDATAPATH,
                    ExcelCONSTANTS.LOGINXLSDATASHEETNAMELOGIN);
        } catch (Exception e) {
            e.printStackTrace();
            ;
        }

    }

    protected void loadFirstPage() {
        driver.get(urlBuilder.getUrlForPage(URLsContent.SITE_DIR));

    }

    protected void verifyElementsVisible(List<String> elementsList) {
        elementsList.forEach(element -> Assertion.assertTrue(homePage.isElementVisible(
                element), element + " is not visible"));
    }

    protected void verifyElementsNotVisible(List<String> elementsList) {
        elementsList.forEach(element -> Assertion.assertFalse(homePage.isElementVisible(
                element), element + " is visible"));
    }


}