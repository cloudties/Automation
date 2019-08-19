/**
 *
 */
package com.automation.ui.cuspera.testcases.base;

/**
 * @author
 */

import com.automation.ui.base.common.contentpatterns.URLsContent;
import com.automation.ui.base.common.core.assertion.Assertion;
import com.automation.ui.base.common.utils.ExcelUtil;
import com.automation.ui.cuspera.common.constants.ExcelCONSTANTS;
 import com.automation.ui.cuspera.pageobjectsfactory.pageobject.home.pages.*;
import com.automation.ui.cuspera.pageobjectsfactory.pageobject.context.pages.*;
import com.automation.ui.cuspera.testcases.base.templates.CusperaTestTemplate;
import org.apache.log4j.Logger;

import java.util.List;

public class CusperaBaseTest extends CusperaTestTemplate {

    private static Logger logger = Logger.getLogger(CusperaBaseTest.class);
    protected ExcelUtil eu = null;
      protected HomePage homePage = null;

     protected ContextPage contextPage =null;



    public CusperaBaseTest() {
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