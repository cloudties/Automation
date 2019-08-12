package com.automation.ui.ipe.pageobjectsfactory.pageobject.tpc.dataprovider;
/**
 * @author Manjusha Saju
 */

import org.testng.annotations.DataProvider;

public class TPCDataProvider {

    public TPCDataProvider() {

    }

    @DataProvider(name = "tpcSearchStarter")
    public static final Object[][] getTPCSearchStarter() {
        return new Object[][]
                {
                        {"SC"}
                };
    }

    @DataProvider(name = "tpcSearch")
    public static final Object[][] getTPCSearch() {
        return new Object[][]
                {
                        {"SC"}, {"SM"}, {"3"}
                };
    }
}
