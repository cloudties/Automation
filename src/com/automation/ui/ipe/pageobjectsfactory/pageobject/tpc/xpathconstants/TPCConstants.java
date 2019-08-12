package com.automation.ui.ipe.pageobjectsfactory.pageobject.tpc.xpathconstants;

/**
 * @author Manjusha Saju
 */
public interface TPCConstants {

    public static String SEARCHFORFILEINPUT = "//input[contains(@class,'form-control rounded-0')]";
    public static String SEARCHFORFILE = "//button[contains(@class,'btn btn-icon-gray icon search-icon rounded-0 mr-3')]";
    public static String UPLOADIMAGE = "//img[@src='./assets/images/upload-file.svg']";
    public static String UPLOADTEXT = "//label[@class='upload-text'][contains(.,'Upload')]";
    public static String CHECKALL = "(//input[contains(@type,'checkbox')])[1]";
    public static String PREVIOUS = "//a[contains(@id,'previous')]";
    public static String NEXT = "//a[contains(@id,'next')]";
    public static String GOTO = "//a[contains(@data-dt-idx,'1')]";
    public static String CHECK_ITEM1 = "(//input[contains(@type,'checkbox')])[2]";

    public static String TPCGENERATEDRAWING_BTN = "//button[contains(.,'Generate Drawings')]";
    public static String TPCDOWNLOAD_BTN = "//button[contains(.,'Download')]";
    public static String TPCDELETE_BTN = "//button[contains(.,'Delete')]";
    public static String TPCDELETE_ICON = "//button[contains(@class,'btn btn-primary btn-close')]";

}
