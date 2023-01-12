package com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.index.dataprovider;
/**
 * @author
 */

import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.base.Industry;
import org.testng.annotations.DataProvider;
import com.automation.ui.digitaldeployer.common.dataprovider.BaseDataProvider;
import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.index.vo.*;
import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.base.*;



public class IndexDataProvider  extends BaseDataProvider {

    public IndexDataProvider() {

    }

    @DataProvider(name = "initSearchStarter")
    public static final Object[][] getSearchStarter() {

        InitialSearchVO initSearchVo1= new InitialSearchVO();
         initSearchVo1.setSelectIndustry(Industry.INDUSTRY_COMPUTER_SOFTWARE);

        return new Object[][]
                {
                        {initSearchVo1}
                };
    }



}
