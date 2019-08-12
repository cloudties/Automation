package com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.xpathconstants;

/**
 * @author Manjusha Saju
 */
public interface DeqCommonDetailsCONSTANTS {

    /**
     * IPE DEQ- XPaths common for DEQ
     */

    public static String DEQCUSTINFO = "//div[@title='Customer Information']";
    public static String DEQDOCINFOSECTIONNAME = "//div[contains(@title,'Document Information')]";
    public static String DEQCABINETDELINFOSECTIONNAME = "//div[contains(@title,'Cabinet Delivery Information')]";
    public static String DEQGENERLINFOSECTIONNAME = "//div[contains(@title,'General Information')]";
    public static String DEQCOMMUNICATIONSECTIONNAME = "//div[contains(@title,'Communication')]";
    public static String DEQPOWERSECTIONNAME = "//div[contains(@title,'Power')]";
    public static String DEQHARDWARESETUPSECTIONNAME = "//div[contains(@title,'Hardware Setup')]";
    public static String DEQPROJECTSPECINFOSECTIONNAME = "//div[contains(@title,'Project Specific Information')]";
    public static String DEQPREVIEWSECTIONNAME = "//div[contains(@title,'Preview')]";


    public static String DEQPROGRESSBAR = "//div[contains(@class,'progress-bar')]";

    public static String DEQSAVEALERTYES = "//button[contains(.,'Yes')]";
    public static String DEQSAVEALERTNO = "//button[contains(.,'No')]";

    public static String DEQINFO = "//span[@class='ml-2'][contains(.,'DEQ')]";
    public static String DEQGENSAVEANDCONTINUE = "//button[contains(.,'Save Results')]";


    public static String DEQSAVEANDCONTINUE = "//button[@class='btn btn-primary mt-n1'][contains(.,'Save Results')]";
    public static String DEQDOCINFO_PAGE = "//div[@title='Document Information']";

    public static String DEQCABDELINFO_PAGE = "//div[@title='Cabinet Delivery Information']";

    public static String DEQGENERALINFO_PAGE = "//div[@title='General Information']";
    public static String DEQCUSTINFOSTATUS = "//h4[contains(.,'Status')]";
    public static String DEQPREVPAGE = "//button[@class='btn btn-primary mt-n1 ng-star-inserted'][contains(.,'Previous Page')]";
    //public static String DEQPROGRESSBAR = "//div[@class='progress']";
}
