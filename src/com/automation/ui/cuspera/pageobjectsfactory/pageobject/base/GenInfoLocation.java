package com.automation.ui.cuspera.pageobjectsfactory.pageobject.base;

public enum GenInfoLocation {


    GEN_INFO_LOC1("Houston"),
    GEN_INFO_LOC2("Sofia"),
    GEN_INFO_LOC3("Tianjin"),
    GEN_INFO_LOC4("Pune");

    private String location;

    GenInfoLocation(String type) {
        this.location = type;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return this.location;
    }
}