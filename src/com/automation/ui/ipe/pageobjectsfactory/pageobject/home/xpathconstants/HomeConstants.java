package com.automation.ui.ipe.pageobjectsfactory.pageobject.home.xpathconstants;

/**
 * @author Manjusha Saju
 */
public interface HomeConstants {

    //xpath for internationlosation implemetation
    //public static String DEQPOWERINFOHEADER1 = XPATHPropertyReader.readProperty("en").getValue("DASHBOARD_HOMEPAGE_IMG");

    public static String DASHBOARD_HOMEPAGE_IMG = "//img[@src='assets/images/dashboard.svg']";
    public static String DEQMENUBUTTON_HOMEPAGE_IMG = "//img[@src='assets/images/BEDQ.svg']";
    public static String TPCMENUBUTTON_HOMEPAGE_IMG = "//img[@src='assets/images/TPC.svg']";
    public static String LANDING_HOMEPAGE_IMG = "//img[@src='assets/images/ic_honeywell_logo.svg']";
    public static String BOMMENUBUTTON_HOMEPAGE_IMG = "//img[@src='assets/images/BOM.svg']";
    public static String RFQMENUBUTTON_HOMEPAGE_IMG = "//img[@src='assets/images/RFQ.svg']";
    public static String FDSMENUBUTTON_HOMEPAGE_IMG = "//img[@src='assets/images/FDS.svg']";
    public static String HWDMENUBUTTON_HOMEPAGE_IMG = "//img[@src='assets/images/HW Drawings.svg']";
    public static String PERFCMENUBUTTON_HOMEPAGE_IMG = "//img[@src='assets/images/Perf Calc.svg']";
    public static String OVERVIEWMENUBUTTON_HOMEPAGE_IMG = "//img[@src='assets/images/Test Procedures.svg']";
    public static String SETTINGMENUBUTTON_HOMEPAGE_IMG = "//img[@src='assets/images/Settings.svg']";
    public static String LOGOUTMENUBUTTON_HOMEPAGE_IMG = "//img[@src='assets/images/Logout.svg']";

    public static String DASHBOARD_TITLE = "//h4[contains(.,'Dashboard')]";

    public static String DASHBOARD_HOMEPAGE = "//span[contains(.,'Dashboard')]";
    public static String DEQMENUBUTTON_HOMEPAGE = "//span[contains(.,'DEQ')]";
    public static String TPCMENUBUTTON_HOMEPAGE = "//span[contains(.,'TPC')]";
    public static String BOMMENUBUTTON_HOMEPAGE = "//span[contains(.,'BOM')]";
    public static String RFQMENUBUTTON_HOMEPAGE = "//span[contains(.,'RFQ')]";
    public static String FDSMENUBUTTON_HOMEPAGE = "//span[contains(.,'FDS')]";
    public static String HWDMENUBUTTON_HOMEPAGE = "//span[contains(.,'HW Drawings')]";
    public static String PERFCMENUBUTTON_HOMEPAGE = "//span[contains(.,'Perf Calculations')]]";
    public static String OVERVIEWMENUBUTTON_HOMEPAGE = "//span[contains(.,'Overview')]";
    public static String SETTINGMENUBUTTON_HOMEPAGE = "//span[contains(.,'Settings')]";
    public static String LOGOUTMENUBUTTON_HOMEPAGE = "//span[contains(.,'Logout')]";
    public static String HWDRAWINGALERTMSG_HOMEPAGE = "//div[contains(@class,'alert alert-info mb-2 ng-star-inserted')]";


}
