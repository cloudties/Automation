package com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.home.dataprovider;
/**
 * @author
 */

import com.automation.ui.digitaldeployer.common.dataprovider.BaseDataProvider;
import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.base.Goals;
import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.base.Industry;
import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.home.vo.InitialVO;
import org.testng.annotations.DataProvider;


public class HomeDataProvider extends BaseDataProvider {

    public HomeDataProvider() {

    }

    @DataProvider(name = "initSearchStarter")
    public static final Object[][] getSearchStarter() {

        InitialVO initSearchVo1= new InitialVO();
         initSearchVo1.setSelectIndustry(Industry.INDUSTRY_COMPUTER_SOFTWARE);

        return new Object[][]
                {
                        {initSearchVo1}
                };
    }



}
