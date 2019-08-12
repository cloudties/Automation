package com.automation.ui.githubtesting.common.core.url;

import com.automation.ui.base.common.constants.BASEConstants;
import com.automation.ui.base.common.core.configuration.Configuration;
import com.automation.ui.base.common.core.configuration.EnvType;
import com.automation.ui.base.common.core.url.*;

public class GitHubUrlBuilder extends CoreUrlBuilder {

    private static final String SITE_HOSTNAME = "sandbox-dev.com";

    public GitHubUrlBuilder() {
        super(Configuration.getEnv());
    }

    public String getSiteUrl() {
        return getSiteUrl(envType);
    }

    public String getSiteUrl(EnvType envType) {
        String hostname = SITE_HOSTNAME;
        if (!envType.equals(EnvType.PROD)) {
            hostname = env + "." + hostname;
        }

        return BASEConstants.HTTP_PREFIX + hostname + "/";
    }

    public String getSitePageUrl(String path) {
        return addPathToUrl(getSiteUrl(), path);
    }


    //   public String getUrlForSiteTopic(String topic) {
    //     return getSiteUrl() + TOPICS_PATH + "/" + topic;
    // }


}
