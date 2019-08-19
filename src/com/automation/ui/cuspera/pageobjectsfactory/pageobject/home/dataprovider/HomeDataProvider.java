package com.automation.ui.cuspera.pageobjectsfactory.pageobject.home.dataprovider;
/**
 * @author
 */

import com.automation.ui.cuspera.pageobjectsfactory.pageobject.base.Industry;
import org.testng.annotations.DataProvider;
import com.automation.ui.cuspera.pageobjectsfactory.pageobject.home.vo.*;
import com.automation.ui.cuspera.pageobjectsfactory.pageobject.base.*;



public class HomeDataProvider {

    public HomeDataProvider() {

    }

    @DataProvider(name = "initSearchStarter")
    public static final Object[][] getSearchStarter() {

        InitialSearchVO initSearchVo1= new InitialSearchVO();
         initSearchVo1.setSelectIndustry(Industry.INDUSTRY_COMPUTER_SOFTWARE);

        initSearchVo1.setSelectMarketNeeded("lead");

        initSearchVo1.setSelectBusinessGoal(Goals.GOAL_INCREASE_REVENUE);


        return new Object[][]
                {
                        {initSearchVo1}
                };
    }



}
