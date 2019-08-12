package com.automation.ui.githubtesting.common.templates;

import com.automation.ui.base.common.core.url.CoreUrlBuilder;
import com.automation.ui.base.common.core.url.UrlBuilder;
import com.automation.ui.base.common.templates.core.CoreTestTemplate;
import com.automation.ui.cuspera.common.core.url.IPEUrlBuilder;
import org.apache.log4j.Logger;

public abstract class GitHubTestTemplate extends CoreTestTemplate {


    private static Logger logger = Logger.getLogger(com.automation.ui.githubtesting.common.templates.GitHubTestTemplate.class);
    protected IPEUrlBuilder siteUrlBuilder;

    protected void prepareURLs() {
        urlBuilder = UrlBuilder.createUrlBuilder();
        siteUrlBuilder = new IPEUrlBuilder();
        siteURL = urlBuilder.getUrl();
        siteCorporateURL = urlBuilder.getSiteGlobalURL();
        getDataReaders();


    }
}
