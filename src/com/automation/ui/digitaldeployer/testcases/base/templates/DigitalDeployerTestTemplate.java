package com.automation.ui.digitaldeployer.testcases.base.templates;

import com.automation.ui.base.common.core.url.UrlBuilder;
import com.automation.ui.base.common.templates.core.CoreTestTemplate;
import com.automation.ui.digitaldeployer.common.core.url.ProjectUrlBuilder;
import org.apache.log4j.Logger;

public abstract class DigitalDeployerTestTemplate extends CoreTestTemplate {

    private static Logger logger = Logger.getLogger(DigitalDeployerTestTemplate.class);
    protected ProjectUrlBuilder siteUrlBuilder;

    protected void prepareURLs() {
        urlBuilder = UrlBuilder.createUrlBuilder();
        siteUrlBuilder = new ProjectUrlBuilder();
        siteURL = urlBuilder.getUrl();
        siteCorporateURL = urlBuilder.getSiteGlobalURL();
        getDataReaders();

        //siteCorpSetupURL = UrlBuilder.createUrlBuilderForSiteAndLang("corp", Configuration.DEFAULT_LANGUAGE).getUrl();
        //logger.info("prepareURLs siteCorporateURL : " + siteCorporateURL + " siteURL" +siteURL  );

    }

}
