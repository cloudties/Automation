package com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.xpathconstants;

/**
 * @author Manjusha Saju
 */
public interface DeqGeneralDetailsCONSTANTS {
    public static String DEQGENERALINFOHEADER = "//h6[contains(.,'General Information')]";
    public static String DEQGENERALINFOSAFENET_YES = "//label[contains(@for,'radio319a6c1e-c38a-4f5d-96cf-d5bd4e8fbe7a0')]";
    public static String DEQGENERALINFOSAFENET_NO = "//label[contains(@for,'radio319a6c1e-c38a-4f5d-96cf-d5bd4e8fbe7a1')]";
    public static String DEQGENERALINFOSPECENVCONDITION_YES = "//label[contains(@for,'radio13Yes0')]";
    public static String DEQGENERALINFOSPECENVCONDITION_NO = "//label[contains(@for,'radio13No1')]";
    public static String DEQGENERALINFOSPECENVCONDITION_DESC = "(//textarea[contains(@rows,'4')])[2]";
    public static String DEQGENERALINFOSPECOPERCONDITION_YES = "//label[contains(@for,'radio14Yes0')]";
    public static String DEQGENERALINFOSPECOPERCONDITION_NO = "//label[contains(@for,'radio14No1')]";
    public static String DEQGENERALINFOSPECOPERCONDITION_DESC = "(//textarea[contains(@class,'form-control')])[2]";
    public static String DEQGENERALINFOCABREQSTANDERD_CE = "//label[contains(@for,'radio8faa0c6b-4eca-4a3d-92bf-7d5850fd7e300')]";
    public static String DEQGENERALINFOCABREQSTANDERD_CSA = "//label[contains(@for,'radio8faa0c6b-4eca-4a3d-92bf-7d5850fd7e301')]";
    public static String DEQGENERALINFOCABREQSTANDERD_UL = "//label[contains(@for,'radio8faa0c6b-4eca-4a3d-92bf-7d5850fd7e302')]";
    public static String DEQGENERALINFOSUPPLIERNAME_ABUDHABI = "//label[contains(@for,'radio6620b0c8-bd5c-4ec2-8739-9987c2f43a0f0')]";
    public static String DEQGENERALINFOSUPPLIERNAME_NETHERLANDS = "//label[contains(@for,'radio6620b0c8-bd5c-4ec2-8739-9987c2f43a0f1')]";
    public static String DEQGENERALINFOSUPPLIERNAME_HAIL = "//label[contains(@for,'radio6620b0c8-bd5c-4ec2-8739-9987c2f43a0f2')]";
    public static String DEQGENERALINFOSUPPLIERNAME_HOUSTON = "//label[contains(@for,'radio6620b0c8-bd5c-4ec2-8739-9987c2f43a0f3')]";
    public static String DEQGENERALINFO_SYSTEM_DCS = "//label[contains(@for,'radio181b518c-f251-45bc-b596-9f24868009c71')]";
    public static String DEQGENERALINFO_SYSTEM_EPKS = "//label[contains(@for,'radio181b518c-f251-45bc-b596-9f24868009c70')]";
    public static String DEQGENERALINFO_NOTPARTOFHW_DCSSCOPE = "(//span[contains(@class,'checkmark')])[1]}";
    public static String DEQGENERALINFO_NOTPARTOFHW_DCS_SMM = "(//span[contains(@class,'checkmark')])[2]";
    public static String DEQGENERALINFO_NOTPARTOFHW_DCS_FIBREOPTICS = "(//span[contains(@class,'checkmark')])[3]";
    public static String DEQGENERALINFO_NOTPARTOFHW_DCS_GRAPHDES = "(//span[contains(@class,'checkmark')])[4]";
    public static String DEQGENERALINFO_SB_RELEASENO = "//input[contains(@id,'b6c16ca3-7a17-4ec5-9ed9-f919d1c59b29')]";
    public static String DEQGENERALINFO_LOCATION = "//select[contains(@id,'question.id')]";

}