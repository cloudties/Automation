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
import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.index.pages.*;
import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.home.pages.*;
import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.login.pages.*;
import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.context.pages.*;
import com.automation.ui.digitaldeployer.testcases.base.templates.DigitalDeployerTestTemplate;
import org.apache.log4j.Logger;

import java.util.List;

public class ProjectBaseTest extends DigitalDeployerTestTemplate {

    private static Logger logger = Logger.getLogger(ProjectBaseTest.class);
    protected ExcelUtil eu = null;
    protected IndexPage indexPage = null;
    protected HomePage homePage = null;
    protected LoginPage login_page = null;

     protected ContextPage contextPage =null;



    public ProjectBaseTest() {
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