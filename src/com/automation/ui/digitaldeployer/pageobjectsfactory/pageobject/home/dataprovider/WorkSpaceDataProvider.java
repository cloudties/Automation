package com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.home.dataprovider;
/**
 * @author
 */

import com.automation.ui.digitaldeployer.common.dataprovider.BaseDataProvider;
import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.base.Industry;
import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.home.vo.InitialVO;
import org.testng.annotations.DataProvider;


public class WorkSpaceDataProvider extends BaseDataProvider {

    public WorkSpaceDataProvider() {

    }

    @DataProvider(name = "initWS")
    public static final Object[][] getWS() {

        InitialVO initSearchVo1= new InitialVO();
         initSearchVo1.setSelectIndustry(Industry.INDUSTRY_COMPUTER_SOFTWARE);

        return new Object[][]
                {
                        {initSearchVo1}
                };
    }



}
