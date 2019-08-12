package com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.xpathconstants;

/**
 * @author Manjusha Saju
 */
public interface DeqCommunicationDetailsCONSTANTS {

    public static String DEQCOMMUNICATIONHEADER = "//h6[contains(.,'Communication')]";
    public static String DEQCABCOMMUNICATIONCDA_YES = "//label[contains(@for,'radiod6459456-1d15-47e8-9227-2475a6215a9e0')]";
    public static String DEQCABCOMMUNICATIONCDA_NO = "//label[contains(@for,'radiod6459456-1d15-47e8-9227-2475a6215a9e1')]";
    public static String DEQCABCOMMUNICATIONFDM_YES = "//label[contains(@for,'radiob19c01fc-8989-4a52-bb97-4f8769f70b670')]";
    public static String DEQCABCOMMUNICATIONFDM_NO = "//label[contains(@for,'radiob19c01fc-8989-4a52-bb97-4f8769f70b671')]";
    public static String DEQCABCOMMUNICATIONTIMEPROTOCOL_NTP = "//label[contains(@for,'radiob329eb48-7d83-43e2-94db-52a9f45ead890')]";
    public static String DEQCABCOMMUNICATIONTIMEPROTOCOL_PTP = "//label[contains(@for,'radiob329eb48-7d83-43e2-94db-52a9f45ead891')]";
    public static String DEQCABCOMMUNICATIONFIBEROPTICS_YES = "//label[contains(@for,'radio9705523c-63a4-4928-88de-f231ba94251e0')]";
    public static String DEQCABCOMMUNICATIONFIBEROPTICS_NO = "//label[contains(@for,'radio9705523c-63a4-4928-88de-f231ba94251e1')]";
    public static String DEQCABCOMMUNICATIONFIBERMODUS_SINGLE = "//label[contains(@for,'radio81694208-7f1e-4c6c-9b93-ea32ca37222b1')]";
    public static String DEQCABCOMMUNICATIONFIBERMODUS_MULTI = "//label[contains(@for,'radio81694208-7f1e-4c6c-9b93-ea32ca37222b0')]";
    public static String DEQCABCOMMUNICATIONINGRESPROTECTION_43 = "//label[@class='custom-control-label'][contains(.,'43 (IP 43)')]";
    public static String DEQCABCOMMUNICATIONINGRESPROTECTION_55 = "//label[contains(@for,'radio4854f2a3-eacd-419f-8a24-283f640c90811')]";
}
