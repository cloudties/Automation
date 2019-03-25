package com.automation.ui.githubtesting.common.templates;

import com.automation.ui.base.common.core.url.UrlBuilder;
import com.automation.ui.base.common.templates.core.CoreTestTemplate;
import com.automation.ui.connected.common.core.url.ConnectedUrlBuilder;
import org.apache.log4j.Logger;

public abstract class GitHubTestTemplate extends CoreTestTemplate {


    private static Logger logger = Logger.getLogger(com.automation.ui.githubtesting.common.templates.GitHubTestTemplate.class);
    protected ConnectedUrlBuilder siteUrlBuilder;

    protected void prepareURLs() {
        urlBuilder = UrlBuilder.createUrlBuilder();
        siteUrlBuilder = new ConnectedUrlBuilder();
        siteURL = urlBuilder.getUrl();
        siteCorporateURL = urlBuilder.getSiteGlobalURL();
        getDataReaders();


    }
}
