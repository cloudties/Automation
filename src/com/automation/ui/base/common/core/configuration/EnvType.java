package com.automation.ui.base.common.core.configuration;

import lombok.Getter;

//NEEDTOCHECK CHANGE URL DOMAIN
public enum EnvType {
    //main domain,envtype,port
    PROD("com", "prod", "","ui"),
    STAGING("co.in", "staging", "","ui"),
    // DEV("co.in", "dev", "9000"),
    DEV("", "dev", "4200",""),
    TEST("",  "test", "8090","ui"),
    SANDBOX("cuspera.com", "sandbox", "9000","ui");

    @Getter
    private final String siteDomain;

    @Getter
    private final String key;


    @Getter
    private final String port;

    private final String webContext;

    EnvType(String siteDomain, String key, String port,String webContext) {
        this.siteDomain = siteDomain;
        this.key = key;
        this.port = port;
        this.webContext=webContext;
    }




    public String getWebContext() {


        return this.webContext;
    }


}
