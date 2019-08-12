package com.automation.ui.cuspera.pageobjectsfactory.pageobject.base;

public enum Industry {

    INDUSTRY_AUTOMOTIVE("Automotive"),
    INDUSTRY_BANKING("Banking"),
    INDUSTRY_COMPUTER_SOFTWARE("Computer Software");

    private String industry;

    Industry(String type) {
        this.industry = type;
    }

    public String getIndustry() {
        return this.industry;
    }

    @Override
    public String toString() {
        return this.industry;
    }
}