/**
 *
 */
package com.automation.ui.ipe.testcases.base;

/**
 * @author Manjusha Saju
 */

import com.automation.ui.base.common.contentpatterns.URLsContent;
import com.automation.ui.base.common.core.assertion.Assertion;
import com.automation.ui.base.common.utils.ExcelUtil;
import com.automation.ui.ipe.common.constants.ExcelCONSTANTS;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.pages.*;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.fds.pages.FDSPage;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.home.pages.HomePage;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.hwd.pages.HWDrawingPage;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.login.pages.LoginPage;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.project.pages.ProjectDefinitionPage;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.tpc.pages.TPCPage;
import com.automation.ui.ipe.testcases.base.templates.IPETestTemplate;
import org.apache.log4j.Logger;

import java.util.List;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.overview.pages.*;

public class IPEBaseTest extends IPETestTemplate {

    private static Logger logger = Logger.getLogger(IPEBaseTest.class);
    protected ExcelUtil eu = null;
    protected LoginPage login_page = null;
    protected HomePage home_page = null;
    protected DeQCustomerDetailsPage deq_custdetailpage = null;
    protected DeQDocumentDetailsPage deq_docdetailpage = null;
    protected DeQCommunicationDetailsPage deq_communicationspage = null;
    protected DeQGeneralInfoDetailsPage deq_generalpage = null;
    protected TPCPage tpcPage = null;
    protected FDSPage fdsPage = null;
    protected HWDrawingPage hwdPage = null;
    protected DeQPowerDetailsPage powerPage = null;
    protected DeQProjectSpecificInfoDetailsPage deqprojectSpecificInfo_page = null;

    protected OverViewPage overView = null;
    protected DeQCabinetDeliveryDetailsPage deq_cabinetdeliverydetailpage = null;

    protected ProjectDefinitionPage project_definition = null;

    protected DeQCustomerDetailsPage deqPage = null;


    public IPEBaseTest() {
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
        elementsList.forEach(element -> Assertion.assertTrue(home_page.isElementVisible(
                element), element + " is not visible"));
    }

    protected void verifyElementsNotVisible(List<String> elementsList) {
        elementsList.forEach(element -> Assertion.assertFalse(home_page.isElementVisible(
                element), element + " is visible"));
    }


}