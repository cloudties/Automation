package com.automation.ui.ipe.testcases.base.templates;

import com.automation.ui.base.common.core.url.UrlBuilder;
import com.automation.ui.base.common.templates.core.CoreTestTemplate;
import com.automation.ui.ipe.common.core.url.IPEUrlBuilder;
import org.apache.log4j.Logger;

public abstract class IPETestTemplate extends CoreTestTemplate {

    private static Logger logger = Logger.getLogger(IPETestTemplate.class);
    protected IPEUrlBuilder siteUrlBuilder;

    protected void prepareURLs() {
        urlBuilder = UrlBuilder.createUrlBuilder();
        siteUrlBuilder = new IPEUrlBuilder();
        siteURL = urlBuilder.getUrl();
        siteCorporateURL = urlBuilder.getSiteGlobalURL();
        getDataReaders();

        //siteCorpSetupURL = UrlBuilder.createUrlBuilderForSiteAndLang("corp", Configuration.DEFAULT_LANGUAGE).getUrl();
        //logger.info("prepareURLs siteCorporateURL : " + siteCorporateURL + " siteURL" +siteURL  );

    }

}
