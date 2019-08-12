package com.automation.ui.ipe.pageobjectsfactory.pageobject.project.xpathconstants;

/**
 * @author Manjusha Saju
 */
public interface ProjectDefinitionConstants {

    public static String CREATEPROJECTDROPDOWNARROW = "//div[@class='mat-select-arrow']";
    public static String CREATENEWPROEJCT = "//span[@class='mat-option-text'][contains(.,'Create New Project')]";
    public static String PROJECTID = "//input[contains(@formcontrolname,'projectId')]";
    public static String PROJECTNAME = "//input[contains(@formcontrolname,'projectName')]";
    public static String PROJECTDESCRIPTION = "//input[contains(@formcontrolname,'projectDescription')]";
    public static String CUSTOMERNAME = "//input[contains(@formcontrolname,'customerName')]";
    public static String PONUMBER = "//input[contains(@formcontrolname,'poNumber')]";
    public static String PROJECTNUMBER = "//input[contains(@formcontrolname,'projectNumber')]";
    // public static String CREATEPROJECTBUTTON = "//button[contains(.,'Create')]";
    public static String CREATEPROJECTBUTTON = "//button[@class='btn btn-primary btn-sm'][contains(.,'Create')]";
    public static String CANCELPROJECTBUTTON = "//button[@class='btn btn-outline-primary btn-sm'][contains(.,'Cancel')]";
    public static String PROJECTIDALERTMSG = "//small[contains(.,'Project Id is required')]";
    public static String PROJECTNAMEALERTMSG = "//small[contains(.,'Project Name is required')]";
    public static String PROJECTDESCALERTMSG = "//small[contains(.,'Project Description is required')]";
    public static String CUSTOMERNAMEALERTMSG = "//small[contains(.,'Customer Name is required')]";
    public static String PONUMBERALERTMSG = "//small[contains(.,'P O Number is required')]";
    public static String PROJECTNUMBERALERTMSG = "//small[contains(.,'Project Number is required')]";

}
