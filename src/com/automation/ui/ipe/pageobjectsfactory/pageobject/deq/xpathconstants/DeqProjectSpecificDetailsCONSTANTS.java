package com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.xpathconstants;

/**
 * @author Manjusha Saju
 */
public interface DeqProjectSpecificDetailsCONSTANTS {
    public static String DEQPROJSPECINFOHEADER = "//h6[contains(.,'Project Specific Information')]";
    public static String DEQPROJSPECINFOTEXTBOX = "//textarea[contains(@id,'e23d8b41-f8c2-46d5-b3c7-b306929d5c75')]";
    public static String DEQPROJSPECINFOEARTHLEAKAGEDETECTOR_YES = "//label[contains(@for,'radio42a23e87-7245-4a64-afe6-83c7fb35db8e0')]";
    public static String DEQPROJSPECINFOEARTHLEAKAGEDETECTOR_NO = "//label[contains(@for,'radio42a23e87-7245-4a64-afe6-83c7fb35db8e1')]";
    public static String DEQPROJSPECINFOHIGHTEMPALARM = "//input[contains(@id,'715ff6fa-db5e-4f93-b094-327284b1c3fe')]";
    public static String DEQPROJSPECINFO2OO3AI_YES = "//label[contains(@for,'radio1b4c6462-c67a-4950-b6f9-0a17583024810')]";
    public static String DEQPROJSPECINFO2OO3AI_NO = "//label[contains(@for,'radio1b4c6462-c67a-4950-b6f9-0a17583024811')]";
    public static String DEQPROJSPECINFO2OO2DI_YES = "//label[contains(@for,'radio2fe24aec-22cc-4630-8d09-6db0ac1047990')]";
    public static String DEQPROJSPECINFO2OO2DI_NO = "//label[contains(@for,'radio2fe24aec-22cc-4630-8d09-6db0ac1047991')]";
    public static String DEQPROJSPECINFOSUBPROJNAME = "//input[contains(@id,'15e113fd-2cfd-4481-8ae5-545a29e53350')]";
    public static String DEQPROJSPECINFOSSAOD_BROWSE = "//strong[@style='padding-left: 1rem;'][contains(.,'Browse')]";
    public static String DEQPROJSPECINFOSSAOD_DELETE = "//label[@class='btn btn-file-delete text-muted ng-star-inserted'][contains(.,'X')]";

    public static String DEQPROJSPECINFOHWDESIGNRESPONS_CHECK1 = "(//span[contains(@class,'checkmark')])[1]";
    public static String DEQPROJSPECINFOHWDESIGNRESPONS_CHECK2 = "(//span[contains(@class,'checkmark')])[2]";
    public static String DEQPROJSPECINFOHWDESIGNRESPONS_CHECK3 = "(//span[contains(@class,'checkmark')])[3]";
    public static String DEQPROJSPECINFOHWDESIGNRESPONS_CHECK4 = "(//span[contains(@class,'checkmark')])[4]";
    public static String DEQPROJSPECINFOHWDESIGNRESPONS_CHECK5 = "(//span[contains(@class,'checkmark')])[5]";

    public static String DEQPROJSPECINFOOWNERDESIGNRESPONS_CHECK1 = "(//span[contains(@class,'checkmark')])[6]";
    public static String DEQPROJSPECINFOOWNERDESIGNRESPONS_CHECK2 = "(//span[contains(@class,'checkmark')])[7]";
    public static String DEQPROJSPECINFOOWNERDESIGNRESPONS_CHECK3 = "(//span[contains(@class,'checkmark')])[8]";
    public static String DEQPROJSPECINFOOWNERDESIGNRESPONS_CHECK4 = "(//span[contains(@class,'checkmark')])[9]";

    public static String DEQPROJSPECINFOHWSCOPEOFSUPPLY_CHECK1 = "(//span[contains(@class,'checkmark')])[10]";
    public static String DEQPROJSPECINFOHWSCOPEOFSUPPLY_CHECK2 = "(//span[contains(@class,'checkmark')])[11]";

    //drag and drop xpath for getting an arrays in list in the drag and drops list
    public static String DEQPROJSPECINFODRAGANDDROP_LIST = "(//div[contains(@class,'list-item cdk-drag ng-star-inserted')])";
}