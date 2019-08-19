package com.automation.ui.cuspera.testcases.base.templates;

import com.automation.ui.base.common.core.url.UrlBuilder;
import com.automation.ui.base.common.templates.core.CoreTestTemplate;
import com.automation.ui.cuspera.common.core.url.CusperaUrlBuilder;
import org.apache.log4j.Logger;

public abstract class CusperaTestTemplate extends CoreTestTemplate {

    private static Logger logger = Logger.getLogger(CusperaTestTemplate.class);
    protected CusperaUrlBuilder siteUrlBuilder;

    protected void prepareURLs() {
        urlBuilder = UrlBuilder.createUrlBuilder();
        siteUrlBuilder = new CusperaUrlBuilder();
        siteURL = urlBuilder.getUrl();
        siteCorporateURL = urlBuilder.getSiteGlobalURL();
        getDataReaders();

        //siteCorpSetupURL = UrlBuilder.createUrlBuilderForSiteAndLang("corp", Configuration.DEFAULT_LANGUAGE).getUrl();
        //logger.info("prepareURLs siteCorporateURL : " + siteCorporateURL + " siteURL" +siteURL  );

    }

}
