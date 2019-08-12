package com.automation.ui.ipe.pageobjectsfactory.pageobject.fds.dataprovider;
/**
 * @author Manjusha Saju
 */

import org.testng.annotations.DataProvider;

public class FDSDataProvider {

    public FDSDataProvider() {

    }

    @DataProvider(name = "fdsSearchStarter")
    public static final Object[][] getFDSSearchStarter() {
        return new Object[][]
                {
                        {"FDS"}
                };
    }


    @DataProvider(name = "fdsSearch")
    public static final Object[][] getFDSSearch() {
        return new Object[][]
                {
                        {"ABC"}, {"FDS"}, {"SC"}
                };
    }
}
