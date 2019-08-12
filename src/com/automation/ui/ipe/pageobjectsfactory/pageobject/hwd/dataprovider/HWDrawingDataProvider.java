package com.automation.ui.ipe.pageobjectsfactory.pageobject.hwd.dataprovider;
/**
 * @author Manjusha Saju
 */

import org.testng.annotations.DataProvider;

public class HWDrawingDataProvider {

    public HWDrawingDataProvider() {

    }

    @DataProvider(name = "hwSearchStarter")
    public static final Object[][] getHWSearchStarter() {
        return new Object[][]
                {
                        {"SC"}
                };
    }

    @DataProvider(name = "hwSearch")
    public static final Object[][] getHWSearch() {
        return new Object[][]
                {
                        {"SC"}, {"LE"}, {"Ca"}
                };
    }
}
