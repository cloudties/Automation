package com.automation.ui.base.common.core.configuration;

import lombok.Getter;

import com.automation.ui.base.common.core.configuration.*;


//NEEDTOCHECK CHANGE URL DOMAIN
public enum EnvType {
    //main domain,envtype,port
    PROD("com", "prod", "",Configuration.getSiteContext()),
    STAGING("co.in", "staging", "",Configuration.getSiteContext()),
    // DEV("co.in", "dev", Configuration.getSitePort()),
    DEV("", "dev", Configuration.getSitePort(),""),
    TEST("",  "test", Configuration.getSitePort(),Configuration.getSiteContext()),
    SANDBOX("honeywell.com", "sandbox", Configuration.getSitePort(),Configuration.getSiteContext());

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
