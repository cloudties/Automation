package com.automation.ui.ipe.pageobjectsfactory.pageobject.globalnav.pages;

import com.automation.ui.ipe.pageobjectsfactory.pageobject.base.IPEBasePageObject;
import com.automation.ui.base.common.core.assertion.Assertion;
import com.automation.ui.base.common.prpreaders.AssertDataReader;
public class NavigatePage extends IPEBasePageObject {

    public NavigatePage toPage(String pageName) {
        driver.get(urlBuilder.getUrlForPage(pageName) + urlBuilder.getCacheBusterQuery(pageName));

        return this;
    }

    public NavigatePage toPageByPath(String path) {
        String query = urlBuilder.getCacheBusterQuery(path);

        driver.get(urlBuilder.getUrl() + path + query);

        return this;
    }

    public NavigatePage toPageByPath(String path, String fragmentIdentifier) {
        String query = urlBuilder.getCacheBusterQuery(path);
        fragmentIdentifier = "#" + fragmentIdentifier;

        driver.get(urlBuilder.getUrlForPath(path) + query + fragmentIdentifier);

        return this;
    }

    public NavigatePage toPageByPath(String path, String[] queryParams) {
        String query = urlBuilder.getQueryParams(path, queryParams);

        driver.get(urlBuilder.appendQueryStringToURL(urlBuilder.getUrlForPath(path), query));

        return this;
    }

    public NavigatePage toPageByPath(String host, String path, String[] queryParams) {
        String query = urlBuilder.getQueryParams(path, queryParams);

        driver.get(urlBuilder.appendQueryStringToURL(urlBuilder.getUrlForPath(path), query));

        return this;
    }

    public NavigatePage toUrl(String url) {
        driver.get(url);
        return this;
    }
}
