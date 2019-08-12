package com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.xpathconstants;

/**
 * @author Manjusha Saju
 */
public interface DeqDocumentDetailsCONSTANTS {


    /**
     * IPE DEQ- XPaths from Section:Document Information
     */
    public static String DEQDOCINFOHEADER = "//h6[contains(.,'Document Information')]";

    public static String DEQDOCSAVERESULT = "//button[@class='btn btn-primary mt-n1'][contains(.,'Save Results')]";
    public static String DEQDOCINFOPLANTADDRESS = "//textarea[contains(@id,'21681f62-d764-498a-b622-98cf7a267e0a')]";
    public static String DEQDOCINFOPLANTLOCATION = "//textarea[contains(@id,'645528b2-8041-4752-a766-3407dda773e4')]";
    public static String DEQDOCINFOSISLENAME = "//input[contains(@id,'90e53152-2acf-41e1-8f2c-0bab5819792f')]";
    public static String DEQDOCINFOSISLEDIGSIGNBROWSE = "(//strong[@style='padding-left: 1rem;'][contains(.,'Browse')])[1]";
    //public static String DEQDOCINFOSISLEDIGSIGNBROWSE ="(//label[contains(.,'Browse & upload the file refrence')])[1]";


    public static String DEQDOCINFOSISLEPOS = "//input[contains(@id,'3b93aa87-8073-44a9-bee1-42ed11043b5a')]";
    public static String DEQDOCINFOAUTHORDATE = "//input[contains(@id,'c5c0fd6e-cce3-411f-9722-49f5726337b6')]";
    public static String DEQDOCINFOSISENGNAME = "//input[contains(@id,'d6d1c7e8-1a3c-48af-86a3-a021ad0f5384')]";
    public static String DEQDOCINFOSISENGSIGNBROWSE = "(//strong[@style='padding-left: 1rem;'][contains(.,'Browse')])[2]";
    public static String DEQDOCINFOSISENGPOS = "//input[contains(@id,'baac1540-e9f3-40a2-8297-c4c53d4e237e')]";
    public static String DEQDOCINFOREVIEWDATE = "//input[contains(@id,'dee60723-3b58-41aa-8d6f-c16528e2d614')]";
    public static String DEQDOCINFODOCAPPROVERNAME = "//input[contains(@id,'cc83b451-c82c-4fd4-91f1-4d00e67ae531')]";
    public static String DEQDOCINFODOCAPPRVBROWSE = "(//strong[@style='padding-left: 1rem;'][contains(.,'Browse')])[3]";
    public static String DEQDOCINFODOCAPPROVERPOS = "//input[contains(@id,'a5642f27-8fb2-4f3d-8fed-a24be21b63aa')]";
    public static String DEQDOCINFODOCSTATUS = "//input[contains(@id,'c77a8e2b-9637-472c-81cc-0ec38bf0cb79')]";
    public static String DEQDOCINFODOCAPPRVDDATE = "//input[contains(@id,'f1903316-2422-4bba-9739-0b54a2457cfc')]";
    public static String DEQDOCINFODOCREV = "//input[contains(@id,'d9c76954-3872-4729-bdc8-c8e865cfc327')]";
    public static String DEQDOCINFODOCCREATEDATE = "//input[contains(@id,'ccac50d0-9197-484f-b315-c9d6616b92f6')]";
    public static String DEQDOCINFOREFDOCDELETEA = "(//span[@aria-hidden='true'][contains(.,'×')])[1]";
    public static String DEQDOCINFOREFDOCDELETEB = "(//span[@aria-hidden='true'][contains(.,'×')])[2]";
    public static String DEQDOCINFOREFDOCDELETEC = "(//span[@aria-hidden='true'][contains(.,'×')])[3]";
    public static String DEQDOCINFOREFDOCDELETED = "(//span[@aria-hidden='true'][contains(.,'×')])[4]";
    public static String DEQDOCINFOREFDOCDELETEE = "(//span[@aria-hidden='true'][contains(.,'×')])[5]";
    public static String DEQDOCINFOREFDOCDELETEF = "(//span[@aria-hidden='true'][contains(.,'×')])[6]";
    public static String DEQDOCINFOREFDOCADDROW = "(//span[@class='text-primary h4 '][contains(.,'+')])[2]";
    public static String DEQDOCINFOSYSARCHSPCREF = "//input[contains(@id,'79969e5d-3dd6-4a68-ac8e-6586d9e763a1')]";
    public static String DEQDOCINFOSPEPREF = "//input[contains(@id,'0fcb77d5-6e20-4716-8525-48ac897c5423')]";
    public static String DEQDOCINFOSDDSREF = "//input[contains(@id,'8ec4b37f-0dae-428a-975f-77c715674728')]";
    public static String DEQDOCINFOSISLEAUTHORSIGNDEL = "(//label[@class='btn btn-file-delete text-muted ng-star-inserted'][contains(.,'X')])[1]";
    public static String DEQDOCINFOSISENGREVIEWSIGNDEL = "(//label[@class='btn btn-file-delete text-muted ng-star-inserted'][contains(.,'X')])[2]";
    public static String DEQDOCINFODOCAPPRVSIGNDEL = "(//label[@class='btn btn-file-delete text-muted ng-star-inserted'][contains(.,'X')])[3]";

    /*
       Enter Rev History - Add Row XPaths
     */
    public static String DEQDOCINFOREVHISTADDROW = "(//span[@class='text-dark pl-2'][contains(.,'Add row')])[1]";
    public static String DEQDOCINFOREVHISTORYPLUSSIGN = "(//span[@class='text-primary h4 '][contains(.,'+')])[1]";

    //XPATH for revesion history  row 1  elements

    public static String DEQDOCINFOREVHISTORYREVINPUTROW1 = "(//input[contains(@type,'text')])[5]";
    // (//input[contains(@class,'form-control ng-untouched ng-pristine ng-valid ng-star-inserted')])[1];
    public static String DEQDOCINFOREVHISTORYDATEROW1 = "(//input[contains(@type,'date')])[5]";
    //(//input[contains(@class,'form-control ng-untouched ng-pristine ng-valid ng-star-inserted')])[2]";
    public static String DEQDOCINFOREVHISTORYDESCROW1 = "(//input[contains(@type,'text')])[6]";
    // (//input[contains(@class,'form-control ng-untouched ng-pristine ng-valid ng-star-inserted')])[3]";
    public static String DEQDOCINFOREVHISTORYORINITATEDBYROW1 = "(//input[contains(@type,'text')])[7]";
    //(//input[@class='form-control ng-pristine ng-valid ng-star-inserted ng-touched'])[4]";

    //XPATH for revesion history  row 2  elements
    public static String DEQDOCINFOREVHISTORYREVINPUTROW2 = "(//input[contains(@type,'text')])[8]";
    // (//input[contains(@class,'form-control ng-untouched ng-pristine ng-valid ng-star-inserted')])[1];
    public static String DEQDOCINFOREVHISTORYDATEROW2 = "(//input[contains(@type,'date')])[6]";
    //(//input[contains(@class,'form-control ng-untouched ng-pristine ng-valid ng-star-inserted')])[2]";
    public static String DEQDOCINFOREVHISTORYDESCROW2 = "(//input[contains(@type,'text')])[9]";
    // (//input[contains(@class,'form-control ng-untouched ng-pristine ng-valid ng-star-inserted')])[3]";
    public static String DEQDOCINFOREVHISTORYORINITATEDBYROW2 = "(//input[contains(@type,'text')])[10]";
    //(//input[@class='form-control ng-pristine ng-valid ng-star-inserted ng-touched'])[4]";

    public static String DEQDOCINFOREVHISTORYSAVEBUTTON_ROW1 = "(//button[contains(@type,'button')])[2]";
    // //button[contains(@class,'btn btn-transparent icon-check ng-star-inserted')]";
    public static String DEQDOCINFOREVHISTORYSAVEBUTTON_ROW2 = "(//button[contains(@type,'button')])[4]";
    // //button[contains(@class,'btn btn-transparent icon-check ng-star-inserted')]";


    public static String DEQDOCINFOREVHISTORYEDITROW1 = "(//button[contains(@class,'btn btn-transparent icon-edit ng-star-inserted')])[1]";
    public static String DEQDOCINFOREVHISTORYEDITROW2 = "(//button[contains(@class,'btn btn-transparent icon-edit ng-star-inserted')])[2]";


    /*
    Add Reference Documents - Add Row XPaths

    */
    //XPATH for revesion history  row 1  elements
    public static String DEQDOCINFODOCREFADDROW = "(//span[@class='text-dark pl-2'][contains(.,'Add row')])[2]";
    public static String DEQDOCINFODOCREFADDROWPLUSSIGN = "(//span[@class='text-primary h4 '][contains(.,'+')])[2]";

    //XPATH for first row elements
    public static String DEQDOCINFODOCREFREFINPUTROW1 = "(//input[contains(@type,'text')])[6]";
    public static String DEQDOCINFODOCREFIDROW1 = "(//input[contains(@type,'text')])[7]";
    public static String DEQDOCINFODOCREFTITLEROW1 = " (//input[contains(@type,'text')])[8]";
    public static String DEQDOCINFODOCREFREMARKROW1 = "(//input[contains(@type,'text')])[9]";

    //XPATH for revesion history  row 2 elements
    public static String DEQDOCINFODOCREFREFINPUTROW2 = "(//input[contains(@type,'text')])[10]";
    public static String DEQDOCINFODOCREFIDROW2 = "(//input[contains(@type,'text')])[11]";
    public static String DEQDOCINFODOCREFTITLEROW2 = " (//input[contains(@type,'text')])[12]";
    public static String DEQDOCINFODOCREFREMARKROW2 = "(//input[contains(@type,'text')])[13]";

    public static String DEQDOCINFODOCREFSAVEBUTTON_ROW1 = "(//button[contains(@type,'button')])[13]";
    public static String DEQDOCINFODOCREFSAVEBUTTON_ROW2 = "(//button[contains(@type,'button')])[15]";

}
