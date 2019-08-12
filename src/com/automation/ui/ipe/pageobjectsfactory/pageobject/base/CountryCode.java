package com.automation.ui.ipe.pageobjectsfactory.pageobject.base;

public enum CountryCode {

    COUNTRY_CODE_USA("+1 (USA)"),
    COUNTRY_CODE_IND("+91 (India)"),
    COUNTRY_CODE_Afghanistan("+93 (Afghanistan)"),
    COUNTRY_CODE_Aland_Islands("+348 18 (Åland Islands)"),
    COUNTRY_CODE_Albania("+355 (Albania)"),
    COUNTRY_CODE_Algeria("+213 (Algeria)"),
    COUNTRY_CODE_American_Samoa("+1 684 (American Samoa)"),
    COUNTRY_CODE_Andorra("+376 (Andorra)"),
    COUNTRY_CODE_Angola("+244 (Angola)"),
    COUNTRY_CODE_Anguilla("+1 264 (Anguilla)"),
    COUNTRY_CODE_Antigua_and_Barbuda("+1 268 (Antigua and Barbuda )"),
    COUNTRY_CODE_Argentina("+54 (Argentina)"),
    COUNTRY_CODE_Armenia("+374 (Armenia)"),
    COUNTRY_CODE_Aruba("+297 (Aruba)"),
    COUNTRY_CODE_Ascension("+247 (Ascension)"),
    COUNTRY_CODE_Australia("+61 (Australia)"),
    COUNTRY_CODE_France("+33 (France)"),
    COUNTRY_CODE_Australian_Antarctic_Territory("+672 1 (Australian Antarctic Territory)"),
    COUNTRY_CODE_Australian_External_Territories("+672 (Australian External Territories)"),
    COUNTRY_CODE_Austria("+43 (Austria)"),
    COUNTRY_CODE_Azerbaijan("+994 (Azerbaijan)"),
    COUNTRY_CODE_Bahamas("+1 242 (Bahamas)");

    private String countryCode;

    CountryCode(String type) {
        this.countryCode = type;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    @Override
    public String toString() {
        return this.countryCode;
    }
}