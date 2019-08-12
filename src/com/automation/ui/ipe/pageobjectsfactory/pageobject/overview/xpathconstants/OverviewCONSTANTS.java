package com.automation.ui.ipe.pageobjectsfactory.pageobject.overview.xpathconstants;

import com.automation.ui.ipe.pageobjectsfactory.pageobject.home.xpathconstants.HomeConstants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public interface OverviewCONSTANTS {
    public String CABINETCHECKBOXALL = "(//input[contains(@type,'checkbox')])[1]";
    public String CABINETCHECKBOX = "(//input[contains(@type,'checkbox')])[2]";
    public String CABINETCHECKBOXA = "(//a[@class='text-primary h3'][contains(.,'+')])[1]";
    public String ASSIGNOWNER = "(//input[contains(@type,'checkbox')])[2]";
    public String DOCTITLELINK = "(//a[@class='text-primary'][contains(.,'Document Title Link')])[1]";

    public String OWNERFROMLIST = "//input[contains(@class,'form-control ng-untouched ng-pristine ng-valid')]";
    public String OWNERASSIGNCANCEL = "//button[@class='btn btn-outline-primary btn-sm'][contains(.,'Cancel')]";
    public String OWNERASSIGN = "//button[@class='btn btn-primary btn-sm'][contains(.,'Assign')]";



    public String PAGELINK = "//a[contains(.,'Page Link')]";
    public String SERGREGATION = "//div[@title='Segregation']";
    public String SAVE = "//button[contains(.,'Save Results')]";
    public String FAIL ="//label[contains(.,'Fail')]";
    public String INPUTVOLTAGE = "//textarea[@class='form-control']";

}
