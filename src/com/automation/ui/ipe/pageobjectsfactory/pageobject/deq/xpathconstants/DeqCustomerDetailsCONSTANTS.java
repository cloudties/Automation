package com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.xpathconstants;

/**
 * @author Manjusha Saju
 */
public interface DeqCustomerDetailsCONSTANTS {

    /**
     * IPE DEQ- XPaths from Section:Customer Information
     */


    public static String DEQCUSTOMERINFOHEADER = "//h6[contains(.,'Customer Information')]";
    public static String DEQCUSTOMERNAMEINPUT = "//input[contains(@id,'e3176ad6-4e59-4a0f-92e9-7378a00d7272')]";
    public static String DEQCUSTOMERNAMEINPUT_ALERT = " //span[contains(.,'Enter valid alpha-numeric value')]";
    public static String DEQPROJECTNAMEINPUT = "//input[contains(@id,'2ae45bd0-fa3b-4f41-9502-3587eda86bf7')]";
    public static String DEQEXPDELDATE = "//input[contains(@id,'fe073d62-b26f-4566-a371-1a036a27937d')]";
    public static String DEQCOMMCONTACTNAME = "//input[contains(@id,'7a4497a2-dec6-47b1-ab72-b26da85745a0')]";
    public static String DEQCOMMCONTACTEMAIL = "//input[contains(@id,'996996f1-e54d-4614-a0db-e2079265ef94')]";
    public static String DEQCOMMCONTACTPHNO = "//input[contains(@id,'inputPhone58428c7e-fb7c-4946-ad60-59bf162731a8')]";
    public static String DEQTECHCONTACTNAME = "//input[contains(@id,'3963c455-56b5-450f-8aea-3c86fb3b22a1')]";
    public static String DEQTECHCONTACTEMAIL = "//input[contains(@id,'347b9111-208d-421e-bd4a-dc8a0256c031')]";
    public static String DEQTECHCONTACTPHNO = "//input[contains(@id,'inputPhone1b57d116-2ff4-4bf9-aeab-601865f6bd25')]";
    public static String DEQPONUMBER = "//input[contains(@id,'e350f05b-0ec1-4475-80a8-7e2e06c62c98')]";
    public static String DEQDOCNUMBER = "//input[contains(@id,'b25f9044-4965-4ae3-8d49-3e4ae3e620dd')]";
    public static String DEQSPEPRESPMATRIXYES = "//label[@class='custom-control-label'][contains(.,'Yes')]";
    public static String DEQSPEPRESPMATRIXNO = "//label[@class='custom-control-label'][contains(.,'No')]";
    public static String DEQDOCCNTLINDNO = "//input[contains(@id,'9f118651-9c92-48d8-8e2b-5a8df98c24c1')]";
    public static String DEQENDUSERNAME = "//input[contains(@id,'a505444a-cc6f-4e6a-bd51-20c3f06e498b')]";
    public static String DEQOPERATORNAME = "//input[contains(@id,'f56021b7-1298-4a79-9603-ba5e3d33ebb3')]";

    public static String DEQCUSTINFOTECHCOUNTRYCODE = "(//select[contains(@class,'form-control')])[2]";
    public static String DEQCUSTINFOCOMMCOUNTRYCODE = "(//select[contains(@class,'form-control')])[1]";


}
