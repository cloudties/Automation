package com.automation.ui.ipe.pageobjectsfactory.pageobject.hwd.xpathconstants;

/**
 * @author Manjusha Saju
 */
public interface HWDConstants {

    public static String SEARCHFORFILEINPUT = "//input[contains(@class,'form-control rounded-0')]";
    public static String SEARCHFORFILE = "//button[contains(@class,'btn btn-icon-gray icon search-icon rounded-0 mr-3')]";
    public static String GENERATE = "//button[@class='btn btn-primary float-right'][contains(.,'Generate')]";
    public static String CHECKALL = "(//input[contains(@type,'checkbox')])[1]";
    public static String PREVIOUS = "//a[contains(@id,'previous')]";
    public static String NEXT = "//a[contains(@id,'next')]";
    public static String GOTO = "//a[contains(@data-dt-idx,'1')]";


}
