package com.automation.ui.ipe.common.core.url;
/**
 * @author Manjusha Saju
 */


import com.automation.ui.base.common.constants.BASEConstants;
import com.automation.ui.base.common.core.configuration.Configuration;
import com.automation.ui.base.common.core.configuration.EnvType;
import com.automation.ui.base.common.core.url.UrlBuilder;

public class IPEUrlBuilder extends UrlBuilder {

    private static final String SITE_HOSTNAME = "sandbox-dev.com";

    public IPEUrlBuilder() {
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


}
