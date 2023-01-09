package com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.base;

public enum Goals {



    GOAL_INCREASE_REVENUE("Increase revenue"),
    GOAL_ACQUIRE_CUSTOMERS("Acquire customers"),
    GOAL_IMPROVE_MARKETING_ROI("Improve marketing ROI");
     private String goal;

    Goals(String type) {
        this.goal = type;
    }

    public String getGoal() {
        return this.goal;
    }

    @Override
    public String toString() {
        return this.goal;
    }
}