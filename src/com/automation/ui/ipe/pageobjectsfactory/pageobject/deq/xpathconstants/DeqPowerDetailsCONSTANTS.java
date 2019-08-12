package com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.xpathconstants;

/**
 * @author Manjusha Saju
 */
public interface DeqPowerDetailsCONSTANTS {


    public static String DEQPOWERINFOHEADER = "//h6[contains(.,'Power')]";

    public static String DEQPOWERUPS240VAC = "//label[contains(@for,'radio73f86339-79e1-49d8-8f1b-af7344d504b40')]";

    public static String DEQPOWERUPS120VAC = "//label[contains(@for,'radio73f86339-79e1-49d8-8f1b-af7344d504b41')]";

    public static String DEQPOWERUPSVOLLEVEL120VAC = "//label[contains(@for,'radioe09b4870-6c99-4730-b8e6-6ab90758cd9e0')]";
    public static String DEQPOWERUPSVOLLEVEL230VAC = "//label[contains(@for,'radioe09b4870-6c99-4730-b8e6-6ab90758cd9e1')]";
    public static String DEQPOWERUPSFTAYES = "//label[contains(@for,'radio83b0c4d0-6191-4c4b-851d-2dff468f9deb0')]";
    public static String DEQPOWERUPSFTANO = "//label[contains(@for,'radio83b0c4d0-6191-4c4b-851d-2dff468f9deb1')]";
    public static String DEQPOWERADD = "//span[contains(.,'+')]";
    public static String DEQPOWERADDROW = "//span[contains(.,'Add row')]";
    public static String DEQPOWEREDIT = "(//button[@type='button'])[1]";
    public static String DEQPOWERDELETE = "(//button[@type='button'])[1]";
    public static String DEQPOWERSAVEROW = "//button[@class='btn btn-transparent icon-check ng-star-inserted']";

    public static String DEQOUTPUTLOADDESC = "(//input[@type='text'])[5]";
    public static String DEQOUTPUTLOADCONSU = "(//input[@type='text'])[6]";
    public static String DEQOUTPUTLOADPOWER = "(//input[@type='text'])[7]";
    public static String DEQOUTPUTLOADSAVE = "(//button[@type='button'])[8]";
    public static String DEQOUTPUTLOADDELETE = "(//button[@type='button'])[9]";

    public static String DEQPOWERSAVE = "//button[contains(.,'Save Results')]";

}