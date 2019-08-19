package com.automation.ui.cuspera.pageobjectsfactory.pageobject.context.dataprovider;
/**
 * @author
 */

import com.automation.ui.cuspera.pageobjectsfactory.pageobject.base.Goals;
import com.automation.ui.cuspera.pageobjectsfactory.pageobject.base.Industry;
import com.automation.ui.cuspera.pageobjectsfactory.pageobject.context.vo.ContextVO;
import org.testng.annotations.DataProvider;


public class ContextDataProvider {

    public ContextDataProvider() {

    }



    @DataProvider(name = "initContextStarter")
    public static final Object[][] getContextStarter() {

        ContextVO initContextVo1= new ContextVO();

        return new Object[][]
                {
                        {initContextVo1}
                };
    }



}
