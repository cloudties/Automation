package com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.vo;

/**
 * @author Manjusha Saju
 */


public class DeqHWSetupInfoVO {

    //20% =1
    //others =0
    private int requiredspareIOcapacity = 0;

    public int getRequiredspareIOcapacity() {
        return requiredspareIOcapacity;
    }

    public void setRequiredspareIOcapacity(int requiredspareIOcapacity) {
        this.requiredspareIOcapacity = requiredspareIOcapacity;
    }

    public int getHowManySeparateController() {
        return howManySeparateController;
    }

    public void setHowManySeparateController(int howManySeparateController) {
        this.howManySeparateController = howManySeparateController;
    }

    public int getPercentagesparemodeulePosition() {
        return percentagesparemodeulePosition;
    }

    public void setPercentagesparemodeulePosition(int percentagesparemodeulePosition) {
        this.percentagesparemodeulePosition = percentagesparemodeulePosition;
    }

    public int getPercentagecustomsparecapacity() {
        return percentagecustomsparecapacity;
    }

    public void setPercentagecustomsparecapacity(int percentagecustomsparecapacity) {
        this.percentagecustomsparecapacity = percentagecustomsparecapacity;
    }

    private int percentagecustomsparecapacity = 0;

    private int howManySeparateController = 0;


    private int percentagesparemodeulePosition;

}
