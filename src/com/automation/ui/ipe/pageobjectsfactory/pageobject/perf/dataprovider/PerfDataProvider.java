package com.automation.ui.ipe.pageobjectsfactory.pageobject.perf.dataprovider;
/**
 * @author Manjusha Saju
 */

import org.testng.annotations.DataProvider;

public class PerfDataProvider {

    public PerfDataProvider() {

    }


    @DataProvider(name = "perfSearch")
    public static final Object[][] getPerfSearch() {
        return new Object[][]
                {
                        {"SC"}, {"SM"}
                };
    }
}
