package com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.home.vo;

import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.base.Goals;
import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.base.Industry;

public class InitialVO {

    public Industry selectIndustry;
    public String selectMarketNeeded;
    public Goals selectBusinessGoal;


    public Industry getSelectIndustry() {
        return selectIndustry;
    }

    public void setSelectIndustry(Industry selectIndustry) {
        this.selectIndustry = selectIndustry;
    }

    public String getSelectMarketNeeded() {
        return selectMarketNeeded;
    }

    public void setSelectMarketNeeded(String selectMarketNeeded) {
        this.selectMarketNeeded = selectMarketNeeded;
    }

    public Goals getSelectBusinessGoal() {
        return selectBusinessGoal;
    }

    public void setSelectBusinessGoal(Goals selectBusinessGoal) {
        this.selectBusinessGoal = selectBusinessGoal;
    }


}
