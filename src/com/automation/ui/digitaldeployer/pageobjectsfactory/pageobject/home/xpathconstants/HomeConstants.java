package com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.home.xpathconstants;

public interface HomeConstants {

    public static String CREATEWSAPP = "//span[contains(text(),'Create')]";

    public static String ADDNEWWS = "//span[contains(text(),'Add New Workspace')]";
    public static String ADDNEWAPPS = "//span[contains(text(),'Add New Application')]";

    public static String WSNAME = "//input[@placeholder='Enter Workspace name']";

    public static String ADDAPP ="//span[text()='Add New Application']";
    public static String ADDAPPNAME ="//span[text()='Add New Application']";
    public static String WORKSPACEDROPDOWN ="//div[@justifycontent='space-between']//select[1]";

    public static String CREATEWS="//span[text()='Create']";
    public static String SEARCHTEXT="//input[contains(@class,'text-grey m-0')]";

    public static String OVERVIEW ="(//li[@class='m-3']//a)[1]";

    public static String API="(//li[@class='m-3']//a)[3]";

    public static String CLEARALL="//span[text()='Clear All']";

    public static String DOCUMNETATION="(//li[@class='m-3']/following-sibling::li)[3]";

    public static String CANCELWS="//span[text()='Cancel']";

}